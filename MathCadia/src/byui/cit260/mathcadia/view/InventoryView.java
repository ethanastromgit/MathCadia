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
import byui.cit260.mathcadia.model.Player;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class InventoryView {

    public String menu;

    public InventoryView() {
        this.menu = "";
    }

    public void displayInvView() {

        boolean done = false; //Set flag to not done
        do {
            //Prompt for and get players name
            String invMenuOption = this.getInvMenuOption();
            if (invMenuOption.toUpperCase().equals("Q")) {
                return;
            }

            //Do the requested action and display the next view
            done = this.doActionInvMenu(invMenuOption);

        } while (!done);
    }

    private String getInvMenuOption() {

        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.menu);

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

    private boolean doActionInvMenu(String choice) {

        choice = choice.toUpperCase(); //Convert choice to upper case

        return false;
    }
}
