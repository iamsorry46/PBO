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
import java.util.Scanner;
public class DataMhsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        DataMhs x = new DataMhs();
        System.out.println("Masukkan biodata mahasiswa !");
        System.out.print("Nama : ");
        x.setNamaMhs(input.nextLine());
        System.out.print("Alamat : ");
        x.setAlamat(input.nextLine());
        System.out.print("Ipk : ");
        x.setIpk(input.nextDouble());
        
        System.out.println("_______________________________");
        System.out.println(x.getNamaMhs());
        System.out.println(x.getAlamat());
        System.out.println(x.getIpk());
    }
    
}
