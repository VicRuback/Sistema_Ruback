/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VarVendedores;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerVendedores  extends AbstractTableModel {
     private List listVendedores;

    public void setList(List listVendedores) {
        this.listVendedores = listVendedores;
    }
    
    public VarVendedores getBean(int rowIndex) {
        return (VarVendedores) listVendedores.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listVendedores.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VarVendedores varVendedores = (VarVendedores) listVendedores.get( rowIndex);
        if ( columnIndex == 0 ){
            return varVendedores.getVarIdVendedor();
        } else if (columnIndex ==1) {
            return varVendedores.getVarNome();        
        } else if (columnIndex ==2) {
            return varVendedores.getVarDataNascimento();
        } else if (columnIndex ==3) {
            return varVendedores.getVarEmail();
        } else if (columnIndex ==4) {
            return varVendedores.getVarApelido();
        } else if (columnIndex ==5) {
            return varVendedores.getVarCpf();
        } else if (columnIndex ==6) {
            return varVendedores.getVarTelefone();
        } else if (columnIndex ==7) {
            return varVendedores.getVarAtivo();
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
            return "Data nacimento";
        } else if ( columnIndex == 3) {
            return "Email";
        }  else if ( columnIndex == 4) {
            return "Apelido";
        }  else if ( columnIndex == 5) {
            return "Cpf";
        }  else if ( columnIndex == 6) {
            return "Telefone";
        }  else if ( columnIndex == 7) {
            return "Ativo";
        }  
        return "";
    }
}
