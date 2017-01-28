package MathCadia;
import java.io.Serializable;
import java.util.Objects;

public class Game implements Serializable {
    
    //Constructor
    public Game(String player, int gamePoints) {
        this.player = player;
        this.gamePoints = gamePoints;
    }
    
    //Attributes
    private String player; 
    private int gamePoints;

    //Getters and Setters
    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
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
        if (this.gamePoints != other.gamePoints) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
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
