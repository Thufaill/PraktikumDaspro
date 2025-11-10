package jobsheet9;

import java.util.Scanner;

public class Tugas2PemesananCafe18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] namaMenu = new String[jumlahPesanan];
        int[] hargaMenu = new int[jumlahPesanan];
        int totalBiaya = 0;

        System.out.println();
        System.out.println("====================================");
        System.out.println("        INPUT DATA PESANAN          ");
        System.out.println("====================================");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("  Nama Menu      : ");
            namaMenu[i] = input.nextLine();

            System.out.print("  Harga (Rp)     : ");
            hargaMenu[i] = input.nextInt();
            input.nextLine(); // membersihkan buffer

            totalBiaya += hargaMenu[i];
            System.out.println();
        }

        System.out.println("====================================");
        System.out.println("          DAFTAR PESANAN            ");
        System.out.println("====================================");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaMenu[i] + " - Rp " + hargaMenu[i]);
        }

        System.out.println("------------------------------------");
        System.out.println("Total Biaya      : Rp " + totalBiaya);
        System.out.println("------------------------------------");

        input.close();
    }
}
