package PemrogramanLanjut.Modul5;
import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        int[] arr = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        Scanner input =new Scanner(System.in);

        System.out.println("Sebelum di urutkan");
        System.out.println(Arrays.toString(arr));
        System.out.println("Setelah di urutkan");
        Arrays.sort(arr);

        for (int nilai : arr){
            System.out.print(nilai + "  ");
        }

        System.out.print("\n\nMasukan Data: ");
        int a = input.nextInt();
        int hasil = Arrays.binarySearch(arr, a);

        System.out.println("Data " + a + " ditemukan di index " + hasil);
    }
}
