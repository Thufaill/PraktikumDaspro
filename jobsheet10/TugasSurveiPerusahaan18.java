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

        for (int responden = 0; responden < TOTAL_RESPONDEN; responden++) {
            System.out.println("\n>> Responden ke-" + (responden + 1));

            for (int pertanyaan = 0; pertanyaan < TOTAL_PERTANYAAN; pertanyaan++) {
                int nilaiJawaban;
                do {
                    System.out.print("   Nilai untuk Pertanyaan " + (pertanyaan + 1) + " (1-5): ");
                    nilaiJawaban = sc.nextInt();

                    if (nilaiJawaban < 1 || nilaiJawaban > 5) {
                        System.out.println("   !! Nilai harus 1 - 5, coba lagi.");
                    }

                } while (nilaiJawaban < 1 || nilaiJawaban > 5);

                jawabanSurvei[responden][pertanyaan] = nilaiJawaban;
            }
        }

        System.out.println("\n----------------------------------------");
        System.out.println("        RATA-RATA PER RESPONDEN       ");
        System.out.println("----------------------------------------");

        for (int responden = 0; responden < TOTAL_RESPONDEN; responden++) {
            double totalNilaiResponden = 0;

            for (int pertanyaan = 0; pertanyaan < TOTAL_PERTANYAAN; pertanyaan++) {
                totalNilaiResponden += jawabanSurvei[responden][pertanyaan];
            }

            double rataRataResponden = totalNilaiResponden / TOTAL_PERTANYAAN;
            System.out.printf("Responden %-2d : %.2f\n", (responden + 1), rataRataResponden);
        }

        System.out.println("\n----------------------------------------");
        System.out.println("       RATA-RATA PER PERTANYAAN       ");
        System.out.println("\n----------------------------------------");

        for (int pertanyaan = 0; pertanyaan < TOTAL_PERTANYAAN; pertanyaan++) {
            double totalNilaiPertanyaan = 0;

            for (int responden = 0; responden < TOTAL_RESPONDEN; responden++) {
                totalNilaiPertanyaan += jawabanSurvei[responden][pertanyaan];
            }

            double rataRataPertanyaan = totalNilaiPertanyaan / TOTAL_RESPONDEN;
            System.out.printf("Pertanyaan %-2d : %.2f\n", (pertanyaan + 1), rataRataPertanyaan);
        }

        System.out.println("\n----------------------------------------");
        System.out.println("        RATA-RATA KESELURUHAN         ");
        System.out.println("\n----------------------------------------"); 

        double totalSemua = 0;

        for (int responden = 0; responden < TOTAL_RESPONDEN; responden++) {
            for (int pertanyaan = 0; pertanyaan < TOTAL_PERTANYAAN; pertanyaan++) {
                totalSemua += jawabanSurvei[responden][pertanyaan];
            }
        }

        double rataKeseluruhan = totalSemua / (TOTAL_RESPONDEN * TOTAL_PERTANYAAN);
        System.out.printf("Rata-Rata Keseluruhan : %.2f\n", rataKeseluruhan);

        sc.close();
    }
}
