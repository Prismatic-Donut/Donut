package donutcodes.donut.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class claimfancystick implements CommandExecutor, Listener {
    String prefix = ChatColor.AQUA + "[DONUT] ";

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("claimfancystick") && args.length == 0) {
        }
        Player player = (Player) sender;
        openGui(player);
        return true;
    }


    private void openGui(Player player) {
        Inventory inv = Bukkit.createInventory(null, 45, ChatColor.AQUA + "Reward!");


        ItemStack placeholderpane = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta placeholderpaneMeta = placeholderpane.getItemMeta();

        placeholderpaneMeta.setDisplayName(" ");
        placeholderpane.setItemMeta(placeholderpaneMeta);

        ItemStack fancystick = new ItemStack(Material.STICK);
        ItemMeta fancystickMeta = fancystick.getItemMeta();
        fancystickMeta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        fancystickMeta.setDisplayName(ChatColor.GREEN + "Fancy Stick");
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "Damage: " + ChatColor.RED + "10");
        lore.add(" ");
        lore.add("§d§oThis stick is §bFANCY!");
        lore.add(" ");
        lore.add("§a§lUNCOMMON WEAPON");
        fancystickMeta.setLore(lore);
        fancystick.setItemMeta(fancystickMeta);

        inv.setItem(0, placeholderpane);
        inv.setItem(1, placeholderpane);
        inv.setItem(2, placeholderpane);
        inv.setItem(3, placeholderpane);
        inv.setItem(4, placeholderpane);
        inv.setItem(5, placeholderpane);
        inv.setItem(6, placeholderpane);
        inv.setItem(7, placeholderpane);
        inv.setItem(8, placeholderpane);
        inv.setItem(9, placeholderpane);
        inv.setItem(10, placeholderpane);
        inv.setItem(11, placeholderpane);
        inv.setItem(12, placeholderpane);
        inv.setItem(13, placeholderpane);
        inv.setItem(14, placeholderpane);
        inv.setItem(15, placeholderpane);
        inv.setItem(16, placeholderpane);
        inv.setItem(17, placeholderpane);
        inv.setItem(18, placeholderpane);
        inv.setItem(19, placeholderpane);
        inv.setItem(20, placeholderpane);
        inv.setItem(21, placeholderpane);
        inv.setItem(22, fancystick);
        inv.setItem(23, placeholderpane);
        inv.setItem(24, placeholderpane);
        inv.setItem(25, placeholderpane);
        inv.setItem(26, placeholderpane);
        inv.setItem(27, placeholderpane);
        inv.setItem(28, placeholderpane);
        inv.setItem(29, placeholderpane);
        inv.setItem(30, placeholderpane);
        inv.setItem(31, placeholderpane);
        inv.setItem(32, placeholderpane);
        inv.setItem(33, placeholderpane);
        inv.setItem(34, placeholderpane);
        inv.setItem(35, placeholderpane);
        inv.setItem(36, placeholderpane);
        inv.setItem(37, placeholderpane);
        inv.setItem(38, placeholderpane);
        inv.setItem(39, placeholderpane);
        inv.setItem(40, placeholderpane);
        inv.setItem(41, placeholderpane);
        inv.setItem(42, placeholderpane);
        inv.setItem(43, placeholderpane);
        inv.setItem(44, placeholderpane);
        player.openInventory(inv);
    }

    @EventHandler
    public void InventoryClickEvent_CLAIMFANCYSTICK(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemStack click = event.getCurrentItem();
        if (click.getType()!=null) {
        }
        if (click.getType() == Material.STICK) {
            if (event.getSlot() == 22) {
                ItemStack fancystick = new ItemStack(Material.STICK);
                ItemMeta fancystickMeta = fancystick.getItemMeta();
                fancystickMeta.setDisplayName(ChatColor.GREEN + "Fancy Stick");
                fancystickMeta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
                ArrayList<String> lore = new ArrayList<String>();
                lore.add(ChatColor.GRAY + "Damage: " + ChatColor.RED + "10");
                lore.add(" ");
                lore.add("§d§oThis stick is §bFANCY!");
                lore.add(" ");
                lore.add("§a§lUNCOMMON WEAPON");
                fancystickMeta.setLore(lore);
                fancystick.setItemMeta(fancystickMeta);
                player.sendMessage(prefix + ChatColor.BLUE + "You recieved a " + ChatColor.GREEN + "Fancy stick!");
                player.getInventory().addItem(new ItemStack(fancystick));
                event.setCancelled(true);
                player.closeInventory();
            }
        }
    }
}
