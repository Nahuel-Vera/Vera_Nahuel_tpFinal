<%-- 
    Document   : Login1
    Created on : 06/08/2021, 18:46:30
    Author     : Nahuu
--%>

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
        <link href="style1Login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav class="btn-pluss-wrapper">
            <h2 class="tooltip">Mira!</h2>
            <div href="#" class="btn-pluss">
                <ul>
                    <li><a href="AgregarEmple1.jsp">AgregarEmpleado</a></li>
                </ul>
                <div id="cuadro">
                    <div id="cabeza">Ingrese</div>
                    <div id="cuerpo">
                        <form class="form-horizontal" action="SvUsuario" method="post">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">Usuario</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputEmail3" name="user" placeholder="Usuario">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
                                <div class="col-sm-10">
                                    <input type="password" class="form-control" id="inputPassword3" name="pass" placeholder="Password">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="submit" class="btn btn-default">Ingresar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </nav>
    </body>
</html>
