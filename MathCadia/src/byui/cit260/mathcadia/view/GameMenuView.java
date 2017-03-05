/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
              super("\n--------------------------------"
                  + "\n Game Menu                      "
                  + "\n--------------------------------"
                  + "\n T - Move Player                "
                  + "\n S - Set Up Inventory           "
                  + "\n I - View Inventory             "
                  + "\n M - View Map                   "
                  + "\n Q - Main Menu                  "
                  + "\n H - Help Menu                  "
                  + "\n--------------------------------");
    }
    
    

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "T": 
                TravelView tv = new TravelView();
                tv.display();
                break;
            case "S": 
                InventoryView iv = new InventoryView();
                iv.displayLength();
                break;
            case "I": 
                SeeInventoryView siv = new SeeInventoryView();
                siv.display();
                break;
            case "M":
                MapView mv = new MapView();
                mv.display();
                break;
            case "Q": 
                return true;
            case "H": 
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
}
