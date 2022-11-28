/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Code;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author Junaidi
 */
public class PossibleTiketPage {
    private String kotaAwal;
    private String kotaAkhir;
    DataPemesan dp;
    /**
     * @param args the command line arguments
     */
    
    public PossibleTiketPage(String kotaBerangkat, String kotaTujuan, DataPemesan dp){
        this.dp = dp;
        kotaAwal = kotaBerangkat;
        kotaAkhir = kotaTujuan;
        JFrame jf = new JFrame();
        JPanel p = new JPanel();
        p.setBackground(new java.awt.Color(30,39, 97));
        GridLayout layout = new GridLayout(6,1);
        layout.setVgap(20);
        p.setLayout(layout);
        JLabel teks = new JLabel("Pilih Tiket");
        jf.add(teks);
        try{
            File file_data = new File("Database.txt");
            Scanner sc = new Scanner(file_data);
            sc.useDelimiter("[,\n]");
//            p.add(new PossibleTicket("2","2",kotaBerangkat,kotaTujuan));
            while(sc.hasNext()){
                String p_asal = sc.next();
                String waktu_awal = sc.next();
                String waktu_akhir = sc.next();
                String p_tujuan = sc.next();
                int Harga = Integer.parseInt(sc.next());
                String pesawat  = sc.next();
                if(p_asal.equals(kotaAwal) && p_tujuan.equals(kotaAkhir)){
                    p.add(new PossibleTicket(waktu_awal,waktu_akhir,Integer.toString(Harga),pesawat,dp));
                }
                
            }
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Maaf tidak ada database");
        }
        jf.add(p);
        jf.setSize(360,800);
        jf.setVisible(true);
        
        jf.setLocationRelativeTo(null);
    }                             
    
    public static void main(String args[]) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PossibleTiketPage pg = new PossibleTiketPage("Lhokseumawe","Jakarta",new DataPemesan());
            }
        });    }
}
