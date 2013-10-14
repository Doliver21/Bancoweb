/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.List;

/**
 *
 * @author alumno
 */
public interface GenericDAO<T,ID> {
    T read(ID id);
    void insert(Object e);
    void update(Object e);
    T delete(ID id);
    List<T> findAll();   
}