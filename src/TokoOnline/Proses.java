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
public abstract class Proses extends Toko implements pengiriman {
    private int ongkir;
    
    Scanner input = new Scanner(System.in);
    Pelanggan a = new Pelanggan();
    Toko T = new Toko ("Hey Shop", "Heri Mukti", "Sampang", "08520387");

    @Override
    public void JNE(){
        System.out.println("Pengiriman JNE : 20000");
        ongkir = 20000;
    }
    @Override
    public void POS(){
        System.out.println("Pengiriman POS : 22000");
        ongkir = 20000;
    }
}
