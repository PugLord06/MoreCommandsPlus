package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.wendyscraft.morecommandsplus.MoreCommandsPlus;

public class SetSpawnCommand implements CommandExecutor {

    private final MoreCommandsPlus plugin;

    public SetSpawnCommand(MoreCommandsPlus plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){

            Location location = p.getLocation();

            plugin.getConfig().set("spawn", location);

            plugin.saveConfig();

            p.sendMessage(ChatColor.GREEN + "Spawn location set");

        }else {
            plugin.getServer().getLogger().info(ChatColor.DARK_RED + "Only A player can run this Command");
        }



        return true;
    }
}
