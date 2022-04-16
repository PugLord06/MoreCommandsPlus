package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.wendyscraft.morecommandsplus.MoreCommandsPlus;

import java.util.ArrayList;

public class VaultCommand implements CommandExecutor {

    private final MoreCommandsPlus plugin;

    public VaultCommand(MoreCommandsPlus plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){

            Inventory vault = Bukkit.createInventory(p, 9, "Your Vault");

            ItemStack item1 = new ItemStack(Material.ENDER_EYE, 2);

            item1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 255);
            ItemMeta meta = item1.getItemMeta();
            meta.setDisplayName(ChatColor.MAGIC + "I SEE YOU");
            meta.setUnbreakable(true);

            ArrayList<String> lore = new ArrayList<>();
            lore.add(ChatColor.MAGIC + "It sweeeps you away");
            lore.add(ChatColor.MAGIC + "ONCE IT BLINKS");
            meta.setLore(lore);
            item1.setItemMeta(meta);

            vault.addItem(item1);
            p.openInventory(vault);


        }else{
            plugin.getServer().getLogger().info("Only a Player can run this command");
        }

        return true;
    }
}
