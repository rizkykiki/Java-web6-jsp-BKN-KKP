<%-- 
    Document   : absenpem
    Created on : Mar 7, 2019, 9:06:22 PM
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

        <title>pembimbing absen</title>


        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

        <!-- Custom styles for this template -->
        <link href="css/absenn.css" rel="stylesheet">

    </head>
    <body id="page-top">

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" >Badan Kepegawaian Negara</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav text-uppercase ml-auto">
                        <form action="homepem.dpt" method="POST">
                            <input type="hidden" value="${q1}" name="q2" placeholder="ID" readonly/>
                            <button type="submit" class="button"><span>Pembimbing</span></button>
                        </form>
                        <form action="editnilai.dpt" method="POST">
                            <input type="hidden" value="${q1}" name="q2" placeholder="ID" readonly/>
                            <button type="submit" class="button1"><span>NIlai PKL</span></button>
                        </form>
                        <form action="absenpem.dpt" method="POST">
                            <input type="hidden" value="${q1}" name="q2" placeholder="ID" readonly/>
                            <button type="submit" class="button3"><span>Absensi Pkl</span></button>
                        </form>		


                    </ul>
                </div>
            </div>
        </nav>
        <h1>Daftar absen </h1>
        <button type="submit" class="button2" onclick="window.print();"><span>Logout</span></button>
        <div id="table-scroll" class="table-scroll">
            <div class="table-wrap">
                <table class="main-table">
                    <thead>
                        <tr>

                            <th scope="col">tanggal</th>
                            <th scope="col">peserta</th>
                            <th scope="col">masuk</th>
                            <th scope="col">keluar</th>
                            <th scope="col">keterangan</th>
                            <th scope="col">Unit</th>
                        </tr>
                        <c:forEach var="abb" items="${ab}" varStatus ="count">
                            <tr>

                                <td>${abb.getTgl()}</td>
                                <td>${abb.getPeserta()}</td>
                                <td>${abb.getMasuk()}</td>
                                <td>${abb.getKeluar()}</td>
                                <td>${abb.getKeterangan()}</td>
                                <td>${abb.getUnit()}</td>

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
