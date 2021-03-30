package donutcodes.donut;


import donutcodes.donut.gui.*;
import donutcodes.donut.commands.randomnumber;
import donutcodes.donut.commands.clearchat;
import donutcodes.donut.items.grappling_hook;
import donutcodes.donut.commands.crystal;
import donutcodes.donut.commands.custombroadcast;
import donutcodes.donut.gui.claimfancystick;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Donut extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("sbmenu").setExecutor(new gui());
        Bukkit.getPluginManager().registerEvents(new gui(), this);
        this.getCommand("randomnumber").setExecutor(new randomnumber());
        Bukkit.getPluginManager().registerEvents(new randomnumber(), this);
        this.getCommand("claimfancystick").setExecutor(new claimfancystick());
        Bukkit.getPluginManager().registerEvents(new claimfancystick(), this);
        this.getCommand("clearchat").setExecutor(new clearchat());
        Bukkit.getPluginManager().registerEvents(new clearchat(), this);
        this.getCommand("donutbroadcast").setExecutor(new custombroadcast());
        Bukkit.getPluginManager().registerEvents(new custombroadcast(),this);
        this.getCommand("crystal").setExecutor(new crystal());
        Bukkit.getPluginManager().registerEvents(new crystal(),this);
        this.getCommand("givegrapplinghook").setExecutor(new grappling_hook());
        Bukkit.getPluginManager().registerEvents(new grappling_hook(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}



