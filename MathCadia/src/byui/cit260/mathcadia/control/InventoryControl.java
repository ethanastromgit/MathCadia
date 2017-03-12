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

/**
 *
 * @author ethan
 */
public class InventoryControl {
    
    public InventoryControl() {
        
    }

    public static boolean validateLength(int input) {
        
        if (input <= 0) {
            return false;
        }
        else if (input > 10) {
            return false;
        }
        return true;
        
    }
    
    public static boolean validateWidth(int input) {
        
        if (input <= 0) {
            return false;
        }
        else if (input > 10) {
            return false;
        }
        return true;
        
    }
    
    public static boolean validateHeight(int input) {
        
        if (input <= 0) {
            return false;
        }
        else if (input > 10) {
            return false;
        }
        return true;
        
    }
    
    public static int calcInventoryVol(int length, int width, int height) {
    
        int volume = length * width * height;
      
        return volume;
    }

    public static int addPotion(int potionAmt, int maxPotionAmt, boolean hasPotion) {

        if (hasPotion == true && potionAmt != maxPotionAmt) {
            potionAmt++;
        } else if (potionAmt >= maxPotionAmt) {
            System.out.println("You cannot exceed the maximum carrying capacity of your inventory.");
        } else if (hasPotion == false) {
            System.out.println("You did not find a potion!");
        }
        return potionAmt;
    }

    public static int calcMaxPotionAmt(int volume) {
        int maxPotionAmt = Math.round(volume / 50);
        return maxPotionAmt;
    }

}
