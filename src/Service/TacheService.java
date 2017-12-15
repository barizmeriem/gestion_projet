/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import bean.Tache;

/**
 *
 * @author Rachid Aitbouzkri
 */
public class TacheService extends AbstractFacade<Tache>{
    
    public TacheService(Class<Tache> entityClass) {
        super(Tache.class);
    }
     public void initBD() {
        for (int i = 0; i <= 10; i++) {
            creerTache(i + 1, "AE" + i, "MP", "T1","T2");
        }
    }
     public int creerTache(int id,String nom,String chemain,String précedent,String suivant) {
        Tache t = new Tache();
        t.setId(id);
       t.setNom(nom);
        t.setChemin(chemain);
        t.setPrécedent(précedent);
        t.setSuivant(suivant);
        create(t);
        return 1;
    }
    
}
