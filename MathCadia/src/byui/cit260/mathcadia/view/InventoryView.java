/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.control.InventoryControl;
import byui.cit260.mathcadia.model.Inventory;
import citbyui.cit260.mathcadia.exceptions.InventoryControlException;
import java.util.Scanner;

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
                System.out.println(ice.getMessage());
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
                System.out.println(ice.getMessage());
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
                System.out.println(ice.getMessage());
            }
            //if (done = false) {
            //System.out.println("None of the dimensions can be zero and the volume cannot be greater than 1000!");
            //}
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

        Scanner keyboard = new Scanner(System.in); //Get infile for keyboard
        String value = ""; //Value to be returned
        boolean valid = false; //Initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.menu);
            System.out.println("\n" + this.lengthView);

            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); //Trim off leading and trailing blanks

            if (value.length() < 1) { //Value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            } else {
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
            System.out.println("\n" + this.widthView);

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
            System.out.println("\n" + this.heightView);

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
            this.volume = "The volume of your bag is " + Inventory.getVolume() + "."
                    + "\nPress Q to go back to Game Menu.";
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

    private boolean doActionLength(String choice) throws InventoryControlException {

        int input = 0;

        try {
            input = Integer.parseInt(choice);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
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
            System.out.println("\nYou must enter a valid number."
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
            System.out.println("\nYou must enter a valid number."
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
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;

    }
}
