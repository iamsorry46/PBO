/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAttributMethod;

/**
 *
 * @author sorry
 */
public class aCar {
    String plateNumber = "";
    String color = "";
    String manufacture = "";
    double speed = 0;
    
    aCar (String pNumber, String clr, String mnfc, double spd){
        this.plateNumber = pNumber;
        this.color = clr;
        this.manufacture = mnfc;
        this.speed = spd;
        
    }
    void Accelerate (){
        System.out.println("Kecepatan Maksimum Kendaraan = "+speed);
    }
    void turnRight (){
        System.out.println("Kendaraan Sedang Belok Ke Kanan");
    }
    void turnLeft (){
        System.out.println("Kendaraan Sedang Belok Ke Kiri");
    }
    void Break (){
        System.out.println("Kendaraan Sedang ngeRem");
    }
    
    void carIdentitas (){
        System.out.println("Merk Mobil : "+manufacture);
        System.out.println("Plate Mobil : "+plateNumber);
        System.out.println("Warna Mobil : "+color);
    }
}
