/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ethan
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of movePlayer method, of class PlayerControl.
     */
    @Test
    public void testMovePlayer() {
        System.out.println("movePlayer");
        String direction = "";
        int positionX = 0;
        int positionY = 0;
        PlayerControl instance = new PlayerControl();
        instance.movePlayer(direction, positionX, positionY);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of recoverHealth method, of class PlayerControl.
     */
    @Test
    public void testRecoverHealth() {
        System.out.println("recoverHealth");
        int potionAmt = 0;
        int healthPoints = 0;
        PlayerControl instance = new PlayerControl();
        instance.recoverHealth(potionAmt, healthPoints);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of skipMathChallenge method, of class PlayerControl.
     */
    @Test
    public void testSkipMathChallenge() {
        System.out.println("skipMathChallenge");
        int skipAmt = 0;
        double equationOneAnswer = 0.0;
        double equationTwoAnswer = 0.0;
        double equationThreeAnswer = 0.0;
        PlayerControl instance = new PlayerControl();
        instance.skipMathChallenge(skipAmt, equationOneAnswer, equationTwoAnswer, equationThreeAnswer);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
