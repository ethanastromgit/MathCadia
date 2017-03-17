/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.control.InventoryControl;
import byui.cit260.mathcadia.control.PlayerControl;
import byui.cit260.mathcadia.control.MapControl;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import citbyui.cit260.mathcadia.exceptions.InventoryControlException;
import citbyui.cit260.mathcadia.exceptions.MapControlException;
import citbyui.cit260.mathcadia.exceptions.PlayerControlException;
import java.awt.Point;

/**
 *
 * @author ethan
 */
public class TravelView extends View {

    int potionAmt = 1;
    int maxPotionAmt = 3;
    boolean hasPotion = false;
    
    public TravelView() {
        super("\n Choose which direction you would like to travel:"
                + "\n N - North"
                + "\n S - South"
                + "\n E - East"
                + "\n W - West"
                + "\n"
                + "\n P - Use Potion"
                + "\n"
                + "\n Q - Return to Game Menu");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //Convert choice to upper case

        Player player = null;

        Point coordinates = null;

        switch (choice) {
            case "N":
            case "S":
            case "E":
            case "W":
                try {
                    MapControl.movePlayerToLocation(player, coordinates);
                } catch (MapControlException me) {
                    System.out.println(me.getMessage());
                }
                try {
                    InventoryControl.addPotion(potionAmt, maxPotionAmt, hasPotion);
                } catch (InventoryControlException ice) {
                    System.out.println(ice.getMessage());
                }
                break;
            case "P":
                int potionAmt = Inventory.getPotionAmt();
                int healthPoints = Player.getHealthPoints();

                try {
                    PlayerControl.recoverHealth(potionAmt, healthPoints);
                } catch (PlayerControlException ex) {
                    System.out.println(ex.getMessage());
                }
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
