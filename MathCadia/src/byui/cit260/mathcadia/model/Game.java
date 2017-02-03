package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Game implements Serializable {

    //Constructor
    public Game(boolean player, int gamePoints) {
        
    }

    //Attributes
    private boolean player;
    private int gamePoints;

    //Getters and Setters
    public boolean isPlayer() {
        return player;
    }

    public void setPlayer(boolean player) {
        this.player = player;
    }

    public int getGamePoints() {
        return gamePoints;
    }

    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }

    //hashcode()
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.player ? 1 : 0);
        hash = 97 * hash + this.gamePoints;
        return hash;
    }

    //equals()
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
        final Game other = (Game) obj;
        if (this.player != other.player) {
            return false;
        }
        if (this.gamePoints != other.gamePoints) {
            return false;
        }
        return true;
    }

    //toString()
    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", gamePoints=" + gamePoints + '}';
    }

}
