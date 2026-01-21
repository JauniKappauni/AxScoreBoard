package de.jauni.axscoreboard;

import de.jauni.axscoreboard.listener.PlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AxScoreBoard extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
