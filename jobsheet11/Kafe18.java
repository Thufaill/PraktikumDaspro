package jobsheet11;

import java.util.Arrays;
import java.util.Scanner;

public class Kafe18 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Promo: Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Promo: Diskon 30%");
        } else {
            System.out.println("Tidak ada promo atau kode salah.");
        }

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("\n===== Menu Resto Kafe =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte      - Rp 22.000");
        System.out.println("4. Teh Tarik  - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("============================\n");
    }

    public static int hitungTotalPesanan(int[] pilihanMenu, int[] jumlahItem, String kodePromo) {

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int total = 0;

        for (int i = 0; i < pilihanMenu.length; i++) {
            int index = pilihanMenu[i] - 1;
            total += hargaItems[index] * jumlahItem[i];
        }

        int potongan = 0;

        if (kodePromo.equals("DISKON50")) {
            potongan = total * 50 / 100;
            System.out.println("Diskon promo 50% : Rp " + potongan);
        } else if (kodePromo.equals("DISKON30")) {
            potongan = total * 30 / 100;
            System.out.println("Diskon promo 30% : Rp " + potongan);
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon.");
        }

        return total - potongan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] member = {"Budi", "Vier", "Iben"};

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        boolean isMember = Arrays.stream(member).anyMatch(nama::equals);

        System.out.print("Masukkan kode promo (jika tidak ada tekan enter): ");
        String kodePromo = sc.nextLine();

        Menu(nama, isMember, kodePromo);

        System.out.println("Masukkan nomor menu yang ingin dibeli (pisahkan dengan spasi)");
        System.out.print("Contoh: 1 3 5 : ");
        String pilihan = sc.nextLine();

        String[] splitMenu = pilihan.trim().split(" ");
        int[] menuDipilih = new int[splitMenu.length];
        int[] jumlahItem = new int[splitMenu.length];

        for (int i = 0; i < splitMenu.length; i++) {
            menuDipilih[i] = Integer.parseInt(splitMenu[i]);
            System.out.print("Jumlah item untuk menu " + menuDipilih[i] + ": ");
            jumlahItem[i] = sc.nextInt();
        }

        System.out.println("--------------------------------");
        int totalAkhir = hitungTotalPesanan(menuDipilih, jumlahItem, kodePromo);
        System.out.println("--------------------------------");

        System.out.println("Total keseluruhan pesanan: Rp " + totalAkhir);

        sc.close();
    }
}
