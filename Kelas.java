import java.util.ArrayList;
import java.util.List;

public class Kelas {
    
    private List<Mahasiswa> daftarMahasiswa;
    
    public Kelas() {
        this.daftarMahasiswa = new ArrayList<>();
    }
    
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa " + mahasiswa.getNama() + " ditambahkan");
    }
    
    public void tampilMahasiswa() {
        System.out.println("\n===== DAFTAR MAHASISWA =====");
        
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa m = daftarMahasiswa.get(i);
            System.out.print((i + 1) + ". ");
            m.tampilInfo();
        }
    }
    
}
