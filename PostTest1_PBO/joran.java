public class joran {
    String nama, merek;
    double harga;
    public joran(String nama, String merek, double harga) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
    }
    void tampil() {
        System.out.println("Nama = " + this.nama);
        System.out.println("   Merek = " + this.merek);
        System.out.println("   Harga = " + this.harga);
    }
}
