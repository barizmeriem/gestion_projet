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
public class Paiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private double montant;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePaiement;
    @ManyToOne
    private Projet projet;

    public Paiement(int id, double montant, Date datePaiement) {
        this.id = id;
        this.montant = montant;
        this.datePaiement = datePaiement;
    }

    public Paiement() {
    }

    public Paiement(int id) {
        this.id = id;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Paiement(int id, double avance, double reste_a_Paye) {
        this.id = id;
        this.montant = avance;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
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
        if (!(object instanceof Paiement)) {
            return false;
        }
        Paiement other = (Paiement) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", montant=" + montant + ", datePaiement=" + datePaiement + '}';
    }

}
