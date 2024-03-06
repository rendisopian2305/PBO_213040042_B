/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

import java.util.Scanner;

/**
 *
 * @author Rd. Deni P
 */
public class KalkulatorMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Kalkulator kalkulator = new Kalkulator(); // Membuat objek dari kelas Kalkulator
        
        // Meminta inputan bilangan pertama
        System.out.print("Masukan bilangan 1: ");
        int bilangan1 = sc.nextInt();
        kalkulator.setBilangan1(bilangan1); // Menginput bilangan1 ke dalam objek
        
        // Meminta inputan bilangan kedua
        System.out.print("Masukan bilangan 2: ");
        int bilangan2 = sc.nextInt();
        kalkulator.setBilangan2(bilangan2); // Menginput bilangan2 ke dalam objek
        
        // Menampilkan daftar operasi yang dapat dipilih
        System.out.println("Daftar Pilihan Operasi");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Bagi");
        System.out.println("4. Kali");
        System.out.println("Pilih Angka Lain Untuk Membatalkan");
        System.out.print("Pilih Operasi: ");
        
        boolean tampilkan = true;
        int operasi = sc.nextInt();
        switch (operasi) {
            // Memilih operasi berdasarkan input
            case 1 -> kalkulator.tambah();
            case 2 -> kalkulator.kurang();
            case 3 -> kalkulator.bagi();
            case 4 -> kalkulator.kali();
            default -> {
                tampilkan = false;
                System.out.println("Operasi Dibatalkan"); // Menampilkan pesan jika operasi dibatalkan
            }
        }
        
        // Menampilkan hasil operasi jika operasi tidak dibatalkan
        if (tampilkan) {
            kalkulator.tampilkanHasil();
        }
    }
}