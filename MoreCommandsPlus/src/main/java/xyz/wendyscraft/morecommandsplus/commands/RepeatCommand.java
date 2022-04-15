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
            }else if (args.length == 1){
                String word = args[0];

                p.sendMessage(ChatColor.GREEN + "Message " + word);
            }else{

                StringBuilder builder = new StringBuilder();

                for (int i =0; i < args.length; i++){

                    builder.append(args[i]);
                    builder.append(" ");
                }

                String finalMessage = builder.toString();
                finalMessage = finalMessage.stripTrailing();

                p.sendMessage(ChatColor.GREEN + "Your message is : " + ChatColor.DARK_PURPLE + finalMessage);

            }
        }

        return true;
    }
}
