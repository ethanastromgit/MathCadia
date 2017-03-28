/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

/**
 *
 * @author ethan
 */
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super("\n-------------------------------------"
                      + "\n Help Menu                           "
                      + "\n-------------------------------------"
                      + "\n P - What is the purpose of the game "
                      + "\n M - How to move in the game         "
                      + "\n R - Rules of the game               "
                      + "\n                                     "
                      + "\n Q - Return                          "
                      + "\n-------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to upper case
        
        switch (choice) {
            case "P": 
                this.displayGamePurpose();
                break;
            case "M": 
                this.displayHowToMove();
                break;
            case "R": 
                this.displayRules();
                break;
            case "Q": //Display Help Menu
                return true;
                /*MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.displayMainMenuView();
                break;*/
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
    private void displayGamePurpose() {
        this.console.println("Defeat all enemies to obtain three keys to open the boss room. Finally, defeat the boss and gradute from MathCadia.");
    }
            
    private void displayHowToMove() {
        this.console.println("You move in any of the four directions - North, South, East, and West - by typing the first character of the corresponding direction.");
    }  
    
    private void displayRules() {
        this.console.println("If you run of out health points, you lose. You may not move in a direction that would take you off the map. Having all three keys is a must to gain access to the boss room. Defeating the boss allows you to win.");
    }
    
}
