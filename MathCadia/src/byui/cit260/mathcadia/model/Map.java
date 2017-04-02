package byui.cit260.mathcadia.model;

import MathCadia.MathCadia;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Random;

public class Map implements Serializable{
    
    protected final BufferedReader keyboard = MathCadia.getInFile();
    protected final PrintWriter console = MathCadia.getOutFile();
    
    public static final int COLUMNS = 5;
    public static final int ROWS = 5;
    private Location[][] matrix = new Location [ROWS][COLUMNS];
    
    
    public Map() {
        
    }
    
    public void initializeMap()  {
        
        Random rand = new Random();
        Location location = new Location();
        
        for (int locRow = 0; locRow < ROWS; locRow++) {
            for (int locColumn = 0; locColumn < COLUMNS; locColumn++) {

                //Create and initialize new Loaction object instance
                
                location.setLocColumn(locColumn);
                location.setLocRow(locRow);
                location.setLocationVisited(false);
                
                boolean randomLocHasPotion = rand.nextBoolean();
                location.setHasPotion(randomLocHasPotion);
                
                
                
                //Assign the Location object to the current position in array
                matrix[locRow][locColumn] = location;
            }
        }
        
    }

    
    
    public int getROWCOUNT() {
        return ROWS;
    }

    public int getCOLUMNCOUNT() {
        return COLUMNS;
    }

    public Location getLocationAt(int row, int col) {
        return matrix[row][col];
    }

    public void setLocations(Location[][] locations) {
        this.matrix = locations;
    }
    
}
