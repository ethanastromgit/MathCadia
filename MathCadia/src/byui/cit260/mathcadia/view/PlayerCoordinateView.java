/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.model.Location;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ethan
 */
public class PlayerCoordinateView {
    
    Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
    
    private String menu;
    
    protected final BufferedReader keyboard = MathCadia.getInFile();
    protected final PrintWriter console = MathCadia.getOutFile();
    
    public PlayerCoordinateView() {
       this.menu = "\n Your player location is " + playerLocation.getLocRow() + ", " + playerLocation.getLocColumn() + "."
               + "\n\n Q - Return to Game Menu";
    }
    
    
    
    public void display() {
        
        boolean done = false; //Set flag to not done
        do {
            //Prompt for and get players name
            String input = this.getInput();
            if (input.toUpperCase().equals("X")) { //User wants to quit
                return; //Exit game
            }
            
            //Do the requested action and display the next view
            done = this.doAction(input);
            
        } while (!done);
    }
    
    private String getInput() {
        
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid
        
        while (!valid) {
            this.console.println("\n" + this.menu);
            
            try {
                value = keyboard.readLine(); //Get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(EnemyThreeView.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid: entry required.");
                continue;
            }
            break; //End the loop
        }
        
        return value; //Return entered value
    }
    
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
            
    }
}
