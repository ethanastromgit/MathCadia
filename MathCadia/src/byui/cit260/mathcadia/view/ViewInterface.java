/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import byui.cit260.mathcadia.exceptions.GameControlException;

/**
 *
 * @author ethan
 */
public interface ViewInterface {
    
    public void display() throws GameControlException;
    public String getInput();
    public boolean doAction(String value) throws GameControlException;
    
}
