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
    
    public void movePlayer(String direction, int positionX, int positionY) {
	if(positionX == 0 && direction == "W") {
		System.out.println("Invalid move!");
        }
	if(positionX == 2 && direction == "E") {
		System.out.println("Invalid move!");
        }
	if(positionY == 0 && direction == "S") {
		System.out.println("Invalid move!");
        }
	if(positionX == 0 && positionY == 7 && direction == "N") {
		System.out.println("Invalid move!");
        }
	if(positionX == 2 && positionY == 7 && direction == "S") {
		System.out.println("Invalid move!");
        }
	if(direction == "N") {
		positionY++;
        }
	if(direction == "S") {
		positionY--;
        }
	if(direction == "W") {
		positionX--;
        }
	if(direction == "E") {
		positionX++;
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
