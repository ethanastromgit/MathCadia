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
import byui.cit260.mathcadia.exceptions.PlayerControlException;
import java.awt.Point;

/**
 *
 * @author ethan
 */
public class PlayerControl {
    
    public PlayerControl() {

    }

    public static boolean isMoveValid(String input, Point coordinates) throws PlayerControlException {

        if (coordinates.x == 0 && input == "W") {
            throw new PlayerControlException("You cannot move out of bounds.");
        } else if (coordinates.x == 2 && input == "E") {
            throw new PlayerControlException("You cannot move out of bounds.");
        } else if (coordinates.y == 0 && input == "S") {
            throw new PlayerControlException("You cannot move out of bounds.");
        } else if (coordinates.y == 8 && input == "N") {
            throw new PlayerControlException("You cannot move out of bounds.");
        }
        return true;

    }

    public static void movePlayer(String input, Point coordinates) {

        if (input == "N") {
            int newRow = coordinates.y + 1;
            Player.setCoordinates(coordinates);
        } else if (input == "S") {
            int newRow = coordinates.y - 1;
            Player.setCoordinates(coordinates);
        } else if (input == "W") {
            int newRow = coordinates.x - 1;
            Player.setCoordinates(coordinates);
        } else if (input == "E") {
            int newRow = coordinates.x + 1;
            Player.setCoordinates(coordinates);
        }
    }

    public static void recoverHealth(int potionAmt, int healthPoints) throws PlayerControlException {
        if (potionAmt >= 1) {
            healthPoints += 2;
            potionAmt--;
            Player.setHealthPoints(healthPoints);
            Inventory.setPotionAmt(potionAmt);
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
