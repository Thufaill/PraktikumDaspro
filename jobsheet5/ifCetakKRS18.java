import java.util.Scanner;
public class ifCetakKRS18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("pembayaran UKT terverivikasi");
            System.out.println("silakan cetak KRS dan minta tanda tangan DPA");
        }else {
            System.out.println("Registrasi ditolak, silahkan lunasin UKT terlebih dahulu");
        }
        String hasil = uktLunas
                ? "Pembayaran terverifikasi\nsilakan cetak KRS dan minta tanda tangan DPA."
                : "Registrasi ditolak, lunasi UKT terlebih dahulu sebelum mencetak KRS.";

        System.out.println("\n--- Versi Ternary Operator ---");
        System.out.println(hasil);
            sc.close();
    }
}