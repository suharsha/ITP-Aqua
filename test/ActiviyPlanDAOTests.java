/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CLASSES.ActivityPlan;
import CLASSES.ActivityPlanDAO;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Suharsha Wick
 */
public class ActiviyPlanDAOTests {
    
    public ActiviyPlanDAOTests() {
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

    @Test
    public void testAddAcitivityPlan(){
        int eventID = 1;
        ActivityPlan plan = new ActivityPlan(eventID);
        ActivityPlanDAO dao = new ActivityPlanDAO();
        
        boolean expectedResult = true;
        boolean result = dao.addActivityPlan(plan);
        assertEquals(expectedResult,result);
    }
}
