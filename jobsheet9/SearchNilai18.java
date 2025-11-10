package jobsheet9;

import java.util.Scanner;

public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int nilaiDiInput = sc.nextInt();
        int[] arrNilai = new int[nilaiDiInput];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang akan dicari: ");
        int key = sc.nextInt();

        boolean gaKetemu = false;

        System.out.println();
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                System.out.println("Nilai " + arrNilai[i] + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                break;
            }
        }
        if (gaKetemu) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
        sc.close();
    }
}