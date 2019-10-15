/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAsistensi;

/**
 *
 * @author Lenovo
 */
public class Buku {
    private String namaPengarang, judulBuku;
    private int tahunTerbit, cetakanKe;
    private double hargaJual;
    
    public Buku (){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }
    
    public void setNamaPengarang (String p){
        this.namaPengarang = p;
    }
    
    public String getNamaPengarang (){
        return namaPengarang;
    }
    
    public void setJudulBuku (String j){
        this.judulBuku = j;
    }
    
    public String getJudulBuku (){
        return judulBuku;
    }
    
    public void setTahunTerbit (int t){
        this.tahunTerbit = t;
    }
    
    public int getTahunTerbit (){
        return tahunTerbit;
    }
    
    public void setCetakanKe (int c){
        this.cetakanKe = c;
    }
    
    public int getCetakanKe (){
        return cetakanKe;
    }
    
    public void setHargaJual(double h){
        this.hargaJual = h;
    }
    
    public double getHargaJual (){
        return hargaJual;
    }
    
    public void infoBuku(){
        System.out.println("Nama Pengarang\t:" + getNamaPengarang());
        System.out.println("Judul Buku\t:" + getJudulBuku());
        System.out.println("Tahun Terbit\t:" + getTahunTerbit());
        System.out.println("Cetakan Ke\t:" + getCetakanKe());
        System.out.println("Harga Jual\t:" + getHargaJual());
    }
    }
   

