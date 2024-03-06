/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4.objekNull;

/**
 *
 * @author Rd. Deni P
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Output: 5
        System.out.println(l3.getJari2()); // Output: 7

        l2 = null;

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Error: NullPointerException
        // Hal ini disebabkan karena referensi null tidak dapat memanggil method, sehingga menyebabkan kesalahan pada saat runtime.
        System.out.println(l3.getJari2()); // Output: 7
    }
}
