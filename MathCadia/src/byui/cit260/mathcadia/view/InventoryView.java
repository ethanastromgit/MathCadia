/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.control.InventoryControl;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ethan
 */
public class InventoryView {

    private final String menu;
    private final String lengthView;
    private final String widthView;
    private final String heightView;
    private String volume;

    int volumeDisplay = Inventory.getVolume();

    protected final BufferedReader keyboard = MathCadia.getInFile();
    protected final PrintWriter console = MathCadia.getOutFile();
    
    public InventoryView() {

        this.menu = "\nNow you will set up your inventory volume. "
                + "\nThe dimensions must be greater than 0 and less than or equal to 10."
                + "\nThe amount of potions you "
                + "\nwill be able to carry will be equal to the volume divided by 50.";
        this.lengthView = "Please enter the desired length:";
        this.widthView = "Please enter the desired width:";
        this.heightView = "Please enter the desired height:";
        this.volume = "The volume of your bag is " + volumeDisplay + "."
                + "\nPress Q to go back to Game Menu.";

    }

    public void displayLength() {

        boolean done = false; //Set flag to not done
        while (!done) {
            String input = this.getInputLength();
            try {
                done = this.doActionLength(input);
            } catch (InventoryControlException ice) {
                ErrorView.display(this.getClass().getName(),
                        ice.getMessage());
            }
        }

        this.displayWidth();

    }

    public void displayWidth() {

        boolean done = false; //Set flag to not done
        do {
            String input = this.getInputWidth();
            try {
                done = this.doActionWidth(input);
            } catch (InventoryControlException ice) {
                ErrorView.display(this.getClass().getName(),
                        ice.getMessage());
            }
        } while (!done);

        this.displayHeight();

    }

    public void displayHeight() {

        boolean done = false; //Set flag to not done
        while (!done) {
            String input = this.getInputHeight();
            try {
                done = this.doActionHeight(input);
            } catch (InventoryControlException ice) {
                ErrorView.display(this.getClass().getName(),
                        ice.getMessage());
            }
            
        }

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

        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid

        while (!valid) {
            this.console.println("\n" + this.menu);
            this.console.println("\n" + this.lengthView);

            try {
                value = keyboard.readLine(); //Get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(InventoryView.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); //Trim off leading and trailing blanks

            if (value.length() < 1) { //Value is blank
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid: entry required.");
                continue;
            } else {
                break;
            } //End the loop
        }

        return value; //Return entered value
    }

    private String getInputWidth() {

        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid

        while (!valid) {
            this.console.println("\n" + this.widthView);

            try {
                value = keyboard.readLine(); //Get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(InventoryView.class.getName()).log(Level.SEVERE, null, ex);
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

    private String getInputHeight() {

        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid

        while (!valid) {
            this.console.println("\n" + this.heightView);

            try {
                value = keyboard.readLine(); //Get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(InventoryView.class.getName()).log(Level.SEVERE, null, ex);
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

    private String getInputVolume() {

        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid

        while (!valid) {
            this.volume = "The volume of your bag is " + Inventory.getVolume() + "."
                    + "\nPress Q to go back to Game Menu.";
            this.console.println("\n" + this.volume);

            try {
                value = keyboard.readLine(); //Get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(InventoryView.class.getName()).log(Level.SEVERE, null, ex);
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

    private boolean doActionLength(String choice) throws InventoryControlException {

        int input = 0;

        try {
            input = Integer.parseInt(choice);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),
                    "\nYou must enter a valid number."
                    + " Try again or enter Q to quit.");
        }

        boolean valid = false;

        valid = InventoryControl.validateLength(input);

        if (valid = true) {
            Inventory.setLength(input);
            return true;
        } else {
            return false;
        }

    }

    private boolean doActionWidth(String choice) throws InventoryControlException {
        int input = 0;
        try {
            input = Integer.parseInt(choice);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),
                    "\nYou must enter a valid number."
                    + " Try again or enter Q to quit.");
        }
        boolean valid = false;

        valid = InventoryControl.validateWidth(input);

        if (valid = true) {
            Inventory.setWidth(input);
            return true;
        } else {
            return false;
        }

    }

    private boolean doActionHeight(String choice) throws InventoryControlException {

        int input = 0;
        try {
            input = Integer.parseInt(choice);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),
                    "\nYou must enter a valid number."
                    + " Try again or enter Q to quit.");
        }
        Inventory.setHeight(input);
        boolean valid = false;
        int length = Inventory.getLength();
        int width = Inventory.getWidth();
        int height = Inventory.getHeight();

        valid = InventoryControl.validateHeight(input);

        if (valid = true) {
            Inventory.setHeight(input);
            int volume = InventoryControl.calcInventoryVol(length, width, height);
            Inventory.setVolume(volume);

            int maxPotionAmt = InventoryControl.calcMaxPotionAmt(volume);
            Inventory.setMaxPotionAmt(maxPotionAmt);

            return true;
        } else {
            return false;
        }

    }

    private boolean doActionVolume(String choice) {

        choice = choice.toUpperCase(); //Convert choice to upper case

        switch (choice) {
            case "Q": //Return to Game Menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;

    }
}
