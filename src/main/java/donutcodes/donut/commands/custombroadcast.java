package donutcodes.donut.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class custombroadcast implements CommandExecutor, Listener {
    String prefix = ChatColor.AQUA + "[DONUT] ";

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("donutbroadcast") && args.length == 0) {
            {
            }
        }
        if (args.length == 1 && args[0] != null) {
            String add = args[0];
            Bukkit.broadcastMessage(add);
        }
        return true;
    }
}
