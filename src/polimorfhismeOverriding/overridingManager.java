/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfhismeOverriding;

/**
 *
 * @author sorry
 */
public class overridingManager extends overridingPegawai{
    private int tunjangan;
    public overridingManager (String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    public int infoTujangan (){
        return tunjangan;
    }
}
