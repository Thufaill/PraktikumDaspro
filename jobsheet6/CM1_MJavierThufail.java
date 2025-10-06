import java.util.Scanner;

public class cm1_MJavierThufail {

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

        double nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        String huruf1 = "";
        if (nilaiAkhir1 >= 80) huruf1 = "A";
        else if (nilaiAkhir1 >= 73) huruf1 = "B+";
        else if (nilaiAkhir1 >= 65) huruf1 = "B";
        else if (nilaiAkhir1 >= 60) huruf1 = "C+";
        else if (nilaiAkhir1 >= 50) huruf1 = "C";
        else if (nilaiAkhir1 >= 39) huruf1 = "D";
        else huruf1 = "E";

        String huruf2 = "";
        if (nilaiAkhir2 >= 80) huruf2 = "A";
        else if (nilaiAkhir2 >= 73) huruf2 = "B+";
        else if (nilaiAkhir2 >= 65) huruf2 = "B";
        else if (nilaiAkhir2 >= 60) huruf2 = "C+";
        else if (nilaiAkhir2 >= 50) huruf2 = "C";
        else if (nilaiAkhir2 >= 39) huruf2 = "D";
        else huruf2 = "E";

        String status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

        String statusSemester;
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Ada mata kuliah tidak lulus)";
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

        System.out.printf("%nRata-rata Nilai Akhir: %.2f%n", rataRata);
        System.out.println("Status Semester      : " + statusSemester);

        input.close();
    }
}
