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
public class polimorfhismeOverloadingManager extends polimorfhismeOverloadingStaff{
    private int tunjanganRumah;
    public polimorfhismeOverloadingManager(int gPokok, int tKehadiran, int tRumah){
        super(gPokok, tKehadiran);
        tunjanganRumah = tRumah;
    }
    
    protected int getTunjanganRumah (){
        return tunjanganRumah;
    }
    protected int takeHomePay (int gPokok, int tKehadiran, int tRumah){
        int total = super.takeHomePay(gPokok, tKehadiran) + tRumah;
        return total;
    }
}
