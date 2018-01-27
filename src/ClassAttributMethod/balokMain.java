/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAttributMethod;

/**
 *
 * @author sorry
 */
public class balokMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Balok kotak1 = new Balok(); 
//        kotak1.panjang = 4;
//        kotak1.lebar = 3;
//        kotak1.tinggi = 2;
//        kotak1.cetakHitungVolume();

//        Balok kotak1 = new Balok(); 
//        kotak1.panjang = 4;
//        kotak1.lebar = 3;
//        kotak1.tinggi = 2;
//        System.out.println("Volume Balok1 Adalah " + kotak1.cetakHitungVolume());

        Balok kotak1 = new Balok(4,4,4);
        System.out.println("Volume balok adalah : "+kotak1.cetakHitungVolume());

    }
    
}
