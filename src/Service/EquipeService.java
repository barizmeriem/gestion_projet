/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Equipe;

/**
 *
 * @author M+O
 */
public class EquipeService extends AbstractFacade<Equipe> {

    public EquipeService() {
        super(Equipe.class);
    }

    public void initBD() {
        for (int i = 0; i <= 10; i++) {
            creerEquipe(i + 1, "T1", "T2");
        }
    }

    public int creerEquipe(int id, String nom, String chef) {
        Equipe m = new Equipe();
        m.setNom(nom);
        m.setId(id);
        m.setChef(chef);
        create(m);
        return 1;
    }

   
}
