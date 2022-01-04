package dev.aarow.thebridge;

import dev.aarow.thebridge.game.GameManager;
import dev.aarow.thebridge.listeners.JoinEvent;
import dev.aarow.thebridge.map.MapManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TheBridge extends JavaPlugin {

    public static TheBridge INSTANCE;
    private GameManager gameManager;
    private MapManager mapManager;

    @Override
    public void onEnable(){
        INSTANCE = this;
        this.gameManager = new GameManager();
        this.mapManager = new MapManager();
        getMapManager().loadMap();

        this.registerCommands();
        this.registerListeners();
    }

    @Override
    public void onDisable(){

    }

    void registerListeners(){
        Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
    }

    void registerCommands(){

    }

    public GameManager getGameManager(){
        return gameManager;
    }

    public MapManager getMapManager(){
        return mapManager;
    }
}
