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
public class Toko extends Pelanggan {
    private String NamaToko;
    
public Toko (String NamaToko, String Nama, String Alamat, String NoTlp){
    super(Nama, Alamat, NoTlp);
    this.NamaToko = NamaToko;
}

    public String getNamaToko() {
        return NamaToko;
    }

    public void setNamaToko(String NamaToko) {
        this.NamaToko = NamaToko;
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Nama Toko :"+getNamaToko());
    }

}
