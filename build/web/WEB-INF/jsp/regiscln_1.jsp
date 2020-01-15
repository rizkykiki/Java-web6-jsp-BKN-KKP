<%-- 
    Document   : regiscln
    Created on : Jan 28, 2019, 10:48:15 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>RegistrationForm</title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- LINEARICONS -->
        <link rel="stylesheet" href="fonts/linearicons/style.css">

        <!-- MATERIAL DESIGN ICONIC FONT -->
        <link rel="stylesheet" href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

        <!-- DATE-PICKER -->
        <link rel="stylesheet" href="vendor/date-picker/css/datepicker.min.css">

        <!-- STYLE CSS -->

        <link rel="stylesheet" href="css/style.css">

    </head>

    <body>

        <div class="wrapper">
            <div class="inner">
                <form action="daftargih.dpt" method="post" onsubmit="validasiemail();" name="cekemail">
                    <h3>Registration PKL</h3>
                    <p>${f1}</p>
                    <p>${f2}</p>
                    <p>${f9}</p>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Email</label>
                            <input type="User" name="email" value="${u1}" class="form-control" placeholder="Email" >
                        </div>
                        <div class="form-wrapper">
                            <label for="">Universitas / SMK</label>
                            <input type="text" name="univ_id" class="form-control" id="autocomplete-custom-append" style="float: left;" placeholder="Universitas"/>
                            <div id="suggestions-container" style="position: relative; float: left; width: 400px; margin: 10px;"></div>

                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Jurusan</label>
                            <input type="text" name="jurusan" class="form-control" placeholder="Jurusan" id="autocomplete-custom-appendd1" style="float: left;" >
                            <div id="suggestions-container" style="position: relative; float: left; width: 400px; margin: 10px;"></div>
                        </div>
                        <div class="form-wrapper">
                            <label for="">Tingkat Pendidikan</label>
                            <input type="text" class="form-control" name="pendidikan" placeholder="Pendidikan" id="autocomplete-custom-appendd" style="float: left;"/>
                            <div id="suggestions-container" style="position: relative; float: left; width: 400px; margin: 10px;"></div>
                        </div>

                    </div>

                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Mulai</label>

                            <input type="text" class="form-control datepicker-here" data-language='en' data-date-format="yyyy-m-dd" name="dari" id="dp1">

                        </div>
                        <div class="form-wrapper">
                            <label for="">Selesai</label>

                            <input type="text" class="form-control datepicker-here" name="sampai" data-language='en'  data-date-format="yyyy-m-dd" id="dp2">

                        </div>
                    </div>
                    <div class="form-row last">
                        <div class="form-wrapper">
                            <label for="Univ">Jumlah</label>
                            <input type="text" onkeypress="return hanyaAngka(event)" name="jumlah" class="form-control" placeholder="jumlah">
                        </div>
                        <div class="form-wrapper">

                            <input type="hidden" name="id_calon" class="form-control" placeholder="id" >
                        </div>

                    </div>

                    <button data-text="Daftar" type="submit" name="daftar">
                        <span>Daftar</span></button>

                </form>
                <button data-text="Kembali" onclick="window.location.href = 'pertama.dpt';" name="kembali">
                    <span>Kembali</span></button>
            </div>
        </div>

        <script src="js/jquery-3.3.1.min.js"></script>

        <!-- DATE-PICKER -->
        <script src="vendor/date-picker/js/datepicker.js"></script>
        <script src="vendor/date-picker/js/datepicker.en.js"></script>
        <script type="text/javascript" src="js/jquery.mockjax.js"></script>
        <script type="text/javascript" src="js/jquery.autocomplete.js"></script>
        <script type="text/javascript" src="js/countries.js"></script>
        <script type="text/javascript" src="js/demo.js"></script>
        <script src="js/main.js"></script>
        <script type="text/javascript" src="js/pendidikan.js"></script>
        <script type="text/javascript" src="js/pendidikan1.js"></script>
        <script type="text/javascript" src="js/jurusan.js"></script>
        <script type="text/javascript" src="js/jurusan1.js"></script>


</html>