<%-- 
    Document   : opsinilai
    Created on : Mar 2, 2019, 1:51:05 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Input Nilai</title>
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
                <form action="endnilai.dpt" method="POST">
                    <h3>Edit Nilai</h3>
                    <input type="hidden" value="${u1}" name="e1">
                    <input type="hidden" value="${u2}" name="e2">
                    <h5>id pkl = ${u1}</h5>
                    <h5>email = ${u2}</h5>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Ketepatan Waktu</label>
                            <input type="text" value="${u3}" onkeypress="return hanyaAngka(event)" class="form-control" name="e3" placeholder="ketepatan waktu">
                        </div>
                        <div class="form-wrapper">
                            <label for="">Kehadiran</label>
                            <input type="text" value="${u4}" onkeypress="return hanyaAngka(event)" name="e4" class="form-control" placeholder="Kehadiran"/>
                        </div>  
                    </div>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Tata Tertib</label>
                            <input type="text" value="${u5}" onkeypress="return hanyaAngka(event)" class="form-control" name="e5" placeholder="Tata tertibb">
                        </div>
                        <div class="form-wrapper">
                            <label for="">Keterampilan Kerja</label>
                            <input type="text" value="${u6}" onkeypress="return hanyaAngka(event)" class="form-control" name="e6" placeholder="Keterampila kerja">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Kualitas Hasil Kerja</label>
                            <input type="text" value="${u7}" onkeypress="return hanyaAngka(event)" class="form-control" name="e7" placeholder="kualitas kerja">
                        </div>
                        <div class="form-wrapper">
                            <label for="">Tanggung jawab</label>
                            <input type="text" value="${u8}" onkeypress="return hanyaAngka(event)" class="form-control" name="e8" placeholder="Tanggung jawab">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Kemampuan Bersosialisasi</label>
                            <input type="text" value="${u9}" onkeypress="return hanyaAngka(event)" class="form-control" name="e9" placeholder="kemampuan Bersosialisasi">
                        </div>
                        <div class="form-wrapper">
                            <label for="">Kerjasama & beradaptasi</label>
                            <input type="text" value="${u10}" onkeypress="return hanyaAngka(event)" class="form-control" name="e10" placeholder="Kerjasama & Beradaptasi">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">kerajianan/inisiatif</label>
                            <input type="text" value="${u11}" onkeypress="return hanyaAngka(event)" class="form-control" name="e11" placeholder="kerajianan/inisiatif">
                        </div>
                        <div class="form-wrapper">
                            <label for="">Etika</label>
                            <input type="text" class="form-control" value="${u12}" onkeypress="return hanyaAngka(event)" name="e12" placeholder="Etika">
                        </div>

                    </div>
                    <div class="form-row">
                        <div class="form-wrapper">
                            <label for="">Penampilan & Kerapihan</label>
                            <input type="text" value="${u13}" onkeypress="return hanyaAngka(event)" class="form-control" name="e13" placeholder="Penampilan & Kerapihan">
                        </div>


                    </div>



                    <button data-text="Regist" name="update">
                        <span>Edit</span>
                    </button>
                    <button data-text="Regist" name="hapus">
                        <span>hapus</span>
                    </button>

                </form>
            </div>
        </div>

        <script src="js/jquery-3.3.1.min.js"></script>

        <!-- DATE-PICKER -->
        <script src="vendor/date-picker/js/datepicker.js"></script>
        <script src="vendor/date-picker/js/datepicker.en.js"></script>

        <script src="js/main.js"></script>
</html>
