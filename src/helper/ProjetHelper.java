/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import Util.DateUtil;
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
            new AbstractHelperItem("Avancement", "avancement"),};

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list != null && rowIndex < list.size()) {
            if (columnIndex == 2) {
                return DateUtil.formateDate("dd-MM-yyyy", list.get(rowIndex).getDebut_projet());
            } else if (columnIndex == 3) {
                return DateUtil.formateDate("dd-MM-yyyy", list.get(rowIndex).getFin_projet());
            }
            return super.getValueAt(rowIndex, columnIndex);
        }
        return "";
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
