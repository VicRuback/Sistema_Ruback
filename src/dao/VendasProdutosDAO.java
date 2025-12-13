/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VarVendas;
import bean.VarVendasBolsas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u11200121120
 */
public class VendasProdutosDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    public void deletePedido(VarVendas varVendas){
    List lista = (List) listProdutos(varVendas);
        for (int i = 0; i < lista.size(); i++) {
            VarVendasBolsas varVendasBolsas = (VarVendasBolsas) lista.get(i);
            delete(varVendasBolsas);
            
        }
    }
    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarVendasBolsas.class);
        criteria.add(Restrictions.eq("idpedidosprodutos", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarVendasBolsas.class);
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listValor(double valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarVendasBolsas.class);
        criteria.add(Restrictions.ge("valorUnitario", valorUnitario));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public Object listNomeValor(String nome, double valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarVendasBolsas.class);
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
        criteria.add(Restrictions.ge("valorUnitario", valorUnitario));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public Object listProdutos(VarVendas varVendas) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarVendasBolsas.class);
        criteria.add(Restrictions.eq("pedidos", varVendas));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarVendasBolsas.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public static void main(String[] args) {
        ClientesDAO clientesDAO = new ClientesDAO();
        clientesDAO.listAll();
    }
}
