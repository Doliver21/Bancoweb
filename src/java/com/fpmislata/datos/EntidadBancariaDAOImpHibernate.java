/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;

import com.fpmislata.negocio.EntidadBancaria;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAOImpHibernate extends GenericDAOHibernate<EntidadBancaria, Integer> implements EntidadBancariaDAO {

    @Override
    public List findbycodigo(String codigo) {
       
       Session session = sessionFactory.getCurrentSession();

        //List<EntidadBancaria> list = new ArrayList();

        Query query = session.createQuery("SELECT * FROM entidadbancaria WHERE codigoEntidadBancaria=?");
        query.setString(0, codigo);
        List list = query.list();
        session.close();

        return list;
    }
    
     public List<EntidadBancaria> findByNombre(String nombreBusqueda) {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("SELECT e FROM EntidadBancaria e WHERE nombre LIKE ?");
        query.setString(0, "%" + nombreBusqueda + "%");
        List list = query.list();
        session.close();

        return list;
    }
}
