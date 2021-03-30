package donutcodes.donut.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

//smasd tab
public class crystal implements CommandExecutor, Listener {
    String prefix = ChatColor.AQUA + "[DONUT] ";
    String prisma = "§9§kt §bPrismatic_Frost §9§kt ";
    ChatColor yel = ChatColor.YELLOW;
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("crystal") && args.length == 0) {
        }
        Player player = (Player) sender;
        String add = sender.getName();
        Bukkit.broadcastMessage(prisma + yel + "Oh hello....");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bukkit.broadcastMessage(prisma + yel + "You've found me I see...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bukkit.broadcastMessage(prisma + yel + "Well, since I'm lost (totally)");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bukkit.broadcastMessage(prisma + yel + "Take this-");
        ItemStack crystal = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemMeta crystalMeta = crystal.getItemMeta();
        crystalMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        crystalMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Prismatic Crystal");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(" ");
        lore.add(ChatColor.GRAY + "...");
        lore.add(" ");
        lore.add("§d§l§kt §f§d§lMythic §d§k§lt");
        crystalMeta.setLore(lore);
        crystal.setItemMeta(crystalMeta);
        player.sendMessage(prefix + ChatColor.BLUE + "You recieved a " + ChatColor.LIGHT_PURPLE + "Prismatic Crystal!");
        player.getInventory().addItem(new ItemStack(crystal));
        Bukkit.broadcastMessage(ChatColor.GREEN + add + ChatColor.BLUE + " recieved this item.");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bukkit.broadcastMessage(prisma + yel + "It seems useless, but don't throw it away!");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bukkit.broadcastMessage(prisma + yel + "Keep it for me...");
        return true;
    }
}