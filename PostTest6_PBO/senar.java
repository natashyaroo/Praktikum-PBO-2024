public class senar extends alatPancing {
    public senar(String nama, String merek, double harga) {
        super(nama, merek, harga);
    }

    @Override
    public void tampil() {
        System.out.println("Senar:");
        System.out.println("Nama = " + getNama());
        System.out.println("Merek = " + getMerek());
        System.out.println("Harga = " + getHarga());
    }
}
