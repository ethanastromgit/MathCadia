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
    private Location playerLocation;

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

    public Location getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Location playerLocation) {
        this.playerLocation = playerLocation;
    }

}
