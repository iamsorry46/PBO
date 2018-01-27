/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceImplement;

/**
 *
 * @author sorry
 */
public class keahlianBidangMinat implements Informatika, MK_BidangMinat{ //multiple implement
    public void JCM(){
        System.out.println("Ahli Membuat Game");
    }
    public void SC(){
        System.out.println("Ahli Membuat Sistem Cerdas");
    }
    public void PPK(){
        System.out.println("Ahli Membuat Robot");
    }
    public void MK_SC(){
        System.out.println("MK Topik Khusu SC->");
    }
    public void MK_JCM(){
        System.out.println("MK Topik Khusu JCM->");
    }
    public void MK_PPK(){
        System.out.println("MK Topik Khusu PPK->");
    }
}
