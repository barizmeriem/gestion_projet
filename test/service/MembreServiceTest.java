/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.MembreService;
import bean.Membre;
import java.util.List;
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
     * Test of findByCin method, of class MembreService.
     */
    @Test
    public void testFindByCin() {
        System.out.println("findByCin");
        int cin = 0;
        MembreService instance = new MembreService();
        List<Membre> expResult = null;
        List<Membre> result = instance.findByCin(cin);
        assertEquals(expResult, result);
    }

    /**
     * Test of findByCin2 method, of class MembreService.
     */
    @Test
    public void testFindByCin2() {
        System.out.println("findByCin2");
        int cin = 0;
        MembreService instance = new MembreService();
        List<Membre> expResult = null;
        List<Membre> result = instance.findByCin2(cin);
        assertEquals(expResult, result);
    }

    /**
     * Test of nbrMembre method, of class MembreService.
     */
//    @Test
//    public void testNbrMembre() {
//        System.out.println("nbrMembre");
//        String idEquipe = "1";
//        MembreService instance = new MembreService();
//        int expResult = 1;
//        int result = instance.nbrMembre(idEquipe);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of main method, of class MembreService.
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
