/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author danielhernandez
 */
public class Inventory implements Serializable {
    
    //Constructor
    public Inventory() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.maxPotionAmt = 1;
        this.volume = 50;
        this.potionAmt = 0;
    }
    
    //Atributes
    private static int potionAmt;
    private static int volume;
    private static int maxPotionAmt;
    private static int length;
    private static int width;
    private static int height;
    
   //Getter & Setter

    public static int getPotionAmt() {
        return potionAmt;
    }

    public static void setPotionAmt(int potionAmt) {
        Inventory.potionAmt = potionAmt;
    }

    public static int getVolume() {
        return volume;
    }

    public static void setVolume(int volume) {
        Inventory.volume = volume;
    }

    public static int getMaxPotionAmt() {
        return maxPotionAmt;
    }

    public static void setMaxPotionAmt(int maxPotionAmt) {
        Inventory.maxPotionAmt = maxPotionAmt;
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        Inventory.length = length;
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        Inventory.width = width;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Inventory.height = height;
    }

    
    
}
