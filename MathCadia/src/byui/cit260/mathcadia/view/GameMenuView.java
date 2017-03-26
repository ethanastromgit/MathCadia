/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.model.Game;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ethan
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
              super("\n--------------------------------"
                  + "\n Game Menu                      "
                  + "\n--------------------------------"
                  + "\n T - Move Player                "
                  + "\n S - Set Up Inventory           "
                  + "\n I - View Inventory             "
                  + "\n M - View Map                   "
                  + "\n Q - Main Menu                  "
                  + "\n H - Help Menu                 "
                      + "\n"
                      + "\n L - call the printInventory() function "
                      + "\n K - call the printPlayer() function"
                  + "\n--------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "T": 
                TravelView tv = new TravelView();
                tv.display();
                break;
            case "S": 
                InventoryView iv = new InventoryView();
                iv.displayLength();
                break;
            case "I": 
                SeeInventoryView siv = new SeeInventoryView();
                siv.display();
                break;
            case "M":
                MapView mv = new MapView();
                mv.display();
                break;
            case "Q": 
                return true;
            case "H": 
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "L": 
                try {
                    PrintInventoryStats.printInventory(0, 0, choice);
                } catch (IOException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "K": 
                try {
                    PrintPlayerStats.printPlayer(0, 0, choice);
                } catch (IOException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
    private void displayMap() {
        StringBuilder line;
        
        Game game = MathCadia.getCurrentGame();
       // Location[][] location = game.getMap().getLocation[][];
    }
}
