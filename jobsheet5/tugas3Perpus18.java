import java.util.Scanner;

public class tugas3Perpus18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean punyaKartu;
        boolean registrasiOnline;

        System.out.print("Apakah punya kartu (true/false): ");
        punyaKartu = sc.nextBoolean();
        System.out.print("Apakah sudah registrasi online (true/false): ");
        registrasiOnline = sc.nextBoolean();

        if (punyaKartu && registrasiOnline) {
            System.out.println("Masuk sana");
        } else {
            System.out.println("Jangan masuk");
        }
        sc.close();
    }
}
