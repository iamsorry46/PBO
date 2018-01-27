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
public class polimorfhismeOverloadingStaff {
    private int gajiPokok;
    private int tunjanganKehadiran;
    
    public polimorfhismeOverloadingStaff (int gPokok, int tKehadiran){
        gajiPokok = gPokok;
        tunjanganKehadiran = tKehadiran;
    }
    protected int getGajiPokok (){
        return gajiPokok;
    }
    protected int getTunjanganKehadiran (){
        return tunjanganKehadiran;
    }
    protected void setTunjanganKehadiran (int tKehadiran){
        tunjanganKehadiran = tunjanganKehadiran *                                                                     tKehadiran;
    }
    protected int takeHomePay (int gPokok, int tKehadiran){
        int total = gPokok + tKehadiran;
        return total;
    }
    
}
