/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VarClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerClientes  extends AbstractTableModel {
     private List listClientes;

    public void setList(List listClientes) {
        this.listClientes = listClientes;
    }
    
    public VarClientes getBean(int rowIndex) {
        return (VarClientes) listClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listClientes.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VarClientes varClientes = (VarClientes) listClientes.get( rowIndex);
        if ( columnIndex == 0 ){
            return varClientes.getVarIdCliente();
        } else if (columnIndex ==1) {
            return varClientes.getVarNome();        
        } else if (columnIndex ==2) {
            return varClientes.getVarCpf();
        } else if (columnIndex ==3) {
            return varClientes.getVarCelular();
        } else if (columnIndex ==3) {
            return varClientes.getVarTelefone();
        } else if (columnIndex ==3) {
            return varClientes.getVarEmail();
        } else if (columnIndex ==3) {
            return varClientes.getVarDataNascimento();
        } else if (columnIndex ==3) {
            return varClientes.getVarDataCadastro();
        } else if (columnIndex ==3) {
            return varClientes.getVarSexo();
        }
        return "";
    
    }
}
