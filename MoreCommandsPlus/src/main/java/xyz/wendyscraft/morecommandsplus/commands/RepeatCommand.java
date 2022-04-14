package xyz.wendyscraft.morecommandsplus.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RepeatCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){

            if (args.length == 0){
                p.sendMessage(ChatColor.RED +  "You did not Specify any arguments when running the command.Try Again");
                p.sendMessage("Example:/repeat <message here>");
            }else{
                String word = args[0];

                p.sendMessage(ChatColor.GREEN + "Message " + word);
            }
        }

        return true;
    }
}
