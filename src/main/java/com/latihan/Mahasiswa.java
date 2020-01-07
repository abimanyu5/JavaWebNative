package com.latihan;

import java.util.Date;

import com.latihan.JenisKelamin;
public class Mahasiswa{
    private Integer id;
    private String npm;
    private String nama;
    private String tempatLahir;
    private Date tanggalLahir;
    private JenisKelamin jenisKelamin;
    private String alamat;


    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getNpm(){
        return npm;
    }
    public void setNpm(String x){
        this.npm=x;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String x){
        this.nama=x;
    }
    public String getTempatLahir(){
        return tempatLahir;
    }
    public void setTempatLahir(String x){
        this.tempatLahir=x;
    }
    public Date getTanggalLahir(){
        return tanggalLahir;
    }
    public void setTanggalLahir(Date x){
        this.tanggalLahir=x;
    }
    public JenisKelamin getJenisKelamin(){
        return jenisKelamin;
    }
    public void setJenisKelamin(JenisKelamin x){
        this.jenisKelamin=x;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String x){
        this.alamat=x;
    }


}