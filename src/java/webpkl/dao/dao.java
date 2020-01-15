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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import webpkl.domain.waktu;
import webpkl.domain.login;
import webpkl.domain.nilai;
import webpkl.domain.pkl;
import webpkl.domain.univ;
import webpkl.domain.user;

/**
 *
 * @author tes
 */
public class dao {

    Connection conn;
    private Statement st;

    public dao(Connection conn) {
        this.conn = conn;
    }

    public user hil(String email) throws SQLException {
        String sql = "SELECT * FROM daftar WHERE email ='" + email + "'";
        PreparedStatement pst = this.conn.prepareStatement(sql);
//        pst.setString(1, username);
//        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        user uset = new user();
        if (rs.next()) {
            //cd.setId(rs.getString(1));
            uset.setId_calon(rs.getString(1));
            uset.setUniv_id(rs.getString(2));
            uset.setJurusan(rs.getString(3));
            uset.setPendidikan(rs.getString(4));
            uset.setJumlah(rs.getString(5));
            uset.setEmail(rs.getString(6));
            uset.setDari(rs.getString(7));
            uset.setSampai(rs.getString(8));
            uset.setHasil(rs.getString(9));

        }
        return uset;
    }

    public login kueriUntukLogin(String username, String password) throws SQLException {
        String sql = "SELECT * FROM loginadmin WHERE username ='" + username + "' and password='" + password + "'";
        PreparedStatement pst = this.conn.prepareStatement(sql);
//        pst.setString(1, username);
//        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        login login = new login();
        if (rs.next()) {
            //cd.setId(rs.getString(1));
            login.setId_peseta(rs.getString(1));
            login.setUsername(rs.getString(2));
            login.setPassword(rs.getString(3));
            login.setKewenangan(rs.getString(4));

        }
        return login;
    }
     public nilai nilaie(String id_anggota) throws SQLException {
        String sql = "SELECT * FROM nilai WHERE id_anggota ='" + id_anggota + "'";
        PreparedStatement pst = this.conn.prepareStatement(sql);
//        pst.setString(1, username);
//        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        nilai use = new nilai();
        if (rs.next()) {
            //cd.setId(rs.getString(1));
             use.setId_anggota(rs.getString(1));
            use.setEmail(rs.getString(2));
            use.setDisiplin(rs.getString(4));
            use.setAbsen(rs.getString(5));
            use.setTatatertib(rs.getString(6));
            use.setKeterampilan(rs.getString(7));
            use.setKualitas_hasil(rs.getString(8));
            use.setTanggungjawab(rs.getString(9));
            use.setBersosialisasi(rs.getString(10));
            use.setKerjasama(rs.getString(11));
            use.setKerajinan(rs.getString(12));
            use.setEtika(rs.getString(13));
            use.setPenampilan(rs.getString(14));
            use.setJumlah(rs.getString(15));
            use.setRata(rs.getString(16));

        }
        return use;
    }

    public pkl liatop(String id_peserta) throws SQLException {
        String sql = "SELECT * FROM daftarulang WHERE id_peserta ='" + id_peserta + "' OR email = '"+ id_peserta+"'";
      // String sql = "SELECT * FROM daftarulang WHERE id_peserta ='" + id_peserta + "'";
        PreparedStatement pst = this.conn.prepareStatement(sql);
//        pst.setString(1, username);
//        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        pkl use = new pkl();
        if (rs.next()) {
            //cd.setId(rs.getString(1));
            use.setId_calon(rs.getString(1));
            use.setId_peserta(rs.getString(2));
            use.setNama_perserta(rs.getString(3));
            use.setEmail(rs.getString(4));
            use.setTgllahir(rs.getString(5));
            use.setTelepon(rs.getString(6));
            use.setAlamat(rs.getString(7));
            use.setUniv_id(rs.getString(8));
            use.setJurusan(rs.getString(9));
            use.setTingkatpendidikan(rs.getString(10));
            use.setUnit(rs.getString(11));
        }
        return use;
    }

