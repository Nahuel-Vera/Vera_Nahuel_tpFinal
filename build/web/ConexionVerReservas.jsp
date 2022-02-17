<%-- 
    Document   : ConexionVerReservas
    Created on : 09/08/2021, 03:23:33
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
                <!-- Agregar en Action el nombre del Servlet a utilizar--->
                <form name="formBuscarFecha" action="SvBuscarFecha" method="post" >
                    <% HttpSession misession=request.getSession();
                       Reservacion reserva1=(Reservacion)misession.getAttribute("reservacion");
                       {
                    %>
                    <!--<label>Id de La Reserva </label><br>
                    <input type="text" id="idReserva" name="idReserva"><br>-->
                    <label>Fecha a buscar(dd/MM/yyyy)</label><br>
                    <input type="text" id="fechaBuscar" name="fechaBuscar"><br>
                    <input type="hidden" id="id" name="id" value="<%=reserva1.getIdReservacion()%>">
                    <button type="submit" class="btn btn-danger btn-xs" data-title="Buscar">Buscar</button>
                </form>
            </div>
        </nav>
    </body>
</html>