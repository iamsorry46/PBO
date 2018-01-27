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
public class RecordMhsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //membuat 3 object recordMhs
        RecordMhs x = new RecordMhs();
        RecordMhs y = new RecordMhs();
        RecordMhs z = new RecordMhs();
        
        x.setName("Siti Faizah");
        y.setName("Muhammad Ansori");
        z.setName("Umar");
        
        System.out.println("Mahasiswa 1 : " + x.getName());
        System.out.println("Mahasiswa 2 : " + y.getName());
        System.out.println("Mahasiswa 3 : " + z.getName());
    }
    
}
