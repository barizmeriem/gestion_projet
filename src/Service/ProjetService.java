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
 * @author O+M
 */
public class ProjetService extends AbstractFacade<Projet> {

    ModuleService moduleService = new ModuleService();
    EquipeService personneService = new EquipeService();

    public ProjetService() {
        super(Projet.class);
    }

    public void initBD() {
        for (int i = 0; i <= 10; i++) {
           creerProjet(i + 1, "EE" + i,i, i*2, i * i);
        }
    }

    public int creerProjet(int id, String nom, double avancement, double montant, int jour_homme) {
//        personneService.create(pe);
        Projet p = new Projet();
        p.setId(id);
        p.setAvancement(avancement);
        p.setJour_homme(jour_homme);
        p.setNom(nom);
        p.setMontant(montant);
        create(p);
        return 1;
    }

    public Projet testerLaDate(Date d_fin, int id) {
        return (Projet) getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.id="+id+" and p.fin_projet'" + d_fin + "'").getSingleResult();
}
//    public Projet projetTerminer(String reste_A_Faire,double salaire){
//        if(reste_A_Faire==null){
//            
//        }
//    }

    
   }