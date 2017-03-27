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
            case "L": //Load Saved Game
                this.loadGame();
                break;
            case "H": //Display Help Menu
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
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
        
        gameMenu.display();
    }
    
    private void saveGame() {
        
        SaveGameView sgv = new SaveGameView();
        String filePath = sgv.getInput();
        
        try {
            GameControl.saveGame(MathCadia.getCurrentGame(), filePath);
            this.console.println("\nGame has successfuly save as " + filePath + ".");
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void loadGame() {
        
        this.console.print("\n\nEnter the file path for the file "
                + "where the game is saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.loadGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void exitGame() {
        
    }

}
