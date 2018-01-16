/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.TacheService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bariz Meriem
 */
public class TacheServiceTest {
    
    public TacheServiceTest() {
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
     * Test of creerTache method, of class TacheService.
     */
//     @Test
//    public void testCreerTache() throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//         
//        System.out.println("creerTache");
//        int id = 1;
//        String nom = "BEGNING";
//        String chemain = "creer des listes";
//        
//        
//        Date d_tache= null;
//        String date1="01/12/2004";
//        d_tache=simpleDateFormat.parse(date1);
//        
//        
//        
//        
//        Date f_tache = null;
//        String date2="08/08/2004";
//        f_tache=simpleDateFormat.parse(date1);
//        
//        String précedent = "controle";
//        String suivant = "ratrrapage ";
//        float pourcentage = 20.10F;
//        int durée = 32;
//        int idmodule = 4;
//        TacheService instance = new TacheService();
//        int expResult = 1;
//        instance.creerTache(id, nom, chemain,d_tache ,f_tache, précedent, suivant, pourcentage, durée, idmodule);
//     
//  
//    }

    
//    @Test
//    public void testCount() {
//        System.out.println("count");
//        int idtache = 1;
//        TacheService instance = new TacheService();
//        int expResult = 1;
//        int result = instance.count(idtache);
//        assertEquals(expResult, result);
//    }

    
//    @Test
//    public void testModifier() {
//        System.out.println("modifier");
//        String chemin = "";
//        TacheService instance = new TacheService();
//        int expResult = 0;
//        int result = instance.modifier(chemin);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByName method, of class TacheService.
//     */
    @Test
    public void testFindByName() {
        System.out.println("findByName");
        String name = "MINO";
        TacheService instance = new TacheService();
        int expResult = 1;
        int result = instance.findByName(name);
        assertEquals(expResult, result);
    }
    
}
