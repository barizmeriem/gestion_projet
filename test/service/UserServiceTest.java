/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.UserService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bariz
 */
public class UserServiceTest {
    
    public UserServiceTest() {
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
     * Test of creerUser method, of class UserService.
     */
    @Test
    public void testCreerUser() {
        System.out.println("creerUser");
        String id = "Bo";
        String password = "Ko";
        UserService instance = new UserService();
        int expResult = 1;
        int result = instance.creerUser(id, password);
        assertEquals(expResult, result);

    }
    
}
