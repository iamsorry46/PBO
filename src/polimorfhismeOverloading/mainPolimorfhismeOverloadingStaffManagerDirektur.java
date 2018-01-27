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
import java.util.Scanner;
public class mainPolimorfhismeOverloadingStaffManagerDirektur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        polimorfhismeOverloadingDirektur x = new polimorfhismeOverloadingDirektur(1500000, 75000, 2000000, 2500000);
        
        System.out.println("Masukkan Jumlah Kehadiran = ");
        x.setTunjanganKehadiran(input.nextInt());
        
        int gPokok = x.getGajiPokok();
        int tKehadiran = x.getTunjanganKehadiran();
        int tRumah = x.getTunjanganRumah();
        int tMobil = x.getTunjanganMobil();
        
        System.out.println("Take Home Pay Staff = " + x.takeHomePay(gPokok, tKehadiran));
        System.out.println("Take Home Pay Manager = " + x.takeHomePay(gPokok, tKehadiran, tRumah));
        System.out.println("Take Home Pay Direktur = " + x.takeHomePay(gPokok, tKehadiran, tRumah, tMobil));
    }
    
}
