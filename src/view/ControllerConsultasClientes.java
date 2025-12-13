/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import bean.VarClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasClientes extends AbstractTableModel {

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
        VarClientes varClientes = (VarClientes) lista.get(rowIndex);
        if (columnIndex == 0){
            return varClientes.getVarIdCliente();
        }
        if (columnIndex == 1){
            return varClientes.getVarNome();
        }
        if (columnIndex == 2){
            return varClientes.getVarCpf();
        
        }

        return "";
        
    }
        
    @Override
    public String getColumnName (int column) {
        if (column == 0) return "Código";
        if (column == 1) return "Nome";
        if (column == 2) return "Cpf";
        
        return "";
    }
    
}