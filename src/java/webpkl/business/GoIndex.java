/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webpkl.business;

import webpkl.connection.DBConnection;
import webpkl.dao.registrationFormSubmit;

/**
 *
 * @author pc
 */
public class GoIndex {

    public GoIndex() {
    }

    public String getInsertFirstlyUserData(String id_calon, String univ_id, String jurusan, String pendidikan, String jumlah, String email, String dari, String sampai) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

        String _id_calon = id_calon; //id user
        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
        String _pendidikan = pendidikan; //firstName
        //String _namaBelakang = pendidikan; //lastName
        String _jumlah = jumlah; //emailAddress
        String _email = email; //mobile
        String _dari = dari;
        String _sampai = sampai;
        if (id_calon == null) {
            id_calon = "0";
        }

        try {
            if (!id_calon.equals("0")) {
                rfs.InsertFirstlyUserData(_id_calon, _univ_id, _jurusan, _pendidikan, _jumlah, _email, _dari, _sampai);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }

    public String ayodaftar(String id_calon, String id_peserta, String nama_peserta, String email, String tgllahir, String telepon, String alamat, String univ_id, String jurusan, String tingkatpendidikan,String unit) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());
        String _unit= unit;
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
        if (id_calon == null) {
            id_calon = "0";
        }

        try {
            if (!id_calon.equals("0")) {
                rfs.insertdaftar(_id_calon, _id_peserta, _nama_peserta, _email, _tgllahir, _telepon, _alamat, _univ_id, _jurusan, _tingkatpendidikan,_unit);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
 public String au(String id_calon,String id_peserta, String nama_peserta, String email,String tgllahir,String telepon,String alamat,String univ_id,String jurusan,String tingkatpendidikan) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

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

        if (_id_peserta == null) {
            id_peserta = "0";
        }

        try {
            if (!id_peserta.equals("0")) {
                rfs.ang(_id_calon, _id_peserta, _nama_peserta, _email, _tgllahir, _telepon, _alamat, _univ_id, _jurusan, _tingkatpendidikan);
          }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
    public String updates(String id_calon, String univ_id, String jurusan, String pendidikan, String jumlah, String email, String dari, String sampai) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

        String _id_calon = id_calon; //id user
        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
        String _pendidikan = pendidikan; //firstName
        //String _namaBelakang = pendidikan; //lastName
        String _jumlah = jumlah; //emailAddress
        String _email = email; //mobile
        String _dari = dari;
        String _sampai = sampai;
        if (id_calon == null) {
            id_calon = "0";
        }

        try {
            if (!id_calon.equals("0")) {
                rfs.upl(_id_calon, _univ_id, _jurusan, _pendidikan, _jumlah, _email, _dari, _sampai);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
    public String delnilai(String id_anggota) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

        String _id_anggota = id_anggota; //id user
//        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
//        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
//        String _pendidikan = pendidikan; //firstName
//        //String _namaBelakang = pendidikan; //lastName
//        String _jumlah = jumlah; //emailAddress
//        String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (id_anggota == null) {
            id_anggota = "0";
        }

        try {
            if (!id_anggota.equals("0")) {
                rfs.nilaihapus(_id_anggota);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
    public String deli(String id_peserta) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

        String _id_peserta = id_peserta; //id user
//        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
//        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
//        String _pendidikan = pendidikan; //firstName
//        //String _namaBelakang = pendidikan; //lastName
//        String _jumlah = jumlah; //emailAddress
//        String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (id_peserta == null) {
            id_peserta = "0";
        }

        try {
            if (!id_peserta.equals("0")) {
                rfs.dll(_id_peserta);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }

    public String del(String id_calon) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

        String _id_calon = id_calon; //id user
//        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
//        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
//        String _pendidikan = pendidikan; //firstName
//        //String _namaBelakang = pendidikan; //lastName
//        String _jumlah = jumlah; //emailAddress
//        String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (id_calon == null) {
            id_calon = "0";
        }

        try {
            if (!id_calon.equals("0")) {
                rfs.dell(_id_calon);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
    public String acce(String id_calon) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

        String _id_calon = id_calon; //id user
//        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
//        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
//        String _pendidikan = pendidikan; //firstName
//        //String _namaBelakang = pendidikan; //lastName
//        String _jumlah = jumlah; //emailAddress
    //    String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (_id_calon == null) {
            id_calon = "0";
        }

        try {
            if (!id_calon.equals("0")) {
                rfs.accer(_id_calon);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
    public String tolak(String id_calon) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

        String _id_calon = id_calon; //id user
//        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
//        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
//        String _pendidikan = pendidikan; //firstName
//        //String _namaBelakang = pendidikan; //lastName
//        String _jumlah = jumlah; //emailAddress
    //    String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (_id_calon == null) {
            id_calon = "0";
        }

        try {
            if (!id_calon.equals("0")) {
                rfs.tol(_id_calon);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
      public String ulangnih(String id_peserta,String email) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

      String _id_peserta = id_peserta; //id user
     // String _id_peserta = id_peserta;
//        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
//        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
//        String _pendidikan = pendidikan; //firstName
//        //String _namaBelakang = pendidikan; //lastName
      // String _unit = unit; //emailAddress
        String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (_id_peserta == null) {
            id_peserta = "0";
        }

        try {
            if (!id_peserta.equals("0")) {
                rfs.ulangni(_id_peserta,_email);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
       public String aktif(String id_calon,String email,String unit) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());

      String _id_calon = id_calon; //id user
     // String _id_peserta = id_peserta;
//        String _univ_id = univ_id; //idType ==> jenisnya NIK/NIP/Reg
//        String _jurusan = jurusan; //idNumber ==> nonya NIK/NIP/Reg
//        String _pendidikan = pendidikan; //firstName
//        //String _namaBelakang = pendidikan; //lastName
       String _unit = unit; //emailAddress
        String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (_id_calon == null) {
            id_calon = "0";
        }

        try {
            if (!id_calon.equals("0")) {
                rfs.akt(_id_calon,_email,_unit);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
        public String masuk(String no,String tgl ,String usernih, String jam, String gg) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());
        String _no = no;
        String _jam = jam; //id user
        String _tgl = tgl;
        String _id_peserta = usernih; //idType ==> jenisnya NIK/NIP/Reg
        String _gg = gg; //idNumber ==> nonya NIK/NIP/Reg
//        String _pendidikan = pendidikan; //firstName
//        //String _namaBelakang = pendidikan; //lastName
//        String _jumlah = jumlah; //emailAddress
    //    String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (_no == null) {
            no = "0";
        }

        try {
            if (!no.equals("0")) {
                rfs.masukk(_no,_tgl,_id_peserta,_jam,_gg);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
         public String keluar(String no, String tgl,String usernih, String jam,String harian) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());
        String _harian = harian;
        String _jam = jam; //id user
        String _id_peserta = usernih; //idType ==> jenisnya NIK/NIP/Reg
        String _tgl = tgl; //idNumber ==> nonya NIK/NIP/Reg
      String _no = no; //firstName
//        //String _namaBelakang = pendidikan; //lastName
//        String _jumlah = jumlah; //emailAddress
    //    String _email = email; //mobile
//        String _dari = dari;
//        String _sampai = sampai;
        if (_no == null) {
            no = "0";
        }

        try {
            if (!no.equals("0")) {
                rfs.keluarr(_no,_tgl,_id_peserta,_jam,_harian);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
           public String nila(String e1,String e2,String e3,String e4,String e5,String e6,String e7,String e8,String e9,String e10,String e11,String e12,String e13,int jumlah,int rata) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());
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
        if (_e1 == null) {
            e1 = "0";
        }

        try {
            if (!e1.equals("0")) {
                rfs.nilai(_e1,_e2,_e3,_e4,_e5,_e6,_e7,_e8,_e9,_e10,_e11,_e12,_e13,_e14,_e15);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
           public String nilakosong(String e1,String e2, String e3) {

        DBConnection dbConn = DBConnection.getInstance();
        String berhasil = "FIRST USER DATA Berhasil di INSERT";
        registrationFormSubmit rfs = new registrationFormSubmit(dbConn.getConnection());
       String _e1 = e1;
        String _e2 = e2;
        String _e3 = e3;
       
        if (_e1 == null) {
            e1 = "0";
        }

        try {
            if (!e1.equals("0")) {
                rfs.nilaikosong(_e1,_e2,_e3);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.closeConnection();
        }

        return berhasil;
    }
}
