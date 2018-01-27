/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfhismeOverriding;

/**
 *
 * @author sorry
 */
public class overridingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        overridingLingkaran x = new overridingLingkaran();
        overridingTabung y = new overridingTabung();
        x.setJariJari(2);
        System.out.println("Luas Lingkaran = " + x.luas());
        y.setJariJari(2);
        y.setTinggi(10);
        System.out.println("Luas Tabung = " + y.luas());
    }
    
}
