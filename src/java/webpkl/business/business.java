/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webpkl.business;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import webpkl.connection.DBConnection;
import webpkl.dao.dao;
import webpkl.domain.login;
import webpkl.domain.nilai;
import webpkl.domain.pkl;
import webpkl.domain.univ;
import webpkl.domain.user;
import webpkl.domain.waktu;

/**
 *
 * @author tes
 */
public class business {

    public business() {
    }

    public login isiBusiness(String username, String password) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        login isinya;
        dao dao = new dao(dbConn.getConnection());
        isinya = dao.kueriUntukLogin(username, password);

        return isinya;
    }

    public user hip(String email) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        user isinya;
        dao dao = new dao(dbConn.getConnection());
        isinya = dao.hil(email);

        return isinya;
    }

    public user updatee(String id_calon) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        user isinya;
        dao dao = new dao(dbConn.getConnection());
        isinya = dao.liatupdate(id_calon);

        return isinya;
    }

    public nilai nilaie(String id_anggota) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        nilai isinya;
        dao dao = new dao(dbConn.getConnection());
        isinya = dao.nilaie(id_anggota);

        return isinya;
    }

    public pkl upp(String id_peserta) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        pkl isinya;
        dao dao = new dao(dbConn.getConnection());
        isinya = dao.liatop(id_peserta);

        return isinya;
    }

    public nilai liatnili(String id_anggota) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        nilai isinya;
        dao dao = new dao(dbConn.getConnection());
        isinya = dao.liatnilai(id_anggota);

        return isinya;
    }
//       public user daftarj(String id_calon, String univ_id, String jurusan, String pendidikan, String jumlah, String email, String dari, String sampai)throws SQLException {
//        
//       DBConnection dbConn = DBConnection.getInstance();
//        user isiya;
//        String berhasil = "FIRST USER DATA Berhasil di INSERT";
//        dao dao = new dao(dbConn.getConnection());
//        isiya = dao.kueryuntukdaftar(id_calon, univ_id,jurusan,pendidikan,jumlah,email,dari,sampai);
//
//        return isiya;
//    }

    public List<univ> isiuniv(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        List<univ> isinya;
        dao dao = new dao(dbConn.getConnection());
        isinya = dao.kueriuntukregis(nama);

        return isinya;
    }

    public List<user> isiupdate(String id_calon) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        List<user> up;
        dao dao = new dao(dbConn.getConnection());
        up = dao.kueriuntukupdate(id_calon);

        return up;
    }

//       public user liat(String id_calon) throws SQLException {
//        
//       DBConnection dbConn = DBConnection.getInstance();
//        user isina;
//        dao dao = new dao(dbConn.getConnection());
//        isina = dao.kueriuntukliat(id_calon);
//tampildaftar
//        return isina;
//    }
    public List<user> tampiltabel1(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        // List<user> liaat;
        List<user> apanya = new ArrayList<user>();
        dao dao = new dao(dbConn.getConnection());
        apanya = dao.kueriuntukadmin1(nama);

        return apanya;
    }
    public List<user> tampiltabel(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        // List<user> liaat;
        List<user> apanya = new ArrayList<user>();
        dao dao = new dao(dbConn.getConnection());
        apanya = dao.kueriuntukadmin(nama);

        return apanya;
    }

    public List<pkl> tampilpklpem(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        // List<user> liaat;
        List<pkl> apanya = new ArrayList<pkl>();
        dao dao = new dao(dbConn.getConnection());
        apanya = dao.kueriuntukpklpem(nama);

        return apanya;
    }
      public List<pkl> tampilpkl1(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        // List<user> liaat;
        List<pkl> apanya = new ArrayList<pkl>();
        dao dao = new dao(dbConn.getConnection());
        apanya = dao.kueriuntukpkl1(nama);

        return apanya;
    }
    public List<pkl> tampilpkl(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        // List<user> liaat;
        List<pkl> apanya = new ArrayList<pkl>();
        dao dao = new dao(dbConn.getConnection());
        apanya = dao.kueriuntukpkl(nama);

        return apanya;
    }

    public List<waktu> tampilabsenpem(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        // List<user> liaat;
        List<waktu> apanya = new ArrayList<waktu>();
        dao dao = new dao(dbConn.getConnection());
        apanya = dao.kueriuntukabsenpem(nama);

        return apanya;
    }

    public List<waktu> tampilabsen(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        // List<user> liaat;
        List<waktu> apanya = new ArrayList<waktu>();
        dao dao = new dao(dbConn.getConnection());
        apanya = dao.kueriuntukabsen(nama);

        return apanya;
    }

    public List<nilai> tampilnilai(String nama) throws SQLException {

        DBConnection dbConn = DBConnection.getInstance();
        // List<user> liaat;
        List<nilai> apanya = new ArrayList<nilai>();
        dao dao = new dao(dbConn.getConnection());
        apanya = dao.kueriuntuknilai(nama);

        return apanya;
    }
}
