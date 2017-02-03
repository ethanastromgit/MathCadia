package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {
    
    //Constructor
    public Player() {
        
    }
    
    //Attributes
    private int points;
    private String name;
    private String description;
    private int healthPoints;
    private int coordinateNumber;
   
    //Getters & Setters
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getCoordinateNumber() {
        return coordinateNumber;
    }

    public void setCoordinateNumber(int coordinateNumber) {
        this.coordinateNumber = coordinateNumber;
    }
    
    //hashcode ()
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.points;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + this.healthPoints;
        hash = 17 * hash + this.coordinateNumber;
        return hash;
    }
    
    //Equals ()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.points != other.points) {
            return false;
        }
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.coordinateNumber != other.coordinateNumber) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    //To String()
    @Override
    public String toString() {
        return "Player{" + "points=" + points + ", name=" + name + ", description=" + description + ", healthPoints=" + healthPoints + ", coordinateNumber=" + coordinateNumber + '}';
    }
    
}
