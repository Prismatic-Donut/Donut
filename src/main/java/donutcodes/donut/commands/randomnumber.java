package donutcodes.donut.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import java.util.Random;

public class randomnumber implements CommandExecutor, Listener {
        String prefix = ChatColor.AQUA + "[DONUT] ";

        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
            if (commandLabel.equalsIgnoreCase("randomnumber") && args.length == 0) {
            }
            Player player = (Player) sender;
            Random rand = new Random();
            int upperbound = 999;
            int int_random = rand.nextInt(upperbound);
            player.sendMessage(prefix + ChatColor.BLUE + "Your random number is: " + ChatColor.YELLOW + ChatColor.BOLD + int_random);
            return true;
        }
    }


