/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Membre;
import bean.Projet;
import java.util.List;

/**
 *
 * @author M
 */
public class MembreService extends AbstractFacade<Membre> {

    public MembreService() {
        super(Membre.class);
    }
     public int creerMembre(int CIN, String password, String nom, String prenom, int jour_homme, String grade, double budget){
       Membre m=new Membre();
       m.setBudget(budget);
       m.setCIN(CIN);
       m.setJour_homme(jour_homme);
       m.setGrade(grade);
       m.setNom(nom);
       m.setPassword(password);
       m.setPrenom(prenom);
       create(m);
     return 1;
     }
     
     
     
     public int saveMembre(double budget,String grade,int CIN ,Projet projet) {
     Membre membre=new Membre();
     
     if(!grade.equalsIgnoreCase("CHEF")&& !grade.equalsIgnoreCase("EMPLOYE")){
         return -1;
     }else if(grade.equalsIgnoreCase("CHEF")){
           return 1;
     }else if(grade.equalsIgnoreCase("EMPLOYE")){
           return 2;
     }
     membre.setGrade(grade);
     membre.setBudget(budget);
     
     create(membre);
     return 1;
     }

     public List findByCin(int CIN){
         return  getEntityManager().createQuery("SELECT p FROM Projet p WHERE p.id="+CIN).getResultList();
     }
    
}

  

