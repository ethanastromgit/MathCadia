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
    private int row;
    private int column;
    private boolean visited;
    private int amountRemaining;
    private int bonusRoom;
    private int coordinateNumber;

    //Getters and Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public int getBonusRoom() {
        return bonusRoom;
    }

    public void setBonusRoom(int bonusRoom) {
        this.bonusRoom = bonusRoom;
    }

    public int getCoordinateNumber() {
        return coordinateNumber;
    }

    public void setCoordinateNumber(int coordinateNumber) {
        this.coordinateNumber = coordinateNumber;
    }
    

    //hashCode()
    @Override    
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.row;
        hash = 11 * hash + this.column;
        hash = 11 * hash + (this.visited ? 1 : 0);
        hash = 11 * hash + this.amountRemaining;
        hash = 11 * hash + this.bonusRoom;
        hash = 11 * hash + this.coordinateNumber;
        return hash;
    }

    //equals()
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        if (this.bonusRoom != other.bonusRoom) {
            return false;
        }
        if (this.coordinateNumber != other.coordinateNumber) {
            return false;
        }
        return true;
    }

    //toString()
    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", bonusRoom=" + bonusRoom + ", coordinateNumber=" + coordinateNumber + '}';
    }
    
}
