/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.MembreService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rachid Aitbouzkri
 */
public class MembreServiceTest {
    
    public MembreServiceTest() {
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
     * Test of saveMembre method, of class MembreService.
     */
    @Test
    public void testSaveMembre() {
        System.out.println("saveMembre");
        String grade = "EMPLOYE";
        int cin = 2;
        String nom = "BO";
        String prenom = "Y";
        String password = "BH";
        int jour_homme = 10;
        int idprojet = 1;
        int idequipe = 5;
        MembreService instance = new MembreService();
        int expResult = 1;
        int result = instance.saveMembre(grade, cin, nom, prenom, password, jour_homme, idprojet, idequipe);
        assertEquals(expResult, result);

    }
    
}
