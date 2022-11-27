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
    private String tanggal;
    private String bulan;
    private String tahun;
    private String kelas;

    public DataPemesan(String Nama, int Jumlah, String Tujuan, String Asal) {
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Tujuan = Tujuan;
        this.Asal = Asal;
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
    
    
    
    /**
     * @param args the command line arguments
     */
    
}
