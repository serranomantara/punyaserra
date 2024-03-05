public class SholatTerawih extends KegiatanRamadhan implements Ibadah {
    public SholatTerawih() {
        super("Sholat Tarawih");
    }
    
    public void persiapan() {
        System.out.println("Berwudhu untuk " + nama);
    }
    
    public void aktivitas() {
        System.out.println("Melaksanakan " + nama);
    }
    
    public void membersihkan() {
        System.out.println("Membersihkan tempat setelah " + nama);
    }
    
    public void sholat() {
        System.out.println("Melaksanakan ibadah sholat");
    }

    @Override
    public String Sholat() {
        System.out.println("Melaksanakan ibadah sholat");
        return ("Melaksanakan ibadah sholat");
    }
}