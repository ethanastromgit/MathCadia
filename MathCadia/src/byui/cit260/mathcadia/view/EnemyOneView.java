/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.control.EnemiesControl;
import byui.cit260.mathcadia.model.Enemies;
import byui.cit260.mathcadia.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ethan
 */
public class EnemyOneView {
    
    Enemies enemies = MathCadia.getCurrentGame().getEnemies();
    String enemyOneDescription = enemies.getEnemyOneDescription();
    String enemyOneAnswer = enemies.getEnemyOneAnswer();
    String enemyOneEquation = enemies.getEnemyOneEquation();
    
    private String menu;
    
    protected final BufferedReader keyboard = MathCadia.getInFile();
    protected final PrintWriter console = MathCadia.getOutFile();
    
    public EnemyOneView() {
        this.menu = "Description: " 
                + enemyOneDescription
                + "\nYou have run into your first enemy! "
                + "To defeat this enemy, "
                + "you must answer the following question."
                + "\n"
                + enemyOneEquation;
    }
    
    public void display() {
        
        boolean done = false; //Set flag to not done
        do {
            //Prompt for and get players name
            String input = this.getInput();
            if (input.toUpperCase().equals("X")) { //User wants to quit
                return; //Exit game
            }
            
            //Do the requested action and display the next view
            done = this.doAction(input);
            
        } while (!done);
    }
    
    private String getInput() {
        
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid
        
        while (!valid) {
            this.console.println("\n" + this.menu);
            
            try {
                value = keyboard.readLine(); //Get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(EnemyOneView.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid: entry required.");
                continue;
            }
            break; //End the loop
        }
        
        return value; //Return entered value
    }
    
    private boolean doAction(String choice) {
        Player player = MathCadia.getCurrentGame().getGamePlayer();
        
        int healthPoints = player.getHealthPoints();
        int attackDamage = enemies.getAttackDamage();
        int keyAmt = player.getKeyAmt();
        
        EnemiesControl.isAnswerOneCorrect(choice, enemyOneAnswer, healthPoints, attackDamage, keyAmt);
        player.setHealthPoints(healthPoints);
        player.setKeyAmt(keyAmt);
        
        if (choice.equals(enemyOneAnswer)) {
            return true;
        } else {
            return false;
        }
    }
    
}
