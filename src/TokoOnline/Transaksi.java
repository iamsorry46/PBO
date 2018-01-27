/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoOnline;

import ProjectUasSpk.customer;
import java.util.Scanner;

/**
 *
 * @author sorry
 */
public class Transaksi extends Toko implements pilihanJNE, pilihanPOS {
    private String namabarang;
    private int hargabarang;
    private int Ongkir;
    private int jml;
    
    Scanner input = new Scanner(System.in);
    Pelanggan a = new Pelanggan();
    Toko TOK = new Toko("Aladoy shoop", "Heri Mukti", "Madura", "085203874647");
    
    @Override
    public void JNE_REG(){
    System.out.println("JNE_REG : 20000");
    Ongkir = 20000;
}
    @Override
    public void JNE_YES(){
    System.out.println("JNE_YES : 30000");
    Ongkir = 30000;
}
    @Override
    public void POS_reguler(){
    System.out.println("POS_reguler : 18000");
    Ongkir = 18000;
}
    @Override
    public void POS_kilat(){
    System.out.println("POS_kilat : 28000");
    Ongkir = 28000;
}
public void inputUser(){
    System.out.println("Isi data Pelanggan");
    System.out.print("Nama : ");
    a.setNama(input.next());
    System.out.print("Alamat : ");
    a.setAlamat(input.next());
    System.out.print("No Handphone : ");
    a.setNoTlp(input.next());
}
public void inputData(){
    System.out.print("Nama Barang : ");
    namabarang = input.next();
    System.out.print("Harga Barang : ");
    hargabarang = input.nextInt();
    System.out.print("Jumlah Barang : ");
    jml = input.nextInt();
}
public void cetakdata(){
    System.out.println("Nama Toko      : " + TOK.getNamaToko());
    System.out.println("Nama Pelanggan : " + a.getNama());
    System.out.println("Alamat         : " + a.getAlamat());
    System.out.println("No Telphone    : " + a.getNoTlp());
    System.out.println("Nama Barang    : " + namabarang);
    System.out.println("Harga Barang   : " + hargabarang);
    System.out.println("Jumlah Barang  : " + jml);
    System.out.println("Ongkir         : " + Ongkir);
    System.out.println("Harga Total    : " + (Ongkir+hargabarang*jml));
    }
}
    