package com.fpmislata.datos;

import com.fpmislata.negocio.EntidadBancaria;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GenericDAOHibernate<T, ID extends Serializable> implements GenericDAO<T, ID> {

    // """ Inicializamos Hibernate"""
    SessionFactory sessionFactory;

    public GenericDAOHibernate(/*SessionFactory sessionFactory*/) {
       this.sessionFactory= HibernateUtil.getSessionFactory();
    // this.sessionFactory = sessionFactory;
    }

    @Override
    public T read(ID id) {
        Session session = sessionFactory.getCurrentSession();
        
        T t;

        try {
            session.beginTransaction();
            t = (T) session.get(getEntityClass(), id); //selecciono idT que quiero dentro del objeto
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException("",ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
               // session.close(); // Las sesiones no se cierran aqui, se cierran fuera !! Aqui solo con try/catch
            }
        }

        return t;
    }

    @Override
    public void insert(T t) {

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                //session.close();
            }
        }

    }

    @Override
    public void update(T t) {

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            session.update(t);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException("",ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                //session.close();
            }
        }

    }

    @Override
    public void delete(ID id) {

        T t;
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            t = (T) session.get(getEntityClass(), id);
            session.delete(t);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException("",ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                //session.close();
            }
        }
    }

    @Override
    public List<T> findAll() {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("SELECT t FROM "+getEntityClass().getName() + " t"); // t misma variable no sabemos lo que devuelve
        List list = query.list();
        //session.close();

        return list;
    }

   
     
  /*  public List<T> findByNombre(String nombreBusqueda) {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("SELECT entidadbancaria FROM "+getEntityClass().getName()+" entidadbancaria WHERE nombre LIKE ?");
        query.setString(0, "%" + nombreBusqueda + "%");
        List list = query.list();
        //session.close();

        return list;
    }*/

    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}