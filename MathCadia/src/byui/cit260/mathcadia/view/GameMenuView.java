/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.control.PrintPlayerStats;
import byui.cit260.mathcadia.control.PrintInventoryStats;
import MathCadia.MathCadia;
import byui.cit260.mathcadia.exceptions.GameControlException;
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
                      + "\n L - call the printPlayer() function "
                      + "\n K - call the printInventory() function"
                  + "\n--------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "T": 
                TravelView tv = new TravelView();
                try {
                    tv.display();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "S": 
                InventoryView iv = new InventoryView();
                iv.displayLength();
                break;
            case "I": 
                SeeInventoryView siv = new SeeInventoryView();
                try {
                    siv.display();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "M":
                MapView mv = new MapView();
                try {
                    mv.display();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "Q": 
                return true;
            case "H": 
                HelpMenuView helpMenuView = new HelpMenuView();
                try {
                    helpMenuView.display();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "L": 
                this.printPlayerStatsView();
                break;
            case "K": 
                this.printInventoryStatsView();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
    private void printPlayerStatsView() {
        
        String filePath = null;
        boolean valid = false;
        
        this.console.println("\n\nEnter the file name for the file where the stats will be saved.");
        
        while (!valid) {
            try {
                
                filePath = this.keyboard.readLine();
                filePath = filePath.trim();
                
                if (filePath.length() < 1) {
                    this.console.println("\nInvalid value: value cannot be blank.");
                } else {
                    valid = true;
                }
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            PrintPlayerStats.printPlayer(MathCadia.getCurrentGame().getPlayer().getHealthPoints(), MathCadia.getCurrentGame().getPlayer().getKeyAmt(), filePath);
            this.console.println("\nPlayer stats successfully written to file" + filePath + ".");
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
    
    private void printInventoryStatsView() {
        
        String filePath = null;
        boolean valid = false;
        
        this.console.println("\n\nEnter the file path for the file where the stats will be saved.");
        
        while (!valid) {
            try {
                
                filePath = this.keyboard.readLine();
                filePath = filePath.trim();
                
                if (filePath.length() < 1) {
                    this.console.println("\nInvalid value: value cannot be blank.");
                } else {
                    valid = true;
                }
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            PrintInventoryStats.printInventory(MathCadia.getCurrentGame().getGamePlayer().getPlayerInventory().getPotionAmt(), MathCadia.getCurrentGame().getGamePlayer().getPlayerInventory().getVolume(), filePath);
            this.console.println("\nInventory stats successfully written to file" + filePath + ".");
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
    
}
