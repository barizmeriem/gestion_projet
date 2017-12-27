/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author O+M;
 */
@Entity
public class Projet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date debut_projet;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fin_projet;
    private String nom;
    private double avancement;
    private double montant;
    private int jour_homme;
//  private BigDecimal bigDecimal = new BigDecimal(0);
    @OneToMany
    private List<Module> modules;
    @OneToMany(mappedBy = "projet")
    private List<Paiement> paiemant;
    @OneToMany(mappedBy = "projet")
    private List<Membre> membres;
   
  

    public Projet() {
    }

    public Projet(int id) {
        this.id = id;
    }

    public Projet(int id, String nom, double avancement, double montant, int jour_homme) {
        this.id = id;
        this.nom = nom;
        this.avancement = avancement;
        this.montant = montant;
        this.jour_homme = jour_homme;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }
    public int getJour_homme() {
        return jour_homme;
    }

    public void setJour_homme(int jour_homme) {
        this.jour_homme = jour_homme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDebut_projet() {
        return debut_projet;
    }

    public void setDebut_projet(Date debut_projet) {
        this.debut_projet = debut_projet;
    }

    public Date getFin_projet() {
        return fin_projet;
    }

    public void setFin_projet(Date fin_projet) {
        this.fin_projet = fin_projet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getAvancement() {
        return avancement;
    }

    public void setAvancement(double avancement) {
        this.avancement = avancement;
    }

    public List<Paiement> getPaiemant() {
        return paiemant;
    }

    public void setPaiemant(List<Paiement> paiemant) {
        this.paiemant = paiemant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

//    public BigDecimal getBigDecimal() {
//        return bigDecimal;
//    }
//
//    public void setBigDecimal(BigDecimal bigDecimal) {
//        this.bigDecimal = bigDecimal;
//    }
    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final Projet other = (Projet) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projet{" + "id=" + id + ", debut_projet=" + debut_projet + ", fin_projet=" + fin_projet + ", nom=" + nom + ", avancement=" + avancement + ", montant=" + montant + ", jour_homme=" + jour_homme + '}';
    }

}
