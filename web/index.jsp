<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpJDBC"%>
<%@page import="java.util.List"%>
<%@page import="com.fpmislata.negocio.EntidadBancaria"%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    EntidadBancariaDAOImpJDBC entidadBancariaDAO = new EntidadBancariaDAOImpJDBC(); //impJDBC

//EntidadBancaria entidadBancaria =  entidadBancariaDAO.read(1);

    List<EntidadBancaria> entidadesBancarias = entidadBancariaDAO.findAll();


    String codigo = request.getParameter("codigoEntidadBancaria");

       EntidadBancariaDAO entidadBancariaDAO2 = new EntidadBancariaDAOImpJDBC();
       List<EntidadBancaria> entidadesBancariasCodigo = entidadBancariaDAO2.findbycodigo(codigo);
       
    

%>

<html>
    <head>
        <title>Fecha</title>
    </head>
    <body>
        <div align="center"> 
            <p>Tu entidad Bancaria es:</p> 

            <table border="solid">

                <% for (EntidadBancaria entidadBancaria : entidadesBancarias) {
                %><tr>  <td><% out.print(entidadBancaria.getIdEntidadBancaria());%></td>
                    <td><%  out.print(entidadBancaria.getCodigoEntidadBancaria());%></td>
                    <td><% out.print(entidadBancaria.getCodigoEntidadBancaria());%></td>
                    <td><% out.print(entidadBancaria.getNombre());%></td>
                    <td><% out.print(entidadBancaria.getCif());%></td>    
                    <td><% out.print(entidadBancaria.getTipoEntidadBancaria());%></td>




                </tr>
                <% }%>

            </table>
            <br>
             <table border="solid">

                <% for (EntidadBancaria entidadBancaria : entidadesBancariasCodigo) {
                %><tr>  <td><% out.print(entidadBancaria.getIdEntidadBancaria());%></td>
                    <td><%  out.print(entidadBancaria.getCodigoEntidadBancaria());%></td>
                    <td><% out.print(entidadBancaria.getCodigoEntidadBancaria());%></td>
                    <td><% out.print(entidadBancaria.getNombre());%></td>
                    <td><% out.print(entidadBancaria.getCif());%></td>    
                    <td><% out.print(entidadBancaria.getTipoEntidadBancaria());%></td>




                </tr>
                <% }%>

            </table>

        </div>   





       
    </body>
</html>