/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.exceptions.PlayerControlException;
import byui.cit260.mathcadia.model.DirectionEnum;
import byui.cit260.mathcadia.model.Location;
import byui.cit260.mathcadia.model.Map;
import byui.cit260.mathcadia.model.Player;

/**
 *
 * @author ethan
 */
public class PlayerControl {
    
    Map map = MathCadia.getCurrentGame().getGameMap();
    
    public PlayerControl() {

    }

    public static boolean isMoveValid(Player player, DirectionEnum direction) throws PlayerControlException {

        Location playerLocation = player.getPlayerPosition();
        
        switch(direction) {
            case NORTH:
                if (playerLocation.getLocRow() == 8) {
                    throw new PlayerControlException("\n You cannot go"
                            + direction.toString()
                            + "because you will be out of bounds.");
                } else {
                   return true;
                }
            case SOUTH:
                if (playerLocation.getLocRow() == 0) {
                    throw new PlayerControlException("\n You cannot go"
                            + direction.toString()
                            + "because you will be out of bounds.");
                } else {
                    return true;
                }
            case EAST:
                if (playerLocation.getLocColumn() == 2) {
                    throw new PlayerControlException("\n You cannot go"
                            + direction.toString()
                            + "because you will be out of bounds.");
                } else {
                    return true;
                }
            case WEST:
                if (playerLocation.getLocColumn() == 0) {
                    throw new PlayerControlException("\n You cannot go"
                            + direction.toString()
                            + "because you will be out of bounds.");
                } else {
                    return true;
                }
            default:
                return false;
        }

    }

    public static void movePlayer(Player player, DirectionEnum direction) {

        Location playerLocation = player.getPlayerPosition();
        
        switch (direction) {
            case NORTH:
                playerLocation.setLocRow(playerLocation.getLocRow() + 1);
                MathCadia.getPlayer().setPlayerPosition(playerLocation);
                
                MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocRow(), playerLocation.getLocColumn()).setLocationVisited(true);
            case SOUTH:
                playerLocation.setLocRow(playerLocation.getLocRow() - 1);
                MathCadia.getPlayer().setPlayerPosition(playerLocation);
                
                MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocRow(), playerLocation.getLocColumn()).setLocationVisited(true);
            case EAST:
                playerLocation.setLocColumn(playerLocation.getLocColumn() + 1);
                MathCadia.getPlayer().setPlayerPosition(playerLocation);
                
                MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocRow(), playerLocation.getLocColumn()).setLocationVisited(true);
            case WEST:
                playerLocation.setLocColumn(playerLocation.getLocColumn() - 1);
                MathCadia.getPlayer().setPlayerPosition(playerLocation);
                
                MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocRow(), playerLocation.getLocColumn()).setLocationVisited(true);
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
