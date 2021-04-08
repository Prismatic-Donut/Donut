package donutcodes.donut.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import donutcodes.donut.Donut;
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
    boolean prismaclaim = false;

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!prismaclaim) {
            if (commandLabel.equalsIgnoreCase("crystal") && args.length == 0) {
            }
            Player player = (Player) sender;
            String add = sender.getName();
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Donut.getMain(), new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(prisma + yel + "Oh hello...");
                }
            }, 0L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Donut.getMain(), new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(prisma + yel + "You've found me I see...");
                }
            }, 40L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Donut.getMain(), new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(prisma + yel + "Well, since I'm lost (totally)");
                }
            }, 80L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Donut.getMain(), new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(prisma + yel + "Take this-");
                }
            }, 120L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Donut.getMain(), new Runnable() {
                @Override
                public void run() {
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
                }
            }, 160L); //100
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Donut.getMain(), new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(prisma + yel + "It seems useless, but don't throw it away!");
                }
            }, 200L);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Donut.getMain(), new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(prisma + yel + "Keep it for me...");
                }
            }, 240L);
            prismaclaim = true;
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("reset"));
            Player player2 = (Player) sender;
            player2.sendMessage(prefix + ChatColor.GREEN + "Successfully resetted your " + ChatColor.LIGHT_PURPLE + "prismaclaim " + ChatColor.GREEN + "boolean!");
            prismaclaim = false;
        }
        return true;
    }
}



