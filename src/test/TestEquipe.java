/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Service.EquipeService;
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
public class TestEquipe {
    public static void main(String[] args) {
        EquipeService equipeService=new EquipeService();
        Map params=new HashMap();
        params.put("ENTREPRISE", "LINKED IN");
       
        try {
            JasperUtil.generatePdf(equipeService.findAll(), "C:\\Users\\Rachid Aitbouzkri\\Documents\\NetBeansProjects\\Gestion-Projet\\src\\report\\reportEquipe.jasper", "D:\\Equipes.pdf", params, true);
        } catch (JRException ex) {
            Logger.getLogger(TestEquipe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
