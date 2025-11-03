package jobsheet8;

import java.util.Scanner;

public class Tugas1JumlahKuadrat18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan rentang n\t: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int totalKuadrat = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                totalKuadrat += kuadrat;

                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + totalKuadrat);
        }
        sc.close();
    }
}