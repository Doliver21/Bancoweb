<%@page import="com.fpmislata.datos.EntidadBancariaDAO"%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpHibernate"%>
<%@page import="com.fpmislata.negocio.TipoEntidadBancaria"%>
<%@page import="com.fpmislata.negocio.EntidadBancaria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%    
    EntidadBancaria entidadBancaria = new EntidadBancaria();
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImpHibernate();
    
    entidadBancaria.setNombre(request.getParameter("nombre"));
    entidadBancaria.setCif(request.getParameter("cif"));
    entidadBancaria.setCodigoEntidadBancaria(request.getParameter("codigoEntidadBancaria"));
    entidadBancaria.setTipoEntidadBancaria(TipoEntidadBancaria.valueOf("tipoEntidadBancaria"));
    
    entidadBancariaDAO.insert(entidadBancaria);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Entidad bancaria insertada con exito en la BD</h1>
    </body>
</html>
