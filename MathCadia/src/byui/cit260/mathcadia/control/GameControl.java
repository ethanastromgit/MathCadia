/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.exceptions.GameControlException;
import byui.cit260.mathcadia.model.Game;
import byui.cit260.mathcadia.model.Map;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.MapControlException;
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
        

        game.setPlayer(player); //Save player in game


        MathCadia.setCurrentGame(game); //Save in MathCadia
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
