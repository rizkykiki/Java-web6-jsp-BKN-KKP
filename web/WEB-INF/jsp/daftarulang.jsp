<%-- 
    Document   : daftarulang
    Created on : Feb 6, 2019, 10:35:53 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Daftar Ulang</title>
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="vendor/date-picker/css/datepicker.min.css">
        <!-- Custom styles for this template -->
        <link href="css/ulang.css" rel="stylesheet">

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
                            <a class="nav-link js-scroll-trigger" href="logincln.dpt">Log out</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="loginBox">
            <div align="center">
                <h2>Silahkan Daftar</h2>
                <p>login ${u12}</p>
                <!--p>id pkl ${u5}</p-->
                <p>${f2}</p>
            </div>
            <form action="ulang.dpt" method="POST">

                <input type="hidden" value="${u1}" name='id_calon' placeholder="ID" readonly/>

                <input type="hidden"  value="${u5}" name='id_peserta' placeholder="ID PKL" readonly/>
                <p>Nama</p>
                <input type="text" name="nama_peserta" placeholder="Nama">
                <p>Email</p>
                <input type="text" name="email" placeholder="Email">
                <p>Tanggal Lahir</p>
                <input type="text" class="form-control datepicker-here" data-language='en' data-date-format="yyyy-m-dd" name="tgllahir" id="dp1">

                <p>Telpon</p>
                <input type="text" name="telepon" onkeypress="return hanyaAngka(event)" placeholder="Telpon"/>
                <p>Alamat</p>
                <input type="text" name="alamat" placeholder="Alamat">
                <p>Univ</p>
                <input type="text" value="${u2}" name="univ_id" placeholder="Univ" readonly>
                <p>Jurusan</p>
                <input type="text" value="${u3}" name="jurusan" placeholder="Jurusan" readonly>
                <p>Tingkat Penindikan</p>
                <input type="text" value="${u4}" name="tingkatpendidikan" placeholder="Tingkat Pendidikan" readonly>
                <p>unit</p>
                <input type="text" value="${u10}" name="unit" placeholder="Tingkat Pendidikan" readonly>
                <p>Password Login : bknpkl</p>
                <input type="submit" name="" value="daftar">
            </form>
        </div>
        <script>
            function hanyaAngka(evt) {
                var charCode = (evt.which) ? evt.which : event.keyCode
                if (charCode > 31 && (charCode < 48 || charCode > 57))
                    return false;
                return true;
            }
        </script>

        <script src="js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/date-picker/js/datepicker.js"></script>
        <script src="vendor/date-picker/js/datepicker.en.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Contact form JavaScript -->
        <script src="js/jqBootstrapValidation.js"></script>
        <script src="js/contact_me.js"></script>

        <!-- Custom scripts for this template -->
        <script src="js/agency.min.js"></script>
    </body>
</html>
