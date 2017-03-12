package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;


public class Player implements Serializable {
    
    private Game[] game;
    
    //Constructor
    public Player() {
        this.name = null;
        this.healthPoints = 10;
        this.keyAmt = 0;
        this.skipAmt = 2;
        this.playerPosX = 1;
        this.playerPosY = 0;
    }
    
    //Attributes
    private String name;
    private static int healthPoints;
    private static int keyAmt;
    private static int skipAmt;
    private static int playerPosX;
    private static int playerPosY;

    //Getters & Setters

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getHealthPoints() {
        return healthPoints;
    }

    public static void setHealthPoints(int healthPoints) {
        Player.healthPoints = healthPoints;
    }

    public static int getKeyAmt() {
        return keyAmt;
    }

    public static void setKeyAmt(int keyAmt) {
        Player.keyAmt = keyAmt;
    }

    public static int getSkipAmt() {
        return skipAmt;
    }

    public static void setSkipAmt(int skipAmt) {
        Player.skipAmt = skipAmt;
    }

    public static int getPlayerPosX() {
        return playerPosX;
    }

    public static void setPlayerPosX(int playerPosX) {
        Player.playerPosX = playerPosX;
    }

    public static int getPlayerPosY() {
        return playerPosY;
    }

    public static void setPlayerPosY(int playerPosY) {
        Player.playerPosY = playerPosY;
    }

    
    
    
}
