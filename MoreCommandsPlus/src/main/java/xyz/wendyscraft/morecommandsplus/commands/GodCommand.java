package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){

           if (args.length == 0){
               if (p.isInvulnerable()){

                   p.setInvulnerable(false);
                   p.sendMessage(ChatColor.DARK_RED + "God Mode has been disabled");

               }else{

                   p.setInvulnerable(true);
                   p.sendMessage(ChatColor.GOLD + "God Mode enabled");
               }
           }else{

               String playerName = args[0];

               Player target = Bukkit.getServer().getPlayerExact(playerName);

               if (target == null){
                   p.sendMessage(ChatColor.DARK_RED + "This player is not online");
               }else{
                   if (target.isInvulnerable()){

                       target.setInvulnerable(false);
                       target.sendMessage(ChatColor.DARK_RED + "God Mode has been disabled");
                       p.sendMessage(ChatColor.DARK_RED + "You have disabled godmode for " +  ChatColor.LIGHT_PURPLE + target.getDisplayName());

                   }else{

                       target.setInvulnerable(true);
                       target.sendMessage(ChatColor.GOLD + "God Mode enabled");
                       p.sendMessage(ChatColor.DARK_AQUA + "You have enabled godmode for " +  ChatColor.LIGHT_PURPLE + target.getDisplayName());
                   }
               }
           }


        }



        return true;
    }
}
