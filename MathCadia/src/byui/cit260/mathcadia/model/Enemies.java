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
public class Enemies implements Serializable {
    
    private final int attackDamage = 2;
    
    private final String enemyOneDescription = "First enemy with key.";
    private final String enemyOneEquation = "What is 5 + 3?";
    private final String enemyOneAnswer = "8";
    private int enemyOneColumn;
    private int enemyOneRow;
    
    private final String enemyTwoDescription = "Second enemy with key.";
    private final String enemyTwoEquation = "What is 7 * 5?";
    private final String enemyTwoAnswer = "35";
   private int enemyTwoColumn;
    private int enemyTwoRow;
    
    private final String enemyThreeDescription = "Third enemy with key.";
    private final String enemyThreeEquation = "What is 54 / 9?";
    private final String enemyThreeAnswer = "6";
    private int enemyThreeColumn;
    private int enemyThreeRow;
    
    private final String bossDescription = "Final enemy. Game is over after defeated.";
    private final String bossEquation = "What is 6 + 8 * 3 - 9 / 3?";
    private final String bossAnswer = "27";
    private int bossColumn;
    private int bossRow;

    public Enemies() {

    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getEnemyOneDescription() {
        return enemyOneDescription;
    }

    public String getEnemyOneEquation() {
        return enemyOneEquation;
    }

    public String getEnemyOneAnswer() {
        return enemyOneAnswer;
    }

    public String getEnemyTwoDescription() {
        return enemyTwoDescription;
    }

    public String getEnemyTwoEquation() {
        return enemyTwoEquation;
    }

    public String getEnemyTwoAnswer() {
        return enemyTwoAnswer;
    }

    public String getEnemyThreeDescription() {
        return enemyThreeDescription;
    }

    public String getEnemyThreeEquation() {
        return enemyThreeEquation;
    }

    public String getEnemyThreeAnswer() {
        return enemyThreeAnswer;
    }

    public String getBossDescription() {
        return bossDescription;
    }

    public String getBossEquation() {
        return bossEquation;
    }

    public String getBossAnswer() {
        return bossAnswer;
    }
    
    public int getEnemyOneColumn() {
        return enemyOneColumn;
    }

    public void setEnemyOneColumn(int enemyOneColumn) {
        this.enemyOneColumn = enemyOneColumn;
    }

    public int getEnemyOneRow() {
        return enemyOneRow;
    }

    public void setEnemyOneRow(int enemyOneRow) {
        this.enemyOneRow = enemyOneRow;
    }

    public int getEnemyTwoColumn() {
        return enemyTwoColumn;
    }

    public void setEnemyTwoColumn(int enemyTwoColumn) {
        this.enemyTwoColumn = enemyTwoColumn;
    }

    public int getEnemyTwoRow() {
        return enemyTwoRow;
    }

    public void setEnemyTwoRow(int enemyTwoRow) {
        this.enemyTwoRow = enemyTwoRow;
    }

    public int getEnemyThreeColumn() {
        return enemyThreeColumn;
    }

    public void setEnemyThreeColumn(int enemyThreeColumn) {
        this.enemyThreeColumn = enemyThreeColumn;
    }

    public int getEnemyThreeRow() {
        return enemyThreeRow;
    }

    public void setEnemyThreeRow(int enemyThreeRow) {
        this.enemyThreeRow = enemyThreeRow;
    }

    public int getBossColumn() {
        return bossColumn;
    }

    public void setBossColumn(int bossColumn) {
        this.bossColumn = bossColumn;
    }

    public int getBossRow() {
        return bossRow;
    }

    public void setBossRow(int bossRow) {
        this.bossRow = bossRow;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.attackDamage;
        hash = 67 * hash + Objects.hashCode(this.enemyOneDescription);
        hash = 67 * hash + Objects.hashCode(this.enemyOneEquation);
        hash = 67 * hash + Objects.hashCode(this.enemyOneAnswer);
        hash = 67 * hash + this.enemyOneColumn;
        hash = 67 * hash + this.enemyOneRow;
        hash = 67 * hash + Objects.hashCode(this.enemyTwoDescription);
        hash = 67 * hash + Objects.hashCode(this.enemyTwoEquation);
        hash = 67 * hash + Objects.hashCode(this.enemyTwoAnswer);
        hash = 67 * hash + this.enemyTwoColumn;
        hash = 67 * hash + this.enemyTwoRow;
        hash = 67 * hash + Objects.hashCode(this.enemyThreeDescription);
        hash = 67 * hash + Objects.hashCode(this.enemyThreeEquation);
        hash = 67 * hash + Objects.hashCode(this.enemyThreeAnswer);
        hash = 67 * hash + this.enemyThreeColumn;
        hash = 67 * hash + this.enemyThreeRow;
        hash = 67 * hash + Objects.hashCode(this.bossDescription);
        hash = 67 * hash + Objects.hashCode(this.bossEquation);
        hash = 67 * hash + Objects.hashCode(this.bossAnswer);
        hash = 67 * hash + this.bossColumn;
        hash = 67 * hash + this.bossRow;
        return hash;
    }

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
        final Enemies other = (Enemies) obj;
        if (this.attackDamage != other.attackDamage) {
            return false;
        }
        if (this.enemyOneColumn != other.enemyOneColumn) {
            return false;
        }
        if (this.enemyOneRow != other.enemyOneRow) {
            return false;
        }
        if (this.enemyTwoColumn != other.enemyTwoColumn) {
            return false;
        }
        if (this.enemyTwoRow != other.enemyTwoRow) {
            return false;
        }
        if (this.enemyThreeColumn != other.enemyThreeColumn) {
            return false;
        }
        if (this.enemyThreeRow != other.enemyThreeRow) {
            return false;
        }
        if (this.bossColumn != other.bossColumn) {
            return false;
        }
        if (this.bossRow != other.bossRow) {
            return false;
        }
        if (!Objects.equals(this.enemyOneDescription, other.enemyOneDescription)) {
            return false;
        }
        if (!Objects.equals(this.enemyOneEquation, other.enemyOneEquation)) {
            return false;
        }
        if (!Objects.equals(this.enemyOneAnswer, other.enemyOneAnswer)) {
            return false;
        }
        if (!Objects.equals(this.enemyTwoDescription, other.enemyTwoDescription)) {
            return false;
        }
        if (!Objects.equals(this.enemyTwoEquation, other.enemyTwoEquation)) {
            return false;
        }
        if (!Objects.equals(this.enemyTwoAnswer, other.enemyTwoAnswer)) {
            return false;
        }
        if (!Objects.equals(this.enemyThreeDescription, other.enemyThreeDescription)) {
            return false;
        }
        if (!Objects.equals(this.enemyThreeEquation, other.enemyThreeEquation)) {
            return false;
        }
        if (!Objects.equals(this.enemyThreeAnswer, other.enemyThreeAnswer)) {
            return false;
        }
        if (!Objects.equals(this.bossDescription, other.bossDescription)) {
            return false;
        }
        if (!Objects.equals(this.bossEquation, other.bossEquation)) {
            return false;
        }
        if (!Objects.equals(this.bossAnswer, other.bossAnswer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enemies{" + "attackDamage=" + attackDamage + ", enemyOneDescription=" + enemyOneDescription + ", enemyOneEquation=" + enemyOneEquation + ", enemyOneAnswer=" + enemyOneAnswer + ", enemyOneColumn=" + enemyOneColumn + ", enemyOneRow=" + enemyOneRow + ", enemyTwoDescription=" + enemyTwoDescription + ", enemyTwoEquation=" + enemyTwoEquation + ", enemyTwoAnswer=" + enemyTwoAnswer + ", enemyTwoColumn=" + enemyTwoColumn + ", enemyTwoRow=" + enemyTwoRow + ", enemyThreeDescription=" + enemyThreeDescription + ", enemyThreeEquation=" + enemyThreeEquation + ", enemyThreeAnswer=" + enemyThreeAnswer + ", enemyThreeColumn=" + enemyThreeColumn + ", enemyThreeRow=" + enemyThreeRow + ", bossDescription=" + bossDescription + ", bossEquation=" + bossEquation + ", bossAnswer=" + bossAnswer + ", bossColumn=" + bossColumn + ", bossRow=" + bossRow + '}';
    }

    
    
}
