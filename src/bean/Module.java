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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Meriem;
 */
@Entity
public class Module implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_debut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_fin;
    private float avancement;
    private float pourcentage;
    private int jour_homme;
    @OneToMany(mappedBy = "module")
    List<Tache> taches;
    @ManyToOne
    private Projet projet;

    public Module(int id, float avancement, float pourcentage,int jour_homme) {
        this.id = id;
        this.avancement = avancement;
        this.pourcentage = pourcentage;
        this.jour_homme = jour_homme;
    }

    public Module(int id) {
        this.id = id;
    }

    public Module() {
    }

    public int getJour_homme() {
        return jour_homme;
    }

    public void setJour_homme(int jour_homme) {
        this.jour_homme = jour_homme;
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

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public float getAvance() {
        return avancement;
    }

    public void setAvance(float avancement) {
        this.avancement = avancement;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (!(object instanceof Module)) {
            return false;
        }
        Module other = (Module) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Module{" + "id=" + id + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", avancement=" + avancement + ", pourcentage=" + pourcentage + ", jour_homme=" + jour_homme + '}';
    }

   

}
