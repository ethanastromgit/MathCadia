/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;

/**
 *
 * @author ethan
 */
public class SeeInventoryView extends View {

    public SeeInventoryView() {

        super("\n M - See how many potions you can hold."
                + "\n P - See how many potions you currently have."
                + "\n H - See how many health points your player currently has."
                + "\n K - See how many keys you currently have."
                + "\n Q - Return to Game Menu");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //Convert choice to upper case

        switch (choice) {
            case "M":
                System.out.println("\n You can hold a maximum of "
                        + Inventory.getMaxPotionAmt()
                        + " potions.");
                break;
            case "P":
                System.out.println("\n You currently have "
                        + Inventory.getPotionAmt()
                        + " potions.");
                break;
            case "H":
                System.out.println("\n Your player currently has "
                        + Player.getHealthPoints()
                        + " health points.");
                break;
            case "K":
                System.out.println("\n Your player currently has "
                        + Player.getKeyAmt()
                        + " keys.");
                break;
            case "Q":
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;

    }

}
