/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Bariz
 */
@Entity
public class EquipeMembre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateAffectation;
    @ManyToOne
    private Equipe equipe;
    @ManyToOne
    private Membre membre;

    public EquipeMembre() {
    }

    public EquipeMembre(int id) {
        this.id = id;
    }

    public EquipeMembre(int id, Date dateAffectation) {
        this.id = id;
        this.dateAffectation = dateAffectation;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Date getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(Date dateAffectation) {
        this.dateAffectation = dateAffectation;
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
        if (!(object instanceof EquipeMembre)) {
            return false;
        }
        EquipeMembre other = (EquipeMembre) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EquipeMembre{" + "id=" + id + ", dateAffectation=" + dateAffectation + '}';
    }

    
    
}
