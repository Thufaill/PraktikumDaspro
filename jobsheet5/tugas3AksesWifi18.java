import java.util.Scanner;

public class tugas3AksesWifi18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputPengguna;
        int sks;

        System.out.println("Siapa pengguna? ");
        inputPengguna =sc.nextLine();
        if (inputPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses diterima");
        }if (inputPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Berapa SKSnya");
            sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Mahasiswa gacor");
            }else if (sks <= 12) {
                System.out.println("Mahasiswa malas");
            }
        }
        else{
            System.out.println("Akses ditolak");
        }
       sc.close();
}
 }