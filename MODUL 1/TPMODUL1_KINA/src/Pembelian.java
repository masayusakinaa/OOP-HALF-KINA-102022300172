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
        System.out.print(s:"NIK            :");
        Penumpang.setNik(sc.nextLine());
        System.out.print(s:"NAMA DEPAN     :");
        Penumpang.setNamaDepan(sc.nextLine());
        System.out.print(s:"NAMA BELAKANG  :");
        Penumpang.setNamaBelakang(sc.nextLine());
        Penumpang.tampilDafarPenumpang();

        System.out.print(s:"pilih nomor penerbangan");
        pilihPenerbangan = sc.nextInt();

        if (pilihPenerbangan > dataPenerbangan.size()) {
            System.out.println(x:"Penerbangan tidak tersedia");
        }
    
    }

    public static void main(String[] args) throws Exception {
        dataPenerbangan = new ArrayList<>();
        dataPenerbangan.add(new Penerbangan(nomorPenerbangan:"GA101", bandaraKeberangkatan:"CGK, Jakarta", bandaraKeberangkatan:"DPS, Bali", "06.30", "08.15", 120000000));
        dataPenerbangan.add(new Penerbangan(nomorPenerbangan:"QZ202", bandaraKeberangkatan:"SUB, SURABAYA",bandaraKeberangkatan: "KNO, Medan", "09.00", "11.45", 135000000));
        
        Scanner sc = new Scanner(System.in);
        int chooseMenu;

    do { 
        System.out.println();
        System.out.println("======= EAD Ticket Booking System =======");
        System.out.println(x:"1. Tampilkan Daftar Penerbangan");
        System.out.println(x:"2. Beli Tiket");
        System.out.println(x:"3. Tampilkan Pesanan Tiket");
        System.out.println(x:"4. Exit");
        System.out.println(x:"Silahkan pilih menu: ");
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
                System.out.println(x:"Terima kasih.");
                break;
            default:
                System.out.println(x:"Menu tidak tersedia.");
        }
    } while (chooseMenu != 4);
    
    sc.close();
    }

}


