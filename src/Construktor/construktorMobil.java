/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construktor;

/**
 *
 * @author sorry
 */
public class construktorMobil {

    /**
     * @param args the command line arguments
     */
    String warna;
    int tahunProduksi;
    
    public construktorMobil (String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public  construktorMobil (){
        
    }
    public void info(){
        System.out.println("Warna : " + warna);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        construktorMobil x = new construktorMobil("Merah", 2015);
        x.info();
        construktorMobil xx = new construktorMobil();
        xx.info();
    }
    
}
