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
public class construktorRumahMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        construktorRumah a = new construktorRumah();
        construktorRumah b = new construktorRumah("Rumah Type-B");
        construktorRumah c = new construktorRumah("Rumah Type-B", 500);
        System.out.println("Perbedaan Output dari masing-masing konstruktor : ");
        a.lihatRumah();
        b.lihatRumah();
        c.lihatRumah();
        construktorRumah d,e;
        d = new construktorRumah();
        e = new construktorRumah();
        d.typeRumah("Rumah Type-D");
        e.typeRumah("Rumah Type-E", 600);
        System.out.println("Perbedaan output dari masing-masing method : ");
        d.lihatRumah();
        e.lihatRumah();
    }
    
}
