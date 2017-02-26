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
public class PlayerControl {
    
    public PlayerControl() {
        
    }
    
    public boolean isMoveValid(String input, int playerPosX, int playerPosY) {
        
        if(playerPosX == 0 && input == "W") {
            return false;
        }
        else if(playerPosX == 2 && input == "E") {
            return false;
        }
        else if(playerPosY == 0 && input == "S") {
            return false;
        }
        else if(playerPosY == 8 && input == "N") {
            return false;
        }
        return true;
                
    }
    
    public void movePlayer(String input, int playerPosX, int playerPosY) {
	
	if(input == "N") {
		playerPosY++;
        }
        else if(input == "S") {
		playerPosY--;
        }
        else if(input == "W") {
		playerPosX--;
        }
        else if(input == "E") {
		playerPosX++;
        }
    }
    
    public void recoverHealth(int potionAmt, int healthPoints) {
        if(potionAmt == 0) {
            System.out.println("You do not have any potions left!");
        }
        else if(potionAmt >= 1) {
            healthPoints += 2;
            potionAmt--;
        }
    }
    
    public void skipMathChallenge(int skipAmt, double equationOneAnswer, double equationTwoAnswer, double equationThreeAnswer) {
        if(skipAmt == 0) {
            System.out.println("You do not have any skips left!");
        }
        
    }
 
}
