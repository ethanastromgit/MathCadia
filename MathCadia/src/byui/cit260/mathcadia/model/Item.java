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
public class Item implements Serializable {
    
    //Constructor
    public Item() {
        
    }
    
    //Atributes
    private int quantityInStock;
    
   //Getter & Setter
    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    //Hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.quantityInStock;
        return hash;
    }
    
    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        return true;
    }
    
    //toString
    @Override
    public String toString() {
        return "Item{" + "quantityInStock=" + quantityInStock + '}';
    }
    
    
    
}
