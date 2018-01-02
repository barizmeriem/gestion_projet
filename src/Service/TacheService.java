/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Module;
import bean.Tache;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Bariz
 */
public class TacheService extends AbstractFacade<Tache> {

    ModuleService moduleService = new ModuleService();

    public TacheService() {
        super(Tache.class);
    }

    public int creerTache(int id, String nom, String chemain, Date d_tache, Date f_tache, String précedent, String suivant, float pourcentage, int durée, int idmodule) {
        Module module = moduleService.find(idmodule);
        Tache t = new Tache(id, nom, chemain, précedent, suivant, pourcentage, pourcentage, durée);
        t.setDebut_tache(d_tache);
        t.setFin_tache(f_tache);

        t.setModule(module);

        create(t);
        return 1;
    }

    public int count(int idtache) {
        List<Module> modules = getEntityManager().createQuery("SELECT t FROM Tache t WHERE t.module=" + idtache).getResultList();
        return modules.size();
    }

    public int modifier(String chemin) {
        Tache tache = new Tache();
        if (chemin == null && chemin != tache.getChemin()) {
            return -1;
        } else {
            tache.setSuivant(chemin);
            return 1;
        }
    }

    public int findByName(String name) {
        return (int) getEntityManager().createQuery("SELECT t FROM Tache t WHERE t.nom='" + name + "'").getSingleResult();
    }
//     public static void main(String[] args) throws ParseException {
//         
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//         
//        System.out.println("creerTache");
//        int id = 2;
//        String nom = "Creation";
//        String chemain = "apres laccomplissement de linitialisation ";
//        
//        
//        Date d_tache= null;
//        String date1="01/02/2018";
//        d_tache=simpleDateFormat.parse(date1);
//        
//        
//        
//        
//        Date f_tache = null;
//        String date2="10/02/2018";
//        f_tache=simpleDateFormat.parse(date1);
//        
//        String précedent = "initialisation";
//        String suivant = "laffectation ";
//        float pourcentage = 37.10F;
//        int durée = 24;
//        int idmodule = 1;
//        TacheService instance = new TacheService();
//        instance.creerTache(id, nom, chemain,d_tache ,f_tache, précedent, suivant, pourcentage, durée, idmodule);
//    }
//     

}
