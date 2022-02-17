<%@page import="Logica.Huesped"%>
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
                <ul>
                    <li><a href="principal.jsp">Volver</a></li>
                </ul>
                <table style="width:100%">
                    <thead>
                        <tr>
                            <th>Id huesped</th>
                            <th>Nombre Completo</th>
                            <th>Fecha de Ingreso</th>
                            <th>Fecha de Egreso</th>
                        </tr>
                    </thead>
                    <tbody>
                         <!--<form name="formModificar" action="SvSusReservas" method="get" >-->
                        <!--traer a las personas para mostrarlas (LLama a la controladora y a la controladoraPersistencia para traer todo de la Bda) .-->
                        <% Controladora control = new Controladora();
                            List<Reservacion> ListReservas = control.TraerReservasUnDeterminadoDia();
                            List <Huesped> ListHuespedes=control.TraerHuespedes();
                            /*HttpSession misession=request.getSession();
                            Reservacion Reservacion=(Reservacion)misession.getAttribute("reservacion");*/
                            {
                            %>
                        <tr>
                            <%
                                if(ListHuespedes!=null){
                                for(Reservacion reserv1 : ListReservas)
                                {
                                    Huesped huesp1=reserv1.getHuesp();%>
                            <td><%=huesp1.getId()%></td>
                            <%String NombreComp=huesp1.getNombre()+" "+huesp1.getApellido();%>
                            <td><%=NombreComp%></td>
                            <%Date fechaIngreso = reserv1.getIngreso();%>
                            <td><%=fechaIngreso%></td>
                            <%Date fechaEgreso = reserv1.getEgreso();%>
                            <td><%=fechaEgreso%></td>
                            <!--</form>-->
                        </tr>
                        <%}
                          }
                         }%>
                    </tbody>
                </table>
            </div>
        </nav>
    </body>
</html>
