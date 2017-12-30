/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.ProjetEquipeService;
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

    /**
     * Test of creerProjetEquipe method, of class ProjetEquipeService.
     */
    @Test
    public void testCreerProjetEquipe() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("creerProjetEquipe");
        int id = 1;
        int idequipe = 1;

        Date dateAffectation = null;
        String date= "01/06/2015";
        dateAffectation = simpleDateFormat.parse(date);

        int idprojet = 1;
        ProjetEquipeService instance = new ProjetEquipeService();
        int expResult = 1;
        int result = instance.creerProjetEquipe(id, idequipe, dateAffectation, idprojet);
        assertEquals(expResult, result);

    }

}
