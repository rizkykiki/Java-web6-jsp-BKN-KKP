/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webpkl.controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;
import webpkl.business.business;
import webpkl.domain.login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import webpkl.business.GoIndex;
import webpkl.business.userId;
import webpkl.domain.nilai;
import webpkl.domain.univ;
import webpkl.domain.user;
import webpkl.domain.pkl;
import webpkl.domain.waktu;

/**
 *
 * @author kurniawan
 */
@Controller
public class controller {

    //bridging JSP ke JAVA
    //jembatan
    @RequestMapping(value = "/index.dpt", method = RequestMethod.GET)
    public String index(ModelMap model) {

        return "index";
    }

    //admin --> tabel nilai
     @RequestMapping(value = "/absen1.dpt", method = RequestMethod.GET)
    public String absen1(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String nama = request.getParameter("nama");
        business u = new business();
        List<waktu> ab = new ArrayList<waktu>();
        ab = u.tampilabsen(nama);

        model.addAttribute("ab", ab);
   
        return "absen1";
    }
    @RequestMapping(value = "/absen.dpt", method = RequestMethod.GET)
    public String absen(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
      //  String nama = request.getParameter("nama");
//        business u = new business();
//        List<waktu> ab = new ArrayList<waktu>();
//        ab = u.tampilabsen(nama);
//
//        model.addAttribute("ab", ab);
    String nama = request.getParameter("nama");
        business u = new business();
        List<user> ab = new ArrayList<user>();
        ab = u.tampiltabel(nama);

        model.addAttribute("ab", ab);
        return "absen";
    }

    @RequestMapping(value = "/absenpem.dpt", method = RequestMethod.POST)
    public String absenpem(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String nama = request.getParameter("nama");
        String id = request.getParameter("q2");
        model.addAttribute("q1", id);
        business u = new business();
        List<waktu> ab = new ArrayList<waktu>();
        ab = u.tampilabsenpem(id);

        model.addAttribute("ab", ab);
        return "absenpem";
    }

    //admin --> tabel nilai
    @RequestMapping(value = "/editnilai.dpt", method = RequestMethod.POST)
    public String editnilai(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String id = request.getParameter("q2");
        model.addAttribute("q1", id);
        String nama = request.getParameter("nama");
        business u = new business();
        List<nilai> nil = new ArrayList<nilai>();
        nil = u.tampilnilai(id);

        model.addAttribute("nil", nil);

        return "editnilai";
    }

    //admin --> tabel nilai --> rincian nilai --> eksekusi
    @RequestMapping(value = "/endnilai.dpt", method = RequestMethod.POST)
    public String endnilai(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        if (request.getParameter("update") != null) {

            String e1 = request.getParameter("e1");
            String e2 = request.getParameter("e2");
            String e3 = request.getParameter("e3");
            String e4 = request.getParameter("e4");
            String e5 = request.getParameter("e5");
            String e6 = request.getParameter("e6");

            String e7 = request.getParameter("e7");
            String e8 = request.getParameter("e8");
            String e9 = request.getParameter("e9");
            String e10 = request.getParameter("e10");

            String e11 = request.getParameter("e11");
            String e12 = request.getParameter("e12");
            String e13 = request.getParameter("e13");
            String e14 = request.getParameter("e14");
            String e15 = request.getParameter("e15");
            int a1 = Integer.parseInt(e3);
            int a2 = Integer.parseInt(e4);
            int a3 = Integer.parseInt(e5);
            int a4 = Integer.parseInt(e6);
            int a5 = Integer.parseInt(e7);
            int a6 = Integer.parseInt(e8);
            int a7 = Integer.parseInt(e9);
            int a8 = Integer.parseInt(e10);
            int a9 = Integer.parseInt(e11);
            int a10 = Integer.parseInt(e12);
            int a11 = Integer.parseInt(e13);
            int jumlah = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11;
            int rata = jumlah / 11;

            String ud = new GoIndex().nila(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, jumlah, rata);
            String i = "SUKSES merubah";
            model.addAttribute("sukses", i);
            return "index";

        }
        if (request.getParameter("hapus") != null) {

            String id_anggota = request.getParameter("e1");

            String ud = new GoIndex().delnilai(id_anggota);

            String i = "SUKSES delete";
            model.addAttribute("sukses", i);
            return "index";

        }
        return "index";
    }

