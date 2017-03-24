package byui.cit260.mathcadia.model;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.view.ErrorView;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;

public class Map implements Serializable{

    private Game[] game;
    
    protected final BufferedReader keyboard = MathCadia.getInFile();
    protected final PrintWriter console = MathCadia.getOutFile();
    
    //Constructor
    public Map() {
        
    }
    
    public Map(int COLUMNCOUNT, int ROWCOUNT) {
        
        if (COLUMNCOUNT < 1 || ROWCOUNT < 1) {
            ErrorView.display(this.getClass().getName(),
                    "The number of rows and columns must be > zero");
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
                location.setCol(col);
                location.setRow(row);
                location.setLocationVisited(false);
                
                //Assign the Location object to the current position in array
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
