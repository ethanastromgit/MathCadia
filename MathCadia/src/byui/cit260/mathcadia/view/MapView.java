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
class MapView extends View {
    
    public MapView() {
              super("\n___________"
                  + "\n|    B    |"
                  + "\n|    E    |"
                  + "\n|         |"
                  + "\n|    E    |"
                  + "\n|         |"
                  + "\n|    E    |"
                  + "\n|         |"
                  + "\n|___ X ___|"
                  + "\n           "
                  + "\n B is the boss room."
                  + "\n E represents the enemies who each possess a key."
                  + "\n X represesnts the player's starting location."
                  + "\n           "
                  + "\n Q - Return to Game Menu");
    }    
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "Q":
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
        
    }
    
}
