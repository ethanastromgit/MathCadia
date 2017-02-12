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
        
    }
    
    //Atributes
    private int potionAmt;
    private int volume;
    private int maxPotionAmt;
    private int length;
    private int width;
    private int height;
    
   //Getter & Setter

    public int getPotionAmt() {
        return potionAmt;
    }

    public void setPotionAmt(int potionAmt) {
        this.potionAmt = potionAmt;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxPotionAmt() {
        return maxPotionAmt;
    }

    public void setMaxPotionAmt(int maxPotionAmt) {
        this.maxPotionAmt = maxPotionAmt;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}
