<%@page import="com.fpmislata.negocio.TipoEntidadBancaria"%>
<%@page import="com.fpmislata.negocio.TipoEntidadBancaria"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario insercion</h1>
        
        <form METHOD="Get" ACTION="http://localhost:8084/web1/Insertar.jsp">
            <input type="text" name="idEntidadBancaria" value="idEntidadBancaria"/>
            <input type="text" name="codigoEntidadBancaria" value="codigoEntidadBancaria"/>
            <input type="text" name="nombre" value="nombre"/>
            <input type="text" name="cif" value="cif"/>
            
   <select name="tipoEntidadBancaria">
      <option selected>--- Elige un tipo Entidad ---</option>
      <option value="<%=TipoEntidadBancaria.CAJADEAHORRO.name() %>">Caja de ahorros</option>
      <option value="<%=TipoEntidadBancaria.BANCO.name()%>>Banco</option>
      <option value="<%=TipoEntidadBancaria.SUCURSAL.name()%>>Sucursal</option>
      <option value="<%=TipoEntidadBancaria.ESTABLECIMIENTOSFINANCIEROSDECREDITO.name()%>>Financieros de credito</option>
      <option value="<%=TipoEntidadBancaria.COOPERATIVASDECREDITO.name()%>>Cooperativas</option>
    </select>

            <input type="text" name="tipoEntidadBancaria" value="tipoEntidadBancaria"/>   -->
            <input type="submit"/>
        </form>
        
        <br></br>
        <a href="index.jsp">INDEX</a> 
    </body>
</html>