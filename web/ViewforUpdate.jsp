<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpHibernate"%>
<%@page import="com.fpmislata.negocio.TipoEntidadBancaria"%>
<%@page import="com.fpmislata.negocio.EntidadBancaria"%>
<%@page import="com.fpmislata.datos.EntidadBancariaDAOImpJDBC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%  EntidadBancariaDAOImpHibernate entidadBancariaDAO = new EntidadBancariaDAOImpHibernate(); //impJDBC
     
    String idEntidadBancariaString = request.getParameter("idEntidadBancaria");

    Integer idEntidadBancaria = Integer.parseInt(idEntidadBancariaString);
    
    EntidadBancaria entidadbancaria=entidadBancariaDAO.read(idEntidadBancaria);

%>
    
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vamos A ver los Datos para Actualizar</h1>
        
                
        <form METHOD="Get" ACTION="http://localhost:8084/web1/Update.jsp">
            <input type="text" name="idEntidadBancaria"  readonly="readonly" value="<% out.print(entidadbancaria.getIdEntidadBancaria());%>"/>
            <input type="text" name="codigoEntidadBancaria" value="<% out.print(entidadbancaria.getCodigoEntidadBancaria());%>"/>
            <input type="text" name="nombre" value="<% out.print(entidadbancaria.getNombre());%>"/>
            <input type="text" name="cif" value="<% out.print(entidadbancaria.getCif());%>"/>
     
            <select name="tipoEntidadBancaria">
            <option selected><%=entidadbancaria.getTipoEntidadBancaria()%></option>
            <option value="<%=TipoEntidadBancaria.CAJADEAHORRO.name() %>">Caja de ahorros</option>
            <option><%=TipoEntidadBancaria.BANCO.name()%></option>
    </select>

    <input type="submit"/>
    
        </form>        
        
        <p></p>
            <p><% out.print(entidadbancaria.getIdEntidadBancaria());%></p>
                <p><% out.print(entidadbancaria.getCodigoEntidadBancaria());%></p>
                    <p><% out.print(entidadbancaria.getCif());%></p>
       

        <a href="index.jsp">INDEX</a> 
        
        
    </body>
</html>