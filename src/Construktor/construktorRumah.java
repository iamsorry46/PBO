/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construktor;

/**
 *
 * @author sorry
 */
public class construktorRumah {
    private String type;
    private int harga;
    
    //construktor overloading
    public construktorRumah(){
        
    }
    public construktorRumah(String type){
        this.type = type;
    }
    public construktorRumah (String type, int harga){
        this.type = type;
        this.harga = harga;
    }
    
    //overloading method
    public void typeRumah (String type){
        this.type = type;
    }
    public void typeRumah (String type, int harga){
        this.type = type;
        this.harga = harga;
    }
    
    //method menampilkan outputnya
    public void lihatRumah (){
        System.out.println("Type Rumah : " + type);
        System.out.println("Harga Rumah : " + harga);
        System.out.println();
    }
}
