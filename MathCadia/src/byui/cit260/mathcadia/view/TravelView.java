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
import byui.cit260.mathcadia.model.DirectionEnum;
import byui.cit260.mathcadia.model.Location;
import byui.cit260.mathcadia.model.Map;

/**
 *
 * @author ethan
 */
public class TravelView extends View {

    Map map = MathCadia.getCurrentGame().getGameMap();
    Player player = MathCadia.getCurrentGame().getGamePlayer();
    Inventory inv = MathCadia.getCurrentGame().getGamePlayer().getPlayerInventory();
    
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

         
         Location playerLocation = player.getPlayerPosition();
        
        choice = choice.toUpperCase(); //Convert choice to upper case

        switch (choice) {
            case "N":
                this.moveNorth();
            case "S":
                this.moveSouth();
            case "E":
                this.moveEast();
            case "W":
                this.moveWest();
//                boolean moveValidity = false;
//                
//                try {
//                    moveValidity = PlayerControl.isMoveValid(choice, playerLocation);
//                } catch (PlayerControlException pce) {
//                    ErrorView.display(this.getClass().getName(),
//                            pce.getMessage());
//                }
//                    
//                if (moveValidity = true) {
//                    PlayerControl.movePlayer(choice, column, row);
//                    player.setRow(row);
//                    player.setColumn(column);
//                    this.console.println("Your player has moved " + choice + ".");
//                }
//                else
//                break;
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

    private void moveNorth() {
        boolean moveValidity = false;
        
        try {
            moveValidity = PlayerControl.isMoveValid(player, DirectionEnum.NORTH);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
        }
        
        PlayerControl.movePlayer(player, DirectionEnum.NORTH);
    }
    
    private void moveSouth() {
        
    }
    
    private void moveEast() {
        
    }
    
    private void moveWest() {
        
    }
    
}
