/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VarVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerVendas  extends AbstractTableModel {
     private List listBolsas;

    public void setList(List listBolsas) {
        this.listBolsas = listBolsas;
    }
    
    public VarVendas getBean(int rowIndex) {
        return (VarVendas) listBolsas.get(rowIndex);
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
        VarVendas varBolsas = (VarVendas) listBolsas.get( rowIndex);
        if ( columnIndex == 0 ){
            return varBolsas.getVarIdVendas();
        } else if (columnIndex ==1) {
            return varBolsas.getVarDataVendas();        
        } else if (columnIndex ==2) {
            return varBolsas.getVarClientes();
        } else if (columnIndex ==3) {
            return varBolsas.getVarUsuarios();
        }  else if (columnIndex ==3) {
            return varBolsas.getVarTotal();
        }  
        return "";
    
    }
    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "categoria";
        } else if ( columnIndex == 3) {
            return "colecao";
        }  else if ( columnIndex == 3) {
            return "descricao";
        } 
        
        return "";
    }
}
