package donutcodes.donut.items;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;

public class grappling_hook implements CommandExecutor, Listener {

    @EventHandler()
    public void onRightClick(PlayerFishEvent e) {
        Player p = e.getPlayer();
        ItemStack item = p.getItemInHand();
        if (e.getState() == PlayerFishEvent.State.REEL_IN || e.getState() == PlayerFishEvent.State.IN_GROUND) {
            if (item.getItemMeta().getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES)) {
                Location l1 = p.getLocation();
                Location l2 = e.getHook().getLocation();

                Vector v = new Vector(l2.getX() - l1.getX(), 1, l2.getZ() - l1.getZ());
                p.setVelocity(v);
            }
        }
    }



    String donut = ChatColor.AQUA + "[DONUT] ";
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (s.equalsIgnoreCase("givegrapplinghook")) {
            Player target = (Player) sender;
            ItemStack grappling_hook = new ItemStack(Material.FISHING_ROD);
            ItemMeta grappling_hook_meta = grappling_hook.getItemMeta();
            grappling_hook_meta.setDisplayName(ChatColor.GREEN + "Grappling Hook");
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.GRAY + "Travel in Style using");
            lore.add(ChatColor.GRAY + "this Grappling Hook");
            lore.add(" ");
            lore.add(ChatColor.GREEN + "§lUNCOMMON");
            grappling_hook_meta.addEnchant(Enchantment.LUCK, 1, false);
            grappling_hook_meta.setUnbreakable(true);
            grappling_hook_meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            grappling_hook_meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            grappling_hook_meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            grappling_hook_meta.setLore(lore);
            grappling_hook.setItemMeta(grappling_hook_meta);
            target.getInventory().addItem(grappling_hook);
            target.sendMessage(donut + ChatColor.BLUE + "You recieved a " + ChatColor.GREEN + "Grappling Hook!");
        }
        return true;
    }
}


