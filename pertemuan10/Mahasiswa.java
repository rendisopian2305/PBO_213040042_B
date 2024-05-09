package pertemuan10;

public class Mahasiswa extends Orang{
    private String nrp;
    private String jurusan;

    public Mahasiswa(String nrp, String nama, String alamat, String jurusan){
        super(nama, alamat);
        setNrp(nrp);
        setJurusan(jurusan);
    }

    // Setter & Getter
    public String getNrp(){
        return nrp;
    }

    public void setNrp(String nrp){
        this.nrp = nrp;
    }

    public String getJurusan(){
        return jurusan;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
}
