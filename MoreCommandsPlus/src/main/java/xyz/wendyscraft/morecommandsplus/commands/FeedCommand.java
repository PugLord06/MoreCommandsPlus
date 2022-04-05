package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



        if (sender instanceof Player p){
            if (p.hasPermission("morecommandsplus.feed")) {

                p.getFoodLevel();
                if (p.getFoodLevel() < 20) {
                    p.setFoodLevel(20);
                    p.setSaturatedRegenRate(20);
                    p.setSaturation(20);
                    p.sendMessage(ChatColor.GREEN + "You have been fed");
                } else {
                    p.sendMessage(ChatColor.DARK_PURPLE + "You are already full ");

                }

            }else {
                p.sendMessage(ChatColor.RED + "Error....You do not have the required permission (morecommandsplus.feed) to run this command");



            }
        }


        return true;
    }
}
