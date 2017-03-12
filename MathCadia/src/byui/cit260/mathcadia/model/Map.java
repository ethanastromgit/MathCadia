package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Map implements Serializable{

    //Constructor
    public Map() {
        
    }
    
    
    
    //Attributes
    private static final int ROWCOUNT = 9;
    private static final int COLUMNCOUNT = 3;
    private Location[][] locations;

    public static int getROWCOUNT() {
        return ROWCOUNT;
    }

    public static int getCOLUMNCOUNT() {
        return COLUMNCOUNT;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    
    
}
