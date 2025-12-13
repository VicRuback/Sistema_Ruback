/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import bean.VarVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVendas extends AbstractTableModel {

    List lista;
    
    public void setList(List lista){
     this. lista = lista; 
     this.fireTableDataChanged();
    }
    
    public Object getBean(int rowIndex){
        return lista.get(rowIndex);
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VarVendas varVendas = (VarVendas) lista.get(rowIndex);
        if (columnIndex == 0){
            return varVendas.getVarIdVendas();
        }
        if (columnIndex == 1){
            return varVendas.getVarClientes();
        }
        if (columnIndex == 2){
            return varVendas.getVarTotal();
        }
        
        return "";
        
    }
        
    @Override
    public String getColumnName (int column) {
        if (column == 0) return "Código";
        if (column == 1) return "Clientes";
        if (column == 2) return "Total";
        
        return "";
    }
    
}
