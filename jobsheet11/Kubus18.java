package jobsheet11;

import java.util.Scanner;

public class Kubus18 {

    public static int[] hitungKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        int luasPermukaan = 6 * sisi * sisi;

        return new int[] { volume, luasPermukaan };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("      MENGHITUNG KUBUS");
        System.out.println("=============================");

        System.out.print("Masukkan panjang sisi kubus : ");
        int sisi = sc.nextInt();

        int[] hasil = hitungKubus(sisi);

        System.out.println("\n========== HASIL PERHITUNGAN ==========");
        System.out.println("Volume Kubus           : " + hasil[0]);
        System.out.println("Luas Permukaan Kubus   : " + hasil[1]);

        sc.close();
    }
}
