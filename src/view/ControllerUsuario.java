/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VarUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerUsuario  extends AbstractTableModel {
     private List listUsuarios;

    public void setList(List listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    public VarUsuarios getBean(int rowIndex) {
        return (VarUsuarios) listUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VarUsuarios varUsuarios = (VarUsuarios) listUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return varUsuarios.getVarIdusuarios();
        } else if (columnIndex ==1) {
            return varUsuarios.getVarNome();        
        } else if (columnIndex ==2) {
            return varUsuarios.getVarApelido();
        } else if (columnIndex ==3) {
            return varUsuarios.getVarDatanascimento();
        } else if (columnIndex ==3) {
            return varUsuarios.getVarCpf();
        } else if (columnIndex ==3) {
            return varUsuarios.getVarSenha();
        } else if (columnIndex ==3) {
            return varUsuarios.getVarAtivo();
        }  else if (columnIndex ==3) {
            return varUsuarios.getVarNivel();
        } 
        return "";
    
    }
}
