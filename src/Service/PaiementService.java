/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Paiement;
import bean.Projet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Bariz
 */
public class PaiementService extends AbstractFacade<Paiement> {

    ProjetService projetService = new ProjetService();

    public PaiementService() {
        super(Paiement.class);
    }

    public int creerPaiement(int id, double montant, Date d_paiment, int idprojet) {
        Projet projet = projetService.find(idprojet);
        Paiement p = new Paiement(id, montant, d_paiment);
        p.setDatePaiement(d_paiment);
        p.setProjet(projet);

        create(p);
        return 1;
    }

    public List<Projet> findNonPaye() {
        String query = "SELECT p FROM Paiement p WHERE p.montant = '0' ";
        return getEntityManager().createQuery(query).getResultList();

    }
    public List<Projet> findPaye() {
        String query = "SELECT p FROM Paiement p WHERE p.montant != '0' ";
        return getEntityManager().createQuery(query).getResultList();

    }

    


}
