<%@ page import="cl.ucn.twa.amunizaga.alconserje.model.Persona" %>
<%@ page import="cl.ucn.twa.amunizaga.alconserje.Controlador" %>
<%--
  Created by IntelliJ IDEA.
  User: USUARIO
  Date: 17/04/15
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%
  //Obtengo el user del form
  String user = request.getParameter("user");

  //Obtengo el password del form
  String pass = request.getParameter("pass");

  //Los imprimo para ver si estan correctos
  //out.println("User: " + user + ", Password: " + pass);

  //Verifico login y password
  if(user != null && pass != null) {

    Persona persona = Controlador.getPersonaRut(user);
    //out.println("Persona: " + persona);

    // Si encontre a la persona y el password es el mismo...
    if (persona != null && persona.getPassword().equals(pass)) {

      //ingreso los datos ok a la "sesion"
      session.setAttribute("persona", persona);
      session.setAttribute("logged", Boolean.TRUE);

      //Ingreso al sistema
      response.sendRedirect("admin.jsp");
    }
  }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Login de acceso al Sistema</title>
</head>
<body>
<%
  Persona persona = (Persona) session.getAttribute("persona");
  //if (persona != null) //ha estado loegueado pero se salio
%>
<form action="login.jsp" method="post">

  <strong>Usuario:</strong>
  <input type ="text" name="user" value=""/>

  <br/>

  <string>Contraseña:</string>
  <input type="password" name="pass" value=""/>

  <br/>

  <input type="submit" value="Ingresar"/>
</form>

</body>
</html>