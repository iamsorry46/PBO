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
public class bukuMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Buku x = new Buku();
    x.Isi("PBO", "Jogiyanto");
    x.cetakKeLayar();
    x.Isi(null, null);
    x.cetakKeLayar();
    x.Isi("PBP", null);
    x.cetakKeLayar();
    }
    
}
