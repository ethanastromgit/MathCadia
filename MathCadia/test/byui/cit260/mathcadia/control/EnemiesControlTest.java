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
public class EnemiesControlTest {
    
    public EnemiesControlTest() {
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
     * Test of isAnswerOneCorrect method, of class EnemiesControl.
     */
    @Test
    public void testIsAnswerOneCorrect() {
        System.out.println("isAnswerOneCorrect");
        int equationOneAnswer = 0;
        int healthPoints = 0;
        int attackDamage = 0;
        int keyAmt = 0;
        EnemiesControl instance = new EnemiesControl();
        instance.isAnswerOneCorrect(equationOneAnswer, healthPoints, attackDamage, keyAmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAnswerTwoCorrect method, of class EnemiesControl.
     */
    @Test
    public void testIsAnswerTwoCorrect() {
        System.out.println("isAnswerTwoCorrect");
        int equationTwoAnswer = 0;
        int healthPoints = 0;
        int attackDamage = 0;
        int keyAmt = 0;
        EnemiesControl instance = new EnemiesControl();
        instance.isAnswerTwoCorrect(equationTwoAnswer, healthPoints, attackDamage, keyAmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAnswerThreeCorrect method, of class EnemiesControl.
     */
    @Test
    public void testIsAnswerThreeCorrect() {
        System.out.println("isAnswerThreeCorrect");
        int equationThreeAnswer = 0;
        int healthPoints = 0;
        int attackDamage = 0;
        int keyAmt = 0;
        EnemiesControl instance = new EnemiesControl();
        instance.isAnswerThreeCorrect(equationThreeAnswer, healthPoints, attackDamage, keyAmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBossAnswerCorrect method, of class EnemiesControl.
     */
    @Test
    public void testIsBossAnswerCorrect() {
        System.out.println("isBossAnswerCorrect");
        int bossEquationAnswer = 0;
        int healthPoints = 0;
        int attackDamage = 0;
        EnemiesControl instance = new EnemiesControl();
        instance.isBossAnswerCorrect(bossEquationAnswer, healthPoints, attackDamage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cannotSkip method, of class EnemiesControl.
     */
    @Test
    public void testCannotSkip() {
        System.out.println("cannotSkip");
        boolean isBoss = false;
        int skipAmt = 0;
        EnemiesControl instance = new EnemiesControl();
        int expResult = 0;
        int result = instance.cannotSkip(isBoss, skipAmt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
