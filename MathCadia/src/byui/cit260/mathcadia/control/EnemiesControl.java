/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import byui.cit260.mathcadia.model.Enemies;
import byui.cit260.mathcadia.model.Game;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Location;
import byui.cit260.mathcadia.model.Map;
import byui.cit260.mathcadia.model.Player;

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
            System.out.println("You have died! Game over!");
        }
    }

    public void isAnswerThreeCorrect(int equationThreeAnswer, int healthPoints, int attackDamage, int keyAmt) {
        if (playerInput == equationThreeAnswer) {
            keyAmt++;
        } else if (playerInput != equationThreeAnswer) {
            healthPoints -= attackDamage;
        } else if (healthPoints == 0) {
            System.out.println("You have died! Game over!");
        }
    }

    public void isBossAnswerCorrect(int bossEquationAnswer, int healthPoints, int attackDamage) {
        if (playerInput == bossEquationAnswer) {
            System.out.println("You have successfully defeated the boss! You win!");
        } else if (playerInput != bossEquationAnswer) {
            healthPoints -= attackDamage;
        } else if (healthPoints == 0) {
            System.out.println("You have died! Game over!");
        }
    }

    public int cannotSkip(boolean isBoss, int skipAmt) {
        if (isBoss == true) {
            System.out.println("You cannot skip the boss question!");
        }
        return skipAmt;
    }

    private void playerDies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
