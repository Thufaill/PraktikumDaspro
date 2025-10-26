package jobsheet7;

import java.util.Scanner;

public class Tugas1PenjualanTiket18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket = 50000, totalProfit;
        int jumlahTiketYangDibeli = 0, pelanggan, i = 1, totalTiketTerjual = 0;

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
                hargaTiket = jumlahTiketYangDibeli * hargaTiket - (hargaTiket * 0.1);
            } else if (jumlahTiketYangDibeli > 4) {
                System.out.println("Selamat anda mendapatkan diskon sebesar 10%");
                hargaTiket = jumlahTiketYangDibeli * hargaTiket - (hargaTiket * 0.15);
            }
            i++;
        }
        totalProfit = hargaTiket * pelanggan;
        totalTiketTerjual += jumlahTiketYangDibeli;
        System.out.println("Berikut adalah total tiket yang terjual: " + totalTiketTerjual);
        System.out.println("Berikut adalah total profit yang ada: " + totalProfit);
        sc.close();
    }
}
