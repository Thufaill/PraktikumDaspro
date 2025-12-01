package jobsheet11;

import java.util.Arrays;
import java.util.Scanner;

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

    public static int hitungTotalHarga18(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodeVoucher = "kosong";
        boolean isMember;
        String member[] = {"Budi","Vier","Iben"};

        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        isMember = Arrays.stream(member).anyMatch(nama::equals);

        System.out.println("================================");
        System.out.println("Apakah memiliki kode promo ? (Y/N)");
        System.out.print("=> ");

        String isAnyVoucher = sc.nextLine();
        if (isAnyVoucher.equalsIgnoreCase("Y")) {
            System.out.print("Kode Voucher = ");
            kodeVoucher = sc.nextLine();
        }
        System.out.println("================================");

        Menu(nama, isMember, kodeVoucher);
        System.out.println("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenuu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga18(pilihanMenuu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);

        sc.close();
    }
}
