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
public class InventoryControlTest {
    
    public InventoryControlTest() {
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
     * Test of validateLength method, of class InventoryControl.
     */
    @Test
    public void testValidateLength1() {
        System.out.println("validateLength");
        System.out.println("\tTest Case #1");
        
        int input = 5;
        
        boolean expResult = true;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateLength(input);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidateLength2() {
       System.out.println("validateLength");
        System.out.println("\tTest Case #2");
        
        int input = 0;
        
        boolean expResult = false;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateLength(input);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidateLength3() {
       System.out.println("validateLength");
        System.out.println("\tTest Case #3");
        
        int input = 11;
        
        boolean expResult = false;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateLength(input);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of validateWidth method, of class InventoryControl.
     */
    @Test
    public void testValidateWidth1() {
        System.out.println("validateWidth");
        System.out.println("\tTest Case #1");
        
        int input = 5;
        
        boolean expResult = true;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateWidth(input);
        
        assertEquals(expResult, result);
    }
    
    public void testValidateWidth2() {
        System.out.println("validateWidth");
        System.out.println("\tTest Case #2");
        
        int input = 0;
        
        boolean expResult = false;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateWidth(input);
        
        assertEquals(expResult, result);
    }
    
    public void testValidateWidth3() {
        System.out.println("validateWidth");
        System.out.println("\tTest Case #3");
        
        int input = 11;
        
        boolean expResult = false;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateWidth(input);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of validateHeight method, of class InventoryControl.
     */
    @Test
    public void testValidateHeight1() {
        System.out.println("validateHeight");
        System.out.println("\tTest Case #1");
        
        int input = 5;
        
        boolean expResult = true;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateHeight(input);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidateHeight2() {
        System.out.println("validateHeight");
        System.out.println("\tTest Case #2");
        
        int input = 0;
        
        boolean expResult = false;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateHeight(input);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidateHeight3() {
        System.out.println("validateHeight");
        System.out.println("\tTest Case #3");
        
        int input = 11;
        
        boolean expResult = false;
        
        InventoryControl instance = new InventoryControl();
        boolean result = instance.validateHeight(input);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of calcInventoryVol method, of class InventoryControl.
     */
    @Test
    public void testCalcInventoryVol1() {
        System.out.println("calcInventoryVol");
        System.out.println("\tTest Case #1");
        
        int length = 5;
        int width = 5;
        int height = 5;
        
        int expResult = 125;
        
        InventoryControl instance = new InventoryControl();
        int result = instance.calcInventoryVol(length, width, height);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of addPotion method, of class InventoryControl.
     */
    /*@Test
    public void testAddPotion() {
        System.out.println("addPotion");
        int potionAmt = 0;
        int maxPotionAmt = 0;
        boolean hasPotion = false;
        InventoryControl instance = new InventoryControl();
        int expResult = 0;
        int result = instance.addPotion(potionAmt, maxPotionAmt, hasPotion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of calcMaxPotionAmt method, of class InventoryControl.
     */
    /*@Test
    public void testCalcMaxPotionAmt() {
        System.out.println("calcMaxPotionAmt");
        int volume = 0;
        int maxPotionAmt = 0;
        InventoryControl instance = new InventoryControl();
        instance.calcMaxPotionAmt(volume, maxPotionAmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
