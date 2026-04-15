import java.util.ArrayList;
import java.util.List;

public class Kelas {
    
    private List<Mahasiswa> daftarMahasiswa;
    private List<Absensi> daftarAbsensi;
    
    public Kelas() {
        this.daftarMahasiswa = new ArrayList<>();
        this.daftarAbsensi = new ArrayList<>();
    }
    
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa " + mahasiswa.getNama() + " ditambahkan");
    }
    

    public void catatAbsensi(Absensi absensi) {
        daftarAbsensi.add(absensi);
        System.out.println("Absensi dicatat");
    }
    
    public void tampilMahasiswa() {
        System.out.println("\n===== DAFTAR MAHASISWA =====");
        
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa m = daftarMahasiswa.get(i);
            System.out.print((i + 1) + ". ");
            m.tampilInfo();
        }
    }
    
    public void tampilAbsensi() {
        System.out.println("\n===== DAFTAR ABSENSI =====");
        
        for (Absensi a : daftarAbsensi) {
            System.out.println(a.toString());
        }
    }
    
}
