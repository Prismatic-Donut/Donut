package donutcodes.donut.items;


import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class space_helmet implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("givespacehelmet") && args.length == 0) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "Please put a username!");
            player.sendMessage(ChatColor.RED + "Usage: /givespacehelmet <Player>");
        }
        if (args.length == 1 && args[0] != null) {
            String playerrecieved = args[0];
            Player player = (Player) sender;
            ItemStack redspacehelmet = new ItemStack(Material.RED_STAINED_GLASS);
            ItemMeta redspacehelmetmeta = redspacehelmet.getItemMeta();
            redspacehelmetmeta.setDisplayName(ChatColor.RED + "Space Helmet");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§7§oA rare space helmet forged");
            lore.add("§7§ofrom shards of moon glass.");
            lore.add(" ");
            lore.add("§7To: " + ChatColor.RED + "[OWNER] " + playerrecieved);
            lore.add("§7From: " + ChatColor.RED + "[ADMIN] " + sender);
            lore.add(" ");
            lore.add(ChatColor.DARK_GRAY + "Edition #1");
            lore.add(ChatColor.DARK_GRAY + "April 2021");
            lore.add(" ");
            lore.add(ChatColor.DARK_GRAY + "This item can be reforged!");
            lore.add("§c§lSPECIAL HELMET");
            redspacehelmetmeta.setLore(lore);
            redspacehelmet.setItemMeta(redspacehelmetmeta);
            player.getInventory().addItem(new ItemStack(redspacehelmet));
        }
        return true;
    }
}
