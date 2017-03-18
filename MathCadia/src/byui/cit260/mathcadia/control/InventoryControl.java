/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import byui.cit260.mathcadia.model.Enemies;
import byui.cit260.mathcadia.model.Game;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Location;
import byui.cit260.mathcadia.model.Map;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.InventoryControlException;

/**
 *
 * @author ethan
 */
public class InventoryControl {
    
    public InventoryControl() {
        
    }

    public static boolean validateLength(int input) throws InventoryControlException {
        
        if (input <= 0) {
            throw new InventoryControlException("Length cannot be equal to or less than 0.");
        }
        else if (input > 10) {
            throw new InventoryControlException("Length cannot be greater than 10.");
        }
        return true;
        
    }
    
    public static boolean validateWidth(int input) throws InventoryControlException {
        
        if (input <= 0) {
            throw new InventoryControlException("Width cannot be equal to or less than 0.");
        }
        else if (input > 10) {
            throw new InventoryControlException("Width cannot be greater than 10.");
        }
        return true;
        
    }
    
    public static boolean validateHeight(int input) throws InventoryControlException {
        
        if (input <= 0) {
            throw new InventoryControlException("Height cannot be equal to or less than 0.");
        }
        else if (input > 10) {
            throw new InventoryControlException("Height cannot be greater than 10.");
        }
        return true;
        
    }
    
    public static int calcInventoryVol(int length, int width, int height) {
    
        int volume = length * width * height;
      
        return volume;
    }

    public static int addPotion(int potionAmt, int maxPotionAmt, boolean hasPotion) throws InventoryControlException {

        if (hasPotion == true && potionAmt != maxPotionAmt) {
            potionAmt++;
        } else {
            throw new InventoryControlException("You did not get a potion. Either the location did not have a potion or you are carrying too many potions.");
        }
        return potionAmt;
    }

    public static int calcMaxPotionAmt(int volume) {
        int maxPotionAmt = Math.round(volume / 50);
        return maxPotionAmt;
    }

}
