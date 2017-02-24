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
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class InventoryView {

    private String menu;
    private String length;
    private String width;
    private String height;
    private String volume;
    
    
    public InventoryView() {
        
        Inventory i = new Inventory();
        int volume = i.getVolume();
        
        this.menu = "\nNow you will set up your inventory volume. "
                  + "\nThe volume cannot be over 1000 and neither of the "
                  + "\ndimensions can be 0. The amount of potions you "
                  + "\nwill be able to carry will be equal to the volume divided by 50.";
        this.length = "Please enter the desired length:";
        this.width = "Please enter the desired width:";
        this.height = "Please enter the desired height:";
        this.volume = "The volume of your bag is " + volume + "."
                    + "\nPress Q to go back to Game Menu.";
                  
    }
    
    public void displayLength() {
        
        boolean done = false; //Set flag to not done
        while (!done) {
            String input = this.getInputLength();
           
            done = this.doActionLength(input);
            
        };
        
        this.displayWidth();
        
    }
    
    public void displayWidth() {
        
        boolean done = false; //Set flag to not done
        do {
            String input = this.getInputWidth();
           
            done = this.doActionWidth(input);
            
        } while (!done);
        
        this.displayHeight();
        
    }
    
    public void displayHeight() {
        
        boolean done = false; //Set flag to not done
        do {
            String input = this.getInputHeight();
           
            done = this.doActionHeight(input);
            
        } while (!done);
        
        this.displayVolume();
        
    }
    
    public void displayVolume() {
        
        boolean done = false; //Set flag to not done
        do {
            String input = this.getInputVolume();
           
            done = this.doActionVolume(input);
            
        } while (!done);
        
        return;
        
    }
    
    private String getInputLength() {
        
        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            System.out.println("\n" + this.length);
            
            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            }
            else {
                break;
            } //End the loop
        }
        
        return value; //Return entered value
    }

    private String getInputWidth() {
        
        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.width);
            
            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            }
            break; //End the loop
        }
        
        return value; //Return entered value
    }
    
    private String getInputHeight() {
        
        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.height);
            
            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            }
            break; //End the loop
        }
        
        return value; //Return entered value
    }
    
    private String getInputVolume() {
        
        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.volume);
            
            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            }
            break; //End the loop
        }
        
        return value; //Return entered value
    }
    
    private boolean doActionLength(String choice) {
        
        int playerInput = Integer.parseInt(choice);
        
        Inventory i = new Inventory();
        i.setLength(playerInput);
        
        return true;
    }
    private boolean doActionWidth(String choice) {
        
        int playerInput = Integer.parseInt(choice);
        
        Inventory i = new Inventory();
        i.setLength(playerInput);
        
        return true;
    }
    private boolean doActionHeight(String choice) {
        
        int playerInput = Integer.parseInt(choice);
        
        Inventory i = new Inventory();
        i.setLength(playerInput);
        
        return true;
    }
    private boolean doActionVolume(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "Q": //Start New Game
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
        
        //InventoryControl ic = new InventoryControl();
        //ic.calcInventoryVol();
        
        //Inventory i = new Inventory();
        //i.setVolume(playerInput);
        
        //return;
    }
}
