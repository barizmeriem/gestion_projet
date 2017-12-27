/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.ProjetService;
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
public class ProjetServiceTest {
    
    public ProjetServiceTest() {
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
     * Test of creerProjet method, of class ProjetService.
     */
    @Test
    public void testCreerProjet() {
        System.out.println("creerProjet");
        int id = 1;
        String nom = "POCKETube";
        Date d_debut = null;
        Date d_fin = null;
        double avancement = 3000000.0;
        double montant = 9000000.0;
        int jour_homme = 120;
        ProjetService instance = new ProjetService();
        int expResult = 1;
        int result = instance.creerProjet(id, nom, d_debut, d_fin, avancement, montant, jour_homme);
        assertEquals(expResult, result);

    }
    
}
