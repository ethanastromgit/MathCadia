/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.control.PlayerControl;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import static byui.cit260.mathcadia.model.Player.getCoordinates;
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
        super("\n Choose which direction you would like to travel"
                + " or use a potion:"
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

        Point coordinates = getCoordinates();

        switch (choice) {
            case "N":
            case "S":
            case "E":
            case "W":
                boolean moveValidity = false;
                
                try {
                    moveValidity = PlayerControl.isMoveValid(choice, coordinates);
                } catch (PlayerControlException pce) {
                    System.out.println(pce.getMessage());
                }
                    
                if (moveValidity = true) {
                    PlayerControl.movePlayer(choice, coordinates);
                    System.out.println("Your player has moved " + choice + ".");
                }
                else
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
