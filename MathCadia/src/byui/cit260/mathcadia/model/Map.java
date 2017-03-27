package byui.cit260.mathcadia.model;

import MathCadia.MathCadia;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Random;

public class Map implements Serializable{
    
    protected final BufferedReader keyboard = MathCadia.getInFile();
    protected final PrintWriter console = MathCadia.getOutFile();
    
    public static final int COLUMNS = 3;
    public static final int ROWS = 9;
    private Location[][] matrix = new Location [COLUMNS][ROWS];
    private int mapEntranceColumn;
    private int mapEntranceRow;
    private int mapExitColumn;
    private int mapExitRow;
    
    
    public Map() {
        
    }
    
    public void initializeMap()  {
        
        Random rand = new Random();
        
        for (int locColumn = 0; locColumn < COLUMNS; locColumn++) {
            for (int locRow = 0; locRow < ROWS; locRow++) {

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
        return ROWS;
    }

    public int getCOLUMNCOUNT() {
        return COLUMNS;
    }

    public Location getLocationAt(int col, int row) {
        return matrix[col][row];
    }

    public void setLocations(Location[][] locations) {
        this.matrix = locations;
    }

    public int getMapEntranceColumn() {
        return mapEntranceColumn;
    }

    public void setMapEntranceColumn(int mapEntranceColumn) {
        this.mapEntranceColumn = mapEntranceColumn;
    }

    public int getMapEntranceRow() {
        return mapEntranceRow;
    }

    public void setMapEntranceRow(int mapEntranceRow) {
        this.mapEntranceRow = mapEntranceRow;
    }

    public int getMapExitColumn() {
        return mapExitColumn;
    }

    public void setMapExitColumn(int mapExitColumn) {
        this.mapExitColumn = mapExitColumn;
    }

    public int getMapExitRow() {
        return mapExitRow;
    }

    public void setMapExitRow(int mapExitRow) {
        this.mapExitRow = mapExitRow;
    }
    
}
