package xyz.wendyscraft.morecommandsplus.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event){
        Player player = event.getPlayer();

        if (!player.hasPermission("morecommandsplus.move")){
            event.setCancelled(true);
        }
    }

}
