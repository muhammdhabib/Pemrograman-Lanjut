package PemrogramanLanjut.Modul1;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String studentNumber = null;
        boolean condition;

        do {
            condition = true;
            try {
                System.out.print("Inputkan NIM Mahasiswa: ");
                studentNumber = scan.nextLine();

                if (studentNumber.length() < 15) {
                    throw new Exception("NIM Kurang dari 15 Angka");
                }
                if (studentNumber.length() > 15) {
                    throw new Exception("NIM Lebih dari 15 Angka");
                }
                String checkNumber = studentNumber.substring(4, 12);
                if (!(checkNumber.equals("10370311"))) {
                    throw new Exception("NIM Harus Berisi 10370311");
                }

            } catch (Exception e){
                condition = false;
                System.out.println(e);
            }

        } while (!condition);
        System.out.println("\nNIM : " + studentNumber + " Berhasil di Input");
    }
}