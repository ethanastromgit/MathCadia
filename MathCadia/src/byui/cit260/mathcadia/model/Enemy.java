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
public class Enemy implements Serializable {
    
    //Constructor
    public Enemy(String nameOfMonster, String monsterDescription, int healthPoints, int coordinateNumber) {
        
    }
    
    //Attributes
    private String nameOfMonster;
    private String monsterDescription;
    private int healthPoints;
    private int coordinateNumber;

    //Getter & Setters
    public String getNameOfMonster() {
        return nameOfMonster;
    }

    public void setNameOfMonster(String nameOfMonster) {
        this.nameOfMonster = nameOfMonster;
    }

    public String getMonsterDescription() {
        return monsterDescription;
    }

    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getCoordinateNumber() {
        return coordinateNumber;
    }

    public void setCoordinateNumber(int coordinateNumber) {
        this.coordinateNumber = coordinateNumber;
    }

    //hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nameOfMonster);
        hash = 41 * hash + Objects.hashCode(this.monsterDescription);
        hash = 41 * hash + this.healthPoints;
        hash = 41 * hash + this.coordinateNumber;
        return hash;
    }
    //Equals
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
        final Enemy other = (Enemy) obj;
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.coordinateNumber != other.coordinateNumber) {
            return false;
        }
        if (!Objects.equals(this.nameOfMonster, other.nameOfMonster)) {
            return false;
        }
        if (!Objects.equals(this.monsterDescription, other.monsterDescription)) {
            return false;
        }
        return true;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Enemies{" + "nameOfMonster=" + nameOfMonster + ", monsterDescription=" + monsterDescription + ", healthPoints=" + healthPoints + ", coordinateNumber=" + coordinateNumber + '}';
    }
   
      
}
