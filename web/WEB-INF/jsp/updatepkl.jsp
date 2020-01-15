<%-- 
    Document   : updatepkl
    Created on : Feb 7, 2019, 3:07:56 PM
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
        <link rel="stylesheet" href="css/nilai.css">
    </head>

    <body>
        <div class="wrapper">
            <div class="inner">
                <form action="updateyuk.dpt" method="POST">
                    <h3>Registration PKL</h3>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">id calon</label>
                            <input type="text" name="id_calon" value="${u1}" class="form-control" placeholder="Nama" readonly/>
                        </div>
                        <div class="form-wrapper">
                            <label for="">universitas</label>
                            <input type="text" name="univ_id" value="${u2}" class="form-control" placeholder="jumlah"/>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">jurusan</label>
                            <input type="User" name="jurusan" value="${u3}" class="form-control" placeholder="E-mail">
                        </div>
                        <div class="form-wrapper">
                            <label for="">Tingkat Pendidikan</label>
                            <input type="text" name="pendidikan" value="${u4}" class="form-control" placeholder="Pendidikan">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Mulai</label>
                            <input type="text" class="form-control datepicker-here" data-language='en'  data-date-format="yyyy-mm-dd" name="dari"  value="${u7}">


                        </div>
                        <div class="form-wrapper">
                            <label for="">Selesai</label>
                            <input type="text" class="form-control datepicker-here" name="sampai"  data-language='en' data-date-format="yyyy-mm-dd" value="${u8}">


                        </div>
                    </div>
                    <div class="form-row last">
                        <div class="form-wrapper">
                            <label for="">jumlah</label>
                            <input type="text" name="jumlah" value="${u5}" onkeypress="return hanyaAngka(event)" class="form-control" id="Univ" placeholder="Pendidikan">
                        </div>
                        <div class="form-wrapper">
                            <label for="">email</label>
                            <input type="text" name="email" value="${u6}" class="form-control" id="jur" placeholder="Jurusan">
                        </div>

                    </div>
                    <div class="form-row last">
                        <div class="form-wrapper">
                           <label for="Univ">Instansi</label>
							 <input type="text" name="unit" class="form-control" id="autocomplete-custom-append4" style="float: left;" placeholder="Instansi"/>
							<div id="suggestions-container" style="position: absolute; float: right; width: 400px; margin: 10px;"></div>
                        </div>
                    </div>
                    <button data-text="Update" type="submit" name="update"/>
                    <span>Update</span>
                    <button data-text="delete" type="submit" name="delete"/>
                    <span>delete</span>

                    <button data-text="Acc" type="submit" name="acc"/>
                    <span>Acc</span>

                    <button data-text="Tolak" type="submit" name="tolak"/>
                    <span>Tolak</span>

                    <!--button data-text="tambah anggota" type="submit" name="anggota"/>
                   <span>tambah anggota</span-->

                </form>
            </div>
        </div>

        <script src="js/jquery-3.3.1.min.js"></script>

        <!-- DATE-PICKER -->
        <script src="vendor/date-picker/js/datepicker.js"></script>
        <script src="vendor/date-picker/js/datepicker.en.js"></script>
        <script type="text/javascript" src="js/jquery.mockjax.js"></script>
		<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
        <script type="text/javascript" src="js/instansi.js"></script>
		<script type="text/javascript" src="js/instansi2.js"></script>

        <script src="js/main.js"></script>
</html>
