package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Game implements Serializable {

    //Attributes
    private Player player;
    private Inventory inventory;
    private Map map;
    private Enemies[] enemies;
    
    //Constructor
    public Game() {
        
    }
    
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

    public Enemies[] getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemies[] enemies) {
        this.enemies = enemies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.player);
        hash = 97 * hash + Objects.hashCode(this.inventory);
        hash = 97 * hash + Objects.hashCode(this.map);
        hash = 97 * hash + Arrays.deepHashCode(this.enemies);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.enemies, other.enemies)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", inventory=" + inventory + ", map=" + map + ", enemies=" + enemies + '}';
    }

    
    
}
