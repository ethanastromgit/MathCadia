package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Map implements Serializable{

    //Constructor
    public Map() {
        
    }
    
    //Attributes
    private int rowCount;
    private int columnCount;
    
    //Getters and Setters

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
}
