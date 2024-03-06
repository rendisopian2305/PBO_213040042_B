/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4.objek1Variable;

/**
 *
 * @author Rd. Deni P
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);

        Lingkaran l2 = l1;

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Output: 5

        l2.setJari2(10);

        System.out.println(l1.getJari2()); // Output: 10
        System.out.println(l2.getJari2()); // Output: 10
    }
}
