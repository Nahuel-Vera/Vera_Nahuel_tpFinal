<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login(JSP Page)</title>
        <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="Bootstrap/css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="cuadro">
            <div id="cabeza">Ingrese</div>
            <div id="cuerpo">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">Usuario</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputEmail3" placeholder="Usuario">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
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
    </body>
</html>
