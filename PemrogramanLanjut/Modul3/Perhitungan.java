package PemrogramanLanjut.Modul3;

public class Perhitungan extends Balok {

    public int luas(Balok sisi) {
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    public int volume(Balok sisi) {
        return 4 * sisi.getPanjang() *  sisi.getLebar() * sisi.getTinggi();
    }
}

