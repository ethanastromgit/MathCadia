/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;
import MathCadia.MathCadia;
import byui.cit260.mathcadia.model.Enemies;
import byui.cit260.mathcadia.model.Game;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Location;
import byui.cit260.mathcadia.model.Map;
import byui.cit260.mathcadia.model.Player;
/**
 *
 * @author ethan
 */
public class GameControl {
    
    public static Player createPlayer(String name) {
        
        if(name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        MathCadia.setPlayer(player); //Save the player
        
        return player;
    }
    
    public static void createNewGame(Player player) {
        
        System.out.println("\n***  ***");
        
        //Game game = new Game();
        //game.setPlayer(player);
        //game.setMap(buildMap());
        
        //MathCadia.getCurrentGame().getMap().getPlaces().get(5);
        
        
    }
    
    public void initializeMap() {
        
    }
    
    public void saveGame() {
        
    }
    
    public void startSavedGame() {
        
    }
    
    public void exitGame() {
        
    }
    
}
