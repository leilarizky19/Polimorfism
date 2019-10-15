/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAsistensi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TesBuku {
    public static void main (String []args){
        Buku b1 = new Buku();
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Pengarang\t:");
        b1.setNamaPengarang(input.nextLine());
        
        System.out.print("Masukkan Judul Buku\t:");
        b1.setJudulBuku (input.nextLine());
        
        System.out.print("Masukkan Tahun Terbit\t:");
        b1.setTahunTerbit(input.nextInt());
        
        System.out.print("Masukkan Cetakan Ke\t:");
        b1.setCetakanKe(input.nextInt());
        
        System.out.print("Masukkan Harga Jual\t:");
        b1.setHargaJual(input.nextDouble());
        
        System.out.println("=================================================");
        
        System.out.println("DATA BUKU");
        System.out.println();
       
        b1.infoBuku();
    }
}
