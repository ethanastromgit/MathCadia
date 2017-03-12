package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Game implements Serializable {

    //Constructor
    public Game() {
        
    }

    //Attributes
    private Player player;
    private Inventory inventory;
    private Map map;
    private Enemies enemies;
    
    //Getters and Setters

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Enemies getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }
    
}
