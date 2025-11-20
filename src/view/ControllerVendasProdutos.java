/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VarVendasBolsas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVendasProdutos extends AbstractTableModel {

    private List lstPedProd;

    public void setList(List lstVarVendasBolsas) {
        this.lstPedProd = lstVarVendasBolsas;
    }
    
    public VarVendasBolsas getBean(int rowIndex) {
        return (VarVendasBolsas) lstPedProd.get(rowIndex);
    }
    
    public void addBean(VarVendasBolsas varVendasBolsas){
     this.lstPedProd.add(varVendasBolsas);
     this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex){
    this.lstPedProd.remove(rowIndex);
    this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstPedProd.size();
                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VarVendasBolsas pedProd = (VarVendasBolsas) lstPedProd.get( rowIndex);
        if ( columnIndex == 0 ){
            return pedProd.getVarIdVendasBolsas();
        } else if (columnIndex ==1) {
            return pedProd.getVarBolsas().getVarNome();        
        } else if (columnIndex ==2) {
            return pedProd.getVarQuantidade();
        } else if (columnIndex ==3) {
            return pedProd.getVarValorUnitario();
        }  else if (columnIndex ==4) {
            return  pedProd.getVarQuantidade() * pedProd.getVarValorUnitario();
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
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor Unitario";
        } else if ( columnIndex == 4) {
            return "Total";
        } 
        return "";
    }
    
}
