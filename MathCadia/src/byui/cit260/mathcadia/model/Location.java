/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable {
    
    //Constructor
    public Location() {
        
    }
    
    //Attributes
    private boolean isEnemyHere;
    private boolean hasPotion;
    private String coordinate;
    private int locationX;
    private int locationY;
    private boolean nullCoordinate;

    //Getters and Setters

    public boolean isIsEnemyHere() {
        return isEnemyHere;
    }

    public void setIsEnemyHere(boolean isEnemyHere) {
        this.isEnemyHere = isEnemyHere;
    }

    public boolean isHasPotion() {
        return hasPotion;
    }

    public void setHasPotion(boolean hasPotion) {
        this.hasPotion = hasPotion;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public boolean isNullCoordinate() {
        return nullCoordinate;
    }

    public void setNullCoordinate(boolean nullCoordinate) {
        this.nullCoordinate = nullCoordinate;
    }
    
}
