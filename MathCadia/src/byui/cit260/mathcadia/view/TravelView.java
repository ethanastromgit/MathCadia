/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.control.PlayerControl;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.PlayerControlException;

/**
 *
 * @author ethan
 */
public class TravelView extends View {

    Player player = MathCadia.getCurrentGame().getPlayer();
    Inventory inv = MathCadia.getCurrentGame().getPlayer().getInventory();
    
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

         
         int column = player.getColumn();
         int row = player.getRow();
        
        choice = choice.toUpperCase(); //Convert choice to upper case

        switch (choice) {
            case "N":
            case "S":
            case "E":
            case "W":
                boolean moveValidity = false;
                
                try {
                    moveValidity = PlayerControl.isMoveValid(choice, column, row);
                } catch (PlayerControlException pce) {
                    ErrorView.display(this.getClass().getName(),
                            pce.getMessage());
                }
                    
                if (moveValidity = true) {
                    PlayerControl.movePlayer(choice, column, row);
                    player.setRow(row);
                    player.setColumn(column);
                    this.console.println("Your player has moved " + choice + ".");
                }
                else
                break;
            case "P":
                int potionAmt = inv.getPotionAmt();
                int healthPoints = player.getHealthPoints();

                try {
                    PlayerControl.recoverHealth(potionAmt, healthPoints);
                    this.console.println("You used a potion.");
                } catch (PlayerControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            ex.getMessage());
                }
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
