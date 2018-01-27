/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfhismeOverriding;

/**
 *
 * @author sorry
 */
public class overridingLingkaran {
    private int jariJari;
    
    protected void setJariJari (int r){
        if (r>0){
            jariJari = r;
        }
    }
    
    protected int getJariJari(){
        return jariJari;
    }
    protected double luas (){
        double luas = Math.PI * Math.pow(jariJari, 2);
        return luas;
    }
}
