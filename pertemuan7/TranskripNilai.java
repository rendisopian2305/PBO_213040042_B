package pertemuan7;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<>();
        tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalBobot = 0.0;
        double totalSks = 0.0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            totalBobot += khs.getIps() * khs.getTotalSks();
            totalSks += khs.getTotalSks();
        }
        if (totalSks > 0) {
            ipk = totalBobot / totalSks;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}
