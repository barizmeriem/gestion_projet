/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.ModuleService;
import bean.Module;
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

//    @Test
//    public void testCreerModule() throws ParseException {
//        System.out.println("creerModule");
//        int id = 5;
//        float avancement = 900.1F;
//        
//        Date d_debut = null;
//         String date1="16/07/2014";
//         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//         d_debut=simpleDateFormat.parse(date1);
//         
//        Date d_fin = null;
//        String date2="06/12/2005";
//         d_fin=simpleDateFormat.parse(date2);
//         
//        float pourcentage = 500.0F;
//        int jour_homme = 13;
//        int idprojet = 4;
//        ModuleService instance = new ModuleService();
//        int expResult = 1;
//        int result = instance.creerModule(id, avancement, d_debut, d_fin, pourcentage, jour_homme, idprojet);
//        assertEquals(expResult, result);
//
//    }
//------------------------------------------------------
//    @Test
//    public void testFindModuleByAvancement() {
//        System.out.println("FindModuleByAvancement");
//        float avancement = 500.0F;
//        ModuleService instance = new ModuleService();
//        List<Module> result = instance.FindModuleByAvancement(avancement);
//        System.out.println(result);
//    }
//-----------------------------------------------------
//    @Test
//    public void testCount() {
//        System.out.println("count");
//        int idmodule = 5;
//        ModuleService instance = new ModuleService();
//        int expResult = 1;
//        int result = instance.count(idmodule);
//        System.out.println(result);
//    }
    
}
