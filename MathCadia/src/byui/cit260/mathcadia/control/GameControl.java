/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.exceptions.GameControlException;
import byui.cit260.mathcadia.model.Game;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Map;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.MapControlException;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ethan
 */
public class GameControl {

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        MathCadia.setPlayer(player); //Save the player

        return player;
    }

    public static void createNewGame(Player player) throws MapControlException {

        Game game = new Game(); //Create new game
        MathCadia.setCurrentGame(game); //Save in MathCadia

        game.setPlayer(player); //Save player in game

        //Reset the inventory
        int potionAmt = 1;
        int volume = 50;
        int maxPotionAmt = 1;
        int length = 2;
        int width = 5;
        int height = 5;
        Inventory.setPotionAmt(potionAmt);
        Inventory.setVolume(volume);
        Inventory.setLength(length);
        Inventory.setWidth(width);
        Inventory.setHeight(height);
        Inventory.setMaxPotionAmt(maxPotionAmt);

        //Reset Player
        int healthPoints = 10;
        int keyAmt = 0;
        int skipAmt = 1;
        Player.setHealthPoints(healthPoints);
        Player.setKeyAmt(keyAmt);
        Player.setSkipAmt(skipAmt);

        Map map = MapControl.createMap();
        game.setMap(map);

        //Reset player's starting location
        Point coordinates = new Point(1,0);
        Player.setCoordinates(coordinates);
        
    }

    public static void saveGame(Game currentGame, String filePath) 
            throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void loadGame(String filePath) 
            throws GameControlException {
        
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
            
    }
    
    public static void exitGame() {

    }

}
