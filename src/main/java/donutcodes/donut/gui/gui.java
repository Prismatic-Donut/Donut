package donutcodes.donut.gui;

import com.sun.tools.javac.jvm.Items;
import org.bukkit.Bukkit;
import org.bukkit.block.BrewingStand;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class gui implements CommandExecutor, Listener {
    String prefix = ChatColor.AQUA + "[DONUT] ";

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("sbmenu") && args.length == 0) {
        }
        Player player = (Player) sender;
        openGui(player);
        return true;
    }


    private void openGui(Player player) {
        Inventory inv = Bukkit.createInventory(null, 54, ChatColor.DARK_GRAY + "Skyblock Menu");


        ItemStack placeholderpane = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta placeholderpaneMeta = placeholderpane.getItemMeta();

        placeholderpaneMeta.setDisplayName(" ");
        placeholderpane.setItemMeta(placeholderpaneMeta);

        ItemStack ironhelm = new ItemStack(Material.IRON_HELMET);
        ItemMeta ironhelmmeta = ironhelm.getItemMeta();

        ironhelmmeta.setDisplayName("Classic Kit");
        ironhelm.setItemMeta(ironhelmmeta);

        ItemStack diamondswordsb = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta diamondswordsbMeta = diamondswordsb.getItemMeta();

        diamondswordsbMeta.setDisplayName(" ");
        diamondswordsb.setItemMeta(diamondswordsbMeta);

        ItemStack playerprofilesb = new ItemStack(Material.PLAYER_HEAD);
        ItemMeta playerprofilesbMeta = playerprofilesb.getItemMeta();

        playerprofilesbMeta.setDisplayName(" ");
        playerprofilesb.setItemMeta(playerprofilesbMeta);

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
        inv.setItem(13, playerprofilesb);
        inv.setItem(14, placeholderpane);
        inv.setItem(15, placeholderpane);
        inv.setItem(16, placeholderpane);
        inv.setItem(17, placeholderpane);
        inv.setItem(18, placeholderpane);
        inv.setItem(19, diamondswordsb);
        inv.setItem(20, placeholderpane);
        inv.setItem(21, placeholderpane);
        inv.setItem(22, placeholderpane);
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
        inv.setItem(45, placeholderpane);
        inv.setItem(46, placeholderpane);
        inv.setItem(47, placeholderpane);
        inv.setItem(48, placeholderpane);
        inv.setItem(49, placeholderpane);
        inv.setItem(50, placeholderpane);
        inv.setItem(51, placeholderpane);
        inv.setItem(52, placeholderpane);
        inv.setItem(53, placeholderpane);
        player.openInventory(inv);
    }


    @EventHandler
    public void InventoryClickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemStack clicked = event.getCurrentItem();
        if (clicked.getType() == Material.BLACK_STAINED_GLASS_PANE) {
            player.sendMessage(prefix + ChatColor.BLUE + "You clicked on a Black Stained Glass Pane!");
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void InventoryClickEvent_PLAYHEADSB(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemStack clicked = event.getCurrentItem();
        if (clicked.getType() == Material.PLAYER_HEAD) {
            if (event.getSlot() == 13) {
                player.performCommand("/stats");
                event.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void InventoryClickEvent_SBDIASWORDMENU(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemStack click = event.getCurrentItem();
        if (click.getType() == Material.DIAMOND_SWORD) {
            if (event.getSlot() == 19) {
                player.performCommand("/skills");
                event.setCancelled(true);
            }
        }
    }
}
