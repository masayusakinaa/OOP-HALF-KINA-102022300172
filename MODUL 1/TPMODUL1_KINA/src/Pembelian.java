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
        dataPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta","DPS, Bali", "06.30", "08.15", 120000000));
        dataPenerbangan.add(new Penerbangan("QZ202", "SUB, SURABAYA","KNO, Medan", "09.00", "11.45", 135000000));
        
        Scanner sc = new Scanner(System.in);
        int chooseMenu;

    do { 
        System.out.println();
        System.out.println("======= EAD Ticket Booking System =======");
        System.out.println("1. Tampilkan Daftar Penerbangan");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Tampilkan Pesanan Tiket");
        System.out.println("4. Exit");
        System.out.println("Silahkan pilih menu: ");
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


