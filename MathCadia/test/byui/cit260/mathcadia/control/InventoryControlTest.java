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
     * Test of calcInventoryVol method, of class InventoryControl.
     */
    @Test
    public void testCalcInventoryVol() {
        System.out.println("calcInventoryVol");
        int length = 0;
        int width = 0;
        int height = 0;
        InventoryControl instance = new InventoryControl();
        int expResult = 0;
        int result = instance.calcInventoryVol(length, width, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addPotion method, of class InventoryControl.
     */
    @Test
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
    }

    /**
     * Test of calcMaxPotionAmt method, of class InventoryControl.
     */
    @Test
    public void testCalcMaxPotionAmt() {
        System.out.println("calcMaxPotionAmt");
        int volume = 0;
        int maxPotionAmt = 0;
        InventoryControl instance = new InventoryControl();
        instance.calcMaxPotionAmt(volume, maxPotionAmt);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
