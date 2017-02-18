/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathCadia;

import byui.cit260.mathcadia.model.Game;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.view.StartProgramView;

/**
 *
 * @author Daniel
 */
public class MathCadia {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        MathCadia.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        MathCadia.player = player;
    }
    
    public static void main(String args[]) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

}
