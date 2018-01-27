/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoOnline;

/**
 *
 * @author sorry
 */
public class Pelanggan implements biodata {
    private String Nama;
    private String Alamat;
    private String Notlp;

public Pelanggan (String Nama, String Alamat, String Notlp){
    this.Nama = Nama;
    this.Alamat = Alamat;
    this.Notlp = Notlp;
}

    Pelanggan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    @Override
    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    @Override
    public String getNotlp() {
        return Notlp;
    }

    public void setNotlp(String Notlp) {
        this.Notlp = Notlp;
    }
    
    public void cetak (){
        System.out.println("Nama : "+getNama());
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Nomer Telepon : "+getNotlp());
    }

}
    

