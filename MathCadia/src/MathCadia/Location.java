/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathCadia;

import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable {
    
    //Constructor
    public Location(int row, int column, boolean visited, int amountRemaining, int bonusRoom, int number) {
        this.row = row;
        this.column = column;
        this.visited = visited;
        this.amountRemaining = amountRemaining;
        this.bonusRoom = bonusRoom;
        this.number = number;
    }
    
    //Attributes
    private int row;
    private int column;
    private boolean visited;
    private int amountRemaining;
    private int bonusRoom;
    private int number;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //hashCode()
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.row;
        hash = 73 * hash + this.column;
        hash = 73 * hash + (this.visited ? 1 : 0);
        hash = 73 * hash + this.amountRemaining;
        hash = 73 * hash + this.bonusRoom;
        hash = 73 * hash + this.number;
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
        if (this.number != other.number) {
            return false;
        }
        return true;
    }

    //toString()
    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", bonusRoom=" + bonusRoom + ", number=" + number + '}';
    }
    
}
