package com.latihan;

import javax.servlet.http.HttpServlet;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormMahasiswaServlet extends HttpServlet {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private MahasiswaDao mahasiswaDao = new MahasiswaDao();

    public void doGet(HttpServletRequest req, HttpServletResponse res) {

    }

    public void doPost(HttpServletRequest req, HttpServletResponse res){
    try{
        Mahasiswa m= new Mahasiswa();
        m.setNpm(req.getParameter("npm"));
        m.setNama(req.getParameter("nama"));
        m.setTempatLahir(req.getParameter("tempat_lahir"));

        String strTanggalLahir = req.getParameter("tanggal_lahir");
        SimpleDateFormat formatterTanggal =new SimpleDateFormat("yyyy-MM-dd");
        
        m.setTanggalLahir(formatterTanggal.parse(strTanggalLahir));
        m.setJenisKelamin(JenisKelamin.valueOf(req.getParameter("jenis_kelamin").toUpperCase()));
        m.setAlamat(req.getParameter("alamat"));

        mahasiswaDao.simpan(m);

        res.sendRedirect("index.html");
        }catch(Exception err){
            err.printStackTrace();
        }

    }
    
}