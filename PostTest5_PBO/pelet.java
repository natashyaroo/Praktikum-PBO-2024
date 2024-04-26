public abstract class pelet {
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


    public abstract void tampil();
}

class concretePelet extends pelet {
    public concretePelet(String nama, String merek, double harga) {
        super(nama, merek, harga);
    }

    @Override
    public void tampil() {
        System.out.println("Pelet:");
        System.out.println("Nama = " + getNama());
        System.out.println("Merek = " + getMerek());
        System.out.println("Harga = " + getHarga());
    }
}
