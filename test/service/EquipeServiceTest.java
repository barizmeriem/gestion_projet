/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Service.EquipeService;
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
public class EquipeServiceTest {

    public EquipeServiceTest() {
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
     * Test of creerEquipe method, of class EquipeService.
     */
    @Test
    public void testCreerEquipe() {
        System.out.println("creerEquipe");
        int id = 7;
        String nom = "hihi.E_equipe";
        int idprojet =4;
        EquipeService instance = new EquipeService();
        int expResult = 1;
        int result = instance.creerEquipe(id, nom, idprojet);
        assertEquals(expResult, result);

    }

}
