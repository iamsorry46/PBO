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
public class SC extends informatika{
    private String sistemPakar, dataMining;
    public SC (String sistemPakar, String dataMining){
        this.dataMining = dataMining;
        this.sistemPakar = sistemPakar;
    }
    public void MK_BidangMinat (){
        System.out.println("SC Ahli Bidang : " + sistemPakar);
        System.out.println("SC Juga Ahli Bidang : " + dataMining);
    }
    
}
