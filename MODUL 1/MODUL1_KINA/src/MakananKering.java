// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;
    
    // Todo : Create Constructor of MakananKering
    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
    }

    
    // Todo : Create Getter and Setter
        public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Todo : Create Method ShowData
    public void mknkrg(){
        System.out.println("Masukkan Nama Makanan: " + nama);
        System.out.println("Masukkan Jumlah Makanan: "+ jumlah);
        System.out.println("Masukkan Harga Makanan" + harga);
        System.out.println("Masukkan Brand Makanan" + brand);
        System.out.println("===================================");
    }
}
