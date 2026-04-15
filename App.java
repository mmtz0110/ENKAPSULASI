public class App {
    public static void main(String[] args) {

        System.out.println("\nSISTEM ABSENSI MAHASISWA\n");
        
        Kelas kelas = new Kelas();
        
        Mahasiswa mhs1 = new Mahasiswa("M001", "Dede Desur");
        Mahasiswa mhs2 = new Mahasiswa("M002", "Aril Syaril");
        Mahasiswa mhs3 = new Mahasiswa("M003", "Danil Pasa");
        
        System.out.println("--- Menambah Mahasiswa ---");
        kelas.tambahMahasiswa(mhs1);
        kelas.tambahMahasiswa(mhs2);
        kelas.tambahMahasiswa(mhs3);
        
        kelas.tampilMahasiswa();
        
        System.out.println("\n--- Pencatatan Absensi ---");
        Absensi abs1 = new Absensi(mhs1);
        Absensi abs2 = new Absensi(mhs2);
        Absensi abs3 = new Absensi(mhs3);
        
        
        // Update status via interface method masuk()
        abs1.masuk();
        abs2.cek();
        abs3.masuk();
        
    }
}
