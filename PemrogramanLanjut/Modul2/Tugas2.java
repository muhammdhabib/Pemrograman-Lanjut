package PemrogramanLanjut.Modul2;
import java.util.Scanner;
public class Tugas2 {
    String name, from; int date;
    String[][] book = {
            {"this is Book, Malang. 2022"}
    };
    String[][] place = {
            {"Malang"},
            {"Bandung"},
            {"Surabaya"}
    };
    void cekName(String name) {
        for(int i=0; i< book.length; i++) {
            if(name.compareTo(book[i][0]) == 0) {
                this.name = name;
            }
        }
    }
    void cekFrom(String from) {
        for(int i=0; i< place.length; i++) {
            if (from.compareTo(place[i][0]) == 0) {
                this.from = from;
                break;
            }
        }
    }
    void cekDate(int date) {
        if(date < 2018 || date > 2022) {
            this.date = date;
        }
    }

    void tampil() {
            System.out.println("Nama Buku: " +name);
            System.out.println("Book From: " +from);
            System.out.println("Date : " +date);
        }

    public static void main(String[] args) {
        Tugas2 book = new Tugas2();
        Scanner input = new Scanner(System.in);
        String inName, inFrom;
        int inDate;

        System.out.println("Welcome to Library");
        System.out.print("Buku\t: ");
        inName = input.nextLine();
        book.cekName(inName);

        System.out.print("From\t: ");
        inFrom = input.nextLine();
        book.cekFrom(inFrom);

        System.out.print("Date\t: ");
        inDate = input.nextInt();
        book.cekDate(inDate);

        System.out.println("\nBuku\t: " +inName);
        System.out.println("From\t: " +inFrom);
        System.out.println("Date\t: " +inDate);

        System.out.println("\nBuku " + inName+ " berhasil ditambahkan");
    }
}