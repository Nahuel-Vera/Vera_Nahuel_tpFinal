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
                <form name="formAgregar" action="SvAgregar" method="get" >
                    <!--<label>id</label><br>
                    <input type="text" id="id" name="id"><br>-->
                    <label>Nombre</label><br>
                    <input type="text" id="nombre" name="nombre"><br>
                    <label>Apellido</label><br>
                    <input type="text" id="apellido" name="apellido"><br>
                    <label>Edad</label><br>
                    <input type="text" id="edad" name="edad"><br>
                    <label>Direccion</label><br>
                    <input type="text" id="direccion" name="direccion"><br>
                    <label>Dni</label><br>
                    <input type="text" id="dni" name="dni"><br>
                    <label>Profesion</label><br>
                    <input type="text" id="profesion" name="profesion"><br>
                    <label>Fecha de nacimiento (dd/mm/yyyy)</label><br>
                    <input type="text" id="fechaNac" name="fechaNac"><br>
                    <button type="submit" class="btn btn-danger btn-xs" data-title="Agregar">Agregar</button>
                </form>
            </div>
        </nav>
    </body>
</html>