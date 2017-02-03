package byui.cit260.mathcadia.model;

import java.io.Serializable;
import java.util.Objects;

public class MathChallenges implements Serializable {
    
    //Constructor
    public MathChallenges() {
        
    }
    
    //Attributes
    private double answer;
    private String description;
    private String hintOption;
    private String howToSolve;
    
    //Getters and Setters
    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHintOption() {
        return hintOption;
    }

    public void setHintOption(String hintOption) {
        this.hintOption = hintOption;
    }

    public String getHowToSolve() {
        return howToSolve;
    }

    public void setHowToSolve(String howToSolve) {
        this.howToSolve = howToSolve;
    }

    //hashCode()
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.answer) ^ (Double.doubleToLongBits(this.answer) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.hintOption);
        hash = 71 * hash + Objects.hashCode(this.howToSolve);
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
        final MathChallenges other = (MathChallenges) obj;
        if (Double.doubleToLongBits(this.answer) != Double.doubleToLongBits(other.answer)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.hintOption, other.hintOption)) {
            return false;
        }
        if (!Objects.equals(this.howToSolve, other.howToSolve)) {
            return false;
        }
        return true;
    }

    //toString()
    @Override
    public String toString() {
        return "MathChallenges{" + "answer=" + answer + ", description=" + description + ", hintOption=" + hintOption + ", howToSolve=" + howToSolve + '}';
    }
    
}
