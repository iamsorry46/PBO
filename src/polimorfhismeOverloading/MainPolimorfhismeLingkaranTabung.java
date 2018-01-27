/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfhismeOverloading;

/**
 *
 * @author sorry
 */
public class MainPolimorfhismeLingkaranTabung{
    public static void main(String[] args) {
        polimorfhismeTabung x = new polimorfhismeTabung();
        x.setJariJari(9);
        x.setTinggi(15);
        double luasLingkaran = x.luas(x.getJariJari());
        double luasTabung = x.luas(x.getJariJari(), x.getTinggi());
        System.out.println("Luas Lingkaran = " + luasLingkaran);
        System.out.println("Luas Tabung = " + luasTabung);
    }
    
    
    
}
