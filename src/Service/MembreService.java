/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Equipe;
import bean.Membre;
import bean.Projet;
import java.util.List;

/**
 *
 * @author Meriem
 */
public class MembreService extends AbstractFacade<Membre> {

    EquipeService equipeService = new EquipeService();
    ProjetService projetService = new ProjetService();

    public MembreService() {
        super(Membre.class);
    }

    public int saveMembre(String grade, int cin, String nom, String prenom, String password, int jour_homme, int idprojet, int idequipe) {
        Equipe equipe = equipeService.find(idequipe);
        Projet projet = projetService.find(idprojet);
        Membre membre = new Membre(cin, password, nom, prenom, jour_homme, grade);

        if (!grade.equalsIgnoreCase("CHEF") && !grade.equalsIgnoreCase("EMPLOYE")) {
            return -1;
        } else if (grade.equalsIgnoreCase("CHEF")) {
            return 1;
        } else if (grade.equalsIgnoreCase("EMPLOYE")) {
            return 1;
        }

        membre.setEquipe(equipe);
        membre.setProjet(projet);

        create(membre);
        return 1;
    }

    public List<Membre> findByCin(int id) {
         List<Membre> res = getEntityManager().createQuery("SELECT m FROM Membre m WHERE m.equipe.id=" + id).getResultList();
        return res;
    }

    public List<Membre> findByCin2(int cin) {
        List<Membre> res = getEntityManager().createQuery("SELECT m FROM Membre m WHERE m.projet.id=" + cin).getResultList();
        return res;
    }

    public List<Membre> findMembreByGrade(String grade) {
        return getEntityManager().createQuery("SELECT m FROM Membre m WHERE m.grade='" + grade + "'").getResultList();
    }

    
    public Membre findMembrebyEquipeAndProjet(Projet p, Equipe e) {
        if (e == null || p == null) {
            return null;
        } else {
            return (Membre) getEntityManager().createQuery("SELECT m FROM Membre m WHERE m.equipe.id=" + e.getId() + " AND m.projet.id=" + p.getId()).getSingleResult();
        }

    }

    public int isCollocataire(int idMembre1, int idMembre2) {
        Membre membre1 = find(idMembre1);
        Membre membre2 = find(idMembre2);
        if (membre1 == null || membre2 == null) {
            return -1;
        } else if (!(membre1.getGrade() == membre2.getGrade())) {
            return -2;
        } else {
            edit(membre2);
            edit(membre1);
            return 1;
        }
    }

}
