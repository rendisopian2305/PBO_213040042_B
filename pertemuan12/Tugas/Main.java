package pertemuan12.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Laptop yang Tersedia ==");
        System.out.println("1. Acer");
        System.out.println("2. Dell");
        System.out.print("Masukkan laptop yang ingin dipilih: ");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                Laptop acer = new Acer("Predator Helios 300", "Intel Core i7", 16, 512, true);
                acer.bootUp();
                ((Spesifikasi) acer).tampilkanSpesifikasi();
                break;
            case 2:
                Laptop dell = new Dell("Inspiron 15", "AMD Ryzen 5", 8, 256, "Windows 10");
                dell.bootUp();
                ((Spesifikasi) dell).tampilkanSpesifikasi();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}


