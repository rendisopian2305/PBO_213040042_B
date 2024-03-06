/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Rd. Deni P
 */
public class Kalkulator {
    double bilangan1; // Menyimpan bilangan pertama untuk operasi kalkulator.
    double bilangan2; // Menyimpan bilangan kedua untuk operasi kalkulator.
    double hasil;     // Menyimpan hasil operasi kalkulator.

    // Setter untuk mengatur nilai bilangan pertama.
    void setBilangan1(double bilangan1) {
        this.bilangan1 = bilangan1;
    }

    // Setter untuk mengatur nilai bilangan kedua.
    void setBilangan2(double bilangan2) {
        this.bilangan2 = bilangan2;
    }

    // Method untuk melakukan operasi penambahan.
    void tambah() {
        hasil = bilangan1 + bilangan2;
    }

    // Method untuk melakukan operasi pengurangan.
    void kurang() {
        hasil = bilangan1 - bilangan2;
    }

    // Method untuk melakukan operasi pembagian.
    void bagi() {
        hasil = bilangan1 / bilangan2;
    }

    // Method untuk melakukan operasi perkalian.
    void kali() {
        hasil = bilangan1 * bilangan2;
    }

    // Method untuk menampilkan hasil dengan format angka desimal 2 digit.
    void tampilkanHasil() {
        System.out.printf("Hasilnya adalah %.2f", hasil);
        System.out.println();
    }

    // Getter untuk mendapatkan nilai hasil.
    double getHasil() {
        return hasil;
    }
}