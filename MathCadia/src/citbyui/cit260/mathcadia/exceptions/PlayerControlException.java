/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mathcadia.exceptions;

/**
 *
 * @author ethan
 */
public class PlayerControlException extends Exception {

    public PlayerControlException() {
    }

    public PlayerControlException(String message) {
        super(message);
    }

    public PlayerControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerControlException(Throwable cause) {
        super(cause);
    }

    public PlayerControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
