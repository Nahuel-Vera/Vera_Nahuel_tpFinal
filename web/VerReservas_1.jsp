<%@page import="Logica.Reservacion"%>
<%@page import="java.util.Date"%>
<%@page import="Logica.Controladora"%>
<%@page import="java.util.List"%>
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
        <link href="style2VerHuesp.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <nav class="btn-pluss-wrapper">
            <h2 class="tooltip">Mira!</h2>
            <div href="#" class="btn-pluss">
                <table style="width:100%">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Fecha de Ingreso</th>
                            <th>Fecha de Egreso</th>
                        </tr>
                    </thead>
                    <tbody>
                        <form name="formAgregar" action="SvRegistrarReserva" method="get" >
                            
                    <% HttpSession misession=request.getSession();
                       Reservacion reserva1=(Reservacion)misession.getAttribute("reservacion");
                       {
                    %>
                    <input type="hidden" id="id" name="id" value="<%=reserva1.getIdReservacion()%>">
                        <!--traer a las personas para mostrarlas (LLama a la controladora y a la controladoraPersistencia para traer todo de la Bda) .-->
                        <% Controladora control = new Controladora();
                            List<Reservacion> ListReservas = control.TraerReservasUnDeterminadoDia();
                            /*HttpSession misession=request.getSession();
                            Reservacion Reservacion=(Reservacion)misession.getAttribute("reservacion");*/
                            {
                            for (Reservacion reserva : ListReservas)
                            {%>
                        <tr>
                            <%int id=reserva.getIdReservacion();%>
                            <td><%=id%></td>
                            <%Date fechaIngreso = reserva.getIngreso();%>
                            <td><%=fechaIngreso%></td>
                            <%Date fechaEgreso = reserva.getEgreso();%>
                            <td><%=fechaEgreso%></td>
                        </tr>
                        <%}%>
                </form>
                        <%}
                       }%>
                    </tbody>
                </table>
            </div>
        </nav>
    </body>
</html>
