package com.fpmislata.datos;

import com.fpmislata.negocio.EntidadBancaria;
import com.fpmislata.negocio.TipoEntidadBancaria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAOImpJDBC implements EntidadBancariaDAO {

    ConnectionFactory connectionFactory = new ConnectionFactoryImpDataSource();

    @Override
    public EntidadBancaria read(Integer idEntidadBancaria) {
        EntidadBancaria entidadBancaria = null;
        try {

            Connection connection = connectionFactory.getConnection();

            String selectSQL = "SELECT * FROM entidadbancaria WHERE idEntidadBancaria= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL); // Objeto que contine el SQL y los valores incognitas
            preparedStatement.setInt(1, idEntidadBancaria); //el primer parametro que encuentra se le da el valor de idEntidadBancaria sustituyendose en el where
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next() == true) {
                //solo obtiene UNA LINEA busca por clave primaria en esete caso el ID
                String codigoEntidadBancaria = rs.getString("codigoEntidadBancaria");
                String nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

                if (rs.next() == true) {
                    throw new RuntimeException("ERROR. Existe mas de una entidad." + idEntidadBancaria);
                }

                entidadBancaria = new EntidadBancaria(idEntidadBancaria, codigoEntidadBancaria, nombre, cif, TipoEntidadBancaria.valueOf(tipoEntidadBancaria));

            } else {
                throw new RuntimeException("No existe la entidad." + idEntidadBancaria);
            }

            connection.close();
            System.out.println("Conexion creada con exito y datos mostrados.");

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return entidadBancaria;
    }

    @Override
    public void insert(EntidadBancaria entidadBancaria) {
        try {

            Connection connection = connectionFactory.getConnection();

            String insertTableSQL = "INSERT INTO entidadbancaria"
                    + "(idEntidadBancaria, codigoEntidadBancaria, nombre, cif, tipoEntidadBancaria) VALUES"
                    + "(?,?,?,?,?)";

            PreparedStatement preparedStatement2 = connection.prepareStatement(insertTableSQL);
            preparedStatement2.setInt(1, entidadBancaria.getIdEntidadBancaria());
            preparedStatement2.setString(2, entidadBancaria.getCodigoEntidadBancaria());
            preparedStatement2.setString(3, entidadBancaria.getNombre());
            preparedStatement2.setString(4, entidadBancaria.getCif());
            preparedStatement2.setString(5, entidadBancaria.getTipoEntidadBancaria().name()); //name me da el nombre del enum
            // execute insert SQL stetement
            preparedStatement2.executeUpdate();

            connection.close();
            System.out.println("Conexion creada con exito y datos insertados.");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void update(EntidadBancaria entidadBancaria) {
        try {

            Connection connection = connectionFactory.getConnection();

            String updateTableSQL = "UPDATE entidadbancaria SET nombre = ? WHERE identidadBancaria = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateTableSQL);
            preparedStatement.setString(1, "Santander");
            preparedStatement.setInt(2, entidadBancaria.getIdEntidadBancaria());
            // execute insert SQL stetement
            preparedStatement.executeUpdate();

            connection.close();
            System.out.println("Conexion creada con exito y datos actualizados.");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(Integer entidadBancaria) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");

            Connection connection = connectionFactory.getConnection();

            String deleteSQL = "DELETE FROM entidadbancaria WHERE idEntidadBancaria = ?";
            PreparedStatement preparedStatement3 = connection.prepareStatement(deleteSQL);
            preparedStatement3.setInt(1, entidadBancaria);
            // execute delete SQL stetement
            preparedStatement3.executeUpdate();

            connection.close();
            System.out.println("Conexion creada con exito");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public List<EntidadBancaria> findAll() {
        try {
            List<EntidadBancaria> listaEntidades;
            try (Connection connection = connectionFactory.getConnection()) {
                listaEntidades = new ArrayList();
                EntidadBancaria entidadBancaria;
                String selectSQL = "SELECT * FROM entidadbancaria ";
                PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    Integer idEntidadBancaria = rs.getInt("idEntidadBancaria");
                    String codigoEntidadBancaria = rs.getString("codigoEntidadBancaria");
                    String nombre = rs.getString("nombre");
                    String cif = rs.getString("cif");
                    String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");
                    entidadBancaria = new EntidadBancaria(idEntidadBancaria,codigoEntidadBancaria, nombre, cif, TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
                    listaEntidades.add(entidadBancaria);
                }
            }
            return listaEntidades;

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    /* @Override
     public EntidadBancaria read(int idEntidad) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public void delete(int idEntidadBancaria) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
     */
    @Override
    public List findbycodigo(String codigo) {

        List<EntidadBancaria> listaEntidadesCodigo = new ArrayList();
        EntidadBancaria entidadBancaria;

        try {
            Connection connection = connectionFactory.getConnection();

            String selectSQL = "SELECT * FROM entidadbancaria WHERE codigoEntidadBancaria = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL); // Objeto que contine el SQL y los valores incognitas
            preparedStatement.setString(1, codigo); //el primer parametro que encuentra se le da el valor de idEntidadBancaria sustituyendose en el where
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer idEntidadBancaria = rs.getInt("idEntidadBancaria");
                String codigoEntidadBancaria= rs.getString("codigoEntidadBancaria");
                String nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

                entidadBancaria = new EntidadBancaria(idEntidadBancaria, codigoEntidadBancaria, nombre, cif, TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
                listaEntidadesCodigo.add(entidadBancaria);
            }

            connection.close();
            System.out.println("Conexion creada con exito y lista de codigo creada.");


        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        return listaEntidadesCodigo;



    }
}