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

/**
 *
 * @author ethan
 */
public class PlayerControl {
    
    
    
    public PlayerControl() {

    }

    public static void isMoveValid(DirectionEnum direction) throws PlayerControlException {
        
        Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
        
        switch(direction) {
            case NORTH:
                if (playerLocation.getLocRow() == 8) {
                    throw new PlayerControlException("\n You cannot go "
                            + direction.toString()
                            + " because you will be out of bounds.");
                }
            case SOUTH:
                if (playerLocation.getLocRow() == 0) {
                    throw new PlayerControlException("\n You cannot go "
                            + direction.toString()
                            + " because you will be out of bounds.");
                }
            case EAST:
                if (playerLocation.getLocColumn() == 2) {
                    throw new PlayerControlException("\n You cannot go "
                            + direction.toString()
                            + " because you will be out of bounds.");
                }
            case WEST:
                if (playerLocation.getLocColumn() == 0) {
                    throw new PlayerControlException("\n You cannot go "
                            + direction.toString()
                            + " because you will be out of bounds.");
                }
            default:
                
        }

    }

    public static void movePlayer(DirectionEnum direction) {
        
        Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
        
        switch (direction) {
            case NORTH:
                playerLocation.setLocRow(playerLocation.getLocRow() + 2);
                MathCadia.getCurrentGame().getGamePlayer().setPlayerLocation(playerLocation);
            case SOUTH:
                playerLocation.setLocRow(playerLocation.getLocRow() - 1);
                MathCadia.getCurrentGame().getGamePlayer().setPlayerLocation(playerLocation);
            case EAST:
                playerLocation.setLocColumn(playerLocation.getLocColumn() + 1);
                MathCadia.getCurrentGame().getGamePlayer().setPlayerLocation(playerLocation);
            case WEST:
                playerLocation.setLocColumn(playerLocation.getLocColumn() - 1);
                MathCadia.getCurrentGame().getGamePlayer().setPlayerLocation(playerLocation);
        }
        
    }

    public static boolean isPotionHere() {
        Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
        Location location = MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow());
        
        
        int potionAmt = MathCadia.getCurrentGame().getGamePlayer().getPlayerInventory().getPotionAmt();
        
        if (location.isHasPotion() == true) {
            MathCadia.getCurrentGame().getGamePlayer().getPlayerInventory().setPotionAmt(potionAmt++);
            location.setHasPotion(false);
            return true;
        } else {
            return false;
        }
            
    }
    
    public static void recoverHealth() throws PlayerControlException {
        int potionAmt = MathCadia.getCurrentGame().getGamePlayer().getPlayerInventory().getPotionAmt();
        int healthPoints = MathCadia.getCurrentGame().getGamePlayer().getHealthPoints();
        
        if (potionAmt >= 1) {
            MathCadia.getCurrentGame().getGamePlayer().setHealthPoints(healthPoints + 2);
            MathCadia.getCurrentGame().getGamePlayer().getPlayerInventory().setPotionAmt(potionAmt - 1);
        } else if (potionAmt == 0) {
            throw new PlayerControlException("You do not have any potions left!");
        }
    }

    public static boolean isLocationVisited() {
        Map map = MathCadia.getCurrentGame().getGameMap();
        Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
        
        if (map.getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow()).isLocationVisited() == true) {
            return true;
        } else {
            map.getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow()).setLocationVisited(true);
            return false;
        }
        
    }
    
}
