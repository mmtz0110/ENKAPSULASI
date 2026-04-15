interface IPerson {
    String getId();
    String getNama();
    void setNama(String nama);
}

public abstract class Orang implements IPerson {
    
    private String id;
    private String nama;
    
    public Orang(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public abstract void tampilInfo();
    
}
