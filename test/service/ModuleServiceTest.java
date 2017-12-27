/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.ModuleService;
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
 * @author Rachid Aitbouzkri
 */
public class ModuleServiceTest {
    
    public ModuleServiceTest() {
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
     * Test of creerModule method, of class ModuleService.
     */
    @Test
    public void testCreerModule() throws ParseException {
        System.out.println("creerModule");
        int id = 1;
        float avancement = 34.1F;
        Date d_debut = null;
         String date1="15/02/2018";
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
         d_debut=simpleDateFormat.parse(date1);
        Date d_fin = null;
        String date2="29/02/2018";
         d_debut=simpleDateFormat.parse(date2);
        float pourcentage = 20.0F;
        int jour_homme = 14;
        int idprojet = 1;
        ModuleService instance = new ModuleService();
        int expResult = 1;
        int result = instance.creerModule(id, avancement, d_debut, d_fin, pourcentage, jour_homme, idprojet);
        assertEquals(expResult, result);

    }
    
}
