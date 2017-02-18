/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.control.GameControl;
import byui.cit260.mathcadia.model.Player;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        //promptMessage = "Please enter your name"
        
        this.promptMessage = "\nPlease enter your name:";
        //display banner when view is created
        
        this.displayBanner();
    }
    
    private void displayBanner() {
        System.out.println(
            "\n****************************************************************"
          + "\n*                                                              *"
          + "\n*            |*   *|     *     *******  |     |                *"
          + "\n*            | * * |    * *       |     |*****|                *"
          + "\n*            |  *  |   *---*      |     |     |                *"
          + "\n*            |     |  *     *     |     |     |                *"
          + "\n*          ****     *     |****   *******     *                *"
          + "\n*         |        * *    |    |     |       * *               *"
          + "\n*         |       *---*   |    |     |      *****              *"
          + "\n*          ****  *     *  |****   *******  *     *             *"
          + "\n*                                                              *"
          + "\n****************************************************************"
            );
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); //Trim off leading and traling blanks
            
            if (value.length() < 1) { //Value is blank
                System.out.println("\nInvalid: name cannot be blank");
                continue;
            }
            break; //End the loop
        }
        return value; //Return entered value
    }

    private boolean doAction(String playersName) {
        
        if(playersName.length() < 2) {
            System.out.println("\nInvalid players name: Your name must be mor ethan one character in length.");
            return false;
        }
        
        //Call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //Display next view
        this.displayNextView(player);
        
        return true; //Success
    }
    
    private void displayNextView(Player player) {
        
        //Display a custom welcom message
        System.out.println("\n=================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n=================================="
        );
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
    public void displayStartProgramView() {
        //System.out.println("\n*** displayStartProgram() function called ***");
        
        boolean done = false; //Set flag to not done
        do {
            //Prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //User wants to quit
                return; //Exit the game
            
            //Do the reqested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
        
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid
        
        while (!valid) { //Loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //End the loop
        }
        
        return value; //Return the value entered
    }
}
