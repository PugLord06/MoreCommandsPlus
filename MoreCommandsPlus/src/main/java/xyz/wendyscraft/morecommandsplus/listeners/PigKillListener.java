package xyz.wendyscraft.morecommandsplus.listeners;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import xyz.wendyscraft.morecommandsplus.MoreCommandsPlus;

public class PigKillListener implements Listener {

    private final MoreCommandsPlus moreCommandsPlus;

    public PigKillListener(MoreCommandsPlus moreCommandsPlus) {
        this.moreCommandsPlus = moreCommandsPlus;
    }

    @EventHandler
    public void onPigDeath(EntityDeathEvent e){


            e.getDrops().clear();
            e.setDroppedExp(0);

            LivingEntity l= e.getEntity();

            if (l instanceof Pig){
                l.getLocation().getWorld().dropItem(e.getEntity().getLocation(), new ItemStack(Material.COOKED_PORKCHOP));
            }


    }



    }

