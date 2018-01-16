/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Equipe;
import bean.EquipeMembre;
import bean.Membre;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Bariz
 */
public class EquipeMembreService extends AbstractFacade<EquipeMembre> {

    EquipeService equipeService = new EquipeService();
    MembreService MembreService = new MembreService();

    public EquipeMembreService() {
        super(EquipeMembre.class);
    }

    public int creerEquipeMembre(int id, int idequipe, Date dateAffectation, int idmembre) {
        Equipe equipe = equipeService.find(idequipe);
        Membre membre = MembreService.find(idmembre);
        EquipeMembre equipeMembre = new EquipeMembre(id);
        equipeMembre.setEquipe(equipe);
        equipeMembre.setMembre(membre);
        equipeMembre.setDateAffectation(dateAffectation);
        create(equipeMembre);
        return 1;
    }

    private List<Membre> AffecterEquipeMembre(Equipe e, Membre m, String grade) {
        List<Membre> res = new ArrayList();
        EquipeMembreService ems = new EquipeMembreService();
        if (m == null || e == null) {
            return null;
        } else {
            return getEntityManager().createQuery("SELECT em FROM EquipeMembre em  WHERE em.membre.grade='" + m.getGrade() + "'").getResultList();
        }

    }

    public List<EquipeMembre> findById(int id) {
        List<EquipeMembre> res = getEntityManager().createQuery("SELECT em FROM EquipeMembre em WHERE em.id=" + id + "").getResultList();
        return res;
    }

    public int nbrMembre(int idEquipe) {
        int nbr = 0;
        Equipe equipe = equipeService.find(idEquipe);
        List<EquipeMembre> equipemembres = findAll();
        if (equipe == null) {
            return -1;
        } else {
            for (int i = 0; i < equipemembres.size(); i++) {
                EquipeMembre equipemembre = equipemembres.get(i);
                if (equipemembre.getEquipe().equals(equipe)) {
                    nbr++;
                }
            }
            return nbr;
        }
    }

}
