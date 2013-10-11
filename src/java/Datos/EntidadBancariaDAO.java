/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.EntidadBancaria;
import Negocio.TipoEntidadBancaria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntidadBancariaDAO {

    public EntidadBancaria read(int idEntidadBancaria) throws ClassNotFoundException, SQLException {

        

        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");


        String selectSQL = "SELECT * FROM entidadbancaria WHERE idEntidadBancaria = ?";
        PreparedStatement preparedStatement = conexion.prepareStatement(selectSQL); 
        preparedStatement.setInt(1, idEntidadBancaria);
        ResultSet rs = preparedStatement.executeQuery();

         EntidadBancaria entidadBancaria;

        if (rs.next() == true) {

            String codigoEntidad = rs.getString("codigoEntidad");
            String nombre = rs.getString("nombre");
            String cif = rs.getString("cif");
            String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");


            if (rs.next() == true) {
                throw new RuntimeException("ERROR. Existe mas de una entidad." + idEntidadBancaria);
            }

            entidadBancaria = new EntidadBancaria(idEntidadBancaria, codigoEntidad, nombre, cif, TipoEntidadBancaria.valueOf(tipoEntidadBancaria));

        } else {
            throw new RuntimeException("No existe la entidad." + idEntidadBancaria);
        }

        conexion.close();
        System.out.println("Conexion creada  y datos mostrados.");
        return entidadBancaria;

    }

    public void insert(EntidadBancaria entidadBancaria) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");

        String insertTableSQL = "INSERT INTO entidadbancaria" + "(idEntidadBancaria, codigoEntidad, nombre, cif, tipoEntidadBancaria) VALUES"
                + "(?,?,?,?,?)";

        PreparedStatement preparedStatement2 = connection.prepareStatement(insertTableSQL);
        preparedStatement2.setInt(1, entidadBancaria.getIdEntidad());
        preparedStatement2.setString(2, entidadBancaria.getCodigoEntidad());
        preparedStatement2.setString(3, entidadBancaria.getNombre());
        preparedStatement2.setString(4, entidadBancaria.getCif());
        preparedStatement2.setString(5, entidadBancaria.getTipoEntidadBancaria().name()); //name me da el nombre del enum
        preparedStatement2.executeUpdate();

        connection.close();
        System.out.println("Conexion creada y datos insertados.");

    }

    public void update(EntidadBancaria entidadBancaria) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");


        String updateTableSQL = "UPDATE entidadbancaria SET nombre = ? WHERE identidadBancaria = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateTableSQL);
        preparedStatement.setString(1, "Santander");
        preparedStatement.setInt(2, entidadBancaria.getIdEntidad());
        preparedStatement.executeUpdate();

        connection.close();
        System.out.println("Conexion creada con exito y datos actualizados.");
    }

    public void delete(int entidadBancaria) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");

        String deleteSQL = "DELETE FROM entidadbancaria WHERE idEntidadBancaria = ?";
        PreparedStatement preparedStatement3 = connection.prepareStatement(deleteSQL);
        preparedStatement3.setInt(1, entidadBancaria);
        preparedStatement3.executeUpdate();

        connection.close();
        System.out.println("Conexion creada con exito");

    }

    public List<EntidadBancaria> findAll() throws ClassNotFoundException, SQLException {

        List<EntidadBancaria> listaEntidades = new ArrayList();
      

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");

        String selectSQL = "SELECT * FROM entidadbancaria ";
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL); 
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            int idEntidadBancaria = rs.getInt("idEntidadBancaria");
            String codigoEntidad = rs.getString("codigoEntidad");
            String nombre = rs.getString("nombre");
            String cif = rs.getString("cif");
            String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

            EntidadBancaria entidadBancaria = new EntidadBancaria(idEntidadBancaria, codigoEntidad, nombre, cif, TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
            listaEntidades.add(entidadBancaria);


            System.out.println("Conexion creada y lista guardada.");
        }
        connection.close();
        return listaEntidades;
    }

    public List<EntidadBancaria> findByCodigo(String codigo) throws ClassNotFoundException, SQLException {

        List<EntidadBancaria> listaEntidadesCodigo = new ArrayList();
        

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "root");

        String selectSQL = "SELECT * FROM entidadbancaria WHERE codigoEntidad = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        preparedStatement.setString(1, codigo); 
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            int idEntidadBancaria = rs.getInt("idEntidadBancaria");
            String codigoEntidad = rs.getString("codigoEntidad");
            String nombre = rs.getString("nombre");
            String cif = rs.getString("cif");
            String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

            EntidadBancaria entidadBancaria = new EntidadBancaria(idEntidadBancaria, codigoEntidad, nombre, cif, TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
            listaEntidadesCodigo.add(entidadBancaria);
        }

        
        connection.close();
        System.out.println("Conexion creada y lista de codigo creada.");

        return listaEntidadesCodigo;
    }
}