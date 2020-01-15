<%-- 
    Document   : laporan
    Created on : May 7, 2019, 11:23:11 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Cek Surat </title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/styles.min.css">
</head>

<body style="background-color:White;">
   <div>
       <center> <img src="logo-bkn.png" width="200"></center>
        <div></div>
    <div></div>
    <div></div>
    
    <div  class="datagrid" style="">
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>No. Surat</th>
                    <th>Instansi</th>
                    <th>Tgl. Terima Kasubdit Lahtah</th>
                </tr>
            </thead>
            <c:forEach var="isikassie" items="${muncul}" varStatus ="count">
                <tbody>
                    <tr>
                        <td>${isikassie.getId()}</td>
                        <td><a href="kassiesave.ddn?no_srt=<c:out value="${isikassie.getNo_srt()}"/>">${isikassie.getNo_srt()}</td>
                        <td>${isikassie.getInstansi()}</td>
                         <td>${isikassie.getTgl_kasubdit()}</td>
                    </tr>
                </tbody>
                </c:forEach>
                <c:forEach var="isikassie" items="${keluar}" varStatus ="count">
                <tbody>
                    <tr>
                        <td>${isikassie.getId()}</td>
                        <td><a href="kassiesave.ddn?no_srt=<c:out value="${isikassie.getNo_srt()}"/>">${isikassie.getNo_srt()}</td>
                        <td>${isikassie.getInstansi()}</td>
                        <td>${isikassie.getTgl_kasubdit()}</td>
                    </tr>
                </tbody>
                </c:forEach>
            <tfoot>
			<p> *Catatan Laporan ini berisikan surat yang sudah masuk dan diterima oleh admin </p>
              
            </tfoot>
        </table>
    </div>
    <div></div>
    </div>
    <div> Jakarta, ...-.....-....</div>
    <div> Mengetahui </div>
    <div></div>
    <div></div>
    <div></div>
    <div><br></br>
		<br></br>
		<br>Kepala Administrasi Persuratan</br></div>


		<div class="form-group"><button class="btn btn-primary btn-block" type="submit" onclick="window.print();">Cetak</button></div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.0/js/bootstrap.bundle.min.js"></script>
</body>

</html>
