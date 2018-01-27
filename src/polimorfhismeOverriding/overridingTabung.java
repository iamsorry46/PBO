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
public class overridingTabung extends overridingLingkaran{
    private int tinggi;
    
    protected void setTinggi (int t){
        if (t > 0) {
            tinggi = t;
        }
    }
    protected int getTinggi (){
        return tinggi;
    }
    @Override
    protected double luas (){
        double luas = (super.luas() * 2) + (2 * Math.PI*super.getJariJari()*tinggi);
        return luas;
    }
}
