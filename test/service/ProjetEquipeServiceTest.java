/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.ProjetEquipeService;
import bean.ProjetEquipe;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class ProjetEquipeServiceTest {

    public ProjetEquipeServiceTest() {
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
//-----------------------------
//    @Test
//    public void testCreerProjetEquipe() throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("creerProjetEquipe");
//        int id = 3;
//        int idequipe = 2;
//
//        Date dateAffectation = null;
//        String date= "10/12/2085";
//        dateAffectation = simpleDateFormat.parse(date);
//
//        int idprojet = 2;
//        ProjetEquipeService instance = new ProjetEquipeService();
//        int expResult = 1;
//        int result = instance.creerProjetEquipe(id, idequipe, dateAffectation, idprojet);
//        assertEquals(expResult, result);
//
//    }
//--------------------------------------------------
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        int id = 1;
//        ProjetEquipeService instance = new ProjetEquipeService();
//        List<ProjetEquipe> expResult = null;
//        List<ProjetEquipe> result = instance.findById(id);
//        System.out.println(result);
//    }
//------------------------------------------------
//    @Test
//    public void testNbrEquipe() {
//        System.out.println("nbrEquipe");
//        int idProjet = 1;
//        ProjetEquipeService instance = new ProjetEquipeService();
//        int result = instance.nbrEquipe(idProjet);
//        System.out.println(result);
//    }

}
