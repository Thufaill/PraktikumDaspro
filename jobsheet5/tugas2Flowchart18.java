import java.util.Scanner;

public class tugas2Flowchart18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.println("Masukan angka: ");
        angka = sc.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Angkanya genap");

        }else{
            System.out.println("Angkanya ganjil");
        }
        sc.close();
    }
}