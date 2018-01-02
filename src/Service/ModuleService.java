/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Module;
import bean.Projet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Meriem
 */
public class ModuleService extends AbstractFacade<Module> {
    
    ProjetService projetService = new ProjetService();

    public ModuleService() {
        super(Module.class);
    }
    public int creerModule(int id, float avancement, Date d_debut, Date d_fin, float pourcentage, int jour_homme, int idprojet) {
        Projet projet = projetService.find(idprojet);
        Module m = new Module(id, avancement, pourcentage, jour_homme);
        m.setProjet(projet);
        m.setDate_debut(d_debut);
        m.setDate_fin(d_fin);
        create(m);
        return 1;
    }

    public List<Module> FindModuleByAvancement(float avancement) {
        return getEntityManager().createQuery("SELECT m FROM Module m"
                + " WHERE m.avancement" + avancement).getResultList();
    }
    
    public int count(int idmodule){
        List<Projet> projets=getEntityManager().createQuery("SELECT m FROM Module m WHERE m.projet.id="+idmodule).getResultList();
        return projets.size();
    }
    
//    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("creerModule");
//        int id = 1;
//        float avancement = 34.1F;
//        
//        Date d_debut = null;
//        String date1="15/02/2018";
//        d_debut=simpleDateFormat.parse(date1);
//        
//        Date d_fin = null;
//        String date2="29/02/2018";
//        d_fin=simpleDateFormat.parse(date2);
//        
//        float pourcentage = 20.0F;
//        int jour_homme = 14;
//        int idprojet = 1;
//        ModuleService instance = new ModuleService();
//        instance.creerModule(id, avancement, d_debut, d_fin, pourcentage, jour_homme, idprojet);
//        
//    }
}
