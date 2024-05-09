package pertemuan10;

public class Orang {
    protected String nama;
    protected String alamat;

    public Orang(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}

