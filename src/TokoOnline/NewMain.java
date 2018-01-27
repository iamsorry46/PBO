/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoOnline;

import java.util.Scanner;

/**
 *
 * @author sorry
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pilihan = null;
        Scanner input = new Scanner(System.in);
        Transaksi a = new Transaksi();
        a.inputUser();
        a.inputData();
        System.out.println("Tentukan Exspedisi Pengiriman !\n1.JNE\n2.POS");
        pilihan = input.next();
        if (pilihan.equals("1")) {
            System.out.println("Pilih Jenis Pengiriman\n1.JNE_REG\n2.JNE_YES");
            pilihan = input.next();
            
            if (pilihan.equals("1")){
                a.JNE_REG();
            } 
            else if (pilihan.equals("2")){
                a.JNE_YES();
            } 
            else {
                System.out.println("Anda belum menentukan jenis pengiriman");
                System.exit(0);
            }
            System.out.println("Cetak Data Transaksi y/n ");
            pilihan = input.next();
            if (pilihan.equals("y")){
                a.cetakdata();
            } 
            else{
                System.exit(0);
            } 
        } 
        
        else if (pilihan.equals("2")){
            System.out.println("Pilih Jenis Pengiriman\n1.POS_reguler\n2.POS_kilat");
            pilihan = input.next();
            if (pilihan.equals("1")){
                a.POS_reguler();
            } 
            else if (pilihan.equals("2")){
                a.POS_kilat();
            } 
            else {
                System.out.println("Anda belum menentukan jenis pengiriman");
                System.exit(0);
            }
            System.out.println("Cetak Data Transaksi y/n ? ");
            pilihan = input.next();
            if (pilihan.equals("y")){
                a.cetakdata();
            } 
            else{
                System.exit(0);
        }

     }
   }
}
    
