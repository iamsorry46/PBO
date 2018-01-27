/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectUasSpk;

/**
 *
 * @author sorry
 */
import java.util.Scanner;

public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Pilihan = null;
        Scanner input = new Scanner(System.in);
        orderMasuk x = new orderMasuk();
        x.inputUser();
        System.out.println("Jenis Order ?\n1.Cetak\n2.Plate");
        Pilihan = input.next();
        if (Pilihan.equals("1")) {
            System.out.println("Jenis Cetak?\n1.Complite\n2.Ongkosan");
            Pilihan = input.next();
            if (Pilihan.equals("1")){
                x.complite();
            } else if (Pilihan.equals("2")){
                x.ongkosan();
            } else {
                System.out.println("Anda belum menentukan jenis cetak, mohon proses diulangi lagi");
                System.exit(0);
            }
            x.inputData();
            System.out.println("Cetak Data Order y/n ?");
            x.cetak();
            Pilihan = input.next();
            if (Pilihan.equals("y")){
                x.cetakData();
            } else{
                System.exit(0);
            } 
        } else if (Pilihan.equals("2")){
            System.out.println("Jenis Plate?\n1.Toko\n2.Oliver 52\n3.Oliver 58");
            Pilihan = input.next();
            if (Pilihan.equals("1")) {
                x.plateToko();
            } else if (Pilihan.equals("2")) {
                x.plate52();
            } else if (Pilihan.equals("3")) {
                x.plate58();
            } else {
                System.out.println("Anda belum menentukan jenis plate, mohon proses diulangi lagi");
                System.exit(0);
            }
            x.inputData();
            System.out.println("Cetak Data Order y/n ?");
            Pilihan = input.next();
            x.plate();
            if (Pilihan.equals("y")){
                x.cetakData();
            } else{
                System.exit(0);
            }
        } else {
            System.out.println("Anda belum/salah menentukan order, mohon proses diulangi lagi");
            System.exit(0);
        }

    }

}
