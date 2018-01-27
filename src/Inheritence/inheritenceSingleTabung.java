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
public class inheritenceSingleTabung {
    public double jariJari;
    public double tinggi;

public double hitungVolume (){
    double volume = Math.PI * Math.pow(jariJari, 2)*tinggi;
    return volume;
}

public void setJariJari (double r){
    jariJari = r;
}
public void setTinggi (double t){
    tinggi = t;
}
public double getJariJari (){
    return jariJari;
}
public double getTinggi (){
    return tinggi;
}
}
