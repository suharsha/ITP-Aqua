/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Suharsha Wick
 */
public class ThemesTest {
    
    public ThemesTest() {
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
     * Test of setTheme method, of class Themes.
     */
    @Test
    public void testSetTheme() {
        System.out.println("setTheme");
        int id1 = 1;
        int id2 = 2;
        int id3 = 3;
        Themes instance = new Themes();
        boolean expResult = true;
        boolean result1 = instance.setTheme(id1);
        assertEquals(expResult, result1);
        boolean result2 = instance.setTheme(id2);
        assertEquals(expResult, result2);
        boolean result3 = instance.setTheme(id3);
        assertEquals(expResult, result3);
        System.exit(-1);
    }

    /**
     * Test of setIcon method, of class Themes.
     */
    @Test
    public void testSetIcon() {
        System.out.println("setIcon");
        JFrame j = new JFrame();
        Themes instance = new Themes();
        boolean expResult = false;
        boolean result = instance.setIcon(j);
        assertEquals(expResult, result);
        System.exit(-1);
    }
    
}
