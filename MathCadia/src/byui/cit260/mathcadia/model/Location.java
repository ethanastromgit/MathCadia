/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.model;

import java.io.Serializable;

public class Location implements Serializable {
    
    //Constructor
    
    
    private Enemies enemies;

    private boolean locationSafe;
    private boolean locationVisited;
    private boolean hasPotion;
    private int locColumn;
    private int locRow;

    public Location() {
        
    }
    
    public boolean isLocationSafe() {
        return locationSafe;
    }

    public void setLocationSafe(boolean isLocationSafe) {
        this.locationSafe = isLocationSafe;
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

    public int getLocColumn() {
        return locColumn;
    }

    public void setLocColumn(int locColumn) {
        this.locColumn = locColumn;
    }

    public int getLocRow() {
        return locRow;
    }

    public void setLocRow(int locRow) {
        this.locRow = locRow;
    }

    public Enemies getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }
    
}
