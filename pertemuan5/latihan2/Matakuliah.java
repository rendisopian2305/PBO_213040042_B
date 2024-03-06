/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.latihan2;

/**
 *
 * @author ACER NITRO 5
 */
public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;
    
    /* Konstruktor */
    public Matakuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }
    
    public double getIndexNilai() {
        // Berdasarkan index matakuliah
        // A=4, AB=3.5, B=3, BC=2.5, C=2, D=1, E=0
        switch (index) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }
    
    public String display() {
        return kode + " - " + nama + " - " + index;
    }
    
    public int getSks() {
        return sks;
    }
}