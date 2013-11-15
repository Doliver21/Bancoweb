package com.fpmislata.datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactoryImpDataSource implements ConnectionFactory {

    @Override
    public Connection getConnection() {
        try {
            Context initContext = null;
            initContext = new InitialContext();

            Context envContext = null;
            envContext = (Context) initContext.lookup("java:/comp/env");

            DataSource datasource = null;
            datasource = (DataSource) envContext.lookup("jdbc/banco");

            Connection con = null;
            con = datasource.getConnection();


            return con;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}