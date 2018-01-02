/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

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
            edit(projet);
            return 1;
        }
    }

    public List<Projet> findById(int id) {
        List<Projet> res = getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.id=" + id + "").getResultList();
        return res;
    }

    public Projet findAncienProjet() {
        return (Projet) getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.fin_projet = (SELECT max(c.fin_projet) FROM Projet c)").getSingleResult();
    }
    public int findByName(String nom){
        return (int) getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.nom='"+nom+"'").getSingleResult();
    }
    
     
    
    
//    public static void main(String[] args) throws ParseException {
//        System.out.println("creerProjet");
//        int id = 2;
//        String nom = "STOCKmanger";
//        Date d_debut = null;
//         String date1="01/02/2018";
//         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//         d_debut=simpleDateFormat.parse(date1);
//        Date d_fin = null;
//        String date2="01/05/2018";
//        d_fin=simpleDateFormat.parse(date2);
//        double avancement = 3000000.0;
//        double montant = 9000000.0;
//        int jour_homme = 90;
//        ProjetService instance = new ProjetService();
//        instance.creerProjet(id, nom, d_debut, d_fin, avancement, montant, jour_homme);
//    }
}
