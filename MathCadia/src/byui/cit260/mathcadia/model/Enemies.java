/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

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
    private final Point ENEMY_COORDINATES;
    private final int ATTACK_DAMAGE;
    private boolean enemyIsBoss;
    
    private final String[] equations = new String[4];
    private final String[] answers = new String[4];
    
    /*
    private final String EQUATION_ONE;
    private final double ANSWER_ONE;
    private final String EQUATION_TWO;
    private final double ANSWER_TWO;
    private final String EQUATION_THREE;
    private final double ANSWER_THREE;
    private final String BOSS_EQUATION;
    private final double BOSS_ANSWER;
    */
    
    Enemies(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
        ENEMY_COORDINATES = new Point(1,3);
        
        this.ATTACK_DAMAGE = 2;
        
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Point getENEMY_COORDINATES() {
        return ENEMY_COORDINATES;
    }
    
    
    
}
