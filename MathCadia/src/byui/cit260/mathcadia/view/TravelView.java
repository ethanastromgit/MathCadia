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
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class TravelView extends View {
    
    PlayerControl pc = new PlayerControl();
    Player p = new Player();
    
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
        
        switch (choice) {
            case "N":
                System.out.println("You moved North.");
                break;
            case "S":
                System.out.println("You moved South.");
                break;
            case "E":
                System.out.println("You moved East.");
                break;
            case "W":
                System.out.println("You moved West.");
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
