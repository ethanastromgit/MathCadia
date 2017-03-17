/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.control.GameControl;
import citbyui.cit260.mathcadia.exceptions.GameControlException;
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
                + "\n R - Return to Current Game     "
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
            case "R": //Return to Player Location
                this.returnToGame();
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

        /*
        GameControl gc = new GameControl();
        Player player = MathCadia.getPlayer();
        gc.createNewGame(player);
        player.setPlayerPosition(MathCadia.getCurrentGame().getGameMap().getMapEntrance();
        
        GameMenuView gameMenu = new GameMenuView;
        try {
            gameMenu.display();
        } catch (GameControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        //Create new game
        GameControl.createNewGame(MathCadia.getPlayer());

        //Display the game menu view
        GameMenuView gameMenu = new GameMenuView();
        //Display the game menu
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n*** startSavedGame() function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void returnToGame() {
        System.out.println("\n*** displayMap() fucntion called ***");
    }

    private void exitGame() {

    }

}
