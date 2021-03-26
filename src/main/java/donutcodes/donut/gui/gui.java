package donutcodes.donut.gui;

import com.sun.tools.javac.jvm.Items;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class gui implements CommandExecutor, Listener {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String [] args) {
        if (commandLabel.equalsIgnoreCase("testgui") && args.length == 0) {
        }
        Player player = (Player) sender;
        openGui(player);
        return true;
    }


            private void openGui(Player player){
                Inventory inv = Bukkit.createInventory(null, 54, ChatColor.DARK_GRAY + "Click in order!");


                ItemStack placeholderpane = new ItemStack (Material.BLACK_STAINED_GLASS_PANE);
                ItemMeta placeholderpaneMeta = placeholderpane.getItemMeta();

                placeholderpaneMeta.setDisplayName(" ");
                placeholderpane.setItemMeta(placeholderpaneMeta);


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
                




                player.openInventory(inv);
            }


    }