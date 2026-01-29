package de.jauni.axscoreboard.listener;

import de.jauni.axscoreboard.AxScoreBoard;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class PlayerJoinListener implements Listener {
    AxScoreBoard reference;

    public PlayerJoinListener(AxScoreBoard reference) {
        this.reference = reference;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        reference.setScoreboard(p);
        reference.startScoreboardUpdater(p);
    }
}
