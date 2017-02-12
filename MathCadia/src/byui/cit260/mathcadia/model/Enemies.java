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
    
    //Constructor
    public Enemies() {
        
    }
    
    //Attributes
    private String enemyName;
    private int attackDamage;
    private boolean isBoss;
    private String enemyCoordinate;
    private boolean hasKey;
    private String equationOne;
    private double equationOneAnswer;
    private String equationTwo;
    private double equationTwoAnswer;
    private String equationThree;
    private double equationThreeAnswer;
    private String bossEquation;
    private double bossEquationAnswer;
    
    //Getter & Setters

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public boolean isIsBoss() {
        return isBoss;
    }

    public void setIsBoss(boolean isBoss) {
        this.isBoss = isBoss;
    }

    public String getEnemyCoordinate() {
        return enemyCoordinate;
    }

    public void setEnemyCoordinate(String enemyCoordinate) {
        this.enemyCoordinate = enemyCoordinate;
    }

    public boolean isHasKey() {
        return hasKey;
    }

    public void setHasKey(boolean hasKey) {
        this.hasKey = hasKey;
    }

    public String getEquationOne() {
        return equationOne;
    }

    public void setEquationOne(String equationOne) {
        this.equationOne = equationOne;
    }

    public double getEquationOneAnswer() {
        return equationOneAnswer;
    }

    public void setEquationOneAnswer(double equationOneAnswer) {
        this.equationOneAnswer = equationOneAnswer;
    }

    public String getEquationTwo() {
        return equationTwo;
    }

    public void setEquationTwo(String equationTwo) {
        this.equationTwo = equationTwo;
    }

    public double getEquationTwoAnswer() {
        return equationTwoAnswer;
    }

    public void setEquationTwoAnswer(double equationTwoAnswer) {
        this.equationTwoAnswer = equationTwoAnswer;
    }

    public String getEquationThree() {
        return equationThree;
    }

    public void setEquationThree(String equationThree) {
        this.equationThree = equationThree;
    }

    public double getEquationThreeAnswer() {
        return equationThreeAnswer;
    }

    public void setEquationThreeAnswer(double equationThreeAnswer) {
        this.equationThreeAnswer = equationThreeAnswer;
    }

    public String getBossEquation() {
        return bossEquation;
    }

    public void setBossEquation(String bossEquation) {
        this.bossEquation = bossEquation;
    }

    public double getBossEquationAnswer() {
        return bossEquationAnswer;
    }

    public void setBossEquationAnswer(double bossEquationAnswer) {
        this.bossEquationAnswer = bossEquationAnswer;
    }
    
}
