package donutcodes.donut;


import donutcodes.donut.gui.*;
import donutcodes.donut.commands.randomnumber;
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
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}



