public abstract class alatPancing {
    private final String nama;
    private final String merek;
    private final double harga;

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

    public abstract void tampil();
    
    public final void tampil(boolean detailed) {
        if (detailed) {
            System.out.println("Detail Alat Pancing:");
            tampil(); 
            System.out.println("--------------------");
        } else {
            System.out.println("Nama = " + this.nama);
        }
    }
}

class joran extends alatPancing {
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

class senar extends alatPancing {
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
