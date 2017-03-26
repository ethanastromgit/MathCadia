/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.model.Player;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintPlayerStats extends View {
    
    public static void printPlayer(int healthPoints, int keyAmt, String filePath) throws IOException {
        
        try (PrintWriter output = new PrintWriter(filePath)) {
            String header = "You have this many health points:";
            output.println(header);
            
            Player player = new Player();
            healthPoints = player.getHealthPoints();
            
            output.println(healthPoints);
            
            String headerTwo = "You have this many keys:";
            output.println(headerTwo);
            
            keyAmt = player.getKeyAmt();
            
             output.println(keyAmt);
            
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
