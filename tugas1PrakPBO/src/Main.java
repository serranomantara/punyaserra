public class Main {
    public static void main(String[] args) {
        KegiatanRamadhan[] kegiatan = new KegiatanRamadhan[3];

        kegiatan[0] = new SholatTerawih();
        kegiatan[1] = new SahurDanBerbuka();
        kegiatan[2] = new DzikirRamadhan();

        for (KegiatanRamadhan kegiatanRamadhan : kegiatan) {
            kegiatanRamadhan.persiapan();
            kegiatanRamadhan.aktivitas();
            kegiatanRamadhan.membersihkan();
            kegiatanRamadhan.sholat();
            System.out.println();
        }
    }
}