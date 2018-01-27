/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritence;

/**
 *
 * @author sorry
 */
public class inheritenceLingkaran {
    public double jariJari;
    
    public void setJariJari (double r){
        jariJari = r;
    }
    
    public double getJariJari (){
        return jariJari;
    }
    
    public double hitungLuas (){
        double luas = Math.PI * Math.pow(jariJari, 2);
        return luas;
    }
}
