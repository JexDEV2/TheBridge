package dev.aarow.thebridge.map;

import dev.aarow.thebridge.TheBridge;

import java.io.File;

public class MapManager {

    public GameMap gameMap;

    public void loadMap(){
        TheBridge.INSTANCE.getDataFolder().mkdirs();

        File gameMapsFolder = new File(TheBridge.INSTANCE.getDataFolder(), "gameMaps");
        if(!gameMapsFolder.exists()){
            gameMapsFolder.mkdirs();
        }
        gameMap = new LocalGameMap(gameMapsFolder, "Galaxy", true);
    }

    public GameMap getGameMap(){
        return gameMap;
    }
}
