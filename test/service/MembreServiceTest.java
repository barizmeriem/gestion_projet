/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.MembreService;
import bean.Equipe;
import bean.Membre;
import bean.Projet;
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

        //-----------------------------------------------------
//    @Test
//    public void testSaveMembre() {
//        System.out.println("saveMembre");
//        String grade = "CHEF";
//        int cin = 10;
//        String nom = "YOUNES";
//        String prenom = "ZOUNI";
//        String password = "PROFESSEUR";
//        int jour_homme = 1;
//        int idprojet = 4;
//        int idequipe = 5;
//        MembreService instance = new MembreService();
//        int expResult = 1;
//        int result = instance.saveMembre(grade, cin, nom, prenom, password, jour_homme, idprojet, idequipe);
//        assertEquals(expResult, result);
//
//    }
//-----------------------------------------------------
//    @Test
//    public void testFindByCin() {
//        System.out.println("findByCin");
//        int cin = 9;
//        MembreService instance = new MembreService();
//        List<Membre> result = instance.findByCin(cin);
//        System.out.println(result);
//    }
//--------------------------------------------------
//    @Test
//    public void testFindByCin2() {
//        System.out.println("findByCin2");
//        int cin = 6;
//        MembreService instance = new MembreService();
//        List<Membre> result = instance.findByCin2(cin);
//        System.out.println(result);
//    }
//----------------------------------------------------    
//    @Test
//    public void testFindMembreByGrade() {
//        System.out.println("findMembreByGrade");
//        String grade = "CHEF";
//        MembreService instance = new MembreService();
//        List<Membre> result = instance.findMembreByGrade(grade);
//        System.out.println(result);
//    }
//-------------------------------------------------------
//    @Test
//    public void testFindMembrebyEquipeAndProjet() {
//        System.out.println("findMembrebyEquipeAndProjet");
//        Projet p = null;
//        Equipe e = null;
//        MembreService instance = new MembreService();
//        Membre result = instance.findMembrebyEquipeAndProjet(p, e);
//        System.out.println(result);
//    }
//---------------------------------------------------------
//    @Test
//    public void testIsCollocataire() {
//        System.out.println("isCollocataire");
//        int idMembre1 = 5;
//        int idMembre2 = 6;
//        MembreService instance = new MembreService();
//        int expResult = 1;
//        int result = instance.isCollocataire(idMembre1, idMembre2);
//        System.out.println(result);
//    }
    
}
