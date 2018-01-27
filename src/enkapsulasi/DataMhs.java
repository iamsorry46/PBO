package enkapsulasi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sorry
 */
public class DataMhs {
    private String namaMhs;
    private String alamat;
    private double ipk;
    
    public String getNamaMhs (){
        return namaMhs;
    }
    public String getAlamat (){
        return alamat;
    }
    public double getIpk(){
        return ipk;
    }
    
    public void setNamaMhs (String nama){
        namaMhs = nama;
    }
    public void setAlamat (String almt){
        alamat = almt;
    }
    public void setIpk (double ip){
        ipk = ip;
    }
    
}
