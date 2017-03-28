package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {

    private Inventory playerInventory;

    //Constructor
    public Player() {

    }

    //Attributes
    private String name;
    private int healthPoints;
    private int keyAmt;
    private int skipAmt;
    private Location playerPosition;

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(Inventory playerInventory) {
        this.playerInventory = playerInventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getKeyAmt() {
        return keyAmt;
    }

    public void setKeyAmt(int keyAmt) {
        this.keyAmt = keyAmt;
    }

    public int getSkipAmt() {
        return skipAmt;
    }

    public void setSkipAmt(int skipAmt) {
        this.skipAmt = skipAmt;
    }

    public Location getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(Location playerPosition) {
        this.playerPosition = playerPosition;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.playerInventory);
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.healthPoints;
        hash = 47 * hash + this.keyAmt;
        hash = 47 * hash + this.skipAmt;
        hash = 47 * hash + Objects.hashCode(this.playerPosition);
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
        final Player other = (Player) obj;
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.keyAmt != other.keyAmt) {
            return false;
        }
        if (this.skipAmt != other.skipAmt) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.playerInventory, other.playerInventory)) {
            return false;
        }
        if (!Objects.equals(this.playerPosition, other.playerPosition)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "playerInventory=" + playerInventory + ", name=" + name + ", healthPoints=" + healthPoints + ", keyAmt=" + keyAmt + ", skipAmt=" + skipAmt + ", playerPosition=" + playerPosition + '}';
    }

}
