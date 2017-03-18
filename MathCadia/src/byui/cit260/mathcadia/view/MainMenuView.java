/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.control.GameControl;
import citbyui.cit260.mathcadia.exceptions.GameControlException;
import citbyui.cit260.mathcadia.exceptions.LoseGameException;
import citbyui.cit260.mathcadia.exceptions.MapControlException;

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
                + "\n L - Load Game                  "
                + "\n S - Save Game                  "
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
                    System.out.println(ge.getMessage());
                }
                break;
            case "L": //Load Saved Game
                this.startExistingGame();
                break;
            case "S": //Save Current Game
                this.saveGame();
                break;
            case "H": //Display Help Menu
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
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

    private void startNewGame() throws GameControlException, MapControlException {

        //Create new game
        GameControl.createNewGame(MathCadia.getPlayer());

        try {
            //Display the game menu view
            GameMenuView gameMenu = new GameMenuView();
            //Display the game menu
            gameMenu.display();
        } catch (LoseGameException lge) {
            System.out.println(lge.getMessage());
        }
    }

    private void startExistingGame() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        GameControl.saveCurrentGame(MathCadia.getCurrentGame());
    }

    private void exitGame() {
        
    }

}
