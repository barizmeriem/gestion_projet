/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.EquipeMembreService;
import bean.EquipeMembre;
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
//--------------------------------------------------
//   @Test
//    public void testCreerEquipeMembre() throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("creerEquipeMembre");
//
//        int id = 3;
//        int idequipe = 2;
//
//        Date dateAffectation = null;
//        String date2 = "01/08/2005";
//        dateAffectation = simpleDateFormat.parse(date2);
//        
//        int idmembre = 2;
//        EquipeMembreService instance = new EquipeMembreService();
//        int expResult = 1;
//        int result = instance.creerEquipeMembre(id, idequipe, dateAffectation, idmembre);
//        assertEquals(expResult, result);
//
//    }

//-----------------------------------------
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        int id = 1;
//        EquipeMembreService instance = new EquipeMembreService();
//        List<EquipeMembre> result = instance.findById(id);
//        System.out.println(result);
//    }
//------------------------------------------------------
//    @Test
//    public void testNbrMembre() {
//        System.out.println("nbrMembre");
//        int idEquipe = 1;
//        EquipeMembreService instance = new EquipeMembreService();
//        int expResult = 1;
//        int result = instance.nbrMembre(idEquipe);
//        System.out.println(result);
//    }
    
}
