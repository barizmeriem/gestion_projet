/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Equipe;
import bean.Projet;
import java.util.List;

/**
 *
 * @author Meriem
 */
public class EquipeService extends AbstractFacade<Equipe> {

    ProjetService projetService = new ProjetService();

    public EquipeService() {
        super(Equipe.class);
    }

    public int creerEquipe(int id, String nom, int idprojet) {
        Projet projet = projetService.find(idprojet);
        Equipe m = new Equipe(id, nom);
        m.setProjet(projet);
        create(m);
        return 1;
    }

   
    public List<Equipe> findById(int id) {
        List<Equipe> res = getEntityManager().createQuery("SELECT e FROM Equipe e WHERE e.projet.id=" + id + "").getResultList();
        return res;
    }
    
}
