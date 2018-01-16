/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Equipe;
import bean.Projet;
import bean.ProjetEquipe;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Bariz
 */
public class ProjetEquipeService extends AbstractFacade<ProjetEquipe> {

    EquipeService equipeService = new EquipeService();
    ProjetService projetService = new ProjetService();

    public ProjetEquipeService() {
        super(ProjetEquipe.class);
    }

    public int creerProjetEquipe(int id, int idequipe, Date dateAffectation, int idprojet) {
        Equipe equipe = equipeService.find(idequipe);
        Projet projet = projetService.find(idprojet);
        ProjetEquipe projetEquipe = new ProjetEquipe(id);
        projetEquipe.setEquipe(equipe);
        projetEquipe.setProjet(projet);
        projetEquipe.setDateAffectation(dateAffectation);
        create(projetEquipe);
        return 1;
    }
    public List<ProjetEquipe> findById(int id) {
        List<ProjetEquipe> res = getEntityManager().createQuery("SELECT pe FROM ProjetEquipe pe WHERE pe.id=" + id + "").getResultList();
        return res;
    }
    
    
    public int nbrEquipe(int idProjet) {
        int nbr = 0;
        Projet projet = projetService.find(idProjet);
        List<ProjetEquipe> projetequipes = findAll();
        if (projet == null) {
            return -1;
        } else {
            for (int i = 0; i < projetequipes.size(); i++) {
                ProjetEquipe projetEquipe = projetequipes.get(i);
                if (projetEquipe.getProjet().equals(projet)) {
                    nbr++;
                }
            }
            return nbr;
        }
    }

//    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("creerProjetEquipe");
//        int id = 1;
//        int idequipe = 1;
//
//        Date dateAffectation = null;
//        String date2 = "01/06/2015";
//        dateAffectation = simpleDateFormat.parse(date2);
//
//        int idprojet = 1;
//        ProjetEquipeService instance = new ProjetEquipeService();
//        instance.creerProjetEquipe(id, idequipe, dateAffectation, idprojet);
//    }
}

