/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Equipe;
import bean.EquipeMembre;
import bean.Membre;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("creerEquipeMembre");
        int id = 1;
        int idequipe = 1;

        Date dateAffectation = null;
        String date2 = "01/06/2015";
        dateAffectation = simpleDateFormat.parse(date2);

        int idmembre = 1;
        EquipeMembreService instance = new EquipeMembreService();
        instance.creerEquipeMembre(id, idequipe, dateAffectation, idmembre);
    }
}
