<%-- 
    Document   : ModificarHuesped
    Created on : 07/08/2021, 20:30:36
    Author     : Nahuu
--%>
<%@page import="Logica.Huesped"%>
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
                <form name="formModificar" action="SvModificar" method="get" >
                    <% HttpSession misession=request.getSession();
                       Huesped huesp1=(Huesped)misession.getAttribute("huesped");
                       {
                    %>
                    <label>Nombre</label><br>
                    <input type="text" id="nombre" name="nombre" value="<%=huesp1.getNombre()%>"><br>
                    <label>Apellido</label><br>
                    <input type="text" id="apellido" name="apellido" value="<%=huesp1.getApellido()%>"><br>
                    <label>Edad</label><br>
                    <input type="text" id="edad" name="edad" value="<%=huesp1.getEdad()%>"><br>
                    <label>Direccion</label><br>
                    <input type="text" id="direccion" name="direccion" value="<%=huesp1.getDireccion()%>"><br>
                    <label>Dni</label><br>
                    <input type="text" id="dni" name="dni" value="<%=huesp1.getDni()%>"><br>
                    <label>Profesion</label><br>
                    <input type="text" id="profesion" name="profesion" value="<%=huesp1.getProfesion()%>"><br>
                    <label>Fecha de nacimiento (dd/mm/yyyy)</label><br>
                    <input type="text" id="fechaNac" name="fechaNac" <%=huesp1.getFechaNac()%>><br>
                    <input type="hidden" id="id" name="id" value="<%=huesp1.getId()%>">
                    <button type="submit" class="btn btn-danger btn-xs" data-title="Modificar">Modificar</button>
                    <%}%>
                </form>
            </div>
        </nav>
    </body>
</html>