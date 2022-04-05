package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){

            p.isInvulnerable();

            if (p.isInvulnerable()){

                p.setInvulnerable(false);
                p.sendMessage(ChatColor.DARK_RED + "God Mode has been disabled");

            }else{

                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GOLD + "God Mode enabled");
            }
        }



        return true;
    }
}
