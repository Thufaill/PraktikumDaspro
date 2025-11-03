package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        float totalNilai, rataNilai;

        float maxNilai = 0;
        int maxKelompok = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            if (rataNilai > maxNilai) {
                maxNilai = rataNilai;
                maxKelompok = i;
            }
            System.out.println("Kelompok " + i + ": nilai rata rata   = " + rataNilai);
            i++;
        }
        System.out.println("\n\nKelompok " + maxKelompok + " adalah nilai tertinggi: " + maxNilai);
        sc.close();
    }
}