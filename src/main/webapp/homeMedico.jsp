
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Medico</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="Css/background.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
    <nav class="navbar navbar-default fixed-top">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <div class="navbar-header">

                <a class="navbar-brand" href="index.html">Eps chingona</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="nav-item active">
                    <a href="index.html">Home Medico</a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                        aria-expanded="false">Opiones<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item">
                            <a href="medico?medico=${user.login}.html">Agregar disponibilidad</a>
                        </li>
                        <li role="separator" class="divider"></li>
                        <li class="nav-item">
                            <a href="VerCitasMedico.html">Ver Citas</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
    </div>
</body>

</html>