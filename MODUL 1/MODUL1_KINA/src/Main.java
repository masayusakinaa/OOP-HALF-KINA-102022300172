// Don't delete any comments below!!!
// Todo: Import Scanner

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);

        // Todo : Create Loop list menu
        while (true) {
            System.out.println("===== Menu Inventaris Makanan EAD =====");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
            System.out.println("Pilih Menu:             "); 
            int pilih = scanner.nextInt();

            if(pilih == 1){
                manajemenInventaris.tambahMakananKering();
            } else if (pilih == 2){
                manajemenInventaris.tambahMakananBasah();
            } else if (pilih == 3) {
                manajemenInventaris.tampilkanSemuaMakanan();
            } else if (pilih == 4){
                System.out.println("Sampai Jumpa");
                break;
            }
            
        }
           
    }
}
