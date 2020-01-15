<%-- 
    Document   : homeadmin
    Created on : Feb 3, 2019, 3:07:13 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Admin</title>


        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

        <!-- Custom styles for this template -->
        <link href="css/adminn.css" rel="stylesheet">

    </head>
    <body id="page-top">

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger">Badan Kepegawaian Negara</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav text-uppercase ml-auto">

                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="anggotaadmin.dpt">Daftar Anggota</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="absen.dpt">Absen</a>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>
        <img src="user.png" class="user">
        <h1>Pendaftar PKL </h1>
        <button type="submit" class="button2" onclick="window.location.href = 'logincln.dpt';"><span>Logout</span></button>
        <div id="table-scroll" class="table-scroll">
            <div class="table-wrap">
                <table class="main-table">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Email</th>
                            <th scope="col">Nama Universitas</th>
                            <th scope="col">Jurusan</th>
                            <th scope="col">Pendidikan</th>
                            <th scope="col">Jumlah</th>

                            <th scope="col">Dari</th>
                            <th scope="col">Sampai</th>
                            <th scope="col">Hasil</th>
                            <th scope="col">unit</th>
                        </tr>
                        <c:forEach var="inii" items="${ini}" varStatus ="count">
                            <tr>
                                <td><a href="anggotaadmin1.dpt?nama=<c:out value="${inii.getId_calon()}"/>">${inii.getId_calon()}</a></td>
                                <td><a href="updatee.dpt?id_calon=<c:out value="${inii.getId_calon()}"/>">${inii.getEmail()}</a></td>
                                <td>${inii.getUniv_id()}</td>
                                <td>${inii.getJurusan()}</td>
                                <td>${inii.getPendidikan()}</td>
                                <td>${inii.getJumlah()}</td>

                                <td>${inii.getDari()}</td>
                                <td>${inii.getSampai()}</td>
                                <td>${inii.getHasil()}</td>
                                <td>${inii.getUnit()}</td>

                            </tr></c:forEach>
                    </thead>
                </table>
            </div>
        </div>
        <script src="js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Contact form JavaScript -->
        <script src="js/jqBootstrapValidation.js"></script>
        <script src="js/contact_me.js"></script>

        <!-- Custom scripts for this template -->
        <script src="js/agency.js"></script>
    </body>
</html>