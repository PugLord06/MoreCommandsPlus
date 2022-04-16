package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



        if (sender instanceof Player p){

            if (args.length == 0) {

                if ((p.getAllowFlight())) {
                    p.setAllowFlight(false);
                    p.sendMessage(ChatColor.DARK_RED + "Flight Disabled");
                } else {
                    p.setAllowFlight(true);
                    p.sendMessage(ChatColor.LIGHT_PURPLE + "Flight Enabled");
                }
            }else {
                String playerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if (target == null){
                    p.sendMessage(ChatColor.DARK_RED + "This player is not online");
                }else {
                    if ((target.getAllowFlight())){
                        p.sendMessage(ChatColor.BLUE + "You have disabled flight for" + target.getDisplayName());
                        target.setAllowFlight(false);
                        target.sendMessage(ChatColor.DARK_RED + "Flight Disabled");
                    }else {
                        p.sendMessage(ChatColor.AQUA + "You have enabled flight for " + target.getDisplayName());
                        target.setAllowFlight(true);
                        target.sendMessage(ChatColor.LIGHT_PURPLE + "Flight Enabled");
                    }
                }
            }

        }
        return true;
    }
}
