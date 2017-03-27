package byui.cit260.mathcadia.model;

import java.io.Serializable;

public class Game implements Serializable {

    //Attributes
    private Player gamePlayer;
    private Map gameMap;
    
    //Constructor
    public Game() {
        
    }
    
    //Getters and Setters
    public Player getPlayer() {
        return gamePlayer;
    }

    public void setPlayer(Player player) {
        this.gamePlayer = player;
    }

    public Map getMap() {
        return gameMap;
    }

    public void setMap(Map map) {
        this.gameMap = map;
    }

    public Player getGamePlayer() {
        return gamePlayer;
    }

    public void setGamePlayer(Player gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public Map getGameMap() {
        return gameMap;
    }

    public void setGameMap(Map gameMap) {
        this.gameMap = gameMap;
    }
    
}
