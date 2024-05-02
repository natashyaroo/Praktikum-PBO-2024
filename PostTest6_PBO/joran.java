public class joran extends alatPancing {
    public joran(String nama, String merek, double harga) {
        super(nama, merek, harga);
    }

    @Override
    public void tampil() {
        System.out.println("Joran:");
        System.out.println("Nama = " + getNama());
        System.out.println("Merek = " + getMerek());
        System.out.println("Harga = " + getHarga());
    }
}