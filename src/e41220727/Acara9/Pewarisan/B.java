/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e41220727.Acara9.Pewarisan;

/**
 *
 * @author LAB KSI
 */
public class B extends A {// Mendeklarasikan Class B yang diturunkan
                          // dari Class A
    int z;
    
    void TampilkanJumlah(){
        // subclass dapat mengakses member dari superclass
        System.out.println("Jumlah : " + (x+y+z));
    }
}
