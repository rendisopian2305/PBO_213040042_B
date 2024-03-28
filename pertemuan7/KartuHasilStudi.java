package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalBobot = 0.0;
        int totalSks = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalBobot += mk.getIndexNilai() * mk.getSks();
            totalSks += mk.getSks();
        }

        if (totalSks > 0) {
            ips = totalBobot / totalSks;
        } else {
            ips = 0;
        }
    }

    public int getTotalSks() {
        int totalSks = 0;
        for (Matakuliah mk : daftarMatakuliah) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }

    /* Setter & Getter */
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }
}