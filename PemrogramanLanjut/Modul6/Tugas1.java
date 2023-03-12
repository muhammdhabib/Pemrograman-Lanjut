package PemrogramanLanjut.Modul6;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
@author     Muhammad Habibulloh, 202110370311259
@category   Praktikum Pemrograman Lanjut Modul 6
@version    JDK version 17
@since      2022-12-10
*/

public class Tugas1 {

    /**
     @exception NumberFormatException e
     @see       IOException
     */

    public static void main(String[] args) {
        // Create a as a new Scanner
        Scanner a = new Scanner(System.in);

        //Initialization Object with ArrayList.
        ArrayList<Integer> inNumber = new ArrayList<>();
        ArrayList<String> inString = new ArrayList<>();

        //Prints Hello, World! on standard output.
        System.out.println("Masukkan Data String/Integer");
        System.out.println("Untuk Berhenti/Keluar Ketik 'exit' ");

        while (true) {
            System.out.print("Input Data: ");
            String input = a.nextLine();

            //Separator between String and Integer.
            try {
                //Variable Integer Input, parseInt (String to Int).
                int numerik = Integer.parseInt(input);
                inNumber.add(numerik);
            } catch (NumberFormatException e) {
                //exit for close or stop the program.
                if (input.equals("exit")) {
                    break;
                }
                //Variable String Input.
                inString.add(input);
            }
        }

        System.out.println();
        //Display Data.
        for (int i = 0; i <= 100; i++) {
            System.out.print("\rMemuat Data " + i + "%");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Gagal Memuat");
            }
        }

        System.out.println("\nProses Memuat Selesai!");
        System.out.println("Inputan Integer: " + inNumber);
        System.out.println("Inputan String: " + inString);

        //Save data into txt.file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("DatabaseModul6.txt", true));
            writer.write("Inputan Integer: " + inNumber); writer.newLine();
            writer.write("Inputan String: " + inString); writer.newLine(); writer.close();
            System.out.println("Data Berhasil Ditambahkan ke Dalam File");
        } catch (IOException e) {
            System.out.println("Data Gagal Ditambahkan ke Dalam File");
        }
    }
}