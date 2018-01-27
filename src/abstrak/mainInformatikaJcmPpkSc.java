/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak;

/**
 *
 * @author sorry
 */
public class mainInformatikaJcmPpkSc {
    public void cetakInfo (informatika x){
        x.MK_BidangMinat();
        x.MK_Umum();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainInformatikaJcmPpkSc y = new mainInformatikaJcmPpkSc();
        y.cetakInfo(new JCM ("Pemrograman Game"));
        System.out.println("-------------------------");
        y.cetakInfo(new SC ("Pemrograman Sistem Pakar", "Pemrograman Data Mining"));
        System.out.println("-------------------------");
        y.cetakInfo(new PPK ("Pemrograman Robotik"));
    }
    
}
