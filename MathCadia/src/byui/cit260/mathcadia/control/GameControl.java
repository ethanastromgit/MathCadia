/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.exceptions.GameControlException;
import byui.cit260.mathcadia.model.Game;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.MapControlException;
import byui.cit260.mathcadia.model.Enemies;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Location;
import byui.cit260.mathcadia.model.Map;
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

        Game currentGame = new Game(); //Create new game

        
        //Set up map
        Map gameMap = new Map();
        
        gameMap.initializeMap();
        
        gameMap.setMapEntranceColumn(1);
        gameMap.setMapEntranceRow(0);
        gameMap.getLocationAt(1, 0).setLocationVisited(true);
        
        currentGame.setGameMap(gameMap);
        
        
        //Set up player
        Player gamePlayer = new Player();
        
        gamePlayer.setHealthPoints(10);
        gamePlayer.setSkipAmt(2);
        gamePlayer.setKeyAmt(0);
        
        currentGame.setGamePlayer(gamePlayer); //Save player in game
        
        
        
        //Set up inventory
        Inventory inv = new Inventory();
        
        inv.setHeight(0);
        inv.setLength(0);
        inv.setWidth(0);
        inv.setMaxPotionAmt(0);
        inv.setPotionAmt(0);
        inv.setVolume(0);
        
        gamePlayer.setPlayerInventory(inv);
        
        
        //Set up enemy locations
        Enemies enemies = new Enemies();
        
        enemies.setEnemyOneLocation(gameMap.getLocationAt(1, 2));
        enemies.setEnemyTwoLocation(gameMap.getLocationAt(1, 4));
        enemies.setEnemyThreeLocation(gameMap.getLocationAt(1, 6));
        enemies.setBossLocation(gameMap.getLocationAt(1, 8));
        
        currentGame.setEnemies(enemies);
        
        
        MathCadia.setCurrentGame(currentGame); //Save in MathCadia
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
        
        MathCadia.setCurrentGame(game);
            
    }
    
    public static void exitGame() {

    }

}
