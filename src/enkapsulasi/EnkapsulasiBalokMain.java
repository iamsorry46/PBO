/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author sorry
 */
import java.util.Scanner;
public class EnkapsulasiBalokMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    EnkapsulasiBalok x = new EnkapsulasiBalok();
        System.out.println("Masukkan Panjang : ");
        x.setPanjang(scan.nextInt());
        System.out.println("Masukkan Lebar : ");
        x.setLebar(scan.nextInt());
        System.out.println("Masukkan Tinggi : ");
        x.setTinggi(scan.nextInt());
        
        System.out.println("Panjang yang dimasukkan : "+x.getPanjang());
        System.out.println("Lebar yang dimasukkan : "+x.getLebar());
        System.out.println("Tinggi yang dimasukkan : "+x.getTinggi());
        System.out.println("Volume x : " + x.hitungVolume());
    }
    
}
