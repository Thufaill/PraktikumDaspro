package jobsheet9;

import java.util.Scanner;

public class Tugas3CariMenu18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] daftarMenu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("====================================");
        System.out.println("         DAFTAR MENU KAFE SENJA     ");
        System.out.println("====================================");

        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i]);
        }

        System.out.println("====================================\n");
        System.out.print("Masukkan nama makanan atau minuman yang ingin dicari: ");
        String menuDicari = input.nextLine();

        boolean ditemukan = false;
        int posisiMenu = -1;

        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarMenu[i].equalsIgnoreCase(menuDicari)) {
                ditemukan = true;
                posisiMenu = i;
                break;
            }
        }

        System.out.println("-------------------------------------------");
        if (ditemukan) {
            System.out.println(menuDicari + " tersedia di menu.");
            System.out.println("Posisi urutan ke-" + (posisiMenu + 1));
        } else {
            System.out.println("Maaf, " + menuDicari + " tidak tersedia di menu kami.");
        }
        System.out.println("-------------------------------------------");

        input.close();
    }
}
