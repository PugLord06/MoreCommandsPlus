package xyz.wendyscraft.morecommandsplus;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.wendyscraft.morecommandsplus.commands.*;
import xyz.wendyscraft.morecommandsplus.listeners.PigKillListener;
import xyz.wendyscraft.morecommandsplus.listeners.SpawnListeners;

public final class MoreCommandsPlus extends JavaPlugin {



    @Override
    public void onEnable() {
        // Plugin startup logic


        getServer().getLogger().info("[MoreCommands+] MoreCommandsPlus has Started");

        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("repeat").setExecutor(new RepeatCommand());
        getCommand("printfood").setExecutor(new RepeatCommand());
        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));
        getCommand("vault").setExecutor(new VaultCommand(this));

        getServer().getPluginManager().registerEvents(new PigKillListener(this), this);
        getServer().getPluginManager().registerEvents(new SpawnListeners(this),this);



        getConfig().options().copyDefaults();
        saveDefaultConfig();


    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equals("printMessageFromConfig")){
            Player player = (Player) sender;
            String food = getConfig().getString("Food");
            int number = getConfig().getInt("Number");
            boolean Booled = getConfig().getBoolean("Boolean");
            String thirdItem = getConfig().getStringList("FoodList").get(2);

            player.sendMessage(ChatColor.BLUE + "The food in the config is " + ChatColor.AQUA + food);
            player.sendMessage(ChatColor.GREEN + "The color in the config is " + ChatColor.RED + number);
            player.sendMessage(ChatColor.BLACK + "The color in the config is " + ChatColor.YELLOW + Booled);
        }





        return true;
    }

    @Override
    public void onDisable() {


        getServer().getLogger().info("[MoreCommands+] MoreCommandsPlus hus Shutdown");
        // Plugin shutdown logic
    }



}
