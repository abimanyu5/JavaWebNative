package com.latihan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MahasiswaDao {
    private Connection koneksiDatabase;
    private String dbDriver = "com.mysql.cj.jdbc.Driver";
    private String dbUrl = "jdbc:mysql://localhost/maven";
    private String dbUsername = "root";
    private String dbPassword = "admin123";

    public void connect() {
        try {
            Class.forName(dbDriver);
            koneksiDatabase = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (koneksiDatabase != null) {
                koneksiDatabase.close();
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public void simpan(Mahasiswa m) {
        try {
            connect();
            String sql = "insert into mahasiswa (npm, nama, tempat_lahir, tanggal_lahir, jenis_kelamin, alamat)values(?,?,?,?,?,?)";
            PreparedStatement ps = koneksiDatabase.prepareStatement(sql);
            ps.setString(1, m.getNpm());
            ps.setString(2, m.getNama());
            ps.setString(3, m.getTempatLahir());
            ps.setDate(4, new java.sql.Date(m.getTanggalLahir().getTime()));
            ps.setString(5, m.getJenisKelamin().toString());
            ps.setString(6, m.getAlamat());

            ps.executeUpdate();

            disconnect();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
