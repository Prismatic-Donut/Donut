package donutcodes.donut.items;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class aspect_of_the_end implements CommandExecutor, Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
            if (p.getItemInHand().getItemMeta().getDisplayName().equals("§9Aspect of the End"))
                if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK || e !=null) {
                    Block b = p.getTargetBlock(null, 8);
                    Location loc = new Location(b.getWorld(), b.getX(), b.getY(), b.getZ(), p.getLocation().getYaw(), p.getLocation().getPitch());
                    p.teleport(loc);
                    p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
            }
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("giveaspectoftheend") && args.length == 0) {
            Player player = (Player) sender;
            ItemStack aspect_of_the_end = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta aspect_of_the_endMeta = aspect_of_the_end.getItemMeta();
            aspect_of_the_endMeta.setDisplayName("§9Aspect of the End");
            ArrayList<String> lore = new ArrayList<>();
            lore.add(ChatColor.GRAY + "Gear Score: §d100000");
            lore.add(ChatColor.GRAY + "Damage: " + ChatColor.RED + "+100000");
            lore.add(ChatColor.GRAY + "Strength: "+ ChatColor.RED + "+100000");
            lore.add(ChatColor.GRAY + "Crit Damage: " + ChatColor.RED + "+100000%");
            lore.add(" ");
            lore.add("§6Item Ability: Instant Transmission §e§lRIGHT CLICK");
            lore.add("§7Teleport §a8 blocks §7ahead of");
            lore.add("§7you and gain §a+50§f ✦ Speed");
            lore.add("§7for §a3 seconds§7.");
            lore.add(" ");
            lore.add("§9§lRARE SWORD");
            aspect_of_the_endMeta.setLore(lore);
            aspect_of_the_endMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            aspect_of_the_end.setItemMeta(aspect_of_the_endMeta);
            player.getInventory().addItem(new ItemStack(aspect_of_the_end));
        }
        return true;
    }
}