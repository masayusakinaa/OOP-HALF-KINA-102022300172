public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Detail Hewan\n");

        Kucing kucing = new Kucing("Chira", 3, "Persia");
        Burung burung = new Burung("Ocong", 2, "Putih");

        System.out.println("ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("tikus");
        System.out.println();
            
        System.out.println("ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("serangga");
        System.out.println();
    
        kucing.infoHewan();
        System.out.println();
        burung.infoHewan();
        }
}

