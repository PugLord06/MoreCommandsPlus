package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.wendyscraft.morecommandsplus.MoreCommandsPlus;

public class EnderChestCommand implements CommandExecutor {

    private final MoreCommandsPlus plugin;

    public EnderChestCommand(MoreCommandsPlus plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){

            p.openInventory(p.getEnderChest());


        }

        return true;
    }
}
