package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import xyz.wendyscraft.morecommandsplus.MoreCommandsPlus;

public class PrintMessageFromConfig implements CommandExecutor {

    Plugin plugin = MoreCommandsPlus.getPlugin(MoreCommandsPlus.class);


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String food = plugin.getConfig().getString("Food");

        Player player = (Player) sender;
        player.sendMessage(food);



        return false;
    }
}
