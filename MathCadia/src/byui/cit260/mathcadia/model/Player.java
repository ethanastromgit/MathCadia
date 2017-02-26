package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;


public class Player implements Serializable {
    
    //Constructor
    public Player() {
        
    }
    
    //Attributes
    private String name;
    private int healthPoints;
    private int keyAmt;
    private int skipAmt;
    private int playerPosX;
    private int playerPosY;

    //Getters & Setters

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

    public int getPlayerPosX() {
        return playerPosX;
    }

    public void setPlayerPosX(int playerPosX) {
        this.playerPosX = playerPosX;
    }

    public int getPlayerPosY() {
        return playerPosY;
    }

    public void setPlayerPosY(int playerPosY) {
        this.playerPosY = playerPosY;
    }

    
    
}
