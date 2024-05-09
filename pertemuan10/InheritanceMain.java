package pertemuan10;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("213040044", "Rd. Deni Pajrianingrat", "Subang", "Teknik Informatika");
        System.out.println(mhs.getNrp() + " - " + mhs.getNama() + " - " + mhs.getAlamat() + " - " + mhs.getJurusan());
    }
}
