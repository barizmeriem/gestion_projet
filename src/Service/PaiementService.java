/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Paiement;
import bean.Projet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rachid Aitbouzkri
 */
public class PaiementService extends AbstractFacade<Paiement> {
    ProjetService projetService = new ProjetService();
    

    public PaiementService() {
        super(Paiement.class);
    }

    public int creerPaiement(int id, double avance,Date d_paiment ,int idprojet) {
        Projet projet = projetService.find(idprojet);
        Paiement p = new Paiement(id, avance, d_paiment);
        p.setDatePaiement(d_paiment);
        p.setProjet(projet);
        
        create(p);
        return 1;
    }
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("creerPaiement");
        int id = 1;
        double avance = 3000000.0;
        
        Date d_paiment = null;
         String date1="01/02/2018";
         d_paiment=simpleDateFormat.parse(date1);
         
        int idprojet = 1;
        PaiementService instance = new PaiementService();
        instance.creerPaiement(id, avance, d_paiment, idprojet);
        
    }

}
