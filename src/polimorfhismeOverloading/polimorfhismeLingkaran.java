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
public class polimorfhismeLingkaran {
    private int jariJari;
    protected void setJariJari (int r){
        if (r > 0){
            jariJari = r;
        }
    }
    protected int getJariJari(){
        return jariJari;
    }
    protected double luas (int r){
        double luas = Math.PI * Math.pow(r, 2);
        return luas;
    }
}
