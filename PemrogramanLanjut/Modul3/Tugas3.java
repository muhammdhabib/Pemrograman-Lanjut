package PemrogramanLanjut.Modul3;

public class Tugas3 {
    static boolean isCube(long input) {
        final double cbrt = Math.cbrt(input);
        return (Math.round(cbrt)*Math.round(cbrt)
                *Math.round(cbrt)) == input;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
