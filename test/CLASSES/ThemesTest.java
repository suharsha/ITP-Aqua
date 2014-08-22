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
        Themes theme = new Themes();
                assertTrue(theme.setTheme(1));
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIcon method, of class Themes.
     */
 /*   @Test
    public void testSetIcon() {
        System.out.println("setIcon");
        JFrame j = null;
        Themes theme = new Themes();
                assertTrue(theme.setIcon(j) );
        fail("The test case is a prototype.");
    } */
    
}
