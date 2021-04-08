package donutcodes.donut;

import donutcodes.donut.commands.clearchat;
import donutcodes.donut.commands.crystal;
import donutcodes.donut.commands.custombroadcast;
import donutcodes.donut.commands.randomnumber;
import donutcodes.donut.gui.claimfancystick;
import donutcodes.donut.gui.gui;
import donutcodes.donut.items.aspect_of_the_end;
import donutcodes.donut.items.grappling_hook;
import donutcodes.donut.items.space_helmet;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Donut extends JavaPlugin {
    public static Donut main;

    public static Plugin getMain() {
        return main;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        main = this;
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
        this.getCommand("givespacehelmet").setExecutor(new space_helmet());
        Bukkit.getPluginManager().registerEvents(new space_helmet(), this);
        this.getCommand("giveaspectoftheend").setExecutor(new aspect_of_the_end());
        Bukkit.getPluginManager().registerEvents(new aspect_of_the_end(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}



