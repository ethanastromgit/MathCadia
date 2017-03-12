/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import byui.cit260.mathcadia.model.Map;

/**
 *
 * @author ethan
 */
public class MapControl {

    public static Map createMap() {
        //Create the map
        Map map = new Map(3, 9);
        
        System.out.println("\n*** createMap() called ***");
        
        return map;
    }
    
    static void movePlayerToStartingLocation(Map map) {
        
    }
    
}
