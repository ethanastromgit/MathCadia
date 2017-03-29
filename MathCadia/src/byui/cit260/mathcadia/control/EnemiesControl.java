/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import byui.cit260.mathcadia.exceptions.LoseGameException;
import byui.cit260.mathcadia.exceptions.WinGameException;
import byui.cit260.mathcadia.model.Location;

/**
 *
 * @author ethan
 */
public class EnemiesControl {

    public int playerInput;
    
    public static boolean isEnemyHere(Location playerLocation, Location bossLocation, Location enemyOneLocation, Location enemyTwoLocation, Location enemyThreeLocation) {
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
    
    public static void isAnswerOneCorrect(String playerInput, String enemyOneAnswer, int healthPoints, int attackDamage, int keyAmt) {
        if (playerInput.equals(enemyOneAnswer)) {
            keyAmt++;
        } else if (!playerInput.equals(enemyOneAnswer)) {
            healthPoints -= attackDamage;
        }
        if (healthPoints == 0) {
            playerDies();
        }
    }

    public static void isAnswerTwoCorrect(String playerInput, String enemyTwoAnswer, int healthPoints, int attackDamage, int keyAmt) {
        if (playerInput.equals(enemyTwoAnswer)) {
            keyAmt++;
        } else if (!playerInput.equals(enemyTwoAnswer)) {
            healthPoints -= attackDamage;
        } else if (healthPoints == 0) {
            playerDies();
        }
    }

    public static void isAnswerThreeCorrect(String playerInput, String enemyThreeAnswer, int healthPoints, int attackDamage, int keyAmt) {
        if (playerInput.equals(enemyThreeAnswer)) {
            keyAmt++;
        } else if (!playerInput.equals(enemyThreeAnswer)) {
            healthPoints -= attackDamage;
        } else if (healthPoints == 0) {
            playerDies();
        }
    }

    public static void isBossAnswerCorrect(String playerInput, String bossAnswer, int healthPoints, int attackDamage) {
        if (playerInput.equals(bossAnswer)) {
            playerWins();
        } else if (!playerInput.equals(bossAnswer)) {
            healthPoints -= attackDamage;
        } else if (healthPoints == 0) {
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
