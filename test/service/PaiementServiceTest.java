/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.PaiementService;
import java.util.Date;
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
public class PaiementServiceTest {
    
    public PaiementServiceTest() {
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
     * Test of creerPaiement method, of class PaiementService.
     */
    @Test
    public void testCreerPaiement() {
        System.out.println("creerPaiement");
        int id = 1;
        double avance = 34.89;
        Date d_paiment = null;
        int idprojet = 1;
        PaiementService instance = new PaiementService();
        int expResult = 1;
        int result = instance.creerPaiement(id, avance, d_paiment, idprojet);
        assertEquals(expResult, result);

    }
    
}
