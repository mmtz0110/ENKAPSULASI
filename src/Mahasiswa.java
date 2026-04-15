public class Mahasiswa extends Orang {
    
    private String email;
    
    public Mahasiswa(String id, String nama, String email) {
        super(id, nama);
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void tampilInfo() {
        System.out.println("ID: " + getId() + " | Nama: " + getNama() + " | Email: " + email);
    }
    
}