    //admin --> tabel nilai --> rincian nilai 
    @RequestMapping(value = "/opsinilai.dpt", method = RequestMethod.GET)
    public String opsinilai(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String id_anggota = request.getParameter("id_anggota");

        business b = new business();
        b.nilaie(id_anggota);
        nilai isinya = b.nilaie(id_anggota);

        String u1 = isinya.getId_anggota();
        String u2 = isinya.getEmail();
        String u3 = isinya.getDisiplin();
        String u4 = isinya.getAbsen();
        String u5 = isinya.getTatatertib();
        String u6 = isinya.getKeterampilan();
        String u7 = isinya.getKualitas_hasil();
        String u8 = isinya.getTanggungjawab();
        String u9 = isinya.getBersosialisasi();
        String u10 = isinya.getKerjasama();
        String u11 = isinya.getKerajinan();
        String u12 = isinya.getEtika();
        String u13 = isinya.getPenampilan();
        String u14 = isinya.getJumlah();
        String u15 = isinya.getRata();
        model.addAttribute("u1", u1);
        model.addAttribute("u2", u2);
        model.addAttribute("u3", u3);
        model.addAttribute("u4", u4);
        model.addAttribute("u5", u5);
        model.addAttribute("u6", u6);
        model.addAttribute("u7", u7);
        model.addAttribute("u8", u8);
        model.addAttribute("u7", u7);
        model.addAttribute("u8", u8);
        model.addAttribute("u9", u9);
        model.addAttribute("u10", u10);
        model.addAttribute("u11", u11);
        model.addAttribute("u12", u12);
        model.addAttribute("u13", u13);
        model.addAttribute("u14", u14);
        model.addAttribute("u15", u15);

        return "opsinilai";
    }
    //admin --> tabel anggota 
     @RequestMapping(value = "/anggotaadmin1.dpt", method = RequestMethod.GET)
    public String anggotaadmin1(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String nama = request.getParameter("nama");
        business u = new business();
        List<pkl> pk = new ArrayList<pkl>();
        pk = u.tampilpkl(nama);

        model.addAttribute("pkl", pk);

        return "anggotaadmin";
    }
     @RequestMapping(value = "/homepem1.dpt", method = RequestMethod.GET)
    public String homepem1(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String nama = request.getParameter("nama");
        String id = request.getParameter("q2");
        model.addAttribute("q1", id);
        business u = new business();
        List<pkl> pk = new ArrayList<pkl>();
        pk = u.tampilpklpem(nama);

        model.addAttribute("pkl", pk);

        return "homepem";
    }

    @RequestMapping(value = "/anggotaadmin.dpt", method = RequestMethod.GET)
    public String anggotaadmin(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String nama = request.getParameter("nama");
        business u = new business();
        List<pkl> pk = new ArrayList<pkl>();
        pk = u.tampilpkl1(nama);

        model.addAttribute("pkl", pk);

        return "anggotaadmin";
    }

    @RequestMapping(value = "/daftarulang.dpt", method = RequestMethod.GET)
    public String daftarulang(ModelMap model) {

        return "daftarulang";
    }

    @RequestMapping(value = "/regiscln.dpt", method = RequestMethod.GET)
    public String regiscln(ModelMap model) {

        return "regiscln";
    }

    @RequestMapping(value = "/adminnilai.dpt", method = RequestMethod.GET)
    public String adminnilai(ModelMap model) {

        return "adminnilai";
    }

    @RequestMapping(value = "/logincln.dpt", method = RequestMethod.GET)
    public String logincln(ModelMap model) {

        return "logincln";
    }

    

    @RequestMapping(value = "/homepkl.dpt", method = RequestMethod.GET)
    public String homepkl(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String id_peserta = request.getParameter("id");
        String usernih = request.getParameter("namauser");
        String harian = request.getParameter("harian");
        String no = request.getParameter("no");
        String aa = request.getParameter("aa");
        String bb = request.getParameter("bb");
        String gg = request.getParameter("gg");
        model.addAttribute("gg", gg);
        model.addAttribute("namauser", usernih);
        model.addAttribute("id", id_peserta);
        model.addAttribute("no", no);
       business o = new business();
        List<waktu> ab = new ArrayList<waktu>();
        ab = o.tampilabsenpem(usernih);

        model.addAttribute("ab", ab);
        return "homepkl";
    }

    @RequestMapping(value = "/updatepkl.dpt", method = RequestMethod.GET)
    public String updatepkl(ModelMap model) {

        return "updatepkl";
    }

    @RequestMapping(value = "/hasil.dpt", method = RequestMethod.GET)
    public String hasil(ModelMap model) {

        return "hasil";
    }

    @RequestMapping(value = "/nilaipkl.dpt", method = RequestMethod.GET)
    public String nilaipkl(ModelMap model) {

        return "nilaipkl";
    }

    @RequestMapping(value = "/pertama.dpt", method = RequestMethod.GET)
    public String pertama(ModelMap model) {

        return "pertama";
    }

    //admin --> tabel pendaftar 
    @RequestMapping(value = "/homeadmin.dpt", method = RequestMethod.GET)
    public String homeadmin(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        business b = new business();
        b.isiBusiness(username, password);

        login isinya = b.isiBusiness(username, password);
        isinya.getUsername();
        String pkl = "login sebagai PKL";
        String admin = "login sebagi admin";
        String usernih = isinya.getUsername();
        model.addAttribute("namauser", usernih);
        model.addAttribute("adminnih", admin);

        String nama = request.getParameter("nama");
        business u = new business();
        List<user> ayo = new ArrayList<user>();
        ayo = u.tampiltabel(nama);

        model.addAttribute("ini", ayo);
        return "homeadmin";
    }

