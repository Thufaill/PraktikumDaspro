package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        String penonton[][] = new String[4][2];
        int pilihanMenu;

        while (true) {
            System.out.println("\n+======+ Selamat datang di bioskop +======+");
            System.out.println("- Menu 1 : Input data penonton");
            System.out.println("- Menu 2 : Tampilkan daftar penonton");
            System.out.println("- Menu 3 : Exit");
            System.out.print("Mana yang anda pilih : ");
            pilihanMenu = sc.nextInt();
            sc.nextLine();

            if (pilihanMenu == 1) {

                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();

                        if (baris < 1 || baris > 4) {
                            System.out.println("Maaf, baris tersebut tidak tersedia.");
                        } else {
                            break;
                        }
                    }

                    while (true) {
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();

                        if (kolom < 1 || kolom > 2) {
                            System.out.println("Maaf, kolom tersebut tidak tersedia.");
                        } else {
                            break;
                        }
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Maaf, kursi tersebut sudah terisi.");
                        sc.nextLine();
                        continue;
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    sc.nextLine();
                    System.out.print("Apakah ingin input penonton lagi? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (pilihanMenu == 2) {

                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print(" *** ");
                        } else {
                            System.out.print("[" + penonton[i][j] + "] ");
                        }
                    }
                    System.out.println();
                }

            } else if (pilihanMenu == 3) {
                System.out.println("Baik, terima kasih telah berkunjung.");
                break;

            } else {
                System.out.println("Menu tidak valid, silakan coba lagi.");
            }
        }

        sc.close();
    }
}