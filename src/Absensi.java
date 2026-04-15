interface IAbsensi {
    String getStatus();
    void masuk();
    void cek();
}

public class Absensi implements IAbsensi {

    private String statusHadir;
    private Mahasiswa mahasiswa;

    public Absensi(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.statusHadir = "Belum Absen";
    }
    
    @Override
    public String getStatus() {
        return statusHadir;
    }
    
    @Override
    public void masuk() {
        this.statusHadir = "Hadir";
        System.out.println(mahasiswa.getNama() + " hadir");
    }
    
    @Override
    public void cek() {
        System.out.println(mahasiswa.getNama() + " - " + statusHadir);
    }
    
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
    
    @Override
    public String toString() {
        return mahasiswa.getNama() + " | " + statusHadir;
    }
    
}
