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
public class Pelajar {
    
    //atribut
    private String nama, nip, cekKelulusan;
    private double nilaiUjian1, nilaiUjian2, nilaiTugas;
    
    //Constructor
    public Pelajar(){
        this.nama = nama;
        this.nip = nip;
        this.nilaiUjian1 = nilaiUjian1;
        this.nilaiUjian2 = nilaiUjian2;
        this.nilaiTugas = nilaiTugas;
    }

    //Methods
    public void setNip (String nip){
        this.nip = nip;
    }
    
    public String getNip (){
        return nip;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getNama (){
        return nama;
    }
    
    public void setNilaiUjian1 (double nilaiUjian1 ){
        this.nilaiUjian1 = nilaiUjian1;
    }
    
    public double getNilaiUjian1 (){
        return nilaiUjian1;
    }
    
    public void setNilaiUjian2 (double nilaiUjian2 ){
        this.nilaiUjian2 = nilaiUjian2;
    }
    
    public double getNilaiUjian2 (){
        return nilaiUjian2;
    }
    
    public void setNilaiTugas (double nilaiTugas ){
        this.nilaiTugas = nilaiTugas;
    }
    
    public double getNilaiTugas (){
        return nilaiTugas;
    }
    
    public double NilaiAkhir(){
        double nilaiAkhir = (0.4*getNilaiUjian1())+(0.4*getNilaiUjian2())+(0.2*getNilaiTugas());
        return (nilaiAkhir);
    }
    
    public String isLulus(){
        
        if (this.NilaiAkhir() >= 60){
            cekKelulusan = "Lulus";
        }else{
            cekKelulusan = "Tidak Lulus";
        }
        return cekKelulusan;
    }
    
    public void infoStatus (){
        System.out.println("Nama \t\t:" + getNama());
        System.out.println("Nip \t\t:" + getNip());
        System.out.println("Nilai Ujian 1 \t:" + getNilaiUjian1());
        System.out.println("Nilai Ujian 2 \t:" + getNilaiUjian2());
        System.out.println("Nilai Tugas \t:" + getNilaiTugas());
        System.out.println("Nilai Akhir \t:" + NilaiAkhir());
        System.out.println("Status \t\t:" + isLulus());
    }
}
    
    
    
    
    
        
        
       
            
    
        
        
    
    
    
    
  

