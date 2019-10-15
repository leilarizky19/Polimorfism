
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
public class pesawat extends kendaraan {
    private String nama, jenis;
    
    public pesawat (String nama){
        super ("Pesawat");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    
    public pesawat (String nama, String jenis){
        super ("Pesawat");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    @Override
    public void informasi (){
        System.out.println("Nama pesawat adalah\t" + nama);
        System.out.println("Jenis pesawat adalah\t" + jenis);
    }
}
