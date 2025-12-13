/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VarVendas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u86117213573
 */
public class VendasDAO extends AbstractDAO{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction(). commit();
    }

   @Override
public void update(Object object) {
    session.beginTransaction();
    session.merge(object);  
    session.getTransaction().commit();
    session.flush();
    session.clear();
}


    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.delete(object);
        session.getTransaction(). commit();
        session.flush();
        session.clear();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarVendas.class);
        criteria.add(Restrictions.eq("varIdVendas", codigo));
        List lista = criteria.list();
        session.getTransaction(). commit();
        return lista;     
    }
    public List<VarVendas> listNome(String nome) {
    session.beginTransaction();

    Criteria criteria = session.createCriteria(VarVendas.class);
    criteria.add(Restrictions.like("varNome", "%" + nome + "%"));

    List<VarVendas> lista = criteria.list();
    session.getTransaction().commit();

    return lista;
}

   public List<VarVendas> listValor(double valor) {
    session.beginTransaction();

    Criteria criteria = session.createCriteria(VarVendas.class);
    criteria.add(Restrictions.ge("varTotal", valor));

    List<VarVendas> lista = criteria.list();
    session.getTransaction().commit();

    return lista;
}

     public List<VarVendas> listNomeValor(String nome, double valor) {
    session.beginTransaction();

    Criteria criteria = session.createCriteria(VarVendas.class);
    criteria.add(Restrictions.like("varNome", "%" + nome + "%"));
    criteria.add(Restrictions.ge("varTotal", valor));

    List<VarVendas> lista = criteria.list();
    session.getTransaction().commit();

    return lista;
}
    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarVendas.class);
        List lista = criteria.list();
        session.getTransaction(). commit();
        return lista;
    }
    public static void main(String[] args) {
        VendasDAO vendasDAO = new VendasDAO();
        vendasDAO.listAll();
    }
    
}
