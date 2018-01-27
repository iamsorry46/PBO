/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectUasSpk;

/**
 *
 * @author sorry
 */
import java.util.Scanner;

public class orderMasuk extends service implements order, jenisOrderCetak, jenisOrderPlate {

    private String namaFile, jenis;
    private int pricePerSheet;
    private int qyt;

    Scanner input = new Scanner(System.in);
    customer x = new customer();
    service CS = new service("CS001", "Ach. Muhajir", "0831561004", "Malang Dinoyo", "muhajirer@gmail.com");

    @Override
    public void complite() {
        System.out.println(jenis = "Jenis Cetak  : Complite");
        System.out.print("Harga Satuan : ");
        pricePerSheet = input.nextInt();
    }

    @Override
    public void ongkosan() {
        System.out.println(jenis = "Jenis Cetak  : Ongkosan");
        System.out.print("Harga Per Lembar : ");
        pricePerSheet = input.nextInt();
    }

    @Override
    public void plateToko() {
        System.out.println(jenis = "Jenis Plate   : Toko");
        pricePerSheet = 8000;
    }

    @Override
    public void plate52() {
        System.out.println(jenis = "Jenis Plate   : Oliver 52");
        pricePerSheet = 13500;
    }

    @Override
    public void plate58() {
        System.out.println(jenis = "Jenis Plate   : Oliver 58");
        pricePerSheet = 23000;
    }

    @Override
    public void cetak() {
        System.out.println("Cetak ");
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void plate() {
        System.out.println("Plate ");
        System.out.println("----------------------------------------------------");
    }

    public void inputUser() {
        System.out.println("Data Customer");
        System.out.print("Id   : ");
        x.setId(input.next());
        System.out.print("Nama : ");
        x.setName(input.next());
        System.out.print("No Phone : ");
        x.setNoPhone(input.next());
        System.out.print("Alamat   : ");
        x.setAddress(input.next());
    }

    public void inputData() {
        System.out.print("Nama File     : ");
        namaFile = input.next();
        System.out.print("Jumlah Order  : ");
        qyt = input.nextInt();
    }

    public void cetakData() {
        System.out.println("                SURAT PERINTAH KERJA              ");
        System.out.println("----------------------------------------------------");
        System.out.println("Id CS   : " + CS.getId() + "\t      |" + "\tId Cust       : " + x.getId());
        System.out.println("Name CS : " + CS.getName() + "|" + "\tName Customer : " + x.getName());
        System.out.println("              " + "\t      |" + "\tNo Telphone   : " + x.getNoPhone());
        System.out.println("====================================================");
        System.out.println("Nama File     : " + namaFile);
        System.out.println(jenis);
        System.out.println("Jumlah Order  : " + qyt);
        System.out.println("Harga Satuan  : " + pricePerSheet);
        System.out.println("____________________________________________________");
        System.out.println("Harga Total   : " + (pricePerSheet * qyt));
    }

}
