package byui.cit260.mathcadia.model;

import java.io.Serializable;


public class Player implements Serializable {
    
    private Inventory inventory;
    
    //Constructor

    public Player() {
        
    }
    
    //Attributes
    private String name;
    private int healthPoints;
    private int keyAmt;
    private int skipAmt;
    private int column;
    private int row;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
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

    
    
}
