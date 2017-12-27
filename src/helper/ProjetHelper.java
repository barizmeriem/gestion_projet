/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Projet;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Bariz
 */
public class ProjetHelper extends AbstractHelper<Projet> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID ", "id"),
            new AbstractHelperItem("NOM ", "nom"),
            new AbstractHelperItem("DEBUT_PROJET ", "debut_projet"),
            new AbstractHelperItem("FIN_PROJET ", "fin_projet"),
            new AbstractHelperItem("MONTANT ", "montant"),
            new AbstractHelperItem("JOUR_HOMME ", "jour_homme"),
            new AbstractHelperItem("Avancement","avancement")};


    }

    public ProjetHelper(JTable jTable, List<Projet> list) {
        super(titres, jTable, list);
    }

    public ProjetHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public ProjetHelper(JTable jTable) {
        super(titres, jTable);
    }


  
}
