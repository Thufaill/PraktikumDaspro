package jobsheet9;

import java.util.Scanner;

public class Tugas1NilaiMahasiswa18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] daftarNilai = new int[jumlahMahasiswa];
        int totalNilai = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        System.out.println();
        System.out.println("=== Input Nilai Mahasiswa ===");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            daftarNilai[i] = input.nextInt();

            totalNilai += daftarNilai[i];

            if (daftarNilai[i] > nilaiTertinggi) {
                nilaiTertinggi = daftarNilai[i];
            }

            if (daftarNilai[i] < nilaiTerendah) {
                nilaiTerendah = daftarNilai[i];
            }
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;

        System.out.println();
        System.out.println("==================================");
        System.out.println("      DAFTAR NILAI MAHASISWA     ");
        System.out.println("==================================");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + daftarNilai[i]);
        }
        System.out.println("==================================");
        System.out.printf("Rata-rata Nilai   : %.2f%n", rataRata);
        System.out.println("Nilai Tertinggi   : " + nilaiTertinggi);
        System.out.println("Nilai Terendah    : " + nilaiTerendah);
        System.out.println("==================================");

        input.close();
    }
}
