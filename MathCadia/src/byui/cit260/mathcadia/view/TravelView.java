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
import byui.cit260.mathcadia.control.PlayerControl;
import byui.cit260.mathcadia.control.InventoryControl;
import byui.cit260.mathcadia.control.MapControl;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import citbyui.cit260.mathcadia.exceptions.MapControlException;
import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class TravelView extends View {
    
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
                break;
            case "P":
                System.out.println("You have used one of your potions.");
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
