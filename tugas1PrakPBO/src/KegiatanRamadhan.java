public abstract class KegiatanRamadhan {
    protected String nama;
    
    public KegiatanRamadhan(String nama) {
        this.nama = nama;
    }
    
    public abstract void persiapan();
    public abstract void aktivitas();
    public abstract void membersihkan();
    
    public void jalankan() {
        persiapan();
        aktivitas();
        membersihkan();
    }

    void sholat() {
        System.out.println("Melaksanakan ibadah sholat");
    }
}
