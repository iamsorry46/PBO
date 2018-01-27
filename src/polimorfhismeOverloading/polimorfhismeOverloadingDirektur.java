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
public class polimorfhismeOverloadingDirektur extends polimorfhismeOverloadingManager{
    private int tunjanganMobil;
    public polimorfhismeOverloadingDirektur (int gPokok, int tKehadiran, int tRumah, int tMobil){
        super(gPokok, tKehadiran, tRumah);
        tunjanganMobil = tMobil;
    }
    
    protected int getTunjanganMobil (){
        return tunjanganMobil;
    }
    
    protected int takeHomePay (int gPokok, int tKehadiran, int tRumah, int tMobil){
        int total = super.takeHomePay(gPokok, tKehadiran, tRumah) + tMobil;
        return total;
    }
}
