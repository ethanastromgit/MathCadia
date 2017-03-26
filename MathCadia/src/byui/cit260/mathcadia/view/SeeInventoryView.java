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

    Inventory inv = new Inventory();
    Player player = new Player();
    
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
                this.console.println("\n You can hold a maximum of "
                        + inv.getMaxPotionAmt()
                        + " potions.");
                break;
            case "P":
                this.console.println("\n You currently have "
                        + inv.getPotionAmt()
                        + " potions.");
                break;
            case "H":
                this.console.println("\n Your player currently has "
                        + player.getHealthPoints()
                        + " health points.");
                break;
            case "K":
                this.console.println("\n Your player currently has "
                        + player.getKeyAmt()
                        + " keys.");
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;

    }

}
