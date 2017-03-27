/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import byui.cit260.mathcadia.view.View;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintInventoryStats extends View {
    
    public static void printInventory(int potionAmt, int volume, String filePath) throws IOException {
        
        try (PrintWriter output = new PrintWriter(filePath)) {
            
            String header = "You have this many potions:";
            output.println(header);
            
            output.println(potionAmt);
            
            String headerTwo = "Your inventory bag's volume is:";
            output.println(headerTwo);
            
            output.println(volume);
            
            output.flush();
            
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }
    
}
