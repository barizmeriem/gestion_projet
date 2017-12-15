/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Paiement;

/**
 *
 * @author Rachid Aitbouzkri
 */
public class PaiementService extends AbstractFacade<Paiement> {

    public PaiementService() {
        super(Paiement.class);
    }

    public void initBD() {
        for (int i = 0; i <= 10; i++) {
            creerPaiement(i + 1, i, i * i);
        }
    }

    public int creerPaiement(int id, double avance, double reste_a_Paye) {
        Paiement p = new Paiement();
        p.setId(id);
        p.setAvance(avance);
        p.setReste_a_Paye(reste_a_Paye);
        create(p);
        return 1;
    }

}
