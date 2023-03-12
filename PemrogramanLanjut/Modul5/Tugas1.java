package PemrogramanLanjut.Modul5;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        System.out.println("Data Sebelum di Urutkan");
        for (int i : arr) System.out.print(i + "  ");
        mengurutkan(arr);

        System.out.println("\nData Setelah di Urutkan : ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        System.out.print("\n\nMasukan Data: ");
        int index = input.nextInt();
        for (int x = 0; x < arr.length; x++){
            if (arr[x] == index){
                System.out.print("Data " + index + " Ada di Index ke: " + x);
            }
        }
    }

    public static void mengurutkan(int[] urutan) {
        int x = urutan.length - 1;
        while (x >= 1) {
            int y = 0;
            while (y <= x) {
                if (urutan[y] > urutan[x])
                    menukar(urutan, y, x);
                y++;
            }
            x--;
        }
    }

    public static void menukar(int[] urutan2, int elementY, int elementX) {
        int sementara = urutan2[elementX];
        urutan2[elementX] = urutan2[elementY];
        urutan2[elementY] = sementara;
    }
}