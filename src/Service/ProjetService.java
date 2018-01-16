package Service;

import bean.Module;
import bean.Projet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Meriem
 */
public class ProjetService extends AbstractFacade<Projet> {

    public ProjetService() {
        super(Projet.class);
    }

    public int creerProjet(int id, String nom, Date d_debut, Date d_fin, double avancement, double montant, int jour_homme) {
        Projet p = new Projet(id, nom, avancement, montant, jour_homme);
        p.setDebut_projet(d_debut);
        p.setFin_projet(d_fin);
        create(p);
        return 1;
    }

    public int fermerProjet(int id, Date d_fin, double avancement) {
        Projet projet = find(id);
        if (projet == null) {
            return -1;
        } else if (projet.getFin_projet().before(d_fin) && projet.getAvancement() == avancement) {
            return -2;
        } else {
            remove(projet);
            return 1;
        }
    }

    public List<Projet> findById(int id) {
        List<Projet> res = getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.id=" + id + "").getResultList();
        return res;
    }

    public Projet findAncienProjet() {
        return (Projet) getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.fin_projet = (SELECT min(c.fin_projet) FROM Projet c)").getSingleResult();
    }

    public List<Projet> findByName(String nom) {
        return getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.nom='" + nom + "'").getResultList();
    }

    public Projet findNewProjet() {
        return (Projet) getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.fin_projet = (SELECT max(c.fin_projet) FROM Projet c)").getSingleResult();
    }

    public List<Projet> FindProjetByAvancement(double avancement) {
        return getEntityManager().createQuery("SELECT p FROM Projet p"
                + " WHERE p.avancement" + avancement).getResultList();
    }

}
