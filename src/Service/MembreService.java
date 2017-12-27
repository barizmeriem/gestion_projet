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
 * @author M
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

    public List<Membre> findByCin(int cin) {
        List<Membre> res = getEntityManager().createQuery("SELECT m FROM Membre m WHERE m.equipe.id=" + cin).getResultList();
        return res;
    }
    public List<Membre> findByCin2(int cin) {
        List<Membre> res = getEntityManager().createQuery("SELECT m FROM Membre m WHERE m.projet.id=" + cin).getResultList();
        return res;
    }

    public static void main(String[] args) {
        System.out.println("saveMembre");
        String grade = "EMPLOYE";
        int cin = 2;
        String nom = "BO";
        String prenom = "Y";
        String password = "BH";
        int jour_homme = 10;
        int idprojet = 1;
        int idequipe = 5;
        MembreService instance = new MembreService();
        instance.saveMembre(grade, cin, nom, prenom, password, jour_homme, idprojet, idequipe);
    }

}
