package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class Game implements Serializable {

    //Constructor
    public Game() {
        
    }

    //Attributes
    private Player player;
    
    //Getters and Setters

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
}
