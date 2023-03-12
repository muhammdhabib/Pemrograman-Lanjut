package PemrogramanLanjut.Modul5;
import java.util.Arrays;

public class Tugas3 {

    public static void main(String[] args) {
        int hitungpositif = 0, hitungnegatif = 0, hitungzero = 0, indek;
        int[] array = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};

        System.out.println("Size : " + array.length);
        System.out.println("Sebelum di urutkan");
        System.out.println(Arrays.toString(array));
        System.out.println("Setelah di urutkan");
        Arrays.sort(array);

        for (int nilai : array){
            System.out.print(nilai + "  ");
        }

        indek = 0;
        while (indek < array.length) {
            indek++;
        }

        indek = 0;
        while (indek < array.length) {
            if (array[indek] < 0) {
                hitungnegatif++;
            } else if (array[indek] == 0) {
                hitungzero++;
            } else {
                hitungpositif++;
            }
            indek++;
        }

        double panjang = array.length;
        double a = hitungpositif / panjang;
        double b = hitungzero / panjang;
        double c = hitungnegatif / panjang;

        System.out.println("\n\nBanyak Data Positif " + hitungpositif + " , dengan Rasio: " + String.format ("%.2f", a));
        System.out.println("Banyak Data Zero " + hitungzero + " , dengan rasio: " + String.format ("%.2f", b));
        System.out.println("Banyak Data Negatif " + hitungnegatif + " , dengan Rasio: " + String.format ("%.2f", c));
    }
}