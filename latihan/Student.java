/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4.latihan;

/**
 *
 * @author Rd. Deni P
 */
public class Student {
    private String nrp;

    // Constructor
    public Student() {
    }

    // Setter
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    // Getter
    public String getNrp() {
        return nrp;
    }

    public static void main(String[] args) {
        Student x = new Student();
        Student y = x;
        
        x.setNrp("01");
        y.setNrp("02");
        
        System.out.println(x.getNrp()); // Output: 02
        
        Student z = new Student();
        x = z;
        
        x.setNrp("03");
        
        System.out.println(x.getNrp()); // Output: 03
        System.out.println(y.getNrp()); // Output: 02
    }
}