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
public class Lingkaran extends bangunDatar{
    @Override
    public void bentuk(){
        System.out.println("Bentuk lingkaran");
    }
    @Override
    public void jumlahSisi(){
        System.out.println("Jumlah sisi lingkaran");
    }
}
