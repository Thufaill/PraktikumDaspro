import java.util.Scanner;

public class CM1_MJavierThufail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : "); 
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();
        System.out.print("Kelas: ");
        String kelas = input.nextLine();
        System.out.print("Prodi: ");
        String prodi = input.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = input.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = input.nextDouble();

        System.out.println("\n--- Mata Kuliah 3: Matematika ---");
        System.out.print("Nilai UTS   : ");
        double uts3 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas3 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas3 = input.nextDouble();

        double nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        double nilaiAkhir3 = (uts3 + uas3 + tugas3) / 3;

        String rataTerbesar = "";
        if (nilaiAkhir1 > nilaiAkhir2 && nilaiAkhir1 > nilaiAkhir3) {
            rataTerbesar = "Algoritma dan Pemrograman";
        } else if (nilaiAkhir2 > nilaiAkhir1 && nilaiAkhir2 > nilaiAkhir3) {
            rataTerbesar = "Struktur Data";
        } else if (nilaiAkhir3 > nilaiAkhir1 && nilaiAkhir3 > nilaiAkhir2) {
            rataTerbesar = "Matematika";
        }

        String huruf1 = "";
        if (nilaiAkhir1 > 80 && nilaiAkhir1 < 100) {
            huruf1 = "A";
        } else if (nilaiAkhir1 >= 73) {
            huruf1 = "B+";
        } else if (nilaiAkhir1 >= 65) {
            huruf1 = "B";
        } else if (nilaiAkhir1 >= 60) {
            huruf1 = "C+";
        } else if (nilaiAkhir1 >= 50) {
            huruf1 = "C";
        } else if (nilaiAkhir1 >= 39) {
            huruf1 = "D";
        } else if (nilaiAkhir1 >= 0) {
            huruf1 = "E";
        } else {
            huruf1 = "ERROR";
        }


        String huruf2 = "";
        if (nilaiAkhir2 > 80 && nilaiAkhir2 < 100) {
            huruf2 = "A";
        } else if (nilaiAkhir2 >= 73) {
            huruf2 = "B+";
        } else if (nilaiAkhir2 >= 65) {
            huruf2 = "B";
        } else if (nilaiAkhir2 >= 60) {
            huruf2 = "C+";
        } else if (nilaiAkhir2 >= 50) {
            huruf2 = "C";
        } else if (nilaiAkhir2 >= 39) {
            huruf2 = "D";
        } else if (nilaiAkhir2 >= 0) {
            huruf2 = "E";
        } else {
            huruf2 = "ERROR";
        }

         String huruf3 = "";
        if (nilaiAkhir3 > 80 && nilaiAkhir3 < 100) {
            huruf3 = "A";
        } else if (nilaiAkhir3 >= 73) {
            huruf3 = "B+";
        } else if (nilaiAkhir3 >= 65) {
            huruf3 = "B";
        } else if (nilaiAkhir3 >= 60) {
            huruf3 = "C+";
        } else if (nilaiAkhir3 >= 50) {
            huruf3 = "C";
        } else if (nilaiAkhir3 >= 39) {
            huruf3 = "D";
        } else if (nilaiAkhir3 >= 0) {
            huruf3 = "E";
        } else {
            huruf3 = "ERROR";
        }

        String status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";
        String status3 = (nilaiAkhir3 >= 60) ? "LULUS" : "TIDAK LULUS";

        double rataRata = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3;

        String statusSemester;
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }

        System.out.println("\n==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Prodi: " + prodi + "\n");

        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s%n",
                uts1, uas1, tugas1, nilaiAkhir1, huruf1, status1);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s%n",
                uts2, uas2, tugas2, nilaiAkhir2, huruf2, status2);
        System.out.printf("Matematika\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s%n",
                uts3, uas3, tugas3, nilaiAkhir3, huruf3, status3);

        System.out.printf("%nRata-rata Nilai Akhir: %.2f%n", rataRata);
        System.out.println("Status Semester      : " + statusSemester);
        System.out.println("Nilai rata-rata terbesar : " + rataTerbesar );

        input.close();

    }
} 
