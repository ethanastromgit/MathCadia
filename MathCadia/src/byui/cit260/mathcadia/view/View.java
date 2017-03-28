/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ethan
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = MathCadia.getInFile();
    protected final PrintWriter console = MathCadia.getOutFile();
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() throws GameControlException {
        
        boolean done = false; //Set flag to not done
        do {
            //Prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("X")) { //User wants to quit
                return; //Exit game
            }
            
            try {
                //Do the requested action and display the next view
                done = this.doAction(value);
            } catch (GameControlException gce) {
                ErrorView.display(this.getClass().getName(), gce.getMessage());
            }
                
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        String value = null;
        boolean valid = false;
        
        while (!valid) {
            this.console.println("\n" + this.displayMessage);
            
            try {
                value = this.keyboard.readLine(); //Get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
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
    
}
