/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathCadia;

import java.io.Serializable;

/**
 *
 * @author ethan
 */
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
    
}