    @RequestMapping(value = "/cek.dpt", method = RequestMethod.GET)
    public String cek(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {

        return "cek";
    }

    @RequestMapping(value = "/homepem.dpt", method = RequestMethod.POST)
    public String homepem(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String id = request.getParameter("q2");
        model.addAttribute("q1", id);
      business u = new business();
            List<user> ayo = new ArrayList<user>();
            ayo = u.tampiltabel1(id);

            model.addAttribute("ini", ayo);

            return "pembimbing";
    }

    //login
    @RequestMapping(value = "/login.dpt", method = RequestMethod.POST)
    public String login(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        business b = new business();
        b.isiBusiness(username, password);
        b.upp(username);
        pkl ti = b.upp(username);
        login isinya = b.isiBusiness(username, password);
        isinya.getUsername();
        String pkl = "login sebagai PKL";
        String admin = "login sebagi admin";
        String usernih = isinya.getUsername();
        String passnih = isinya.getPassword();
        String bb = ti.getTgllahir();
        String id = isinya.getId_peseta();
        String aa = ti.getNama_perserta();
        String dpt = "masuk gagal";
        String kew = isinya.getKewenangan();
        String gg = ti.getUnit();
        // 1 pkl 2 pakdidi 3 pakdipta 4 calon

        if ("1".equals(kew)) {
            model.addAttribute("namauser", usernih);
            model.addAttribute("mm", pkl);
            model.addAttribute("id", id);
            userId u = new userId();
            String absen = u.userDataId();
            model.addAttribute("aa", aa);
            model.addAttribute("bb", bb);
            model.addAttribute("no", absen);
            model.addAttribute("gg", gg);
           business o = new business();
        List<waktu> ab = new ArrayList<waktu>();
        ab = o.tampilabsenpem(usernih);

        model.addAttribute("ab", ab);
//               Date currentdate = new Date();
//        DateFormat modifiedDate= new SimpleDateFormat("dd-MM-yyyy"); 

            return "homepkl";
        } else if ("2".equals(kew)) {
            model.addAttribute("namauser", usernih);
            model.addAttribute("adminnih", admin);

            String nama = request.getParameter("nama");
            business u = new business();
            List<user> ayo = new ArrayList<user>();
            ayo = u.tampiltabel(nama);

            model.addAttribute("ini", ayo);
            return "homeadmin";

            //layaknya pak didi
            //waktu acc --> sekalian pilih unit penempatan PKL cont "Direktorat a,"
            /*
            else if(3)
            pembimbing
            username, password, unit kerjanya
            
            tampil tabel daftar mahasiswa PKL yg di acc ke unit kerja ybs
             */
        } else if ("3".equals(kew)) {
            //pakdipta
            model.addAttribute("q1", id);
//            business u = new business();
//            List<pkl> pk = new ArrayList<pkl>();
//            pk = u.tampilpklpem(id);
//
//            model.addAttribute("pkl", pk);
 business u = new business();
            List<user> ayo = new ArrayList<user>();
            ayo = u.tampiltabel1(id);

            model.addAttribute("ini", ayo);

            return "pembimbing";
        } else if ("4".equals(kew)) {
            //calon

            String id_calon = request.getParameter("id_calon");
            business c = new business();
            c.updatee(username);
            user isi = c.updatee(username);
            String u1 = isi.getId_calon();
            String u2 = isi.getUniv_id();
            String u3 = isi.getJurusan();
            String u4 = isi.getPendidikan();
            String u10 = isi.getUnit();
            String u12 = isi.getEmail();
            model.addAttribute("u1", u1);
            model.addAttribute("u12", u12);
            model.addAttribute("u2", u2);
            model.addAttribute("u3", u3);
            model.addAttribute("u4", u4);
            model.addAttribute("u10", u10);
            userId u = new userId();
            String id_pkl = u.userDataId();
            model.addAttribute("u5", id_pkl);
            return "daftarulang";
        } else {

            String i = "login gagal (user tidak ada)";
            model.addAttribute("sukses", i);
            return "index";
        }

    }

    //pkl --> homepkl --> eksekusi
    @RequestMapping(value = "/absenin.dpt", method = RequestMethod.POST)
    public String absenin(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        String id_peserta = request.getParameter("id");
        String usernih = request.getParameter("namauser");
        String harian = request.getParameter("harian");
        String no = request.getParameter("no");
        String aa = request.getParameter("aa");
        String bb = request.getParameter("bb");
        String gg = request.getParameter("gg");
        model.addAttribute("gg", gg);
        model.addAttribute("namauser", usernih);
        model.addAttribute("id", id_peserta);
        model.addAttribute("no", no);
       business o = new business();
        List<waktu> ab = new ArrayList<waktu>();
        ab = o.tampilabsenpem(usernih);

        model.addAttribute("ab", ab);
        if (request.getParameter("masuk") != null) {

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat jar = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            // System.out.println( sdf.format(cal.getTime()) );
            // model.addAttribute("date", );

            // String no1= no.toString();
            String jam = jar.format(cal.getTime());
            String tgl = sdf.format(cal.getTime());

            String ud = new GoIndex().masuk(no, tgl, usernih, jam, gg);
           
        ab = o.tampilabsenpem(usernih);

        model.addAttribute("ab", ab);

            return "homepkl";

        }
        if (request.getParameter("keluar") != null) {

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat jar = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            // System.out.println( sdf.format(cal.getTime()) );
            // model.addAttribute("date", );

            // String no1= no.toString();
            String jam = jar.format(cal.getTime());
            String tgl = sdf.format(cal.getTime());
            if (harian == null || "".equals(harian) || " ".equals(harian)){
                model.addAttribute("g","tugas gaboleh kosong");
            }else{
                 String ud = new GoIndex().keluar(no, tgl, usernih, jam, harian);
            ab = o.tampilabsenpem(usernih);
              model.addAttribute("ab", ab);
            }

           

            return "homepkl";
        }
        if (request.getParameter("nii") != null) {
            String id_anggota = id_peserta;

            model.addAttribute("aa", aa);
            model.addAttribute("namauser", usernih);
            model.addAttribute("id", id_peserta);
            model.addAttribute("no", no);
            model.addAttribute("aa", aa);
            model.addAttribute("bb", bb);
            business b = new business();
            b.liatnili(id_anggota);
            nilai isinya = b.liatnili(id_anggota);
            String s1 = isinya.getId_anggota();
            String s2 = isinya.getEmail();
            String s3 = isinya.getDisiplin();
            String s4 = isinya.getAbsen();
            String s5 = isinya.getTatatertib();
            String s6 = isinya.getKeterampilan();
            String s7 = isinya.getKualitas_hasil();
            String s8 = isinya.getTanggungjawab();
            String s9 = isinya.getBersosialisasi();
            String s10 = isinya.getKerjasama();
            String s11 = isinya.getKerajinan();
            String s12 = isinya.getEtika();
            String s13 = isinya.getPenampilan();
            String s14 = isinya.getJumlah();
            String s15 = isinya.getRata();

            int a1 = Integer.parseInt(s3);
            int a2 = Integer.parseInt(s4);
            int a3 = Integer.parseInt(s5);
            int a4 = Integer.parseInt(s6);
            int a5 = Integer.parseInt(s7);
            int a6 = Integer.parseInt(s8);
            int a7 = Integer.parseInt(s9);
            int a8 = Integer.parseInt(s10);
            int a9 = Integer.parseInt(s11);
            int a10 = Integer.parseInt(s12);
            int a11 = Integer.parseInt(s13);
            int a12 = Integer.parseInt(s15);
//            int jumlah = a1+a2+a3+a4+a5+a6+a7+a8+a9+a10+a11;
//            int rata = jumlah/11;
            model.addAttribute("s1", s1);
            model.addAttribute("s2", s2);
            model.addAttribute("s3", s3);
            model.addAttribute("s4", s4);
            model.addAttribute("s5", s5);
            model.addAttribute("s6", s6);
            model.addAttribute("s7", s7);
            model.addAttribute("s8", s8);
            model.addAttribute("s7", s7);
            model.addAttribute("s8", s8);
            model.addAttribute("s9", s9);
            model.addAttribute("s10", s10);
            model.addAttribute("s11", s11);
            model.addAttribute("s12", s12);
            model.addAttribute("s13", s13);
            model.addAttribute("s14", s14);
            model.addAttribute("s15", s15);
            if (a1 >= 86) {
                model.addAttribute("q1", "A");
            } else if ((a1 <= 85) && (a1 >= 70)) {
                model.addAttribute("q1", "B");
            } else if ((a1 <= 69) && (a1 >= 55)) {
                model.addAttribute("q1", "C");
            } else if ((a1 <= 54) && (a1 >= 10)) {
                model.addAttribute("q1", "D");
            } else {
                model.addAttribute("q1", "E");
            }
            if (a2 >= 86) {
                model.addAttribute("q2", "A");
            } else if ((a2 <= 85) && (a2 >= 70)) {
                model.addAttribute("q2", "B");
            } else if ((a2 <= 69) && (a2 >= 55)) {
                model.addAttribute("q2", "C");
            } else if ((a2 <= 54) && (a2 >= 10)) {
                model.addAttribute("q2", "D");
            } else {
                model.addAttribute("q2", "E");
            }
            if (a3 >= 86) {
                model.addAttribute("q3", "A");
            } else if ((a3 <= 85) && (a3 >= 70)) {
                model.addAttribute("q3", "B");
            } else if ((a3 <= 69) && (a3 >= 55)) {
                model.addAttribute("q3", "C");
            } else if ((a3 <= 54) && (a3 >= 10)) {
                model.addAttribute("q3", "D");
            } else {
                model.addAttribute("q3", "E");
            }
            if (a4 >= 86) {
                model.addAttribute("q4", "A");
            } else if ((a4 <= 85) && (a4 >= 70)) {
                model.addAttribute("q4", "B");
            } else if ((a4 <= 69) && (a4 >= 55)) {
                model.addAttribute("q4", "C");
            } else if ((a4 <= 54) && (a4 >= 10)) {
                model.addAttribute("q4", "D");
            } else {
                model.addAttribute("q4", "E");
            }
            if (a5 >= 86) {
                model.addAttribute("q5", "A");
            } else if ((a5 <= 85) && (a5 >= 70)) {
                model.addAttribute("q5", "B");
            } else if ((a5 <= 69) && (a5 >= 55)) {
                model.addAttribute("q5", "C");
            } else if ((a5 <= 54) && (a5 >= 10)) {
                model.addAttribute("q5", "D");
            } else {
                model.addAttribute("q5", "E");
            }
            if (a6 >= 86) {
                model.addAttribute("q6", "A");
            } else if ((a6 <= 85) && (a6 >= 70)) {
                model.addAttribute("q6", "B");
            } else if ((a6 <= 69) && (a6 >= 55)) {
                model.addAttribute("q6", "C");
            } else if ((a6 <= 54) && (a6 >= 10)) {
                model.addAttribute("q6", "D");
            } else {
                model.addAttribute("q6", "E");
            }
            if (a7 >= 86) {
                model.addAttribute("q7", "A");
            } else if ((a7 <= 85) && (a7 >= 70)) {
                model.addAttribute("q7", "B");
            } else if ((a7 <= 69) && (a7 >= 55)) {
                model.addAttribute("q7", "C");
            } else if ((a7 <= 54) && (a7 >= 10)) {
                model.addAttribute("q7", "D");
            } else {
                model.addAttribute("q7", "E");
            }
            if (a8 >= 86) {
                model.addAttribute("q8", "A");
            } else if ((a8 <= 85) && (a8 >= 70)) {
                model.addAttribute("q8", "B");
            } else if ((a8 <= 69) && (a8 >= 55)) {
                model.addAttribute("q8", "C");
            } else if ((a8 <= 54) && (a8 >= 10)) {
                model.addAttribute("q8", "D");
            } else {
                model.addAttribute("q8", "E");
            }
            if (a9 >= 86) {
                model.addAttribute("q9", "A");
            } else if ((a9 <= 85) && (a9 >= 70)) {
                model.addAttribute("q9", "B");
            } else if ((a9 <= 69) && (a9 >= 55)) {
                model.addAttribute("q9", "C");
            } else if ((a9 <= 54) && (a9 >= 10)) {
                model.addAttribute("q9", "D");
            } else {
                model.addAttribute("q9", "E");
            }
            if (a10 >= 86) {
                model.addAttribute("q10", "A");
            } else if ((a10 <= 85) && (a10 >= 70)) {
                model.addAttribute("q10", "B");
            } else if ((a10 <= 69) && (a10 >= 55)) {
                model.addAttribute("q10", "C");
            } else if ((a10 <= 54) && (a10 >= 10)) {
                model.addAttribute("q10", "D");
            } else {
                model.addAttribute("q10", "E");
            }
            if (a11 >= 86) {
                model.addAttribute("q11", "A");
            } else if ((a11 <= 85) && (a11 >= 70)) {
                model.addAttribute("q11", "B");
            } else if ((a11 <= 69) && (a11 >= 55)) {
                model.addAttribute("q11", "C");
            } else if ((a11 <= 54) && (a11 >= 10)) {
                model.addAttribute("q11", "D");
            } else {
                model.addAttribute("q11", "E");
            }
            if (a12 >= 86) {
                model.addAttribute("q12", "A");
            } else if ((a12 <= 85) && (a12 >= 70)) {
                model.addAttribute("q12", "B");
            } else if ((a12 <= 69) && (a12 >= 55)) {
                model.addAttribute("q12", "C");
            } else if ((a12 <= 54) && (a12 >= 10)) {
                model.addAttribute("q12", "D");
            } else {
                model.addAttribute("q12", "E");
            }

            return "nilaipkl";
        }
        return "homepkl";
    }
    // cek di terima atau tidak

    @RequestMapping(value = "/ce.dpt", method = RequestMethod.POST)
    public String ce(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {

        String email = request.getParameter("email");

        business b = new business();
        b.hip(email);

        user isinya = b.hip(email);
        isinya.getEmail();

        String usernih = isinya.getEmail();

        String kew = isinya.getHasil();
        if ("tolak".equals(kew)) {
            String tam = "Mohon Maaf Anda Belum Beruntung, Silahkan Coba lagi lain waktu..";
            model.addAttribute("tam", tam);
            model.addAttribute("namauser", usernih);

            return "hasil";
        } else if ("sudah".equals(kew)) {
            String tam = "KAMI MENGUCAPKAN SELAMAT KEPADA KALIAN, KARENAA KALIAN DITERIMA UNTUK PKL DISNI !! SEGERA DATANG DENGAN MEMBAWA SURAT PENGANTAR DARI KAMPUS";
            model.addAttribute("tam", tam);
            model.addAttribute("namauser", usernih);
            return "hasil";
        } else if ("belum".equals(kew)) {
            String tam = "Mohon Tunggu 3x24 Jam ";
            model.addAttribute("tam", tam);
            model.addAttribute("namauser", usernih);
            return "hasil";
        } else {
            String i = "email belum terdaftar(tidak valid)";
            model.addAttribute("sukses", i);
            return "index";
        }

    }
    // mendaftar awal nih sebagai calon

    @RequestMapping(value = "/daftargih.dpt", method = RequestMethod.POST)
    public String daftargih(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException, ParseException {

        if (request.getParameter("daftar") != null) {
            userId u = new userId();
            String id_calon = u.userDataId();

            //   model.addAttribute("u1", id_calon);
            //   String id_calon = request.getParameter("id_calon");
            String univ_id = request.getParameter("univ_id");
            String jurusan = request.getParameter("jurusan");
            String pendidikan = request.getParameter("pendidikan");
            String jumlah = request.getParameter("jumlah");
            String email = request.getParameter("email");
            String dari = request.getParameter("dari");
            String sampai = request.getParameter("sampai");

            DateFormat format = new SimpleDateFormat("yyyy-m-dd", Locale.ENGLISH);
            Date dariu = format.parse(dari);
            Date sampaiu = format.parse(sampai);
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(dariu);
            cal2.setTime(sampaiu);
            if (id_calon == null || "".equals(id_calon) || " ".equals(id_calon) || univ_id == null || "".equals(univ_id) || " ".equals(univ_id)
                    || jurusan == null || "".equals(jurusan) || " ".equals(jurusan) || pendidikan == null || "".equals(pendidikan) || " ".equals(pendidikan)
                    || jumlah == null || "".equals(jumlah) || " ".equals(jumlah) || email == null || "".equals(email) || " ".equals(email) || dari == null || "".equals(dari) || " ".equals(dari)
                    || sampai == null || "".equals(sampai) || " ".equals(sampai)) {

                String i = "GAGAL masih ada data yg kosong nih";
                model.addAttribute("f9", i);
            } else {

                          
            if (cal1.after(cal2)) {
//                System.out.println("Date1 is after Date2");
                model.addAttribute("f1", "Tanggal Mulai tidak boleh melebihi dari tanggal selesai");

            }

            if (cal1.before(cal2)) {
                //  System.out.println("Date1 is before Date2");
                //  model.addAttribute("f1", "tanggal sudah benar nih");
                business b = new business();
                b.hip(email);

                user isinya = b.hip(email);
                isinya.getEmail();
                String email1 = isinya.getEmail();
                if (email.equals(email1)) {
                    model.addAttribute("f2", "email sudah ada bro");
                } else {
                 
                    String ud = new GoIndex().getInsertFirstlyUserData(id_calon, univ_id, jurusan, pendidikan,
                            jumlah, email, dari, sampai);
                    String i = "SUKSES mendaftar silahkan tunggu 3x24jam";
                    model.addAttribute("sukses", i);
                    model.addAttribute("f1", "pendaftaran berhasil bro ");
                    model.addAttribute("f2", "mohon tunggu 3x24jam / cek status secara berkala");
                    }
                }
            

            if (cal1.equals(cal2)) {
                //System.out.println("Date1 is equal Date2");
                model.addAttribute("f1", "tanggal mulai sama dengan sampai nih bro salah");
            }
               }
            //cari di internet compare date
            //opsi 1 : a. convert string to date ( convert string dari ke date, dan convert string sampai ke date)
            //         b. compare date, if (date dari < date sampai) maka bisa di insert (), klo tdk maka kluarkan warning tdk bisa karena tgl mulai lebih besar
            //opsi 2 : a. cek tahunnya klo sama ok, if tahun dari > tahun sampai maka g bs, klo if tahun dari <= sampai, cek bulannya
            //         b. substring(dari) ambil bulannya --> sub string(dari,6,2) substring(sampai) ambil bulannyanya --> lalu dibandingkan : if (dari = 4 = sampai = 4) else cek tanggalnya
            //         c. substring(dari) ambil tglnya, substring(sampai) ambil tanggalnya 
            //business - dao ( select * from daftar where email = '"+email+"' and sudah)
            //return true / ada --> g blh insert
            //if (email = hasil dari dao)
            //
            return "regiscln_1";

        } else if (request.getParameter("kembali") != null) {
            return "index";
        }
        return "index";
    }
    // belum jadi 

    @RequestMapping(value = "/findInstansiLikeByName.dpt", method = RequestMethod.GET)
    @ResponseBody
    public String findInstansiLikeByName(
            @RequestParam("callback") String callBack,
            @RequestParam("name_startsWith") String name) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        List<univ> ins = new business().isiuniv(name);

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("instansis", ins);
        return objectMapper.writeValueAsString(new JSONPObject(callBack,
                resultMap));
    }

    // //admin --> tabel calon/homeadmin --> rincian data 
    @RequestMapping(value = "/ops.dpt", method = RequestMethod.GET)
    public String ops(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {

        String id_peserta = request.getParameter("id_peserta");

        business b = new business();
        b.upp(id_peserta);
        pkl isinya = b.upp(id_peserta);
        String u1 = isinya.getId_calon();
        String u2 = isinya.getId_peserta();
        String u3 = isinya.getNama_perserta();
        String u4 = isinya.getEmail();
        String u5 = isinya.getTgllahir();
        String u6 = isinya.getTelepon();
        String u7 = isinya.getAlamat();
        String u8 = isinya.getUniv_id();
        String u9 = isinya.getJurusan();
        String u10 = isinya.getTingkatpendidikan();
        model.addAttribute("u1", u1);
        model.addAttribute("u2", u2);
        model.addAttribute("u3", u3);
        model.addAttribute("u4", u4);
        model.addAttribute("u5", u5);
        model.addAttribute("u6", u6);
        model.addAttribute("u7", u7);
        model.addAttribute("u8", u8);
        model.addAttribute("u7", u7);
        model.addAttribute("u8", u8);
        model.addAttribute("u9", u9);
        model.addAttribute("u10", u10);

        return "opsipkl";
    }

    @RequestMapping(value = "/ops1.dpt", method = RequestMethod.GET)
    public String ops1(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {

        String id_peserta = request.getParameter("id_peserta");

        business b = new business();
        b.upp(id_peserta);
        pkl isinya = b.upp(id_peserta);
        String u1 = isinya.getId_calon();
        String u2 = isinya.getId_peserta();
        String u3 = isinya.getNama_perserta();
        String u4 = isinya.getEmail();
        String u5 = isinya.getTgllahir();
        String u6 = isinya.getTelepon();
        String u7 = isinya.getAlamat();
        String u8 = isinya.getUniv_id();
        String u9 = isinya.getJurusan();
        String u10 = isinya.getTingkatpendidikan();
        model.addAttribute("u1", u1);
        model.addAttribute("u2", u2);
        model.addAttribute("u3", u3);
        model.addAttribute("u4", u4);
        model.addAttribute("u5", u5);
        model.addAttribute("u6", u6);
        model.addAttribute("u7", u7);
        model.addAttribute("u8", u8);
        model.addAttribute("u7", u7);
        model.addAttribute("u8", u8);
        model.addAttribute("u9", u9);
        model.addAttribute("u10", u10);

        return "opsipkladmin";
    }
    //admin --> tabel anggota --> rincian data anggota --> eksekusi

    @RequestMapping(value = "/yukanggota.dpt", method = RequestMethod.POST)
    public String yukanggota(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        if (request.getParameter("update") != null) {

            String id_calon = request.getParameter("id_calon");
            String id_peserta = request.getParameter("id_peserta");
            String nama_peserta = request.getParameter("nama_peserta");
            String email = request.getParameter("email");
            String tgllahir = request.getParameter("tgllahir");
            String telepon = request.getParameter("telepon");
            String alamat = request.getParameter("alamat");
            String univ_id = request.getParameter("univ_id");
            String jurusan = request.getParameter("jurusan");
            String tingkatpendidikan = request.getParameter("tingkatpendidikan");

            String ud = new GoIndex().au(id_calon, id_peserta, nama_peserta, email, tgllahir, telepon, alamat, univ_id, jurusan, tingkatpendidikan);

            String i = "SUKSES merubah";
            model.addAttribute("sukses", i);
            return "index";

        }
        if (request.getParameter("nilai") != null) {

            String id_peserta = request.getParameter("id_peserta");

            String email = request.getParameter("email");
            model.addAttribute("e1", id_peserta);
            model.addAttribute("e2", email);

            return "adminnilai";

        }
        if (request.getParameter("hapus") != null) {

            String id_peserta = request.getParameter("id_peserta");

            String ud = new GoIndex().deli(id_peserta);

            String i = "SUKSES delete";
            model.addAttribute("sukses", i);
            return "index";

        }
        return "index";
    }
    //admin --> tabel anggota --> rincian anggota --> tambah nilai --> eksekusi

    @RequestMapping(value = "/nilaio.dpt", method = RequestMethod.POST)
    public String nilaio(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {

        String e1 = request.getParameter("e1");
        String e2 = request.getParameter("e2");
        String e3 = request.getParameter("e3");
        String e4 = request.getParameter("e4");
        String e5 = request.getParameter("e5");
        String e6 = request.getParameter("e6");

        String e7 = request.getParameter("e7");
        String e8 = request.getParameter("e8");
        String e9 = request.getParameter("e9");
        String e10 = request.getParameter("e10");

        String e11 = request.getParameter("e11");
        String e12 = request.getParameter("e12");
        String e13 = request.getParameter("e13");
        String e14 = request.getParameter("e14");
        String e15 = request.getParameter("e15");
        int a1 = Integer.parseInt(e3);
        int a2 = Integer.parseInt(e4);
        int a3 = Integer.parseInt(e5);
        int a4 = Integer.parseInt(e6);
        int a5 = Integer.parseInt(e7);
        int a6 = Integer.parseInt(e8);
        int a7 = Integer.parseInt(e9);
        int a8 = Integer.parseInt(e10);
        int a9 = Integer.parseInt(e11);
        int a10 = Integer.parseInt(e12);
        int a11 = Integer.parseInt(e13);
        int jumlah = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11;
        int rata = jumlah / 11;

        String ud = new GoIndex().nila(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, jumlah, rata);
        return "index";
    }
    // admin --> tabel calon --> COpy ke rincian jsp

    @RequestMapping(value = "/updatee.dpt", method = RequestMethod.GET)
    public String updatee(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {

        String id_calon = request.getParameter("id_calon");

        business b = new business();
        b.updatee(id_calon);
        user isinya = b.updatee(id_calon);
        String u1 = isinya.getId_calon();
        String u2 = isinya.getUniv_id();
        String u3 = isinya.getJurusan();
        String u4 = isinya.getPendidikan();
        String u5 = isinya.getJumlah();
        String u6 = isinya.getEmail();
        String u7 = isinya.getDari();
        String u8 = isinya.getSampai();
        model.addAttribute("u1", u1);
        model.addAttribute("u2", u2);
        model.addAttribute("u3", u3);
        model.addAttribute("u4", u4);
        model.addAttribute("u5", u5);
        model.addAttribute("u6", u6);
        model.addAttribute("u7", u7);
        model.addAttribute("u8", u8);

        return "updatepkl";
    }
    // admin --> homeadmin/calon --> rincian calon --> eksekusi tambah anggota

    @RequestMapping(value = "/ulang.dpt", method = RequestMethod.POST)
    public String ulang(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {

        String id_calon = request.getParameter("id_calon");
        String id_peserta = request.getParameter("id_peserta");
        String nama_peserta = request.getParameter("nama_peserta");
        String email = request.getParameter("email");
        String tgllahir = request.getParameter("tgllahir");
        String telepon = request.getParameter("telepon");
        String alamat = request.getParameter("alamat");
        String univ_id = request.getParameter("univ_id");
        String jurusan = request.getParameter("jurusan");
        String tingkatpendidikan = request.getParameter("tingkatpendidikan");
        String unit = request.getParameter("unit");
         business b = new business();
                b.upp(email);

                pkl isinya = b.upp(email);
                isinya.getEmail();
                String email1 = isinya.getEmail();
                if (email==null||"".equals(email) || " ".equals(email) || nama_peserta==null||"".equals(nama_peserta) || " ".equals(nama_peserta) ||  
                        tgllahir==null||"".equals(tgllahir) || " ".equals(tgllahir)|| telepon==null||"".equals(telepon) || " ".equals(telepon)  
                        || alamat==null||"".equals(alamat) || " ".equals(alamat) ) {
                      
                      String i = "GAGAL masih ada data yg kosong nih";
        model.addAttribute("sukses", i);
                    }else{
                if (email.equals(email1)) {
                   
                     String i = "GAGAL Email sudah terdaftar";
        model.addAttribute("sukses", i);
                } else {
                    
                         String udh = new GoIndex().ayodaftar(id_calon, id_peserta, nama_peserta, email,
                tgllahir, telepon, alamat, univ_id, jurusan, tingkatpendidikan, unit);
        String ud = new GoIndex().ulangnih(id_peserta, email);
        String hh = new GoIndex().nilakosong(id_peserta, email, unit);
        String i = "SUKSES menambah anggota";
        model.addAttribute("sukses", i);
                
        return "index";
                    }
       
                }
                
                
                 return "index";
    }
    // admin --> home admin calon --> rincian data calon --> pilihan eksekusi

    @RequestMapping(value = "/updateyuk.dpt", method = RequestMethod.POST)
    public String updateyuk(ModelMap model, HttpServletRequest request, HttpSession session) throws SQLException {
        if (request.getParameter("update") != null) {
            String id_calon = request.getParameter("id_calon");
            String univ_id = request.getParameter("univ_id");
            String jurusan = request.getParameter("jurusan");
            String pendidikan = request.getParameter("pendidikan");
            String jumlah = request.getParameter("jumlah");
            String email = request.getParameter("email");
            String dari = request.getParameter("dari");
            String sampai = request.getParameter("sampai");
            //  String unit = request.getParameter("unit");

            String ud = new GoIndex().updates(id_calon, univ_id, jurusan, pendidikan, jumlah, email, dari, sampai);

            String i = "SUKSES merubah";
            model.addAttribute("sukses", i);
            return "index";

        } else if (request.getParameter("delete") != null) {
            String id_calon = request.getParameter("id_calon");

            String ud = new GoIndex().del(id_calon);

            String i = "SUKSES delete";
            model.addAttribute("sukses", i);
            return "index";
        } else if (request.getParameter("acc") != null) {

            String id_calon = request.getParameter("id_calon");
            String email = request.getParameter("email");
            String unit = request.getParameter("unit");
            String ud = new GoIndex().acce(id_calon);
            String udh = new GoIndex().aktif(id_calon, email, unit);

            String i = "SUKSES acc";
            model.addAttribute("sukses", i);
            return "index";
        } else if (request.getParameter("tolak") != null) {

            String id_calon = request.getParameter("id_calon");

            String ud = new GoIndex().tolak(id_calon);

            String i = "SUKSES menolak";
            model.addAttribute("sukses", i);
            return "index";
        } //else if (request.getParameter("aktif") != null) {
        //
        //            String email = request.getParameter("email");
        //            String id_calon = request.getParameter("id_calon");
        //
        //            // String ud = new GoIndex().aktif(email, id_calon);
        //            String i = "SUKSES bikin login";
        //            model.addAttribute("sukses", i);
        //            return "index";
        //        } 
        else if (request.getParameter("anggota") != null) {

            // String email = request.getParameter("email");
            String id_calon = request.getParameter("id_calon");
            business b = new business();
            b.updatee(id_calon);
            user isinya = b.updatee(id_calon);
            String u1 = isinya.getId_calon();
            String u2 = isinya.getUniv_id();
            String u3 = isinya.getJurusan();
            String u4 = isinya.getPendidikan();
            model.addAttribute("u1", u1);
            model.addAttribute("u2", u2);
            model.addAttribute("u3", u3);
            model.addAttribute("u4", u4);
            userId u = new userId();
            String id_pkl = u.userDataId();
            model.addAttribute("u5", id_pkl);
            //  String id_calon = request.getParameter("id_calon");

            // String ud = new GoIndex().aktif(email,id_calon);
            return "daftarulang";
        }
        return "index";
    }

}
