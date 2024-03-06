/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.latihan2;

/**
 *
 * @author ACER NITRO 5
 */
public class MatakuliahMain {
    public static void main(String[] args) {
        // Create objek matakuliah
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Tampilkan daftar matakuliah
        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- Nilai IPK ---");
        // Bagaimana hitung IPK?
        // Rumus: (Index nilai+sks)+(index nilai+sks)+...+(index nilai+sks)/total_sks
        // Latihan 3
        double totalNilaiSks = (mk1.getIndexNilai() * mk1.getSks()) + (mk2.getIndexNilai() * mk2.getSks()) + (mk3.getIndexNilai() * mk3.getSks());
        double totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double ipk = totalNilaiSks / totalSks;
        String formattedIpk = String.format("%.3f", ipk);
        System.out.println("IPK: " + formattedIpk);
    }
}
