/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Membre;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author BARIZ
 */
public class MembreHelper extends AbstractHelper<Membre> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("CIN ", "cin"),
            new AbstractHelperItem("GRADE ", "grade"),
            new AbstractHelperItem("NOM ", "nom"),
            new AbstractHelperItem("PRENOM ", "prenom"),
            new AbstractHelperItem("JOUR-HOMME ", "jour_homme"),
            new AbstractHelperItem("PROJET_ID ", "projet"),
            new AbstractHelperItem("EQUIPE_ID ", "equipe"),
            new AbstractHelperItem("PASSWORD ", "password")};
    }

    public MembreHelper(JTable jTable, List<Membre> list) {
        super(titres, jTable, list);
    }

    public MembreHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public MembreHelper(JTable jTable) {
        super(titres, jTable);
    }

}