    public user liatupdate(String id_calon) throws SQLException {
        String sql = "SELECT * FROM daftar WHERE id_calon ='" + id_calon + "' or email ='" + id_calon + "'";
        PreparedStatement pst = this.conn.prepareStatement(sql);
//        pst.setString(1, username);
//        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        user uset = new user();
        if (rs.next()) {
            //cd.setId(rs.getString(1));
            uset.setId_calon(rs.getString(1));
            uset.setUniv_id(rs.getString(2));
            uset.setJurusan(rs.getString(3));
            uset.setPendidikan(rs.getString(4));
            uset.setJumlah(rs.getString(5));
            uset.setEmail(rs.getString(6));
            uset.setDari(rs.getString(7));
            uset.setSampai(rs.getString(8));
              uset.setUnit(rs.getString(10));

        }
        return uset;
    }

    public List<univ> kueriuntukregis(String nama) throws SQLException {
        String sql = "SELECT * FROM `univ` WHERE nama like '%" + nama + "%'";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<univ> univ = new ArrayList<univ>();
        while (rs.next()) {
            univ uni = new univ();

            //cd.setId(rs.getString(1));
            uni.setUniv_id(rs.getString(1));
            uni.setUniv_nama(rs.getString(2));
            univ.add(uni);

        }
        return univ;

    }
//      public user kueriuntukliat(String id_calon) throws SQLException {
//     String sql = "SELECT * FROM `daftar` order by id_calon asc";
//             PreparedStatement pst = this.conn.prepareStatement(sql);
////        pst.setString(1, username);
////        pst.setString(2, password);
//
//        ResultSet rs = pst.executeQuery();
//        user use = new user();
//        if (rs.next()) {
//            //cd.setId(rs.getString(1));
//               use.setId_calon(rs.getString(1));
//            use.setUniv_id(rs.getString(2));
//            use.setJurusan(rs.getString(3));
//            use.setPendidikan(rs.getString(4));
//            use.setJumlah(rs.getString(5));
//            use.setEmail(rs.getString(6));
//            use.setDari(rs.getString(7));
//            use.setSampai(rs.getString(8));
//
//        }
//        return use;
//    }
    public List<user> kueriuntukadmin(String nama) throws SQLException {
        //  List<user> kas = new ArrayList<user>();
        String sql = "SELECT * FROM daftar order by id_calon asc";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<user> userr = new ArrayList<user>();
        while (rs.next()) {
            user use = new user();

            //cd.setId(rs.getString(1));
            use.setId_calon(rs.getString(1));
            use.setUniv_id(rs.getString(2));
            use.setJurusan(rs.getString(3));
            use.setPendidikan(rs.getString(4));
            use.setJumlah(rs.getString(5));
            use.setEmail(rs.getString(6));
            use.setDari(rs.getString(7));
            use.setSampai(rs.getString(8));
            use.setHasil(rs.getString(9));
            use.setUnit(rs.getString(10));
            userr.add(use);

        }
        return userr;

    }

