<%-- 
    Document   : Update
    Created on : 22-nov-2013, 9:59:05
    Author     : alumno
--%>

<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpHibernate"%>
<%@page import="java.util.List"%>
<%@page import="com.fpmislata.negocio.TipoEntidadBancaria"%>
<%@page import="com.fpmislata.negocio.EntidadBancaria"%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpJDBC"%>

<% //CONTROLADOR
        EntidadBancariaDAOImpHibernate entidadBancariaDAO = new EntidadBancariaDAOImpHibernate(); //impJDBC
       //   EntidadBancariaDAOImpJDBC entidadBancariaDAO = new EntidadBancariaDAOImpJDBC();
        
        String idEntidad=request.getParameter("idEntidadBancaria");        
        Integer idEntidadBancaria = Integer.parseInt(idEntidad);
        
        String codigoEntidadBancaria=request.getParameter("codigoEntidadBancaria");
        String nombre=request.getParameter("nombre");
        String cif=request.getParameter("cif");
                
        String tipoEntidadBancariaString=request.getParameter("tipoEntidadBancaria");
        TipoEntidadBancaria tipoEntidadBancaria= TipoEntidadBancaria.valueOf(tipoEntidadBancariaString);
  
        EntidadBancaria entidadBancariaActualiza = new EntidadBancaria(idEntidadBancaria, codigoEntidadBancaria, nombre, cif, tipoEntidadBancaria);
        
        entidadBancariaDAO.update(entidadBancariaActualiza);
        
       // List<EntidadBancaria> entidadesBancarias = entidadBancariaDAOImpJDBC.findAll();
        %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exito al Actualizar</h1>
        
                <a href="index.jsp">INDEX</a> 
                
    </body>
</html>
