package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe18 {

    static String[] menu;
    static int[][] data;

    static void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();

        menu = new String[jmlMenu];
        data = new int[jmlMenu][jmlHari];

        sc.nextLine();

        System.out.println("\n=== INPUT DATA MENU ===");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("\nPenjualan untuk menu: " + menu[i]);
            for (int h = 0; h < jmlHari; h++) {
                System.out.print("  Hari ke-" + (h + 1) + ": ");
                data[i][h] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void tampilTabel() {
        System.out.println("\n=========== TABEL PENJUALAN ===========");
        System.out.printf("%-18s", "Menu");

        for (int h = 0; h < data[0].length; h++) {
            System.out.printf("H%d\t", h + 1);
        }

        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-18s", menu[i]);
            for (int h = 0; h < data[i].length; h++) {
                System.out.printf("%d\t", data[i][h]);
            }
            System.out.println();
        }
    }

    static void menuTertinggi() {
        int maxTotal = -1;
        String menuMax = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < data[i].length; h++) {
                total += data[i][h];
            }

            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }

        System.out.println("\n====== MENU TERLARIS ======");
        System.out.println("Menu : " + menuMax);
        System.out.println("Total Penjualan : " + maxTotal);
    }

    static void rataRataMenu() {
        System.out.println("\n=== RATA-RATA PENJUALAN MENU ===");

        for (int i = 0; i < menu.length; i++) {
            double total = 0;
            for (int h = 0; h < data[i].length; h++) {
                total += data[i][h];
            }

            double rata = total / data[i].length;
            System.out.printf("%-18s : %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {

        inputData();
        tampilTabel();
        menuTertinggi();
        rataRataMenu();
    }
}
