package jobsheet10;

import java.util.Scanner;

public class TugasSurveiPerusahaan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_RESPONDEN = 10;
        final int TOTAL_PERTANYAAN = 6;

        int[][] jawabanSurvei = new int[TOTAL_RESPONDEN][TOTAL_PERTANYAAN];

        System.out.println("======================================");
        System.out.println("          INPUT HASIL SURVEI          ");
        System.out.println("======================================");

        for (int i = 0; i < TOTAL_RESPONDEN; i++) {
            System.out.println("\n>> Responden ke-" + (i + 1));

            for (int j = 0; j < TOTAL_PERTANYAAN; j++) {
                int jawaban;
                do {
                    System.out.print("   Nilai pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();

                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("   !! Nilai harus 1 - 5, coba lagi.");
                    }

                } while (jawaban < 1 || jawaban > 5);

                jawabanSurvei[i][j] = jawaban;
            }
        }

        System.out.println("\n======================================");
        System.out.println("        RATA-RATA PER RESPONDEN       ");
        System.out.println("======================================");

        for (int i = 0; i < TOTAL_RESPONDEN; i++) {
            double totalNilaiResponden = 0;

            for (int j = 0; j < TOTAL_PERTANYAAN; j++) {
                totalNilaiResponden += jawabanSurvei[i][j];
            }

            double rataRataResponden = totalNilaiResponden / TOTAL_PERTANYAAN;
            System.out.printf("Responden %-2d : %.2f\n", (i + 1), rataRataResponden);
        }

        System.out.println("\n======================================");
        System.out.println("       RATA-RATA PER PERTANYAAN       ");
        System.out.println("======================================");

        for (int j = 0; j < TOTAL_PERTANYAAN; j++) {
            double totalNilaiPertanyaan = 0;

            for (int i = 0; i < TOTAL_RESPONDEN; i++) {
                totalNilaiPertanyaan += jawabanSurvei[i][j];
            }

            double rataRataPertanyaan = totalNilaiPertanyaan / TOTAL_RESPONDEN;
            System.out.printf("Pertanyaan %-2d : %.2f\n", (j + 1), rataRataPertanyaan);
        }

        System.out.println("\n======================================");
        System.out.println("        RATA-RATA KESELURUHAN         ");
        System.out.println("======================================");

        double totalSemua = 0;

        for (int i = 0; i < TOTAL_RESPONDEN; i++) {
            for (int j = 0; j < TOTAL_PERTANYAAN; j++) {
                totalSemua += jawabanSurvei[i][j];
            }
        }

        double rataKeseluruhan = totalSemua / (TOTAL_RESPONDEN * TOTAL_PERTANYAAN);
        System.out.printf("Rata-rata keseluruhan : %.2f\n", rataKeseluruhan);

        sc.close();
    }
}
