/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Service.ProjetService;
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
public class TestProjet {
    public static void main(String[] args) {
        ProjetService projetService=new ProjetService();
        Map params=new HashMap();
        params.put("ENTREPRISE", "LINKED IN");
        try {
            JasperUtil.generatePdf(projetService.findAll(), "C:\\Users\\Rachid Aitbouzkri\\Documents\\NetBeansProjects\\Gestion-Projet\\src\\report\\reportProjet.jasper", "D:\\Projets.pdf", params, true);
        } catch (JRException ex) {
            Logger.getLogger(TestProjet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestProjet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
