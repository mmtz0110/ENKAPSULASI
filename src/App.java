public class App {
    public static void main(String[] args) {

        System.out.println("SISTEM ABSENSI MAHASISWA");
        
        Kelas kelas = new Kelas();
        System.out.println("Kelas dibuat\n");
        
        Mahasiswa mhs1 = new Mahasiswa("M001", "Andi Pratama", "andi@university.ac.id");
        Mahasiswa mhs2 = new Mahasiswa("M002", "Siti Nurhaliza", "siti@university.ac.id");
        Mahasiswa mhs3 = new Mahasiswa("M003", "Budi Santoso", "budi@university.ac.id");
        
        System.out.println("--- Menambah Mahasiswa ---");
        kelas.tambahMahasiswa(mhs1);
        kelas.tambahMahasiswa(mhs2);
        kelas.tambahMahasiswa(mhs3);
        
        kelas.tampilMahasiswa();
        
        System.out.println("\n\n--- Pencatatan Absensi ---\n");
        
        Absensi abs1 = new Absensi(mhs1);
        Absensi abs2 = new Absensi(mhs2);
        Absensi abs3 = new Absensi(mhs3);
        
        
        // Update status via interface method masuk()
        abs1.masuk();
        abs2.masuk();
        abs3.masuk();
        
        
        // Catat ke kelas
        System.out.println("");
        kelas.catatAbsensi(abs1);
        kelas.catatAbsensi(abs2);
        kelas.catatAbsensi(abs3);
        
        
        // Tampil absensi
        kelas.tampilAbsensi();
        
        System.out.println("\nStatus absensi:");
        System.out.println("Status: " + abs1.getStatus());
        
    }
}
