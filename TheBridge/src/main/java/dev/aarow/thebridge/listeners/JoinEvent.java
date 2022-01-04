package dev.aarow.thebridge.listeners;

import dev.aarow.thebridge.TheBridge;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.teleport(TheBridge.INSTANCE.getMapManager().gameMap.getWorld().getSpawnLocation());
        player.sendMessage(player.getWorld().getName());

    }
}
