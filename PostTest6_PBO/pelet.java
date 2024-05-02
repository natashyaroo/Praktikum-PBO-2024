interface fungsilainnya{
    void tampil();
    void tampilmerek();
}
    public class pelet {
    private final String nama;
    private final String merek;
    private final double harga;

    public pelet(String nama, String merek, double harga) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getMerek() {
        return merek;
    }

    public double getHarga() {
        return harga;
    }

    void tampil() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Merek = " + this.merek);
        System.out.println("Harga = " + this.harga);
    }
}

class concretePelet extends pelet implements fungsilainnya {
    public concretePelet(String nama, String merek, double harga) {
        super(nama, merek, harga);
    }

    @Override
    public void tampil() {
        System.out.println("Pelet:");
        System.out.println("Nama = " + getNama());
        System.out.println("Harga = " + getHarga());
    }
    @Override
    public void tampilmerek(){
        System.out.println("Merek = " + getMerek());
    }
}
