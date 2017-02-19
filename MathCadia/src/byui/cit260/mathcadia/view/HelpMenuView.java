/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.view.GameMenuView;
import byui.cit260.mathcadia.control.GameControl;
import byui.cit260.mathcadia.model.Player;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class HelpMenuView {
    
    private String menu;
    
    private void HelpMenuView() {
        this.menu = "\n-------------------------------------"
                  + "\n Help Menu                           "
                  + "\n-------------------------------------"
                  + "\n P - What is the purpose of the game "
                  + "\n M - How to move in the game         "
                  + "\n R - Rules of the game               "
                  + "\n Q - Return to Main Menu             "
                  + "\n-------------------------------------";
    }
    
    public void displayHelpMenuView() {
        
        boolean done = false; //Set flag to not done
        do {
            //Prompt for and get players name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("X")) { //User wants to quit
                return; //Exit game
            }
            
            //Do the requested action and display the next view
            done = this.doActionHelpMenu(helpMenuOption);
            
        } while (!done);
    }
    
    private String getHelpMenuOption() {
        
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
    
    private boolean doActionHelpMenu(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "P": 
                this.displayGamePurpose();
                break;
            case "M": 
                this.displayHowToMove();
                break;
            case "R": 
                this.displayRules();
                break;
            case "Q": //Display Help Menu
                this.displayHelpMenuView();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
    private void displayGamePurpose() {
        System.out.println("Defeat all enemies to obtain three keys to open the boss room. Finally, defeat the boss and gradute from MathCadia.");
    }
            
    private void displayHowToMove() {
        System.out.println("You move in any of the four directions - North, South, East, and West - by typing the first character of the corresponding direction.");
    }  
    
    private void displayRules() {
        System.out.println("If you run of out health points, you lose. You may not move in a direction that would take you off the map. Having all three keys is a must to gain access to the boss room. Defeating the boss allows you to win.");
    }
}
