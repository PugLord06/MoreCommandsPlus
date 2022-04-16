package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.wendyscraft.morecommandsplus.MoreCommandsPlus;

public class SpawnCommand implements CommandExecutor {

    private final MoreCommandsPlus plugin;

    public SpawnCommand(MoreCommandsPlus plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){

            Location location = plugin.getConfig().getLocation("spawn");

            if (location != null){
                p.teleport(location);
                p.sendMessage(ChatColor.LIGHT_PURPLE + "You have been teleported to spawn");
            }else{

                p.sendMessage(ChatColor.GREEN + "There is no spawn location set.Use : /spawn to do so");
            }

        }

        return true;
    }
}
