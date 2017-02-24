/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.view.HelpMenuView;
import byui.cit260.mathcadia.view.GameMenuView;
import byui.cit260.mathcadia.control.GameControl;
import byui.cit260.mathcadia.control.InventoryControl;
import byui.cit260.mathcadia.model.Player;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class InventoryView {

    public String menu;
    private int length;
    private int width;
    private int height;

    public InventoryView() {
        
        Random rand = new Random();
        length = rand.nextInt(10);
        width = rand.nextInt(10);
        height = rand.nextInt(10);
        
        this.menu = "Your inventory bag is " + length 
                  + " by " + width + " by " + height 
                  + " inches. Your volume is " + volume + ".";
    }

    public void display() {
        
        boolean correct = false;
        
        while(!correct){
            System.out.println("\n" + this.menu);
        
            String input = this.getInput();

            //Do the requested action and display the next view
            correct = this.doAction(input);
            if(!correct) {
                System.out.println("\nWRONG");
            }
        }
        
    }

    private String getInput() {

        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        
        value = keyboard.nextLine(); //Get next line typed on keyboard
        value = value.trim(); //Trim off leading and trailing blanks

        return value; //Return entered value
    }

    private int doAction(String choice) {
        
        int playerInput = Integer.parseInt(choice);
        
        InventoryControl ic = new InventoryControl();
        return ic.calcInventoryVol(length, width, height);

    }
}
