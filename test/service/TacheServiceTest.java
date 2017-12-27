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
 * @author Rachid Aitbouzkri
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
    @Test
    public void testCreerTache() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
         
        System.out.println("creerTache");
        int id = 2;
        String nom = "Creation";
        String chemain = "apres laccomplissement de linitialisation ";
        
        
        Date d_tache= null;
        String date1="01/02/2018";
        d_tache=simpleDateFormat.parse(date1);
        
        
        
        
        Date f_tache = null;
        String date2="10/02/2018";
        f_tache=simpleDateFormat.parse(date1);
        
        String précedent = "initialisation";
        String suivant = "laffectation ";
        float pourcentage = 37.10F;
        int durée = 24;
        int idmodule = 1;
        TacheService instance = new TacheService();
        int expResult = 1;
        instance.creerTache(id, nom, chemain,d_tache ,f_tache, précedent, suivant, pourcentage, durée, idmodule);
     
  
    }
    
}
