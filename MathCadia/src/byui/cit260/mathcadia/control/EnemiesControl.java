/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import byui.cit260.mathcadia.exceptions.EnemiesControlException;
import byui.cit260.mathcadia.exceptions.LoseGameException;
import byui.cit260.mathcadia.exceptions.WinGameException;

/**
 *
 * @author ethan
 */
public class EnemiesControl {

    public int playerInput;

    public void isAnswerOneCorrect(int equationOneAnswer, int healthPoints, int attackDamage, int keyAmt) {
        if (playerInput == equationOneAnswer) {
            keyAmt++;
        } else if (playerInput != equationOneAnswer) {
            healthPoints -= attackDamage;
        }
        if (healthPoints == 0) {
            playerDies();
        }
    }

    public void isAnswerTwoCorrect(int equationTwoAnswer, int healthPoints, int attackDamage, int keyAmt) {
        if (playerInput == equationTwoAnswer) {
            keyAmt++;
        } else if (playerInput != equationTwoAnswer) {
            healthPoints -= attackDamage;
        } else if (healthPoints == 0) {
            playerDies();
        }
    }

    public void isAnswerThreeCorrect(int equationThreeAnswer, int healthPoints, int attackDamage, int keyAmt) {
        if (playerInput == equationThreeAnswer) {
            keyAmt++;
        } else if (playerInput != equationThreeAnswer) {
            healthPoints -= attackDamage;
        } else if (healthPoints == 0) {
            playerDies();
        }
    }

    public void isBossAnswerCorrect(int bossEquationAnswer, int healthPoints, int attackDamage) {
        if (playerInput == bossEquationAnswer) {
            playerWins();
        } else if (playerInput != bossEquationAnswer) {
            healthPoints -= attackDamage;
        } else if (healthPoints == 0) {
            playerDies();
        }
    }

    public int cannotSkip(boolean isBoss, int skipAmt) throws EnemiesControlException {
        if (isBoss == true) {
            throw new EnemiesControlException("You cannot skip the boss question!");
        }
        return skipAmt;
    }

    public static void playerDies() {
        throw new LoseGameException("Your player has died. Returning to Main Menu.");
    }
    
    public static void playerWins() {
        throw new WinGameException("Your player has won. Returning to Main Menu.");
    }
}
