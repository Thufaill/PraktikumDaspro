package jobsheet11;

public class Kafe18 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang " + namaPelanggan + "!");
        if (kodePromo == "DISKON50") {
            System.out.println("Selamat kamu mendapatkan diskon 50%");
        } else if (kodePromo == "DISKON30") {
            System.out.println("Selamat kamu mendapatkan diskon 50%");
        } else {
            System.out.println("Kode Invalid");
        }

        if (isMember) {
            System.out.println("Anda adalah member,dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== Menu Resto Kafe =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");
    }
}
