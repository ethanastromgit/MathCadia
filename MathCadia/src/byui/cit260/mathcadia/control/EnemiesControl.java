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
public class EnemiesControl {
    
    public void dealDamageToPlayer(healthPoints, answer, attackDamage) {
	
    }
    
    public void isAnswerCorrect(equationOneAnswer, equationTwoAnswer, equationThreeAnswer, healthPoints, attackDamge) {
        if() {
            
        }
        else if("playerInput" != answer) 
		healthPoints -= attackDamage;
        else if(healthPoints == 0)
		gameOver();
    }
    
    public void cannotSkip(isBoss) {
        if(isBoss == true) {
            System.out.println("You cannot skip the boss question!");
        }
    }
}
