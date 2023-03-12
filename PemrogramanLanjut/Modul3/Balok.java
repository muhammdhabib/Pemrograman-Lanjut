package PemrogramanLanjut.Modul3;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    protected void hasil() {
        Perhitungan ph = new Perhitungan();

        System.out.println("Hasil Luas balok :" + ph.luas(this));
        System.out.println("Hasil Volume balok :" + ph.volume(this));
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
