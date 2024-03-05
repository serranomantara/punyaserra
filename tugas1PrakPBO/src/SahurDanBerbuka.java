public class SahurDanBerbuka extends KegiatanRamadhan {
    public SahurDanBerbuka() {
        super("Sahur");
    }
    
    public void persiapan() {
        System.out.println("Mempersiapkan makanan dan minuman untuk " + nama);
    }
    
    public void aktivitas() {
        System.out.println("Makan dan minum saat " + nama);
    }
    
    public void membersihkan() {
        System.out.println("Membersihkan tempat makanan dan minuman setelah " + nama);
    }
}