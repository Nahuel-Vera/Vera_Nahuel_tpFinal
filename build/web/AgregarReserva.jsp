<%-- 
    Document   : AgregarReserva
    Created on : 06/08/2021, 14:52:59
    Author     : Nahuu
--%>

<%@page import="Logica.Reservacion"%>
<%@page import="Logica.Huesped"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<!--[if lte IE 9]>
<html lang="en" class="oldie">
<![endif]-->
<!--[if gt IE 9]><!-->
<html lang="en">
    <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Hidden Menu</title>
        <link href="style_1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav class="btn-pluss-wrapper">
            <h2 class="tooltip">Mira!</h2>
            <div href="#" class="btn-pluss">
                <ul>
                    <li><a href="principal.jsp">Volver</a></li>
                </ul>
                <!-- Agregar en Action el nombre del Servlet a utilizar--->
                <form name="formAgregar" action="SvRegistrarReserva" method="get" >
                    <% HttpSession misession=request.getSession();
                       Huesped huesp1=(Huesped)misession.getAttribute("huesped");
                       {
                    %>
                    <input type="hidden" id="id" name="id" value="<%=huesp1.getId()%>">
                    <!--<label>Id de La Reserva </label><br>
                    <input type="text" id="idReserva" name="idReserva"><br>-->
                    <label>Desde</label><br>
                    <input type="text" id="fechaIngreso" name="fechaIngreso"><br>
                    <label>Hasta</label><br>
                    <input type="text" id="fechaEgreso" name="fechaEgreso"><br>
                    <button type="submit" class="btn btn-danger btn-xs" data-title="Registrar">Agregar</button>
                    <%}%>
                </form>
            </div>
        </nav>
    </body>
</html>
