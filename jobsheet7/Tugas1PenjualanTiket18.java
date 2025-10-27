package jobsheet7;

import java.util.Scanner;

public class Tugas1PenjualanTiket18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket = 50000, totalHarga = 0;
        double totalHargaPelanggan;
        int jumlahTiketYangDibeli = 0, pelanggan, i = 1, totalTiketTerjual = 0;

        System.out.println("=== PENJUALAN TIKET BIOSKOP ===");
        System.out.print("Masukkan jumlah pelanggan: ");
        pelanggan = sc.nextInt();
        while (i <= pelanggan) {

            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
            jumlahTiketYangDibeli = sc.nextInt();

            if (jumlahTiketYangDibeli < 0) {
                System.out.println("Masukkan jumlah tiket sampai valid!");
                continue;
            }
            if (jumlahTiketYangDibeli > 10) {
                System.out.println("Selamat anda mendapatkan diskon sebesar 15%");
                hargaTiket -= hargaTiket * 0.15;
            } else if (jumlahTiketYangDibeli > 4) {
                System.out.println("Selamat anda mendapatkan diskon sebesar 10%");
                hargaTiket -= hargaTiket * 0.10;
            }
            
            totalHargaPelanggan = jumlahTiketYangDibeli * hargaTiket;
            totalTiketTerjual += jumlahTiketYangDibeli;
            totalHarga += totalHargaPelanggan;
            i++;
        }
        System.out.println("======================================");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total harga tiket   : " + totalHarga);
        System.out.println("======================================");
        sc.close();
    }
}  
