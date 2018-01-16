/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Service.MembreService;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import util.JasperUtil;

/**
 *
 * @author Bariz
 */
public class TestMembre {
    public static void main(String[] args) {
        MembreService membreService=new MembreService();
        Map params=new HashMap();
        params.put("ENTREPRISE", "LINKED IN");
        try {
            JasperUtil.generatePdf(membreService.findAll(), "C:\\Users\\Rachid Aitbouzkri\\Documents\\NetBeansProjects\\Gestion-Projet\\src\\report\\reportMembre.jasper", "D:\\Membres.pdf", params, true);
        } catch (JRException ex) {
            Logger.getLogger(TestMembre.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestMembre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
