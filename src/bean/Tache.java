/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author O+M;
 */
@Entity
public class Tache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date debut_tache;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fin_tache;
    private String nom;
    private String chemin;
    private String précedent;
    private String suivant;
    private float avancement;
    private float pourcentage;
    private int durée;
    @ManyToOne
    private Module module;

    public Tache() {
    }

    public Tache(int id) {
        this.id = id;
    }

    public Tache(int id, String nom, String chemin, String précedent, String suivant, float avancement, float pourcentage, int durée) {
        this.id = id;
        this.nom = nom;
        this.chemin = chemin;
        this.précedent = précedent;
        this.suivant = suivant;
        this.avancement = avancement;
        this.pourcentage = pourcentage;
        this.durée = durée;
    }

    public Date getDebut_tache() {
        return debut_tache;
    }

    public void setDebut_tache(Date debut_tache) {
        this.debut_tache = debut_tache;
    }

    public Date getFin_tache() {
        return fin_tache;
    }

    public void setFin_tache(Date fin_tache) {
        this.fin_tache = fin_tache;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public String getPrécedent() {
        return précedent;
    }

    public void setPrécedent(String précedent) {
        this.précedent = précedent;
    }

    public String getSuivant() {
        return suivant;
    }

    public void setSuivant(String suivant) {
        this.suivant = suivant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAvancement() {
        return avancement;
    }

    public void setAvancement(float avancement) {
        this.avancement = avancement;
    }

    public float getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(float pourcentage) {
        this.pourcentage = pourcentage;
    }

    public int getDurée() {
        return durée;
    }

    public void setDurée(int durée) {
        this.durée = durée;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tache)) {
            return false;
        }
        Tache other = (Tache) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tache{" + "id=" + id + ", debut_tache=" + debut_tache + ", fin_tache=" + fin_tache + ", nom=" + nom + ", chemin=" + chemin + ", pr\u00e9cedent=" + précedent + ", suivant=" + suivant + ", avancement=" + avancement + ", pourcentage=" + pourcentage + ", dur\u00e9e=" + durée + '}';
    }

}
