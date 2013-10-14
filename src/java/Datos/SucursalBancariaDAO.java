/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.SucursalBancaria;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface SucursalBancariaDAO {
    
    public SucursalBancaria read(int idSucursalBancaria);
    
    public void insert(SucursalBancaria sucursalBancaria);
    
    public void update(SucursalBancaria sucursalBancaria);
    
    public void delete(int idSucursalBancaria);
    
    public List<SucursalBancaria> findAll();
    
    public List<SucursalBancaria> findByCodigo(String codigo);
    
}