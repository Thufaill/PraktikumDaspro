package jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa18 {

    public static void isianArray(int[] nilai, Scanner sc) {
        System.out.println("\nInput Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilai[i]);
        }
    }

    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa, sc);
        tampilArray(nilaiMahasiswa);

        int total = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal seluruh nilai mahasiswa: " + total);

        sc.close();
    }
}
