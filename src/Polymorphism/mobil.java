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
public class mobil extends kendaraan {
    private String nama, jenis;
    
    
    public mobil (String nama){
        super ("Mobil");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    
    public mobil (String nama, String jenis){
        super ("Mobil");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    @Override
    public void informasi (){
        System.out.println("Nama mobil adalah\t" + nama);
        System.out.println("Jenis mobil adalah\t" + jenis);
    }
}
