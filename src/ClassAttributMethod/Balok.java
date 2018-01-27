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
public class Balok {
    int pjg, lbr, tgg;
// void cetakHitungVolume(){ //methode void
//     int volume = panjang*lebar*tinggi;
//     System.out.println("Volume Balok adalah "+volume);
// }
// int cetakHitungVolume(){ //method non void no parameter
//     int volume = panjang*lebar*tinggi;
//     return volume;
// }
Balok (int panjang, int lebar, int tinggi){ //method non void parameter
     this.pjg = panjang;
     this.lbr = lebar;
     this.tgg = tinggi;
 }
int cetakHitungVolume (){
    int volume = pjg*lbr*tgg;
    return volume;
}
 
}
