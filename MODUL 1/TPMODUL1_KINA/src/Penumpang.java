public class Penumpang {
    private static String nik, namaDepan, namaBelakang;

    public static void setNamaBelakang(String namaBelakang) {
        Penumpang.namaBelakang = namaBelakang;
    }

    public static void setNamaDepan(String namaDepan) {
        Penumpang.namaDepan = namaDepan;
    }

    public static void setNik(String nik) {
        Penumpang.nik = nik;
    }

    
    public static void tampilDafarPenumpang(){
        System.out.println();
        System.out.println("NIK           : "+nik);
        System.out.println("Nama Depan    : "+namaDepan);
        System.out.println("Nama Belakang : "+namaBelakang);
    }
}
