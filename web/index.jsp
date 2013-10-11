<%-- 
    Document   : index
    Created on : 10-oct-2013, 8:53:50
    Author     : alumno
--%>

<%@page import="banco.EntidadBancaria"%>
<%@page import="banco.EntidadBancariaDAO"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
     Date hoy = new Date();
     EntidadBancariaDAO entidadbancariaDAO = new EntidadBancariaDAO();
     EntidadBancaria entidadBancaria = entidadbancariaDAO.read(1);
     %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= entidadBancaria%>
    </body>
</html>
