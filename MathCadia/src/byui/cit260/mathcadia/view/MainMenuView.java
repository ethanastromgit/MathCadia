/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.control.GameControl;
import byui.cit260.mathcadia.exceptions.GameControlException;
import byui.cit260.mathcadia.exceptions.LoseGameException;
import byui.cit260.mathcadia.exceptions.MapControlException;
import byui.cit260.mathcadia.exceptions.WinGameException;
import byui.cit260.mathcadia.model.Game;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ethan
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n--------------------------------"
                + "\n Main Menu                      "
                + "\n--------------------------------"
                + "\n N - Start New Game             "
                + "\n R - Return to Current Game     "
                + "\n S - Save Game                  "
                + "\n L - Load Game                  "
                + "\n H - Help Menu                  "
                + "\n X - Exit Game                  "
                + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //Convert choice to upper case

        switch (value) {
            case "N": //Start New Game
                try {
                    this.startNewGame();
                } catch (GameControlException | MapControlException ge) {
                    ErrorView.display(this.getClass().getName(),
                            ge.getMessage());
                }
                break;
            case "R": //Return to Current Game
                this.returnToCurrentGame();
                break;
            case "S": //Save Current Game
                this.saveGame();
                break;
            case "L":
                try {
                    this.loadGame();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "H": //Display Help Menu
                HelpMenuView helpMenuView = new HelpMenuView();
                try {
                    helpMenuView.display();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "X": //Exit Game
                this.exitGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void startNewGame() throws GameControlException, MapControlException {

        //Create new game
        GameControl.createNewGame(MathCadia.getPlayer());

        try {
            //Display the game menu view
            GameMenuView gameMenu = new GameMenuView();
            //Display the game menu
            gameMenu.display();
        } catch (LoseGameException lge) {
            ErrorView.display(this.getClass().getName(),
                    lge.getMessage());
        } catch (WinGameException wge) {
            ErrorView.display(this.getClass().getName(),
                    wge.getMessage());
        }
          
    }

    private void returnToCurrentGame() {
        MathCadia.getCurrentGame().getPlayer();
        GameMenuView gameMenu = new GameMenuView();
        
        try {
            gameMenu.display();
        } catch (GameControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void saveGame() {
        
        SaveGameView sgv = new SaveGameView();
        String filePath = sgv.getInput();
        
        try {
            GameControl.saveGame(MathCadia.getCurrentGame(), filePath);
            this.console.println("\nGame has successfuly saved as " + filePath + ".");
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void loadGame() throws GameControlException {
        
        LoadGameView loadGameView = new LoadGameView();
        String filePath = loadGameView.getInput();

        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        MathCadia.setCurrentGame(game);
        MathCadia.setPlayer(MathCadia.getCurrentGame().getGamePlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        try {
            gameMenu.display();
        } catch (GameControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        this.console.print("\n\nEnter the file path for the file "
//                + "where the game is saved.");
//        
//        String filePath = this.getInput();
//        
//        try {
//            GameControl.loadGame(filePath);
//        } catch (Exception ex) {
//            ErrorView.display("MainMenuView", ex.getMessage());
//        }
//        
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.display();
    }

    private void exitGame() {
        
        try {
            this.console.println("Do you wish to save the game before exiting?  Y/N");

            String answer = null;

            answer = this.keyboard.readLine();
            answer.trim();
            
            if ((answer.toUpperCase().charAt(0)) == 'Y') {
                this.saveGame();
            }
            
            System.exit(0);
            
        } catch (IOException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

}
