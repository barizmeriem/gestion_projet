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
 * @author YOUNES
 */
public class MembreHelper extends AbstractHelper<Membre> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("CIN ", "cin"),
            new AbstractHelperItem("BUDGET ", "budget"),
            new AbstractHelperItem("GRADE ", "grade"),
            new AbstractHelperItem("JOUR-HOMME ", "jour_homme"),
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
