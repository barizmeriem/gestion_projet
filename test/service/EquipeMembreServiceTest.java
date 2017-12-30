/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.EquipeMembreService;
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
public class EquipeMembreServiceTest {

    public EquipeMembreServiceTest() {
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
     * Test of creerEquipeMembre method, of class EquipeMembreService.
     */
    @Test
    public void testCreerEquipeMembre() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("creerEquipeMembre");

        int id = 1;
        int idequipe = 1;

        Date dateAffectation = null;
        String date2 = "01/06/2015";
        dateAffectation = simpleDateFormat.parse(date2);
        
        int idmembre = 1;
        EquipeMembreService instance = new EquipeMembreService();
        int expResult = 1;
        int result = instance.creerEquipeMembre(id, idequipe, dateAffectation, idmembre);
        assertEquals(expResult, result);

    }

}
