/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.MovimientoBancario;
import java.util.List;

/**
 *
 * @author alumno
 */
 interface MovimientoBancarioDAO {
    
    public MovimientoBancario read(int idMovimientoBancario);
    
    public void insert(MovimientoBancario movimientoBancario);
    
    public void update(MovimientoBancario movimientoBancario);
    
    public void delete(int idMovimientoBancario);
    
    public List<MovimientoBancario> findAll();
    
    public List<MovimientoBancario> findByCodigo(String codigo);
    
}