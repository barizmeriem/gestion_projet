/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Meriem;
 */
@Entity
public class Membre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int cin;
    private String password;
    private String nom;
    private String prenom;
    private int jour_homme;
    private String grade;
    @ManyToOne
    private Projet projet; 
    @ManyToOne
    private Equipe equipe;
    
    
    public Membre(int cin, String password, String nom, String prenom, int jour_homme, String grade) {
        this.cin = cin;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.jour_homme = jour_homme;
        this.grade = grade;
    }

    public Membre() {
    }

    public Membre(int CIN) {
        this.cin = CIN;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getJour_homme() {
        return jour_homme;
    }

    public void setJour_homme(int jour_homme) {
        this.jour_homme = jour_homme;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.cin;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Membre other = (Membre) obj;
        if (this.cin != other.cin) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Membre{" + "cin=" + cin + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", jour_homme=" + jour_homme + ", grade=" + grade + '}';
    }

}
