/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author danielhernandez
 */
public enum Enemies implements Serializable {

    EnemyOne("First enemy with key."),
    EnemyTwo("Second enemy with key."),
    EnemyThree("Third enemy with key."),
    Boss("Final enemy. Game is over after defeated.");

    //Attributes
    private final String DESCRIPTION;
    private Point enemyCoordinates;
    private final int ATTACK_DAMAGE;
    private boolean enemyIsBoss;

    String[] equations = new String[4];
    String[] answers = new String[4];

    Enemies(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
        
        
        this.ATTACK_DAMAGE = 2;

        String[] equations = {"What is 5 + 3?",
            "What is 7 * 5?",
            "What is 54 / 9?",
            "What is 6 + 8 * 3 - 9 / 3?"};

        String[] answers = {"8",
            "35",
            "6",
            "27"};

    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Point getENEMY_COORDINATES() {
        return enemyCoordinates;
    }

    public boolean isEnemyIsBoss() {
        return enemyIsBoss;
    }

    public void setEnemyIsBoss(boolean enemyIsBoss) {
        this.enemyIsBoss = enemyIsBoss;
    }

    public String[] getEquations() {
        return equations;
    }

    public void setEquations(String[] equations) {
        this.equations = equations;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

}
