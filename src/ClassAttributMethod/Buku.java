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
public class Buku {
    String pengarang;
    String judul;
    
    void Isi (String isi1, String isi2){
        judul = isi1;
        pengarang = isi2;
    }
    
    void cetakKeLayar (){
        if (judul == null && pengarang ==null) return;
        System.out.println("Judul : " + judul + ", Pengarang : " + pengarang);
    }
}
