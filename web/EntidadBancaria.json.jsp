<%@page import="com.fpmislata.datos.EntidadBancariaDAO"%><%@page import="com.fpmislata.negocio.EntidadBancaria"%><%@page import="com.fpmislata.datos.EntidadBancariaDAOImpHibernate"%><%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>

<%
  //Llamo a entidadBancaria
 EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImpHibernate();
   
    
    
    
    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(entidadBancariaDAO.read(1));
    response.setContentType("application/json; charset=UTF-8");
    out.print(json);
%>