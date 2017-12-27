/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author O+M
 */
@Entity
public class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String nom;
    @OneToMany(mappedBy = "equipe")
    private List< Membre > members;
    @ManyToOne
    private Projet projet;

    public Equipe(int id) {
        this.id = id;
    }

    public Equipe() {
    }

    public Equipe(int id, String nom) {
        this.id = id;
        this.nom = nom;
//        this.chef = chef;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Membre> getMembers() {
        return members;
    }

    public void setMembers(List<Membre> members) {
        this.members = members;
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
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipe{" + "id=" + id + ", nom=" + nom + '}';
    }




}
