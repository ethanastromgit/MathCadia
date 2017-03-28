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
    private Location enemyOneLocation;

    private final String enemyTwoDescription = "Second enemy with key.";
    private final String enemyTwoEquation = "What is 7 * 5?";
    private final String enemyTwoAnswer = "35";
    private Location enemyTwoLocation;

    private final String enemyThreeDescription = "Third enemy with key.";
    private final String enemyThreeEquation = "What is 54 / 9?";
    private final String enemyThreeAnswer = "6";
    private Location enemyThreeLocation;

    private final String bossDescription = "Final enemy. Game is over after defeated.";
    private final String bossEquation = "What is 6 + 8 * 3 - 9 / 3?";
    private final String bossAnswer = "27";
    private Location bossLocation;
    private final boolean isBoss = true;

    public Enemies() {

    }

    public boolean isIsBoss() {
        return isBoss;
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

    public Location getEnemyOneLocation() {
        return enemyOneLocation;
    }

    public void setEnemyOneLocation(Location enemyOneLocation) {
        this.enemyOneLocation = enemyOneLocation;
    }

    public Location getEnemyTwoLocation() {
        return enemyTwoLocation;
    }

    public void setEnemyTwoLocation(Location enemyTwoLocation) {
        this.enemyTwoLocation = enemyTwoLocation;
    }

    public Location getEnemyThreeLocation() {
        return enemyThreeLocation;
    }

    public void setEnemyThreeLocation(Location enemyThreeLocation) {
        this.enemyThreeLocation = enemyThreeLocation;
    }

    public Location getBossLocation() {
        return bossLocation;
    }

    public void setBossLocation(Location bossLocation) {
        this.bossLocation = bossLocation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.attackDamage;
        hash = 59 * hash + Objects.hashCode(this.enemyOneDescription);
        hash = 59 * hash + Objects.hashCode(this.enemyOneEquation);
        hash = 59 * hash + Objects.hashCode(this.enemyOneAnswer);
        hash = 59 * hash + Objects.hashCode(this.enemyOneLocation);
        hash = 59 * hash + Objects.hashCode(this.enemyTwoDescription);
        hash = 59 * hash + Objects.hashCode(this.enemyTwoEquation);
        hash = 59 * hash + Objects.hashCode(this.enemyTwoAnswer);
        hash = 59 * hash + Objects.hashCode(this.enemyTwoLocation);
        hash = 59 * hash + Objects.hashCode(this.enemyThreeDescription);
        hash = 59 * hash + Objects.hashCode(this.enemyThreeEquation);
        hash = 59 * hash + Objects.hashCode(this.enemyThreeAnswer);
        hash = 59 * hash + Objects.hashCode(this.enemyThreeLocation);
        hash = 59 * hash + Objects.hashCode(this.bossDescription);
        hash = 59 * hash + Objects.hashCode(this.bossEquation);
        hash = 59 * hash + Objects.hashCode(this.bossAnswer);
        hash = 59 * hash + Objects.hashCode(this.bossLocation);
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
        if (!Objects.equals(this.enemyOneLocation, other.enemyOneLocation)) {
            return false;
        }
        if (!Objects.equals(this.enemyTwoLocation, other.enemyTwoLocation)) {
            return false;
        }
        if (!Objects.equals(this.enemyThreeLocation, other.enemyThreeLocation)) {
            return false;
        }
        if (!Objects.equals(this.bossLocation, other.bossLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enemies{" + "attackDamage=" + attackDamage + ", enemyOneDescription=" + enemyOneDescription + ", enemyOneEquation=" + enemyOneEquation + ", enemyOneAnswer=" + enemyOneAnswer + ", enemyOneLocation=" + enemyOneLocation + ", enemyTwoDescription=" + enemyTwoDescription + ", enemyTwoEquation=" + enemyTwoEquation + ", enemyTwoAnswer=" + enemyTwoAnswer + ", enemyTwoLocation=" + enemyTwoLocation + ", enemyThreeDescription=" + enemyThreeDescription + ", enemyThreeEquation=" + enemyThreeEquation + ", enemyThreeAnswer=" + enemyThreeAnswer + ", enemyThreeLocation=" + enemyThreeLocation + ", bossDescription=" + bossDescription + ", bossEquation=" + bossEquation + ", bossAnswer=" + bossAnswer + ", bossLocation=" + bossLocation + '}';
    }

}
