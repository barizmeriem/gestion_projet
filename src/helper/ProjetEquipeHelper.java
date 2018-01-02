/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import Util.DateUtil;
import bean.ProjetEquipe;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Bariz
 */
public class ProjetEquipeHelper extends AbstractHelper<ProjetEquipe> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("DATE_AFFECTATION", "dateAffectation"),
            new AbstractHelperItem("PROJET_ID ", "projet"),
            new AbstractHelperItem("EQUIPE_ID ", "equipe")};
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list!=null && rowIndex < list.size()) {
                if (columnIndex==0){
                    return DateUtil.formateDate("dd-MM-yyyy",list.get(rowIndex).getDateAffectation() );
                }
                return super.getValueAt(rowIndex, columnIndex);
        }
        return "";
    }

    public ProjetEquipeHelper(JTable jTable, List<ProjetEquipe> list) {
        super(titres, jTable, list);
    }

    public ProjetEquipeHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public ProjetEquipeHelper(JTable jTable) {
        super(titres, jTable);
    }

}
