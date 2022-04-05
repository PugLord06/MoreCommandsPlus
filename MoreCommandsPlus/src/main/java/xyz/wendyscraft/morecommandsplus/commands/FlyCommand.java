package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



        if (sender instanceof Player p){

            if ((p.getAllowFlight())){
                p.setAllowFlight(false);
                p.sendMessage(ChatColor.DARK_RED + "Flight Disabled");
            }else {
                p.setAllowFlight(true);
                p.sendMessage(ChatColor.LIGHT_PURPLE + "Flight Enabled");
            }

        }
        return true;
    }
}
