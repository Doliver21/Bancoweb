/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.datos;

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
            Class.forName("com.mysql.jdbc.Driver"); 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactoryJDBCImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");  
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactoryJDBCImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}

