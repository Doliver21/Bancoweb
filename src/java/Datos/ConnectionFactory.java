/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author alumno
 */

import java.sql.Connection;

public interface ConnectionFactory {
    
 Connection getConnection();
    
}
