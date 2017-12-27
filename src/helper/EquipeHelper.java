/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Equipe;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Bariz
 */
public class EquipeHelper extends AbstractHelper<Equipe> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID", "id"),
            new AbstractHelperItem("NOM ", "nom"),
            new AbstractHelperItem("PROJET_ID ", "projet")};
    }

    public EquipeHelper(JTable jTable, List<Equipe> list) {
        super(titres, jTable, list);
    }

    public EquipeHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public EquipeHelper(JTable jTable) {
        super(titres, jTable);
    }

}
