// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;
public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();

   
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        public void tambahMakananKering() { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Makanan: ");
        String nama = (scanner.nextLine());

        System.out.println("Jumlah: ");
        int jumlah = (scanner.nextInt());

        System.out.print("Harga: ");
        double harga = (scanner.nextDouble());

        System.out.println("brand: ");
        String brand = (scanner.nextLine());

        // Todo : Create a new object for MakananKering
        MakananKering makananKering = new MakananKering( nama,  jumlah,  harga,  brand);
        daftarMakananKering.add(makananKering);
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan Kering berhasil ditambahkan!");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Makanan: ");
        String nama = scanner.nextLine();
        System.out.println("Jumlah: ");
        int jumlah = scanner.nextInt();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        System.out.println("bahan: ");
        String bahan= scanner.nextLine();
    

        // Todo : Create a new object for MakananBasah
        MakananBasah makananBasah = new MakananBasah( nama,  jumlah,  harga,  bahan);
        daftarMakananBasah.add(makananBasah);
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan Basah berhasil ditambahkan!");
    }
    
    
    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Maaf nmakanan tidak ada");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering makananKeringnew : daftarMakananKering) {
                makananKeringnew.mknkrg();
            }
            
            // Todo : Create print notification for  Makanan Basah
            for  (MakananBasah makananBasahnew : daftarMakananBasah) {
                makananBasahnew.mknbsh();
            }
            }
        
    }
}