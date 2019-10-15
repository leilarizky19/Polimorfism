/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Lenovo
 */
public class main {
    public static void main (String [] args){
        kendaraan K;
        pesawat p = new pesawat ("Boeing 707", "Pesawat Komersial");
        mobil m1 = new mobil ("Toyota Kijang", "Jeep");
        mobil m2 = new mobil ("Suzuki Baleno", "Sedan");
        mobil m3 = new mobil ("VW Combi");
        kapal kp = new kapal ("Queen Mary 2", "Kapal Pesiar");
        
        K = p;
        K.informasi();
        K = m1;
        K.informasi();
        K = m2;
        K.informasi();
        K = m3;
        K.informasi();
        K = kp;
        K.informasi();
        
    }
    
}
