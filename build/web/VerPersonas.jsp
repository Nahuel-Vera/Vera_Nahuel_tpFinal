<%@page import="java.util.Date"%>
<%@page import="Logica.Controladora"%>
<%@page import="java.util.List"%>
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
                            <th>Nombre y Apellido</th>
                            <th>Edad</th>
                            <th>Dni</th>
                            <th>Direccion</th>
                            <th>Fecha de nacimiento</th>
                        </tr>
                    </thead>
                    <tbody>
                        <!--traer a las personas para mostrarlas (LLama a la controladora y a la controladoraPersistencia para traer todo de la Bda) .-->
                        <% Controladora control = new Controladora();
                            List<Huesped> listHuespedes = control.TraerHuespedes();
                            for (Huesped huesp : listHuespedes) {%>
                        <tr>
                            <%String nombreComp = huesp.getNombre() + " " + huesp.getApellido();%>
                            <td><%=nombreComp%></td>
                            <%int edad = huesp.getEdad();%>
                            <td><%=edad%></td>
                            <%int dni = huesp.getDni();%>
                            <td><%=dni%></td>
                            <%String direccion = huesp.getDireccion();%>
                            <td><%=direccion%></td>
                            <%Date fechaNac = huesp.getFechaNac();%>
                            <td><%=fechaNac%></td>
                            <%int id=huesp.getId();%>
                            <td>
                                <form name="Modificar" action="SvModificar" method="post" style="display:inline">
                                    <button typo="submit" class="btn btn_danger btn-xs" data-title="Modificar">Modificar</button>
                                     <input type="hidden" name="id" value="<%=id%>">
                                </form>
                            </td>
                            <td>
                                <form name="Eliminar" action="SvEliminar" method="post" style="display: inline">
                                    <input type="hidden" name="id" value="<%=id%>">
                                    <button type="submit" class="btn btn-danger btn-xs" data-title="Eliminar">Eliminar</button>
                                </form>
                            </td>
                            <td>
                                <form name="Reservar" action="SvRegistrarReserva" method="post" style="display: inline">
                                    <input type="hidden" name="id" value="<%=id%>">
                                    <button type="submit" class="btn btn-danger btn-xs" data-title="Reservar">Reservar</button>
                                </form>
                            </td>
                            <!--<td>
                                <form name="susReservas" action="SvSusReservas" method="post" style="display: inline">
                                    <input type="hidden" name="id" value="<%//=id%>">
                                    <button type="submit" class="btn btn-danger btn-xs" data-title="susReservas">Sus Reservas</button>
                                </form>-->
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </nav>
    </body>
</html>
