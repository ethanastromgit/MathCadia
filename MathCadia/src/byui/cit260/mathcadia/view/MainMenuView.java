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
public class MainMenuView {

    private String menu;
    
    public MainMenuView() {
        this.menu = "\n--------------------------------"
                  + "\n Main Menu                      "
                  + "\n--------------------------------"
                  + "\n N - Start New Game             "
                  + "\n L - Load Game                  "
                  + "\n S - Save Game                  "
                  + "\n R - Return to Player Location  "
                  + "\n H - Help Menu                  "
                  + "\n X - Exit Game                  "
                  + "\n--------------------------------";
    }
    
    public void displayMainMenuView() {
        
        boolean done = false; //Set flag to not done
        do {
            //Prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) { //User wants to quit
                return; //Exit game
            }
            
            //Do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }
    
    private String getMenuOption() {
        
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
            case "N": //Start New Game
                this.startNewGame();
                break;
            case "L": //Load Saved Game
                this.startExistingGame();
                break;
            case "S": //Save Current Game
                this.saveGame();
                break;
            case "H": //Display Help Menu
                this.displayHelpMenu();
                break;
            case "R": //Return to Player Location
                this.displayPlayerCurrentScene();
                break;
            case "X": //Exit Game
                this.exitGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
    private void startNewGame() {
        //Create new game
        GameControl.createNewGame(MathCadia.getPlayer());
        
        //Display the game menu view
        GameMenuView gameMenu = new GameMenuView();
        //Display the game menu
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        System.out.println("\n*** startSavedGame() function called ***");
    }
    
    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu() function called ***");
        //Display the help menu
        //HelpMenuView helpMenu = new HelpMenuView();
        //helpMenu.displayMenu();
    }
    
    private void displayPlayerCurrentScene() {
        System.out.println("\n*** displayPlayerCurrentScene() fucntion called ***");
    }
    
    private void exitGame() {
        
    }
    
    private void displayNextView(Player player) {
        
        //Display a custom welcome message
        System.out.println(
            "\n****************************************************"
        );
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //Display the main menu view
        mainMenuView.displayMenuView();
    }
}
