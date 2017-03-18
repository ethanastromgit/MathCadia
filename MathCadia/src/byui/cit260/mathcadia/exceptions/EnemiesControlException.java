/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.exceptions;

/**
 *
 * @author ethan
 */
public class EnemiesControlException extends Exception {

    public EnemiesControlException() {
    }

    public EnemiesControlException(String message) {
        super(message);
    }

    public EnemiesControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public EnemiesControlException(Throwable cause) {
        super(cause);
    }

    public EnemiesControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
