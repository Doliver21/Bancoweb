/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;

import java.util.List;

/**
 *
 * @author alumno
 */
public interface GenericDAO<T,ID> {
    T read(ID id);
    void insert(T e);
    void update(T e);
    void delete(ID id);
    List<T> findAll();   
}