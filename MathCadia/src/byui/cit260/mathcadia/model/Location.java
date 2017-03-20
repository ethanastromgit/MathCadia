/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.model;

import java.io.Serializable;

public class Location implements Serializable {
    
    //Constructor
    public Location() {
        
    }
    
    //Attributes
    private boolean locationType;
    private boolean locationVisited;
    private boolean hasPotion;
    private int col;
    private int row;
    private Enemies enemies;

    //Getters and Setters

    public boolean isLocationType() {
        return locationType;
    }

    public void setLocationType(boolean locationType) {
        this.locationType = locationType;
    }

    public boolean isLocationVisited() {
        return locationVisited;
    }

    public void setLocationVisited(boolean locationVisited) {
        this.locationVisited = locationVisited;
    }

    public boolean isHasPotion() {
        return hasPotion;
    }

    public void setHasPotion(boolean hasPotion) {
        this.hasPotion = hasPotion;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Enemies getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }
    
}
