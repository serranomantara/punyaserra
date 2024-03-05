public class DzikirRamadhan extends KegiatanRamadhan implements Ibadah {
    public DzikirRamadhan() {
        super("Dzikir Ramadhan");
    }
    
    public void persiapan() {
        System.out.println("Mempersiapkan diri untuk " + nama);
    }
    
    public void aktivitas() {
        System.out.println("Melaksanakan " + nama);
    }
    
    public void membersihkan() {
        System.out.println("Membersihkan diri setelah " + nama);
    }
    
    public void shalat() {
        System.out.println("Melaksanakan ibadah sholat");
    }

    @Override
    public String Sholat() {
        System.out.println("Melaksanakan ibadah sholat");
        return ("Melaksanakan ibadah sholat");
    }
}