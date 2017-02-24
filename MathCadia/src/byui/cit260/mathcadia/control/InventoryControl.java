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

    public void calcInventoryVol(int length, int width, int height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            return;
        } else if ((length * width * height) > 1000) {
            return;
        }
        
        int volume = length * width * height;
        
        Inventory i = new Inventory();
        i.setVolume(volume);
    }

    public int addPotion(int potionAmt, int maxPotionAmt, boolean hasPotion) {

        if (hasPotion == true && potionAmt != maxPotionAmt) {
            potionAmt++;
        } else if (potionAmt >= maxPotionAmt) {
            System.out.println("You cannot exceed the maximum carrying capacity of your inventory.");
        } else if (hasPotion == false) {
            System.out.println("You did not find a potion!");
        }
        return potionAmt;
    }

    public void calcMaxPotionAmt(int volume, int maxPotionAmt) {
        maxPotionAmt = volume / 50;
    }

}
