<%-- 
    Document   : homepkl
    Created on : Feb 3, 2019, 2:28:48 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="lockscreen">
    <head>
        <meta charset="UTF-8">
        <title>PKL</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- Theme style -->
        <link rel="stylesheet" href="css/jam.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <form action="absenin.dpt" method="POST">
            <center>  <h3>Laporan Kegiatan</h3>
                <input type="hidden" name="namauser" value="${namauser}" readonly>
                <h4 name="namauser"> ${namauser}</h4>
                <h4 name="namauser"> ${gg}</h4>
               
                <p name="namauser"> ${g}</p>
                <input type="hidden" name="id" value="${id}" readonly>
                <input type="hidden" name="no" value="${no}" readonly>
                <input type="hidden" name="gg" value="${gg}" readonly>
                <input type="hidden" name="aa" value="${aa}" readonly>
                <input type="hidden" name="bb" value="${bb}" readonly>
         <!--h4 name="id"> ${id}</h4-->
                <textarea name="harian" cols="40" rows="5"></textarea>
            </center>
            <button onClick="alert('Selamat Datang dan Selamat bekerja')" name="masuk" type="submit" class="button"><span>Absen Masuk</span></button>
            <button onClick="alert('Terima Kasih dan Hati Hati Dijalan')" name="keluar" type="submit" class="button1"><span>Absen Pulang<span></button>

                        <button type="submit" class="button3" name="nii"><span> Liat Nilai <span></button>
                                    <!-- Automatic element centering using js -->
                                    </form>
                <input type="text" name="no" value="${no}" readonly>
                <table border="2">
                    <thead>
                        <tr>
                            <th scope="col">tanggal</th>
                            <th scope="col">peserta</th>
                            <th scope="col">masuk</th>
                            <th scope="col">keluar</th>
                            <th scope="col">keterangan</th>
                           
                        </tr>
                        <c:forEach var="abb" items="${ab}" varStatus ="count">
                            <tr>

                                <td>${abb.getTgl()}</td>
                                <td><a href="homepkl.dpt?no=<c:out value="${abb.getId_absen()}"/>&namauser=${namauser}&id=${id}&gg=${gg}">${abb.getPeserta()}</a></td>
                                <td>${abb.getMasuk()}</td>
                                <td>${abb.getKeluar()}</td>
                                <td>${abb.getKeterangan()}</td>
                                

                            </tr></c:forEach>
                    </thead>
                </table>
            
          
                                    <button type="submit" class="button2" name="logout" onclick="window.location.href = 'logincln.dpt';"><span>Logout</span></button>                     

                                    <div class="center">            
                                        <div class="headline text-center" id="time">

                                            <!-- START LOCK SCREEN ITEM -->
                                            <div class="lockscreen-item">


                                                <!-- jQuery 2.0.2 -->
                                                <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
                                                <!-- Bootstrap -->
                                                <script src="../../js/bootstrap.min.js" type="text/javascript"></script>

                                                <!-- page script -->
                                                <script type="text/javascript">
                                                               $(function () {
                                                                   startTime();
                                                                   $(".center").center();
                                                                   $(window).resize(function () {
                                                                       $(".center").center();
                                                                   });
                                                               });

                                                               /*  */
                                                               function startTime()
                                                               {
                                                                   var today = new Date();
                                                                   var h = today.getHours();
                                                                   var m = today.getMinutes();
                                                                   var s = today.getSeconds();

                                                                   // add a zero in front of numbers<10
                                                                   m = checkTime(m);
                                                                   s = checkTime(s);

                                                                   //Check for PM and AM
                                                                   var day_or_night = (h > 11) ? "PM" : "AM";

                                                                   //Convert to 12 hours system
                                                                   if (h > 12)
                                                                       h -= 12;

                                                                   //Add time to the headline and update every 500 milliseconds
                                                                   $('#time').html(h + ":" + m + ":" + s + " " + day_or_night);
                                                                   setTimeout(function () {
                                                                       startTime()
                                                                   }, 500);
                                                               }

                                                               function checkTime(i)
                                                               {
                                                                   if (i < 10)
                                                                   {
                                                                       i = "0" + i;
                                                                   }
                                                                   return i;
                                                               }

                                                               /* CENTER ELEMENTS IN THE SCREEN */
                                                               jQuery.fn.center = function () {
                                                                   this.css("position", "absolute");
                                                                   this.css("top", Math.max(0, (($(window).height() - $(this).outerHeight()) / 2) +
                                                                           $(window).scrollTop()) - 30 + "px");
                                                                   this.css("left", Math.max(0, (($(window).width() - $(this).outerWidth()) / 2) +
                                                                           $(window).scrollLeft()) + "px");
                                                                   return this;
                                                               }
                                                </script>
                                                </body>
                                                </html>