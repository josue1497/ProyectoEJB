<%-- 
    Document   : registrar.jsp
    Created on : 23/11/2017, 04:07:03 PM
    Author     : Rental Servicios
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar Alumno</h1>
        <form method="post" action="">
            CI: <input type="text" name="CI" id="CI" placeholder="Cedula de Identidad"/><br>
            Nombre: <input type="text" name="nombre" id="nombre" placeholder="Ingrese nombre"/><br>
            Edad: <input type="text" name="edad" id="edad" placeholder="Ingrese su Edad"/><br>
            Sexo: Masculino <input type="radio" name="genero" id="genero" value="Masculino" />
             Femenino <input type="radio" name="genero" id="genero" value="Masculino"/><br>
             <input type="submit" value="Registrar"/>

        </form>        
    </body>
</html>
