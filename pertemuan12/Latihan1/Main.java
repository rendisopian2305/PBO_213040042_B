package pertemuan12.Latihan1;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + lingkaran.getJari2());
        System.out.println("luas: " + lingkaran.luas());

        Tabung tabung = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + tabung.getJari2() + ", Tinggi: " + tabung.getTinggi());
        System.out.println("luas: " + tabung.luas());
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input untuk Lingkaran
//        System.out.print("Masukkan jari-jari lingkaran: ");
//        int jari2Lingkaran = scanner.nextInt();
//        Lingkaran lingkaran = new Lingkaran(jari2Lingkaran);
//        System.out.println("Lingkaran");
//        System.out.printf("Jari-jari: %d%n", lingkaran.getJari2());
//        System.out.printf("Luas: %.2f%n", lingkaran.luas());
//
//        // Input untuk Tabung
//        System.out.print("Masukkan jari-jari tabung: ");
//        int jari2Tabung = scanner.nextInt();
//        System.out.print("Masukkan tinggi tabung: ");
//        int tinggiTabung = scanner.nextInt();
//        Tabung tabung = new Tabung(jari2Tabung, tinggiTabung);
//        System.out.println("Tabung");
//        System.out.printf("Jari-jari: %d, Tinggi: %d%n", tabung.getJari2(), tabung.getTinggi());
//        System.out.printf("Luas: %.2f%n", tabung.luas());
//
//        scanner.close();
//    }
}
