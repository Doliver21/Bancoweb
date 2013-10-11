/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class ConnectionFactoryJDBCImp {

  
    public Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");  //Carga el driver
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactoryJDBCImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");  //Conexion
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactoryJDBCImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}

