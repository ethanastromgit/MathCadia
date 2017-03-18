/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.model.Game;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Map;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.MapControlException;
import java.awt.Point;

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

        //Reset the inventory and save in the game
        int potionAmt = 1;
        int volume = 50;
        int maxPotionAmt = 1;
        int length = 0;
        int width = 0;
        int height = 0;
        Inventory.setPotionAmt(potionAmt);
        Inventory.setVolume(volume);
        Inventory.setLength(length);
        Inventory.setWidth(width);
        Inventory.setHeight(height);
        Inventory.setMaxPotionAmt(maxPotionAmt);

        int healthPoints = 10;
        Player.setHealthPoints(healthPoints);

        Map map = MapControl.createMap();
        game.setMap(map);

        //Reset player's starting location
        Point coordinates = new Point(1,0);
        Player.setCoordinates(coordinates);
        
    }

    public static void saveCurrentGame(Game currentGame) {
        
    }

    public void startSavedGame() {

    }

    public void exitGame() {

    }

}
