/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.control.InventoryControl;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class SeeInventoryView extends View {
    
    Inventory i = new Inventory();
    Player p = new Player();
    InventoryControl ic = new InventoryControl();
    
    
    int currentPotionDisplay = i.getPotionAmt();
    int playerCurrentHealthPoints = p.getHealthPoints();
    int volume = i.getVolume();
    int maxPotionDisplay = i.getMaxPotionAmt();
    
    int maxPotionAmt = ic.calcMaxPotionAmt(volume);
    
    public SeeInventoryView() {
        
        super("\n M - See how many potions you can hold."
            + "\n P - See how many potions you currently have."
            + "\n H - See how many health points your player currently has."
            + "\n Q - Return to Game Menu");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "M":
                i.setMaxPotionAmt(maxPotionAmt);
                System.out.println("\n You can hold a maximum of " 
                                 + maxPotionDisplay
                                 + " potions.");
                break;
            case "P":
                System.out.println("\n You currently have "
                                 + currentPotionDisplay
                                 + " potions.");
                break;
            case "H":
                System.out.println("\n Your player currently has "
                                 + playerCurrentHealthPoints
                                 + " health points.");
                break;
            case "Q":
                return true;  
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
        
    }
    
}