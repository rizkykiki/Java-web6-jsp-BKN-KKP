/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webpkl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class registrationFormSubmit {

    Connection conn;

    public registrationFormSubmit(Connection conn) {
        this.conn = conn;
    }

    //SUBMIT clicked
    //1. save to userData : id, firstName, lastName, idType (NIK/NIP/etc), idNumber (No of NIK/NIP/etc), emailAddress, mobile 
    //   if anonym --> id, firstName and lastName = anonymous
    //2. make ticket (become idComplaintData)
    //3. save to complaintData : idComplaintData, idWhistleType (perihal), idUserData
    //4. ticket appears in jsp
    public void InsertFirstlyUserData(String id_calon, String univ_id, String jurusan, String pendidikan, String jumlah, String email, String dari, String sampai) throws SQLException {

        String _id_calon = id_calon; //id user
        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
        String _pendidikan = pendidikan; //firstName
        String _jumlah = jumlah; //emailAddress
        String _email = email; //mobile
        String _dari = dari;
        String _sampai = sampai;
        String _hasil = "belum";
        String _unit = "";

        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
        String sql = "INSERT INTO "
                + "daftar(id_calon, univ_id, jurusan, pendidikan, "
                + " jumlah, email, dari, sampai, hasil,unit) "
                + "VALUES('" + _id_calon + "', '" + _univ_id + "','" + _jurusan + "', '" + _pendidikan + "', "
                + "'" + _jumlah + "', '" + _email + "', '" + _dari + "', "
                + "'" + _sampai + "', '" + _hasil + "', '" + _unit + "')";
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }

    public void insertdaftar(String id_calon, String id_peserta, String nama_peserta, String email, String tgllahir, String telepon, String alamat, String univ_id, String jurusan, String tingkatpendidikan,String unit) throws SQLException {

        String _id_calon = id_calon;
        String _id_peserta = id_peserta;
         String _unit = unit;
        String pass = "bknpkl";
        String kew = "3";
        String _nama_peserta = nama_peserta;
        String _email = email;
        String _tgllahir = tgllahir;
        String _telepon = telepon;
        String _alamat = alamat;
        String _univ_id = univ_id;
        String _jurusan = jurusan;
        String _tingkatpendidikan = tingkatpendidikan;

        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
        String sql = "INSERT INTO "
                + "daftarulang(id_calon,id_peserta, nama_peserta, email, "
                + " tgllahir, telepon, alamat, univ_id,jurusan,tingkatpendidikan,unit) "
                + "VALUES('" + _id_calon + "','"+_id_peserta+"','" + _nama_peserta + "', '" + _email + "', "
                + "'" + _tgllahir + "', '" + _telepon + "', '" + _alamat + "', "
                + "'" + _univ_id + "','" + _jurusan + "','" + _tingkatpendidikan + "','" + _unit + "')";
         
        PreparedStatement st = this.conn.prepareStatement(sql);
       
        st.executeUpdate(sql);
        st.close();
    }

    public void upl(String id_calon, String univ_id, String jurusan, String pendidikan, String jumlah, String email, String dari, String sampai) throws SQLException {

        String _id_calon = ""; 
        String _univ_id = univ_id;
        String _jurusan = jurusan; 
        String _pendidikan = pendidikan; 
        String _jumlah = jumlah; 
        String _email = email; 
        String _dari = dari;
        String _sampai = sampai;

     
        String sql = "UPDATE daftar SET univ_id='" + _univ_id + "',jurusan='" + _jurusan + "',pendidikan='" + _pendidikan + "',jumlah='" + _jumlah + "',email='" + _email + "',dari='" + _dari + "',sampai='" + _sampai + "' WHERE id_calon='" + id_calon + "'";
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }
    public void ang(String id_calon,String id_peserta, String nama_peserta, String email,String tgllahir,String telepon,String alamat,String univ_id,String jurusan,String tingkatpendidikan) throws SQLException {

        String _id_calon = id_calon;
        String _id_peserta = id_peserta;
      
        String _nama_peserta = nama_peserta;
        String _email = email;
        String _tgllahir = tgllahir;
        String _telepon = telepon;
        String _alamat = alamat;
        String _univ_id = univ_id;
        String _jurusan = jurusan;
        String _tingkatpendidikan = tingkatpendidikan;

     
        String sql = "UPDATE daftarulang SET id_calon='" + _id_calon + "', nama_peserta='" + _nama_peserta + "',email='" + _email + "',tgllahir='" + _tgllahir + "',telepon='" + _telepon + "',alamat='" + _alamat + "',univ_id='" + _univ_id + "',jurusan='" + _jurusan + "',tingkatpendidikan='" + _tingkatpendidikan + "' WHERE id_peserta='" + _id_peserta + "'";
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }
    public void nilaihapus(String id_anggota) throws SQLException {

        String _id_anggota = id_anggota; //id user

       String sql = "DELETE FROM nilai WHERE id_anggota='" + _id_anggota + "'";
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }
     public void dll(String id_peserta) throws SQLException {

        String _id_peserta = id_peserta; //id user

       String sql = "DELETE FROM daftarulang WHERE id_peserta='" + _id_peserta + "'";
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }
    public void dell(String id_calon) throws SQLException {

        String _id_calon = id_calon; //id user

       String sql = "DELETE FROM daftar WHERE id_calon='" + _id_calon + "'";
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }
    public void accer(String id_calon) throws SQLException {

        String _id_calon = id_calon;
//        String _id_peserta = id_peserta;
//        String _nama_peserta = nama_peserta;
//          String _email = email;
          String kew = "sudah";
          String pass= "bknpkl";
//        String _tgllahir = tgllahir;
//        String _telepon = telepon;
//        String _alamat = alamat;
//        String _univ_id = univ_id;
//        String _jurusan = jurusan;
//        String _tingkatpendidikan = tingkatpendidikan;

        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
//        String sql = "INSERT INTO "
//                + "loginadmin(username,password, kewenangan) "
//                + "VALUES('" + _email + "','" + pass + "','" + kew + "')";
        String sql = "UPDATE daftar SET hasil='" + kew + "' WHERE id_calon='" + _id_calon + "'";
    
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }
    public void tol(String id_calon) throws SQLException {

        String _id_calon = id_calon;
//        String _id_peserta = id_peserta;
//        String _nama_peserta = nama_peserta;
//          String _email = email;
          String kew = "tolak";
          String pass= "bknpkl";
//        String _tgllahir = tgllahir;
//        String _telepon = telepon;
//        String _alamat = alamat;
//        String _univ_id = univ_id;
//        String _jurusan = jurusan;
//        String _tingkatpendidikan = tingkatpendidikan;

        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
//        String sql = "INSERT INTO "
//                + "loginadmin(username,password, kewenangan) "
//                + "VALUES('" + _email + "','" + pass + "','" + kew + "')";
        String sql = "UPDATE daftar SET hasil='" + kew + "' WHERE id_calon='" + _id_calon + "'";
    
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }
     public void ulangni(String id_calon,String email) throws SQLException {

        String _id_calon = id_calon;
     // String _id_peserta = id_peserta;
//        String _nama_peserta = nama_peserta;
          String _email = email;
          String kew = "1";
          String pass= "bknpkl";
      //  String _unit = unit;
//        String _telepon = telepon;
//        String _alamat = alamat;
//        String _univ_id = univ_id;
//        String _jurusan = jurusan;
//        String _tingkatpendidikan = tingkatpendidikan;

        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
        String sql = "INSERT INTO "
                + "loginadmin(id_user,username,password, kewenangan) "
                + "VALUES('" + _id_calon + "','" + _email + "','" + pass + "','" + kew + "')";
       
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
         
    }
     public void akt(String id_calon,String email,String unit) throws SQLException {

        String _id_calon = id_calon;
     // String _id_peserta = id_peserta;
//        String _nama_peserta = nama_peserta;
          String _email = email;
          String kew = "4";
          String pass= "clnpklbkn";
        String _unit = unit;
//        String _telepon = telepon;
//        String _alamat = alamat;
//        String _univ_id = univ_id;
//        String _jurusan = jurusan;
//        String _tingkatpendidikan = tingkatpendidikan;

        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
        String sql = "INSERT INTO "
                + "loginadmin(id_user,username,password, kewenangan) "
                + "VALUES('" + _id_calon + "','" + _email + "','" + pass + "','" + kew + "')";
        String sql2 = "UPDATE daftar SET unit='" + _unit + "' WHERE id_calon='" + _id_calon + "'";
    
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
         PreparedStatement stt = this.conn.prepareStatement(sql2);
        stt.executeUpdate(sql2);
        stt.close();
    }
     
      public void masukk(String no ,String tgl, String usernih,String jam, String gg) throws SQLException {

      String _tgl = tgl;
    
      String _id_peserta = usernih;
   String _no = no;
          String _jam = jam;
          String kew = null;
          String pass= null;
        String _gg = gg;
//        String _telepon = telepon;
//        String _alamat = alamat;
//        String _univ_id = univ_id;
//        String _jurusan = jurusan;
//        String _tingkatpendidikan = tingkatpendidikan;

//String sql2="select * from absen where email and masuk";
// PreparedStatement pstt = this.conn.prepareStatement(sql2);
// ResultSet rss = pstt.executeQuery();
//if(rss.next = null)
//{
        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
        String sql = "INSERT INTO "
                + "absen(id_absen,tgl,peserta,masuk,keluar,keterangan,unit) "
                + "VALUES('" + _no + "','" + _tgl + "','" + _id_peserta + "','" + _jam + "','" + kew + "','" + pass + "','" + _gg + "')";
       // String sql = "UPDATE daftar SET hasil='" + kew + "' WHERE id_calon='" + _id_calon + "'";
    
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
}       
//else{
//       String ts = ("sudah ngisi");
//    }

      public void keluarr(String no, String tgl,String usernih,String jam,String harian) throws SQLException {

       String _harian= harian;
      String _id_peserta = usernih;
      String _no = no;
          String _jam = jam;
          String kosong = null;
     //     String kosong1= null;
//        String _tgllahir = tgllahir;
//        String _telepon = telepon;
//        String _alamat = alamat;
//        String _univ_id = univ_id;
//        String _jurusan = jurusan;
//        String _tingkatpendidikan = tingkatpendidikan;

        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
     
       String sql = "UPDATE absen SET keluar='" + _jam + "', keterangan='" + _harian + "' WHERE id_absen='" + _no + "'";
    
        PreparedStatement st = this.conn.prepareStatement(sql);
        st.executeUpdate(sql);
        st.close();
    }
        public void nilai(String e1,String e2,String e3,String e4,String e5,String e6,String e7,String e8,String e9,String e10,String e11,String e12,String e13,int jumlah,int rata) throws SQLException {

        String _e1 = e1;
        String _e2 = e2;
        String _e3 = e3;
        String _e4 = e4;
        String _e5 = e5;
        String _e6 = e6;
        String _e7 = e7;
        String _e8 = e8;
        String _e9 = e9;
        String _e10 = e10;
        String _e11 = e11;
        String _e12 = e12;
        String _e13 = e13;
        int _e14 = jumlah;
        int _e15 = rata;
        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
//        String sql = "INSERT INTO "
//                + "nilai(id_anggota,email, disiplin, absen, "
//                + " tatatertib, keterampilan, kualitas_hasil, tanggungjawab,bersosialisasi,kerjasama,kerajinan,etika,penampilan,jumlah,rata) "
//                + "VALUES('" + _e1 + "','"+_e2+"','" + _e3 + "', '" + _e4 + "', "
//                + "'" + _e5 + "', '" + _e6 + "', '" + _e7 + "', "
//                + "'" + _e8 + "','" + _e9 + "','" + _e10 + "','" + _e11 + "','" + _e12 + "','" + _e13 + "','" + _e14 + "','" + _e15 + "')";
           String sql = "UPDATE nilai SET disiplin='" + _e3 + "', absen='" + _e4 + "', tatatertib='" + _e5 + "', keterampilan='" + _e6 + "', kualitas_hasil='" + _e7 + "', "
                   + "tanggungjawab='" + _e8 + "', bersosialisasi='" + _e9 + "', kerjasama='" + _e10 + "', kerajinan='" + _e11 + "', etika='" + _e12 + "', penampilan='" + _e13 + "', jumlah='" + _e14 + "', rata='" + _e15 + "' WHERE id_anggota='" + _e1 + "'";
    
        PreparedStatement st = this.conn.prepareStatement(sql);
       
        st.executeUpdate(sql);
        st.close();
    }
        public void nilaikosong(String e1,String e2, String e3) throws SQLException {

        String _e1 = e1;
        String _e2 = e2;
        String _e = e3;
        String _e3 = "0";
        String _e4 = "0";
        String _e5 = "0";
        String _e6 = "0";
        String _e7 = "0";
        String _e8 = "0";
        String _e9 = "0";
        String _e10 = "0";
        String _e11 = "0";
        String _e12 = "0";
        String _e13 = "0";
        String _e14 = "0";
        String _e15 = "0";
        // String sql = "INSERT INTO daftar values id_calon = '" + _id_calon + "',univ_id = '" + _univ_id + "',jurusan = '" + _jurusan + "'pendidikan = '" + _pendidikan + "'jumlah = '" + _jumlah + "',email = '" + _email + "',dari = '" + _dari + "'sampai = '" + _sampai + "'";
        String sql = "INSERT INTO "
                + "nilai(id_anggota,email,unit, disiplin, absen, "
                + " tatatertib, keterampilan, kualitas_hasil, tanggungjawab,bersosialisasi,kerjasama,kerajinan,etika,penampilan,jumlah,rata) "
                + "VALUES('" + _e1 + "','"+_e2+"','" + _e + "','" + _e3 + "', '" + _e4 + "', "
                + "'" + _e5 + "', '" + _e6 + "', '" + _e7 + "', "
                + "'" + _e8 + "','" + _e9 + "','" + _e10 + "','" + _e11 + "','" + _e12 + "','" + _e13 + "','" + _e14 + "','" + _e15 + "')";
         
        PreparedStatement st = this.conn.prepareStatement(sql);
       
        st.executeUpdate(sql);
        st.close();
    }
}
