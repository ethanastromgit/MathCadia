/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
class MapView {
    
    private String menu;
    
    public MapView() {
        this.menu = "\n___________"
                  + "\n|    B    |"
                  + "\n|    E    |"
                  + "\n|         |"
                  + "\n|    E    |"
                  + "\n|         |"
                  + "\n|    E    |"
                  + "\n|         |"
                  + "\n|___ X ___|"
                  + "\n           "
                  + "\n B is the boss room."
                  + "\n E represents the enemies who each possess a key."
                  + "\n X represesnts the player's starting location."
                  + "\n           "
                  + "\n Q - Return to Game Menu";
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
        
        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            }
            break; //End the loop
        }
        
        return value; //Return entered value
    }
    
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "Q":
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
        
    }
    
}
