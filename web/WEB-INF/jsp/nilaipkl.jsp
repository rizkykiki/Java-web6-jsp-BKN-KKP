<%-- 
    Document   : nilaipkl
    Created on : Feb 23, 2019, 12:38:39 PM
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

        <title>nilai pkl</title>


        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

        <!-- Custom styles for this template -->
        <link href="css/nilaipkl.css" rel="stylesheet">

    </head>
    <body id="page-top">  
        <h1>Table Nilai </h1>
        <input type="hidden" name="id" value="${id}" readonly>
        <input type="hidden" name="email" value="${namauser}" readonly>

<!--p class="p1"> id : ${id} </p-->
        <p class="p2"> Email : ${namauser}</p>
        <p class="p2"> instansi : ${gg}</p>



        <div id="table-scroll" class="table-scroll">
            <div class="table-wrap">
                <table class="main-table">
                    <thead>
                        <tr>
                            <th rowspan="2">NO</th>
                            <th rowspan="2">parameter</th>
                            <th colspan="2">Nilai</th>
                        </tr>
                        <tr>
                            <th>Angka</th>
                            <th>Huruf</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Ketepatan Waktu</td>
                            <td>${s3}</td>
                            <td>${q1}</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Kehadiran</td>
                            <td>${s4}</td>
                            <td>${q2}</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Tata Tertib</td>
                            <td>${s5}</td>
                            <td>${q3}</td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>Keterampilan Kerja</td>
                            <td>${s6}</td>
                            <td>${q4}</td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>Kualitas Hasil Kerja</td>
                            <td>${s7}</td>
                            <td>${q5}</td>
                        </tr>
                        <tr>
                            <td>6</td>
                            <td>Tanggung jawab</td>
                            <td>${s8}</td>
                            <td>${q6}</td>
                        </tr>
                        <tr>
                            <td>7</td>
                            <td>Kemampuan Bersosialisasi</td>
                            <td>${s9}</td>
                            <td>${q7}</td>
                        </tr>
                        <tr>
                            <td>8</td>
                            <td>Kerjasama & beradaptasi</td>
                            <td>${s10}</td>
                            <td>${q8}</td>
                        </tr>
                        <tr>
                            <td>9</td>
                            <td>Kerajinan/inisiatif</td>
                            <td>${s11}</td>
                            <td>${q9}</td>
                        </tr>
                        <tr>
                            <td>10</td>
                            <td>Etika</td>
                            <td>${s12}</td>
                            <td>${q10}</td>
                        </tr>
                        <tr>
                            <td>11</td>
                            <td>Penampilan dan Kerapihan</td>
                            <td>${s13}</td>
                            <td>${q11}</td>
                        </tr>
                        <tr>

                            <td colspan="2">jumlah</td>
                            <td colspan="2">${s14}</td>

                        </tr>
                        <tr>

                            <td colspan="2">rata - rata</td>
                            <td colspan="2">${s15}</td>

                        </tr>
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
