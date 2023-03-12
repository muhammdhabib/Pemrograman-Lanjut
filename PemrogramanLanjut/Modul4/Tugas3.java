package PemrogramanLanjut.Modul4;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Konversi Hari\nMasukkan Jumlah Hari : ");
        int userInput = input.nextInt();

        extracted(userInput);
    }

    private static void extracted(int userInput) {
        int tahun = userInput /365;
        int sisa1 = userInput %365;
        int bulan = sisa1/30;
        int sisa2 = sisa1%30;

        System.out.print(userInput + " Hari Sama dengan\n");
        System.out.print(tahun + " Tahun " + bulan + " Bulan " + sisa2 + " Hari " );
    }
}

