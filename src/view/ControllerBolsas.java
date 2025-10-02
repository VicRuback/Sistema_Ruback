/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VarBolsas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerBolsas  extends AbstractTableModel {
     private List listBolsas;

    public void setList(List listBolsas) {
        this.listBolsas = listBolsas;
    }
    
    public VarBolsas getBean(int rowIndex) {
        return (VarBolsas) listBolsas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listBolsas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VarBolsas varBolsas = (VarBolsas) listBolsas.get( rowIndex);
        if ( columnIndex == 0 ){
            return varBolsas.getVarIdBolsas();
        } else if (columnIndex ==1) {
            return varBolsas.getVarNome();        
        } else if (columnIndex ==2) {
            return varBolsas.getVarCategoria();
        } else if (columnIndex ==3) {
            return varBolsas.getVarColecao();
        }  else if (columnIndex ==3) {
            return varBolsas.getVarDescricao();
        }  else if (columnIndex ==3) {
            return varBolsas.getVarColoracao();
        }  else if (columnIndex ==3) {
            return varBolsas.getVarPreco();
        }  else if (columnIndex ==3) {
            return varBolsas.getVarAtivo();
        }
        return "";
    
    }
}
