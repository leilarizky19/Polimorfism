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
public class kapal extends kendaraan {
    private String nama, jenis;
    
    public kapal (String nama){
        super ("Kapal");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    
    public kapal (String nama, String jenis){
        super ("Kapal");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    @Override
    public void informasi (){
        System.out.println("Nama kapal adalah\t" + nama);
        System.out.println("Jenis kapal adalah\t" + jenis);
    }
}
