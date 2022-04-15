package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player p) {
            if (args.length == 0) {
                p.setHealth(20);
                p.sendMessage(ChatColor.GREEN + "You have been healed!");
            } else {

                String playerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if (target == null) {
                    p.sendMessage(ChatColor.DARK_RED + "This player is not online");
                } else {
                    target.setHealth(20);
                    target.sendMessage(ChatColor.GREEN + "You have been healed!");
                    p.sendMessage(ChatColor.LIGHT_PURPLE + "You have healed " + ChatColor.GREEN + target.getDisplayName());
                }

            }


        }
        return true;
    }
}
