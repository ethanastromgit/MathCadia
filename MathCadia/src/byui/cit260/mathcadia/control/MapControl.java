/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.model.Map;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.MapControlException;
import java.awt.Point;

/**
 *
 * @author ethan
 */
public class MapControl {

    public static Map createMap() {
        //Create the map
        Map map = new Map(3, 9);
        
        return map;
    }
    
    public static void movePlayerToLocation(Player player, Point coordinates)
        throws MapControlException {
        
        Map map = MathCadia.getCurrentGame().getMap();
        int newColumn = coordinates.x-1;
        int newRow = coordinates.y-1;
        
        if (newColumn < 0 || newColumn >= map.getCOLUMNCOUNT() ||
            newRow < 0 || newRow >= map.getROWCOUNT()) {
            throw new MapControlException("Can not move player to location "
                                        + coordinates.x + ", " + coordinates.y
                                        + " because that location is outisde "
                                        + " the bounds of the map.");
        }
        
        
    }
    
    
}
