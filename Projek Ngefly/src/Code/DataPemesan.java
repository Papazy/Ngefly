/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Code;

/**
 *
 * @author Junaidi
 */
public class DataPemesan {

    private String Nama;
    private int Jumlah;
    private String Tujuan;
    private String Asal;
    private String Penumpang = "";

    public String getJ_pesawat() {
        return j_pesawat;
    }

    public void setJ_pesawat(String j_pesawat) {
        this.j_pesawat = j_pesawat;
    }
    private String tanggal;
    private String bulan;
    private String tahun;
    private String kelas;
    private String waktu_awal;
    private String waktu_akhir;
    private String harga;
    private String j_pesawat;
 

    public String getWaktu_awal() {
        return waktu_awal;
    }

    public void setWaktu_awal(String waktu_awal) {
        this.waktu_awal = waktu_awal;
    }

    public String getWaktu_akhir() {
        return waktu_akhir;
    }

    public void setWaktu_akhir(String waktu_akhir) {
        this.waktu_akhir = waktu_akhir;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public DataPemesan(String Nama, int Jumlah, String Tujuan, String Asal) {
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Tujuan = Tujuan;
        this.Asal = Asal;
    }

    public DataPemesan(int Jumlah, String Tujuan, String Asal, String tanggal, String bulan, String tahun, String kelas) {
        this.Jumlah = Jumlah;
        this.Tujuan = Tujuan;
        this.Asal = Asal;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
        this.kelas = kelas;
    }
    
    
    public DataPemesan(){}

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public String getTujuan() {
        return Tujuan;
    }

    public void setTujuan(String Tujuan) {
        this.Tujuan = Tujuan;
    }

    public String getAsal() {
        return Asal;
    }

    public void setAsal(String Asal) {
        this.Asal = Asal;
    }

    public String getPenumpang() {
        return Penumpang;
    }

    public void setPenumpang(String Penumpang) {
        this.Penumpang = Penumpang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    
}
