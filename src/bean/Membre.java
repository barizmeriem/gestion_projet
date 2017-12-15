/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author @author O+M;
 */
@Entity
public class Membre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CIN;
    private String password;
    private String nom;
    private String prenom;
    private int jour_homme;
    private String grade;
    private double budget;
    @ManyToOne
    private Equipe equipe;

    public Membre(int CIN, String password, String nom, String prenom, int jour_homme, String grade, double budget) {
        this.CIN = CIN;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.jour_homme = jour_homme;
        this.grade = grade;
        this.budget = budget;
    }

    public Membre() {
    }

    public Membre(int CIN) {
        this.CIN = CIN;
    }

    public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
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

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
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
        hash = 89 * hash + this.CIN;
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
        if (this.CIN != other.CIN) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Membre{" + "CIN=" + CIN + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", jour_homme=" + jour_homme + ", grade=" + grade + ", budget=" + budget + '}';
    }

   
    
}
