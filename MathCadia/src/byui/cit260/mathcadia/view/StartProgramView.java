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
          + "\n* You are a student of the prestigious university known as     *"
          + "\n* MathCadia, a school that studies in the mystic arts of       *"
          + "\n* mathematics and magic. You will use the power of algebraic   *"
          + "\n* spells by solving or skipping problems involving different   *"
          + "\n* aspects of math. Your knowledge in the math arts can be used *"
          + "\n* to fight monsters. Along your journey, you may find potions  *"
          + "\n* that will help you recover from the enemies you encounter.   *"
          + "\n* You are working to gain the title of Math Master and finally *"
          + "\n* graduate from your studies.                                  *"
          + "\n*                                                              *"
          + "\n* This game will cover the player character studying for an    *"
          + "\n* exam by sparring with a few simple monsters, each having a   *"
          + "\n* challenge to be completed. The user will defeat these        *"
          + "\n* enemies to gain three keys.                                  *"
          + "\n*                                                              *"
          + "\n* The goal of this game is for the player to survive through   *"
          + "\n* the challenges with their health points intact and to beat   *"
          + "\n* the final boss after finding all three keys.                 *"
          + "\n****************************************************************"
            );
    }

    /*private String getPlayerName() {
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
    }*/

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
