package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Map implements Serializable{

    //Constructor
    public Map() {
        
    }
    
    //Attributes
    public static final int ROWCOUNT = 9;
    public static final int COLUMNCOUNT = 3;
    private Location[][] matrix = new Location[ROWCOUNT][COLUMNCOUNT];
    private Location mapEntrance;
    private Location mapExit;

    public static int getROWCOUNT() {
        return ROWCOUNT;
    }

    //Getters and Setters
    public static int getCOLUMNCOUNT() {
        return COLUMNCOUNT;
    }

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    public Location getMapEntrance() {
        return mapEntrance;
    }

    public void setMapEntrance(Location mapEntrance) {
        this.mapEntrance = mapEntrance;
    }

    public Location getMapExit() {
        return mapExit;
    }

    public void setMapExit(Location mapExit) {
        this.mapExit = mapExit;
    }

    
    
}
