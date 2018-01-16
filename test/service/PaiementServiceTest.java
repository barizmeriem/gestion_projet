/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.PaiementService;
import bean.Projet;
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
public class PaiementServiceTest {

    public PaiementServiceTest() {
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
//    public static void main(String[] args) throws ParseException {
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//
//        System.out.println("creerPaiement");
//        int id = 6;
//        double montant = 0.0;
//
//        Date d_paiment = null;
//        String date1 = "11/11/2011";
//        d_paiment = simpleDateFormat.parse(date1);
//
//        int idprojet = 5;
//        PaiementService instance = new PaiementService();
//        instance.creerPaiement(id, montant, d_paiment, idprojet);
//
//    }
//------------------------------------------------------------
//    @Test
//    public void testFindNonPaye() {
//        System.out.println("findNonPaye");
//        PaiementService instance = new PaiementService();
//        List<Projet> result = instance.findNonPaye();
//        System.out.println(result);
//
//    }
//--------------------------------------------------------    

//    @Test
//    public void testFindPaye() {
//        System.out.println("findPaye");
//        PaiementService instance = new PaiementService();
//        List<Projet> result = instance.findPaye();
//        System.out.println(result);
//    }

}
