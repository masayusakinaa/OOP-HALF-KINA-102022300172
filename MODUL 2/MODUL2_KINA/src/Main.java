public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(23, "warnet gaming rawr", 5000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();
        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(23, "warnet gaming rawr", 7000, true);
        // To do: Panggillah Method Informasi dari class KompterVIP
        komputerVIP.Informasi();
        System.out.println();

        // To do: Panggillah Method Login
        komputerVIP.login("Kina");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 3);
        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(23, "warnet gaming rawr", 10000, tru);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        System.out.println();
        komputerPremium.Informasi();

        System.out.println();

        // To do: Panggillah Method Pesan
        komputerPremium.pesan(5);

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       komputerPremium.tambahLayanan("bakso");
       komputerPremium.tambahLayanan("bakso", "esteh");
    }
}