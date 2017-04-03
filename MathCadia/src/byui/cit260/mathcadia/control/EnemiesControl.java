/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.exceptions.LoseGameException;
import byui.cit260.mathcadia.exceptions.WinGameException;
import byui.cit260.mathcadia.model.Enemies;
import byui.cit260.mathcadia.model.Location;
import byui.cit260.mathcadia.model.Player;

/**
 *
 * @author ethan
 */
public class EnemiesControl {

    public int playerInput;
    
    
    
    public static boolean isEnemyHere() {
        Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
        Location bossLocation = MathCadia.getCurrentGame().getEnemies().getBossLocation();
        Location enemyOneLocation = MathCadia.getCurrentGame().getEnemies().getEnemyOneLocation();
        Location enemyTwoLocation = MathCadia.getCurrentGame().getEnemies().getEnemyTwoLocation();
        Location enemyThreeLocation = MathCadia.getCurrentGame().getEnemies().getEnemyThreeLocation();
        
        if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() == bossLocation.getLocRow()) {
            return true;
        } else if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
            return true;
        } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
            return true;
        } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void isAnswerOneCorrect(String playerInput, String enemyOneAnswer) {
        Player player = MathCadia.getCurrentGame().getGamePlayer();
        Enemies enemiesAttDam = new Enemies();
        
        int healthPoints = player.getHealthPoints();
        int attackDamage = enemiesAttDam.getAttackDamage();
        int keyAmt = player.getKeyAmt();
        
        if (playerInput.equals(enemyOneAnswer)) {
            keyAmt++;
        } else {
            healthPoints -= attackDamage;
            player.setHealthPoints(healthPoints);
                if (healthPoints <= 0) {
            playerDies();
        }
        }
        
    }
        
    public static void isAnswerTwoCorrect(String playerInput, String enemyTwoAnswer) {
        Player player = MathCadia.getCurrentGame().getGamePlayer();
        Enemies enemiesAttDam = new Enemies();
        
        int healthPoints = player.getHealthPoints();
        int attackDamage = enemiesAttDam.getAttackDamage();
        int keyAmt = player.getKeyAmt();
        
        if (playerInput.equals(enemyTwoAnswer)) {
            keyAmt++;
        } else {
            healthPoints -= attackDamage;
            player.setHealthPoints(healthPoints);
        }
        if (healthPoints == 0) {
            playerDies();
        }
        
    }

    public static void isAnswerThreeCorrect(String playerInput, String enemyThreeAnswer) {
        Player player = MathCadia.getCurrentGame().getGamePlayer();
        Enemies enemiesAttDam = new Enemies();
        
        int healthPoints = player.getHealthPoints();
        int attackDamage = enemiesAttDam.getAttackDamage();
        int keyAmt = player.getKeyAmt();
        
        if (playerInput.equals(enemyThreeAnswer)) {
            keyAmt++;
        } else {
            healthPoints -= attackDamage;
            player.setHealthPoints(healthPoints);
        }
        if (healthPoints == 0) {
            playerDies();
        }
        
    }

    public static void isBossAnswerCorrect(String playerInput, String bossAnswer) {
       Player player = MathCadia.getCurrentGame().getGamePlayer();
        Enemies enemiesAttDam = new Enemies();
        
        int healthPoints = player.getHealthPoints();
        int attackDamage = enemiesAttDam.getAttackDamage();
        
        if (playerInput.equals(bossAnswer)) {
            playerWins();
        } else {
            healthPoints -= attackDamage;
            player.setHealthPoints(healthPoints);
        }
        if (healthPoints == 0) {
            playerDies();
        }
        
    }

    public static void playerDies() {
        throw new LoseGameException("Your player has died. Returning to Main Menu.");
    }
    
    public static void playerWins() {
        throw new WinGameException("Your player has won. Returning to Main Menu.");
    }
}
