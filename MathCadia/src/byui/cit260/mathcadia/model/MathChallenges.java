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

    //hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.answer) ^ (Double.doubleToLongBits(this.answer) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.description);
        return hash;
    }

    //equals
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
        return true;
    }

    //toString
    @Override
    public String toString() {
        return "MathChallenges{" + "answer=" + answer + ", description=" + description + '}';
    }
    
}    
    
   
    