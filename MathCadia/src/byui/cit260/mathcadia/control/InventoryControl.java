/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

/**
 *
 * @author ethan
 */
public class InventoryControl {
    
    public int calcInventoryVol(length, width, height) {
	if(length <= 0 || width <= 0 || height <= 0)
		return -1;
        else if((length * width * height) > 1000)
		return -1;
	return length * width * height;		
    }
    
    public void addPotion(potionAmt, maxPotionAmt, hasPotion) {
        
        if(hasPotion == true && potionAmt != maxPotionAmt) {
            potionAmt++;
        }
        else if(potionAmt >= maxPotionAmt) {
            System.out.println("You cannot exceed the maximum carrying capacity of your inventory.");
            break;
        }
        else if(hasPotion == false) {
            break;
        }
        
    }
    
    public void calcMaxPotionAmt(volume, maxPotionAmt) {
        maxPotionAmt = volume / 50;
        break;
    }
    
}
