<%-- 
    Document   : entidadesBancarias.json
    Created on : 21-nov-2013, 9:30:55
    Author     : alumno
--%>
<%@page import="java.util.List"%>
<%@page import="com.fpmislata.negocio.EntidadBancaria"%><%@page import="com.fpmislata.datos.EntidadBancariaDAOImpHibernate"%><%@page import="com.fasterxml.jackson.databind.ObjectMapper"%><%
  //Llamo a entidadBancaria
    List<EntidadBancaria> entidadBancaria = new EntidadBancariaDAOImpHibernate().findAll();
    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(entidadBancaria);
    response.setContentType("application/json; charset=UTF-8");
    out.print(json);
    
%>
