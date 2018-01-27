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
public class construktorBuku {

    /**
     * @param args the command line arguments
     */
    private String pengarang, judul;
    public construktorBuku (String pengarang, String judul){
        this.pengarang = pengarang;
        this.judul = judul;
    }
    public void info (){
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Judul : " + judul);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        construktorBuku x = new construktorBuku("Anik", "Pemrograman Objek");
        x.info();
    }
    
}
