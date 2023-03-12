package PemrogramanLanjut.Modul5;

import java.util.Scanner;

public class Tugas4 {
    int[] array = new int[10]; int size;
    Scanner scan = new Scanner(System.in);

    void inputArray() {
        System.out.print("Size: ");
        size = scan.nextInt();
        System.out.println("Data :");

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
    }

    void sorting () {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + "  ");
        }
    }

    void ratio() {
        double positif = 0;
        double negatif = 0;
        double zero = 0;

        for (int i = 0; i < size; i++) {
            if (array[i]>0) {
                positif++;
            }
            else if (array[i]<0) {
                negatif++;
            }
            else {
                zero++;
            }
        }

        System.out.println("\n\nRasio Positif\t: " + String.format ("%.2f", positif/size));
        System.out.println("Rasio Zero\t\t: " + String.format ("%.2f", zero/size));
        System.out.println("Rasio Negatif\t: " + String.format ("%.2f", negatif/size));
    }
}

class Main {
    public static void main(String[] args) {
        Tugas4 sort = new Tugas4();

        sort.inputArray();
        System.out.println("\nSetelah di Urutkan: ");
        sort.sorting();
        sort.ratio();
    }
}
