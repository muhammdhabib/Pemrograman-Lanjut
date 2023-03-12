package PemrogramanLanjut.Modul2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String NIM = null; String Email = null; String phoneNum = null;
        String Name; boolean condition;

        System.out.print("Nama Mahasiswa\t: ");
        Name = scan.nextLine();

        do {
            condition = true;
            try {
                System.out.print("Masukkan NIM\t: ");
                NIM = scan.nextLine();
                if (NIM.length() < 15) {
                    throw new Exception("NIM Kurang dari 15 Angka");
                }
                if (NIM.length() > 15) {
                    throw new Exception("NIM Lebih dari 15 Angka");
                }
                String subNIM = NIM.substring(4, 12);
                if (!(subNIM.equals("10370311"))) {
                    throw new Exception("NIM harus berisi 10370311");
                }
            } catch (Exception e){
                condition = false;
                System.out.println(e);
            }
        } while(!condition);

        do{
            try {
                System.out.print("No. Telepon\t\t: ");
                phoneNum = scan.nextLine();
                String NomorRegex = "^\\d{12}$";
                Pattern pattern = Pattern.compile(NomorRegex);
                if (pattern.matcher(phoneNum).matches()) {
                    condition = true;
                } else {
                    throw new Exception("No. Telepon Hanya Berisi 12 Angka");
                }
            } catch (Exception e){
                condition = false;
                System.out.println(e);}
        } while(!condition);

        do {
            try {
                System.out.print("Email\t\t\t: ");
                Email = scan.nextLine();
                String emailRegex =  "[a-zA-Z\\d]*@" + "webmail.umm.ac.id";
                Pattern pattern = Pattern.compile(emailRegex);
                if(pattern.matcher(Email).matches()) {
                    condition = true;
                } else {
                    throw new Exception("Hanya Email @webmail.umm.ac.id");
                }
            } catch (Exception e){
                condition = false;
                System.out.println(e);
            }
        } while(!condition);

        System.out.println("\nData Mahasiswa Informatika");
        System.out.println("Nama\t\t: " +Name);
        System.out.println("NIM\t\t\t: " +NIM);
        System.out.println("No. Telepon\t: " +phoneNum);
        System.out.println("Email\t\t: " +Email);
    }
}