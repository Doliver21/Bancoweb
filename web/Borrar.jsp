<%-- 
    Document   : Borrar
    Created on : 22-nov-2013, 9:55:29
    Author     : alumno
--%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpHibernate"%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpHibernate"%>
<%@page import="com.fpmislata.negocio.EntidadBancaria"%>
<%@page import="java.util.List"%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpJDBC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    //Podria usar el DAO de JDBC solamente cambiando Hibernate por JDBC
    EntidadBancariaDAOImpHibernate entidadBancariaDAO = new EntidadBancariaDAOImpHibernate(); //impJDBC
  //EntidadBancariaDAOImpJDBC entidadBancariaDAO = new EntidadBancariaDAOImpJDBC(); //impJDBC
     
    String idEntidadBancaria = request.getParameter("idEntidadBancaria");

    Integer idEntidadBancariaInteger = Integer.parseInt(idEntidadBancaria);

    entidadBancariaDAO.delete(idEntidadBancariaInteger);

    List<EntidadBancaria> entidadesBancarias = entidadBancariaDAO.findAll();

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar</title>
    </head>
    <body>
        <h1>Tu entidad Bancaria ha sido BORRADA</h1>     


        <div align="center"> 
            <p>Tu entidad Bancaria es:</p> 

            <table border="solid">

                <% for (EntidadBancaria entidadBancaria : entidadesBancarias) {
                %><tr><td><%  out.print(entidadBancaria.getIdEntidadBancaria());%></td>
                    <td><% out.print(entidadBancaria.getCodigoEntidadBancaria());%></td>
                    <td><% out.print(entidadBancaria.getNombre());%></td>
                    <td><% out.print(entidadBancaria.getCif());%></td>    
                    <td><% out.print(entidadBancaria.getTipoEntidadBancaria());%></td>

                </tr>
                <% }%>

            </table>

        </div>   


<a href="index.jsp">Volver</a>

    </body>
</html>
