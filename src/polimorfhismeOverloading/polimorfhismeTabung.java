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
public class polimorfhismeTabung extends polimorfhismeLingkaran{
    private int tinggi;
    protected void setTinggi (int t){
        if (t > 0) {
            tinggi = t;
        }
    }
    protected int getTinggi (){
        return tinggi;
    }
    protected double luas (int r, int t){
        double luas = (super.luas(r)*2)+(2*Math.PI*r*t);
        return luas;
    }
}
