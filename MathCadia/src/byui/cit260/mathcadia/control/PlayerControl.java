/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

/**
 *
 * @author ethan
 */
public class PlayerControl {
    
    public void movePlayer(direction, postionX, positionY) {
	if(positionX == 0 && direction == "W")
		return false;
	if(positionX == 2 && direction == "E")
		return false;
	if(positionY == 0 && direction == "S")
		return false;
	if(positionX == 0 && positionY == 7 && direction == "N")
		return false;
	if(positionX == 2 && positionY == 7 && direction == "S")
		return false;
		
	if(direction == "N")
		positionY++;
	if(direction == "S")
		positionY--;
	if(direction == "W")
		postionX--;
	if(direction == "E")
		positionX++;
    }
    
    public void recoverHealth(Inventory.potionAmt, Player.healthPoints) {
        if(Inventory.potionAmt == 0) {
            System.out.println("You do not have any potions left!");
            break;
        }
        else if(Inventory.potionAmt >= 1) {
            Player.healthPoints += 2;
            break;
        }
    }
    
    public void skipMathChallenge(Player.skipAmt, MathChallenges.equationOneAnswer, MathChallenges.equationTwoAnswer, MathChallenges.equationThreeAnswer) {
        if(Player.skipAmt = 0) {
            System.out.println("You do not have any skips left!");
            break;
        }
        
    }
    
    public void addKey(Location.hasKey, Player.keyAmt) {
        if(hasKey == false) {
            break;
        }
        Player.keyAmt++;
    }
}
