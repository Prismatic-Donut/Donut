package donutcodes.donut;


import donutcodes.donut.gui.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Donut extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("testgui").setExecutor(new gui());
        Bukkit.getPluginManager().registerEvents(new gui(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}



