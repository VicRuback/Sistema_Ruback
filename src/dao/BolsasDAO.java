/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VarBolsas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u86117213573
 */
public class BolsasDAO extends AbstractDAO{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction(). commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.update(object);
        session.getTransaction(). commit();
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
        Criteria criteria = session.createCriteria(VarBolsas.class);
        criteria.add(Restrictions.eq("varIdBolsas", codigo));
        List lista = criteria.list();
        session.getTransaction(). commit();
        return lista;

        
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VarBolsas.class);
        List lista = criteria.list();
        session.getTransaction(). commit();
        return lista;
    }
      public static void main(String[] args) {
        BolsasDAO bolsasDAO = new BolsasDAO();
        bolsasDAO.listAll();
    }
    
    
}
