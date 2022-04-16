package xyz.wendyscraft.morecommandsplus.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import xyz.wendyscraft.morecommandsplus.MoreCommandsPlus;


public class SpawnListeners implements Listener{

    private final MoreCommandsPlus plugin;

    public SpawnListeners(MoreCommandsPlus plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();


        if (p.hasPlayedBefore()) {

            Location location = plugin.getConfig().getLocation("spawn");

            if (location != null) {
                p.teleport(location);

            }

        }
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e){

        Location location = plugin.getConfig().getLocation("spawn");

        if (location != null) {
            e.setRespawnLocation(location);

        }

    }

}
