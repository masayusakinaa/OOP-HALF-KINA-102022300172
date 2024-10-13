import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {


    public static int pilihPenerbangan;
    public static ArrayList<Penerbangan> dataPenerbangan;

    public static void detailTiket(){
        Penumpang.tampilDafarPenumpang();
        String nomorPenerbangan = null;
        for (Penerbangan x : dataPenerbangan){
        
            if (pilihPenerbangan == dataPenerbangan.indexOf(x)+1) {
                nomorPenerbangan = x.getNomorPenerbangan();
                x.tampilDaftarPenerbangan();
            }
        }
        
        if (nomorPenerbangan == null){
            System.out.println("Penerbangan belum dipilih");
        }

    }

    public static ArrayList<Penerbangan> daftarPenerbangan(){
     
        for (Penerbangan x : dataPenerbangan){
            System.out.println();
            System.out.println(dataPenerbangan.indexOf(x)+1);
            x.tampilDaftarPenerbangan();
        }

        return dataPenerbangan;
        }

   
    public static void beliTiket(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NIK            :");
        Penumpang.setNik(sc.nextLine());
        System.out.print("NAMA DEPAN     :");
        Penumpang.setNamaDepan(sc.nextLine());
        System.out.print("NAMA BELAKANG  :");
        Penumpang.setNamaBelakang(sc.nextLine());
        Penumpang.tampilDafarPenumpang();

        System.out.print("pilih nomor penerbangan");
        pilihPenerbangan = sc.nextInt();

        if (pilihPenerbangan > dataPenerbangan.size()) {
            System.out.println("Penerbangan tidak tersedia");
        }
    
    }

    public static void main(String[] args) throws Exception {
        dataPenerbangan = new ArrayList<>();
        dataPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06.30", "08.15", 120000000));
        dataPenerbangan.add(new Penerbangan("GA102", "SUB, SURABAYA", "KNO, Medan", "09.30", "11.15", 135000000));
        
        Scanner sc = new Scanner(System.in);
        int chooseMenu;

    do { 
        System.out.println();
        System.out.println("Tampilin menu");
        System.out.println("1 daftar penerbangan");
        System.out.println("2 beli tiket");
        System.out.println("3 tampilkan tiket");
        System.out.println("4. exit");
        chooseMenu = sc.nextInt();

        switch (chooseMenu) {
            case 1:
                daftarPenerbangan();
                break;
            case 2:
                beliTiket();
                break;
            case 3:
                detailTiket();
                break;
            case 4:
                System.out.println("Terima kasih.");
                break;
            default:
                System.out.println("Menu tidak tersedia.");
        }
    } while (chooseMenu != 4);
    
    sc.close();
    }

}


