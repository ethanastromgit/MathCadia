package byui.cit260.mathcadia.model;

import MathCadia.MathCadia;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Random;

public class Map implements Serializable{
    
    protected final BufferedReader keyboard = MathCadia.getInFile();
    protected final PrintWriter console = MathCadia.getOutFile();
    
    public static final int COLUMNCOUNT = 3;
    public static final int ROWCOUNT = 9;
    
    private Location[][] matrix = new Location [COLUMNCOUNT][ROWCOUNT];
    
    public Map() {
        
    }
    
    public void initializeMap()  {
        
        Random rand = new Random();
        
        for (int locColumn = 0; locColumn < COLUMNCOUNT; locColumn++) {
            for (int locRow = 0; locRow < ROWCOUNT; locRow++) {

                //Create and initialize new Loaction object instance
                Location location = new Location();
                location.setLocColumn(locColumn);
                location.setLocRow(locRow);
                location.setLocationVisited(false);
                
                boolean randomLocHasPotion = rand.nextBoolean();
                location.setHasPotion(randomLocHasPotion);
                
                //Assign the Location object to the current position in array
                matrix[locColumn][locRow] = location;
            }
        }
    }

    public int getROWCOUNT() {
        return ROWCOUNT;
    }

    public int getCOLUMNCOUNT() {
        return COLUMNCOUNT;
    }

    public Location[][] getLocations() {
        return matrix;
    }

    public void setLocations(Location[][] locations) {
        this.matrix = locations;
    }
    
}