    public List<user> kueriuntukadmin1(String nama) throws SQLException {
        //  List<user> kas = new ArrayList<user>();
        String sql = "SELECT * FROM daftar WHERE unit like '%" + nama + "%'";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<user> userr = new ArrayList<user>();
        while (rs.next()) {
            user use = new user();

            //cd.setId(rs.getString(1));
            use.setId_calon(rs.getString(1));
            use.setUniv_id(rs.getString(2));
            use.setJurusan(rs.getString(3));
            use.setPendidikan(rs.getString(4));
            use.setJumlah(rs.getString(5));
            use.setEmail(rs.getString(6));
            use.setDari(rs.getString(7));
            use.setSampai(rs.getString(8));
            use.setHasil(rs.getString(9));
            use.setUnit(rs.getString(10));
            userr.add(use);

        }
        return userr;

    }
    public List<pkl> kueriuntukpklpem(String nama) throws SQLException {
        //  List<user> kas = new ArrayList<user>();
        String sql = "SELECT * FROM daftarulang WHERE id_calon ='"+nama+"' ";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<pkl> userr = new ArrayList<pkl>();
        while (rs.next()) {
            pkl use = new pkl();

            //cd.setId(rs.getString(1));
            use.setId_calon(rs.getString(1));
            use.setId_peserta(rs.getString(2));
            use.setNama_perserta(rs.getString(3));
            use.setEmail(rs.getString(4));
            use.setTgllahir(rs.getString(5));
            use.setTelepon(rs.getString(6));
            use.setAlamat(rs.getString(7));
            use.setUniv_id(rs.getString(8));
            use.setJurusan(rs.getString(9));
            use.setTingkatpendidikan(rs.getString(10));
            use.setUnit(rs.getString(11)); 
            userr.add(use);

        }
        return userr;

    }
    public List<pkl> kueriuntukpkl1(String nama) throws SQLException {
        //  List<user> kas = new ArrayList<user>();
        
        String sql = "SELECT * FROM daftarulang ";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<pkl> userr = new ArrayList<pkl>();
        while (rs.next()) {
            pkl use = new pkl();

            //cd.setId(rs.getString(1));
            use.setId_calon(rs.getString(1));
            use.setId_peserta(rs.getString(2));
            use.setNama_perserta(rs.getString(3));
            use.setEmail(rs.getString(4));
            use.setTgllahir(rs.getString(5));
            use.setTelepon(rs.getString(6));
            use.setAlamat(rs.getString(7));
            use.setUniv_id(rs.getString(8));
            use.setJurusan(rs.getString(9));
            use.setTingkatpendidikan(rs.getString(10));
            use.setUnit(rs.getString(11)); 
            userr.add(use);

        }
        return userr;

    }

    public List<pkl> kueriuntukpkl(String nama) throws SQLException {
        //  List<user> kas = new ArrayList<user>();
        
        String sql = "SELECT * FROM daftarulang WHERE id_calon = '" + nama + "'";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<pkl> userr = new ArrayList<pkl>();
        while (rs.next()) {
            pkl use = new pkl();

            //cd.setId(rs.getString(1));
            use.setId_calon(rs.getString(1));
            use.setId_peserta(rs.getString(2));
            use.setNama_perserta(rs.getString(3));
            use.setEmail(rs.getString(4));
            use.setTgllahir(rs.getString(5));
            use.setTelepon(rs.getString(6));
            use.setAlamat(rs.getString(7));
            use.setUniv_id(rs.getString(8));
            use.setJurusan(rs.getString(9));
            use.setTingkatpendidikan(rs.getString(10));
            use.setUnit(rs.getString(11)); 
            userr.add(use);

        }
        return userr;

    }
    public List<nilai> kueriuntuknilai(String nama) throws SQLException {
        //  List<user> kas = new ArrayList<user>();
        String sql = "SELECT * FROM nilai WHERE unit like '%" + nama + "%'";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<nilai> userr = new ArrayList<nilai>();
        while (rs.next()) {
            nilai use = new nilai();

            //cd.setId(rs.getString(1));
            use.setId_anggota(rs.getString(1));
            use.setEmail(rs.getString(2));
            use.setUnit(rs.getString(3));
            use.setDisiplin(rs.getString(4));
            use.setAbsen(rs.getString(5));
            use.setTatatertib(rs.getString(6));
            use.setKeterampilan(rs.getString(7));
            use.setKualitas_hasil(rs.getString(8));
            use.setTanggungjawab(rs.getString(9));
            use.setBersosialisasi(rs.getString(10));
            use.setKerjasama(rs.getString(11));
            use.setKerajinan(rs.getString(12));
            use.setEtika(rs.getString(13));
            use.setPenampilan(rs.getString(14));
            use.setJumlah(rs.getString(15));
            use.setRata(rs.getString(16));

            userr.add(use);

        }
        return userr;

    }public List<waktu> kueriuntukabsenpem(String nama) throws SQLException {
        //  List<user> kas = new ArrayList<user>();
        String sql = "SELECT * FROM absen WHERE unit like '%" + nama + "%' or peserta = '"+nama+ "' ";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<waktu> userr = new ArrayList<waktu>();
        while (rs.next()) {
            waktu use = new waktu();

            //cd.setId(rs.getString(1));
            use.setId_absen(rs.getString(1));
            use.setTgl(rs.getString(2));
            use.setPeserta(rs.getString(3));
            use.setMasuk(rs.getString(4));
            use.setKeluar(rs.getString(5));
            use.setKeterangan(rs.getString(6));
             use.setUnit(rs.getString(7));

            userr.add(use);

        }
        return userr;

    }

