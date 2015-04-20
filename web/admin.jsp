<%@ page import="cl.ucn.twa.amunizaga.alconserje.model.Persona" %>
<%--
  Created by IntelliJ IDEA.
  User: USUARIO
  Date: 17/04/15
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  Persona persona = (Persona) session.getAttribute("persona");
  if (persona == null) {
    response.sendRedirect("login.jsp");
  }

  Boolean logged = (Boolean) session.getAttribute("logged");
  if (logged == null || !logged.booleanValue()) {
    response.sendRedirect("login.jsp");

  }

%>
<html>
<head>
  <title>Pagina de Administracion</title>
</head>
<body>

<h1>Bienvenido Sr. <%= persona.getNombre() %></h1>
<%//equivalente a escribir out.println(persona.getnombre())
%>

</body>
</html>