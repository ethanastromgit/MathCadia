/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ethan
 */
public class LoadGameView extends View {
    
    public LoadGameView() {
        super("\nLoadGameView\n");
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false;
        String input = null;
        
        while (!valid) {            
            try {
                //prompt for player input
                this.console.println("\n\nWhat is the name of the file you want to load? ");

                input = this.keyboard.readLine();
                input = input.trim();

                if (input.length() < 1) {
                    this.console.println("\nInvalid value: value can not be blank");
                }
                else {
                    break;
                }

            }
            catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return input;
    }

    @Override
    public boolean doAction(String value) {
        return true;
    }
    
}