    public List<waktu> kueriuntukabsen(String nama) throws SQLException {
        //  List<user> kas = new ArrayList<user>();
        String sql = "SELECT * FROM absen WHERE unit like '%" + nama + "%'";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<waktu> userr = new ArrayList<waktu>();
        while (rs.next()) {
            waktu use = new waktu();

            //cd.setId(rs.getString(1));
            use.setId_absen(rs.getString(1));
            use.setTgl(rs.getString(2));
            use.setPeserta(rs.getString(3));
            use.setMasuk(rs.getString(4));
            use.setKeluar(rs.getString(5));
            use.setKeterangan(rs.getString(6));

            userr.add(use);

        }
        return userr;

    }

    public List<user> kueriuntukupdate(String id_calon) throws SQLException {
        String sql = "SELECT * FROM `daftar` WHERE '" + id_calon + "'";

        PreparedStatement pstt = this.conn.prepareStatement(sql);
//        pst.setString(1, user);
//         pst.setString(2, pass);

        ResultSet rs = pstt.executeQuery();
        List<user> user = new ArrayList<user>();
        while (rs.next()) {
            user use = new user();

            //cd.setId(rs.getString(1));
            use.setId_calon(rs.getString(1));
            use.setUniv_id(rs.getString(2));
            use.setJurusan(rs.getString(3));
            use.setPendidikan(rs.getString(4));
            use.setJumlah(rs.getString(5));
            use.setEmail(rs.getString(6));
            use.setDari(rs.getString(7));
            use.setSampai(rs.getString(8));
            user.add(use);

        }
        return user;

    }
     public nilai liatnilai(String id_anggota) throws SQLException {
        String sql = "SELECT * FROM nilai WHERE id_anggota ='" + id_anggota + "'";
        PreparedStatement pst = this.conn.prepareStatement(sql);
//        pst.setString(1, username);
//        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        nilai use = new nilai();
        if (rs.next()) {
            //cd.setId(rs.getString(1));
            use.setId_anggota(rs.getString(1));
            use.setEmail(rs.getString(2));
            use.setUnit(rs.getString(3));
            use.setDisiplin(rs.getString(4));
            use.setAbsen(rs.getString(5));
            use.setTatatertib(rs.getString(6));
            use.setKeterampilan(rs.getString(7));
            use.setKualitas_hasil(rs.getString(8));
            use.setTanggungjawab(rs.getString(9));
            use.setBersosialisasi(rs.getString(10));
            use.setKerjasama(rs.getString(11));
            use.setKerajinan(rs.getString(12));
            use.setEtika(rs.getString(13));
            use.setPenampilan(rs.getString(14));
            use.setJumlah(rs.getString(15));
            use.setRata(rs.getString(16));
            
        }
        return use;
    }

//    public user kueryuntukdaftar(String id_calon, String univ_id, String jurusan, String pendidikan, String jumlah, String email, String dari, String sampai) throws SQLException {
//        //String sql = "SELECT * FROM loginadmin WHERE username ='"+user+"' and password='"+pass+"'";
//        String sql = "INSERT INTO daftar values id_calon = '" + id_calon + "',univ_id = '" + univ_id + "',jurusan = '" + jurusan + "'pendidikan = '" + pendidikan + "'jumlah = '" + jumlah + "',email = '" + email + "',dari = '" + dari + "'sampai = '" + sampai + "'";
//        PreparedStatement pst = this.conn.prepareStatement(sql);
////        pst.setString(1, id_calon);
////        pst.setString(2, univ_id);
////        pst.setString(3, jurusan);
////        pst.setString(4, pendidikan);
////        pst.setString(5, jumlah);
////        pst.setString(6, email);
////        pst.setString(7, dari);
////        pst.setString(8, sampai);
//
//         PreparedStatement st = this.conn.prepareStatement(sql);
//        st.executeUpdate(sql);
//        st.close();
//        
//    }
}
