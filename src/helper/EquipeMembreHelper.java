/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import Util.DateUtil;
import bean.EquipeMembre;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Bariz
 */
public class EquipeMembreHelper extends AbstractHelper<EquipeMembre> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("EQUIPE_NOM ", "equipe"),
            new AbstractHelperItem("MEMBRE_NOM ", "membre"),
            new AbstractHelperItem("DATE_AFFECTATION", "dateAffectation"),};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list != null && rowIndex < list.size()) {
            if (columnIndex == 0) {
                return DateUtil.formateDate("dd-MM-yyyy", list.get(rowIndex).getDateAffectation());
            }
//                if (columnIndex==1){
//                    return list.get(rowIndex).getMembre().getNom();
//                }
            if (columnIndex == 2) {
                return list.get(rowIndex).getEquipe().getNom();
            }
            return super.getValueAt(rowIndex, columnIndex);
        }
        return "";
    }

    public EquipeMembreHelper(JTable jTable, List<EquipeMembre> list) {
        super(titres, jTable, list);
    }

    public EquipeMembreHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public EquipeMembreHelper(JTable jTable) {
        super(titres, jTable);
    }

}
