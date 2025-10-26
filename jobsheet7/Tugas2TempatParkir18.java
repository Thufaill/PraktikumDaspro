package jobsheet7;

import java.util.Scanner;

public class Tugas2TempatParkir18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 5000;
                }

            } else if (jenis == 0) {
                System.out.println("Jenis kendaraan tidak valid");
            }
        } while (jenis != 0);
        System.out.println("Inilah totalnya: " + total);
        sc.close();
    }
}
