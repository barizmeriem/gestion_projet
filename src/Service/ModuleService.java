/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Module;
import java.util.List;

/**
 *
 * @author M+O
 */
public class ModuleService extends AbstractFacade<Module> {

    public ModuleService() {
        super(Module.class);
    }

    public void initBD() {
        for (int i = 0; i <= 10; i++) {
            creerModule(i + 1,i,i%20,i * i);
        }
    }

    public int creerModule(int id, float avancement, float pourcentage, int jour_homme) {
        Module p = new Module();
        p.setId(id);
        p.setAvancement(avancement);
        p.setPourcentage(pourcentage);
        p.setJour_homme(jour_homme);
        create(p);
        return 1;
    }

    public List<Module> FindModuleByAvancement(String avancement) {

        return getEntityManager().createQuery("SELECT p FROM Module p"
                + " WHERE p.avancement>" + avancement).getResultList();

    }

}
