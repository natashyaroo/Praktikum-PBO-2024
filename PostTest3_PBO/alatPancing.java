public class alatPancing {
    private String nama;
    private String merek;
    private double harga;

    public alatPancing(String nama, String merek, double harga){
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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    void tampil() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Merek = " + this.merek);
        System.out.println("Harga = " + this.harga);
    }

}
class joran extends alatPancing{
    public joran (String nama, String merek, double harga){
        super(nama, merek,harga);
    }
    public void tampil(int index) {
        System.out.print(index + 1 + ".");
        System.out.println("Nama = " + this.getNama());
        System.out.println("Merek = " + this.getMerek());
        System.out.println("Harga = " + this.getHarga());
    }
}
class senar extends alatPancing{
    public senar (String nama, String merek, double harga){
        super(nama, merek,harga);
    }
    public void tampil(int index) {
        System.out.print(index + 1 + ".");
        System.out.println("Nama = " + this.getNama());
        System.out.println("Merek = " + this.getMerek());
        System.out.println("Harga = " + this.getHarga());
    }
}
