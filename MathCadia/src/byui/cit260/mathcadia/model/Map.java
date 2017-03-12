package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;
import byui.cit260.mathcadia.model.Location;

public class Map implements Serializable{

    private Game[] game;
    
    //Constructor
    public Map() {
        
    }
    
    public Map(int COLUMNCOUNT, int ROWCOUNT) {
        
        if (COLUMNCOUNT < 1 || ROWCOUNT < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.COLUMNCOUNT = COLUMNCOUNT;
        this.ROWCOUNT = ROWCOUNT;
        
        //Create 2D array for Location objects
        this.locations = new Location[COLUMNCOUNT][ROWCOUNT];
        
        for (int col = 0; col < COLUMNCOUNT; col++) {
            for (int row = 0; row < ROWCOUNT; row++) {
                //Create and initialize new Loaction object instance
                Location location = new Location();
                location.setPosX(col);
                location.setPosY(row);
                location.setLocationVisited(false);
                
                //Assign the Lcoation object to the current position in array
                locations[col][row] = location;
            }
        }
    }
    
    //Attributes
    private int ROWCOUNT;
    private int COLUMNCOUNT;
    private Location[][] locations;

    public int getROWCOUNT() {
        return ROWCOUNT;
    }

    public int getCOLUMNCOUNT() {
        return COLUMNCOUNT;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    
    
}
