package byui.cit260.mathcadia.model;

import java.awt.Point;
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
    }
    
    //Attributes
    private String name;
    private static int healthPoints;
    private static int keyAmt;
    private static int skipAmt;
    private static Point coordinates;

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

    public static Point getCoordinates() {
        return coordinates;
    }

    public static void setCoordinates(Point coordinates) {
        Player.coordinates = coordinates;
    }

    
    
}
