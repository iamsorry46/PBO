/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author sorry
 */
public class OverloadingKalkulator {
    int tambah (int nilai1, int nilai2){
        System.out.println("tambah () 1");
        int hasil = nilai1+nilai2;
        return hasil;
    }
    int tambah (int nilai1, int nilai2, int nilai3){
        System.out.println("tambah () 2");
        int hasil = nilai1+nilai2+nilai3;
        return hasil;
    }
    double tambah (double nilai1, double nilai2){
        System.out.println("tambah () 3");
        double hasil = nilai1+nilai2;
        return hasil;
    }
    
    public static void main(String[] args) {
        OverloadingKalkulator x = new OverloadingKalkulator();
        double hasil = x.tambah(10, 10.0);
        System.out.println(hasil);
    }
}
