/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Junaidi
 */
public class TESTING {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        try{
            File file_data = new File("Database.txt");
            Scanner sc = new Scanner(file_data);
            sc.useDelimiter("[,\n]");
            
            while(sc.hasNext()){
                String a = sc.next();
                String b = sc.next();
                String c = sc.next();
                String d = sc.next();
                int e = Integer.parseInt(sc.next());
                String f = sc.next();
                
                System.out.print(a);
                System.out.print(b);
                System.out.print(c);
                System.out.print(d);
                System.out.print(e);
                System.out.println(f);
             
                
            }
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Maaf tidak ada database");
        }
        
    }
}
