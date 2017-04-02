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
        
        gameMap.getLocationAt(2, 0).setLocationVisited(true);
        
        
        
        
        //Set up player
        Player gamePlayer = new Player();
        
        gamePlayer.setHealthPoints(10);
        gamePlayer.setKeyAmt(0);
        
        //Set up inventory
        Inventory inv = new Inventory();
        
        inv.setHeight(0);
        inv.setLength(0);
        inv.setWidth(0);
        inv.setMaxPotionAmt(0);
        inv.setPotionAmt(0);
        inv.setVolume(0);
        
        gamePlayer.setPlayerInventory(inv);
        
        currentGame.setGamePlayer(gamePlayer); //Save player in game
        
        //Set up enemy and player locations
        Location playerLocation = new Location();
        Location enemyOneLocation = new Location();
        Location enemyTwoLocation = new Location();
        Location enemyThreeLocation = new Location();
        Location bossLocation = new Location();
        
        Enemies enemies = new Enemies();
        currentGame.setEnemies(enemies);
        
        playerLocation.setLocColumn(0);
        playerLocation.setLocRow(2);
        enemyOneLocation.setLocColumn(1);
        enemyOneLocation.setLocRow(2);
        enemyTwoLocation.setLocColumn(2);
        enemyTwoLocation.setLocRow(2);
        enemyThreeLocation.setLocColumn(3);
        enemyThreeLocation.setLocRow(2);
        bossLocation.setLocColumn(4);
        bossLocation.setLocRow(2);
        
        currentGame.getGamePlayer().setPlayerLocation(playerLocation);
        currentGame.getEnemies().setEnemyOneLocation(enemyOneLocation);
        currentGame.getEnemies().setEnemyTwoLocation(enemyTwoLocation);
        currentGame.getEnemies().setEnemyThreeLocation(enemyThreeLocation);
        currentGame.getEnemies().setBossLocation(bossLocation);
        
        currentGame.setGameMap(gameMap);
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
