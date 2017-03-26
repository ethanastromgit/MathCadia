/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.PlayerControlException;

/**
 *
 * @author ethan
 */
public class PlayerControl {
    
    
    public PlayerControl() {

    }

    public static boolean isMoveValid(String input, int column, int row) throws PlayerControlException {

        if (column == 0 && input.equals("W")) {
            throw new PlayerControlException("You cannot move out of bounds.");
        } else if (column == 2 && input.equals("E")) {
            throw new PlayerControlException("You cannot move out of bounds.");
        } else if (row == 0 && input.equals("S")) {
            throw new PlayerControlException("You cannot move out of bounds.");
        } else if (row == 8 && input.equals("N")) {
            throw new PlayerControlException("You cannot move out of bounds.");
        } else
        return true;

    }

    public static void movePlayer(String input, int column, int row) {

        if (input.equals("N")) {
            int newRow = row + 1;
        } else if (input.equals("S")) {
            int newRow = row - 1;
        } else if (input.equals("W")) {
            int newRow = column - 1;
        } else if (input.equals("E")) {
            int newRow = column + 1;
        }
    }

    public static void recoverHealth(int potionAmt, int healthPoints) throws PlayerControlException {
        if (potionAmt >= 1) {
            healthPoints += 2;
            potionAmt--;
        } else if (potionAmt == 0) {
            throw new PlayerControlException("You do not have any potions left!");
        }
    }

    public void skipMathChallenge(int skipAmt, double equationOneAnswer, double equationTwoAnswer, double equationThreeAnswer) throws PlayerControlException {
        if (skipAmt == 0) {
            throw new PlayerControlException("You do not have any skips left!");
        }

    }

}
