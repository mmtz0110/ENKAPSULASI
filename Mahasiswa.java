public class Mahasiswa extends Orang {
    
    public Mahasiswa(String id, String nama) {
        super(id, nama);
    }
    
    @Override
    public void tampilInfo() {
        System.out.println("ID: " + getId() + " | Nama: " + getNama());
    }
    
}

