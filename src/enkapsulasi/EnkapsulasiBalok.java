/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author sorry
 */
public class EnkapsulasiBalok {
    private int  panjang, lebar, tinggi; //information hidding
    public int getPanjang (){
        return panjang;
    }
    public int getLebar (){
        return lebar;
    }
    public int getTinggi (){
        return tinggi;
    } //method getter
    
    public void setPanjang (int p){
        if (p <= 0){
            System.out.println("Panjang tidak boleh dibawah 0");
        } else{
            panjang = p;
        }
    }
    public void setLebar (int l){
        if (l <= 0){
            System.out.println("Lebar tidak boleh dibawah 0");
        } else{
            lebar = l;
        }       
    }
    public void setTinggi (int t){
        if (t <= 0){
            System.out.println("Tinggi tidak boleh dibawah 0");
        } else{
            tinggi = t;
        }       
    } // method setter
    public int hitungVolume(){
        int volume = panjang*lebar*tinggi;
        return volume;
    }
}
