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

    public void tampil() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Merek = " + this.merek);
        System.out.println("Harga = " + this.harga);
    }


    public void tampil(boolean detailed) {
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
        super.tampil(); 
    }
}

class senar extends alatPancing {
    public senar(String nama, String merek, double harga) {
        super(nama, merek, harga);
    }

    @Override
    public void tampil() {
        System.out.println("Senar:");
        super.tampil(); 
    }
}
