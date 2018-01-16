/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.ProjetService;
import bean.Projet;
import java.util.Date;
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

    //    @Test
//    public void testCreerProjet() {
//        System.out.println("creerProjet");
//        int id = 150;
//        String nom = "hwawi";
//        Date d_debut = null;
//        Date d_fin = null;
//        double avancement = 1500000.0;
//        double montant = 90000000.0;
//        int jour_homme = 118;
//        ProjetService instance = new ProjetService();
//        int expResult = 1;
//        int result = instance.creerProjet(id, nom, d_debut, d_fin, avancement, montant, jour_homme);
//        assertEquals(expResult, result);
//
//    }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//    @Test
//    public void testFermerProjet() {
//        System.out.println("fermerProjet");
//        int id = 1;
//        Date d_fin = null;
//        double avancement = 3000000.0;
//        ProjetService instance = new ProjetService();
//        int expResult = 1;
//        int result = instance.fermerProjet(id, d_fin, avancement);
//        System.out.println(result);
//    }
//-------------------------------------------------------
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        int id = 1;
//        ProjetService instance = new ProjetService();
//        List<Projet> result = instance.findById(id);
//        System.out.println(result);
//    }
//
//----------------------------------------
//    @Test
//    public void testFindAncienProjet() {
//        System.out.println("findAncienProjet");
//        ProjetService instance = new ProjetService();
//        Projet result = instance.findAncienProjet();
//        System.out.println(result);
//    }
//------------------------------------------------
//    @Test
//    public void testFindNewProjet() {
//        System.out.println("findNewProjet");
//        ProjetService instance = new ProjetService();
//        Projet result = instance.findNewProjet();
//        System.out.println(result);
//
//    }
//---------------------------------------------------
//    @Test
//    public void testFindProjetByAvancement() {
//        System.out.println("FindProjetByMontant");
//        double avancement = 3000000.0;
//        ProjetService instance = new ProjetService();
//        List<Projet> result = instance.FindProjetByAvancement(avancement);
//        System.out.println(result);
//    }
//    
    
//----------------------------------------------------

//@Test
//    public void testFindByName() {
//        System.out.println("findByName");
//        String nom = "Hicho";
//        ProjetService instance = new ProjetService();
//        List<Projet> result = instance.findByName(nom);
//        System.out.println(result);
//    }
    
}
