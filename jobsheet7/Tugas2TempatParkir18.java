package jobsheet7;

import java.util.Scanner;

public class Tugas2TempatParkir18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

       do {
            System.out.println("\nSISTEM PARKIR KENDARAAN");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }

                System.out.println("--------------------------------------");
                System.out.println("Durasi Parkir    : " + durasi + " jam");
                System.out.println("Biaya Sementara  : Rp " + total);
                System.out.println("--------------------------------------");

            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid.");
                System.out.println("Masukkan 1 (Mobil), 2 (Motor), \natau 0 untuk keluar.");
            }

        } while (jenis != 0);

        System.out.println("======================================");
        System.out.println("Total Biaya Parkir : Rp " + total);
        System.out.println("Terima kasih telah menggunakan layanan kami!");
        System.out.println("======================================");
        
    sc.close();
    }
}
