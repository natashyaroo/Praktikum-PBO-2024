import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main{
    public static void lihatSenar(final ArrayList<senar> senarList) {
        clearScreen();
        for (int i = 0; i < senarList.size(); i++) {
            senarList.get(i).tampil(i);
            promptEnterKey();
        }
    }
    
    public static final void lihatJoran(final ArrayList<joran> jorans) {
        clearScreen();
        for (int i = 0; i < jorans.size(); i++) {
            jorans.get(i).tampil(i);
            promptEnterKey();
        }
    }
    
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        
    } 
    public static void promptEnterKey(){
        System.out.println("\nTekan \"ENTER\" untuk Melanjutkan...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
     }
     public static void ubahSenar(ArrayList<senar> senarList, BufferedReader br) throws IOException {
        clearScreen();
        lihatSenar(senarList);
    
        System.out.print("Pilih Nomor Senar yang ingin diubah =  ");
        int choice = Integer.parseInt(br.readLine()) - 1;
    
        if (choice >= 0 && choice < senarList.size()) {
            senar senarToUpdate = senarList.get(choice);
    
            System.out.print("Masukkan Nama Baru Senar =  ");
            String nama = br.readLine();
            System.out.print("Masukkan Merek Baru Senar =  ");
            String merek = br.readLine();
            System.out.print("Masukkan Harga Baru Senar =  ");
            double harga = Double.parseDouble(br.readLine());
    
            senarToUpdate.setNama(nama);
            senarToUpdate.setMerek(merek);
            senarToUpdate.setHarga(harga);
    
            System.out.println("\nData Senar Berhasil Diubah!");
            promptEnterKey();
        } else {
            System.out.println("Nomor Senar Tidak Valid!");
            promptEnterKey();
        }
    }
    public static void ubahJoran(ArrayList<joran> joran, BufferedReader br) throws IOException {
        clearScreen();
        lihatJoran(joran);
    
        System.out.print("Pilih Nomor Joran yang ingin diubah: ");
        int choice = Integer.parseInt(br.readLine()) - 1;
    
        if (choice >= 0 && choice < joran.size()) {
            joran joranToUpdate = joran.get(choice);
    
            System.out.print("Masukkan Nama Baru Joran = ");
            String nama = br.readLine();
            System.out.print("Masukkan Merek Baru Joran = ");
            String merek = br.readLine();
            System.out.print("Masukkan Harga Baru Joran = ");
            double harga = Double.parseDouble(br.readLine());
    
            joranToUpdate.setNama(nama);
            joranToUpdate.setMerek(merek);
            joranToUpdate.setHarga(harga);
    
            System.out.println("\nData Joran Berhasil Diubah!");
            promptEnterKey();
        } else {
            System.out.println("Nomor Joran Tidak Valid!");
            promptEnterKey();
        }
    }
    public static void hapusSenar(ArrayList<senar> senarList, BufferedReader br) throws IOException {
        clearScreen();
        lihatSenar(senarList);
    
        System.out.print("Pilih Nomor Senar yang ingin dihapus = ");
        int choice = Integer.parseInt(br.readLine()) - 1;
    
        if (choice >= 0 && choice < senarList.size()) {
            senarList.remove(choice);
            System.out.println("Senar berhasil dihapus!");
            promptEnterKey();
        } else {
            System.out.println("Nomor Senar Tidak Valid!");
            promptEnterKey();
        }
    }
    public static void hapusJoran(ArrayList<joran> joran, BufferedReader br) throws IOException {
        clearScreen();
        lihatJoran(joran);
    
        System.out.print("Pilih Nomor Joran yang ingin dihapus = ");
        int choice = Integer.parseInt(br.readLine()) - 1;
    
        if (choice >= 0 && choice < joran.size()) {
            joran.remove(choice);
            System.out.println("Joran berhasil dihapus!");
            promptEnterKey();
        } else {
            System.out.println("Nomor Joran Tidak Valid!");
            promptEnterKey();
        }
    }
    

    public static void Main(String[] args) throws IOException{
        ArrayList<alatPancing> alatPancing = new ArrayList<>();
        ArrayList<mataKail> mataKail = new ArrayList<>();
        ArrayList<pelet> pelet = new ArrayList<>();
        ArrayList<joran> joran = new ArrayList<>();
        ArrayList<senar> senar = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(isr);
        while(true){
        clearScreen();
        System.out.println("""
                ===Data Toko Pancing Icikiwir===
                1. Tambah Data Barang
                2. Lihat Data Barang
                3. Ubah Data Barang
                4. Hapus Data Barang
                5. Exit
                """);
                System.out.print("Pilih Menu = ");
                String pilih  = br.readLine();
                if(pilih.equals("1")){
                    while (true) {
                        clearScreen();
                        System.out.println("""
                                1. Alat Pancing 1 Set
                                2. Mata Kail
                                3. Pelet
                                0. Kembali
                                """);
                        System.out.print("Pilih Barang Yang Ingin Ditambahkan = ");
                        String tambahAlat = br.readLine();
                        if (tambahAlat.equals("1")) {
                            while (true) {
                                clearScreen();
                                System.out.println("""
                                        1. Alat Pancing 1 Set
                                        2. Joran
                                        3. Senar
                                        0. Kembali 
                                        """);
                                        System.out.print("Pilih Barang Yang Ingin Ditambahkan = ");
                                        String Pilihalat = br.readLine();
                                        if(Pilihalat.equals("1")){
                                            clearScreen();
                                            System.out.print("Masukan Nama Alat Pancing = ");
                                            String nama = br.readLine();
                                            System.out.print("Masukan Merek Alat Pancing = ");
                                            String merek = br.readLine();
                                            System.out.print("Masukan Harga Alat Pancing = ");
                                            double harga = Double.parseDouble(br.readLine());
                                            alatPancing alatbaru = new alatPancing(nama, merek, harga);
                                            alatPancing.add(alatbaru);
                                            System.out.println("\nData Barang Berhasil Ditambahkan!");
                                            promptEnterKey();
                                        }else if(Pilihalat.equals("2")){
                                            clearScreen();
                                            System.out.print("Masukkan Nama Joran =  ");
                                            String nama = br.readLine();
                                            System.out.print("Masukkan Merek Joran =  ");
                                            String merek = br.readLine();
                                            System.out.print("Masukkan Harga Joran =  ");
                                            double harga = Double.parseDouble(br.readLine());
                                            joran joranbaru = new joran(nama, merek, harga);
                                            joran.add(joranbaru);
                                            System.out.println("\nData Barang Berhasil Ditambahkan!");
                                            promptEnterKey();

                                        }else if(Pilihalat.equals("3")){
                                            clearScreen();
                                            System.out.print("Masukkan Nama Senar = ");
                                            String nama = br.readLine();
                                            System.out.print("Masukkan Merek Senar = ");
                                            String merek = br.readLine();
                                            System.out.print("Masukkan Harga Senar = ");
                                            double harga = Double.parseDouble(br.readLine());
                                            senar senarbaru = new senar(nama, merek, harga);
                                            senar.add(senarbaru);
                                            System.out.println("\nData Barang Berhasil Ditambahkan!");
                                            promptEnterKey();

                                        }else if (Pilihalat.equals("0")) {
                                            break;
                                        }
                            }
                            
                        }else if(tambahAlat.equals("2")){
                            clearScreen();
                            System.out.print("Masukan Nama Mata Kail  = ");
                            String nama = br.readLine();
                            System.out.print("Masukan Merek Mata Kail = ");
                            String merek = br.readLine();
                            System.out.print("Masukan Harga Mata Kail = ");
                            double harga = Double.parseDouble(br.readLine());
                            mataKail mataKailbaru = new mataKail(nama, merek, harga);
                            mataKail.add(mataKailbaru);
                            System.out.println("\nData Barang Berhasil Ditambahkan!");
                            promptEnterKey();
                        }else if(tambahAlat.equals("3")){
                            clearScreen();
                            System.out.print("Masukan Nama Pelet  = ");
                            String nama = br.readLine();
                            System.out.print("Masukan Merek Pelet = ");
                            String merek = br.readLine();
                            System.out.print("Masukan Harga Pelet = ");
                            double harga = Double.parseDouble(br.readLine());
                            pelet peletbaru = new pelet(nama, merek, harga);
                            pelet.add(peletbaru);
                            System.out.println("\nData Barang Berhasil Ditambahkan!");
                            promptEnterKey();

                        }else if(tambahAlat.equals("0")){
                            break;
                        }
                        
                    }
                        
                
                }else if(pilih.equals("2")){
                    while (true) {
                        clearScreen();
                        System.out.println("""
                            1. Alat Pancing 1 Set
                            2. Mata Kail
                            3. Pelet
                            0. Kembali
                            """);
                            System.out.print("Pilih Barang Yang Ingin Dilihat = ");
                            String lihatAlat = br.readLine();
                            if (lihatAlat.equals("1")) {
                                while (true) {
                                    clearScreen();
                                    System.out.println("""
                                            1. Alat Pancing 1 Set
                                            2. Joran
                                            3. Senar
                                            0. Kembali 
                                            """);
                                            System.out.print("Pilih Barang Yang Ingin Dilihat = ");
                                            String Pilihalat = br.readLine();
                                            if(Pilihalat.equals("1")){
                                                for(int i =0; i<alatPancing.size(); i++){
                                                    alatPancing.get(i).tampil(); 
                                                    promptEnterKey();
                                                }
                                            } else if(Pilihalat.equals("2")){
                                                clearScreen();
                                                for(int i =0; i<joran.size(); i++){
                                                    joran.get(i).tampil();
                                                    promptEnterKey();
                                                }
                                            } else if(Pilihalat.equals("3")){
                                                clearScreen();
                                                for(int i =0; i<senar.size(); i++){
                                                    senar.get(i).tampil(); 
                                                    promptEnterKey();
                                                }
                                            
                                            }else if (Pilihalat.equals("0")) {
                                                break;
                                            }
                                }
                            }else if(lihatAlat.equals("2")){
                                clearScreen();
                                for(int i =0; i<mataKail.size(); i++){
                                    System.out.print(i+1+".");
                                    System.out.println("Nama = " + mataKail.get(i).getNama());
                                    System.out.println("Merek = " + mataKail.get(i).getMerek());
                                    System.out.println("Harga = " + mataKail.get(i).getHarga());
                                    promptEnterKey();
                                    }
    
                            }else if(lihatAlat.equals("3")){
                                clearScreen();
                                for(int i =0; i<pelet.size(); i++){
                                    System.out.print(i+1+".");
                                    System.out.println("Nama = " + pelet.get(i).getNama());
                                    System.out.println("Merek = " + pelet.get(i).getMerek());
                                    System.out.println("Harga = " + pelet.get(i).getHarga());
                                    promptEnterKey();
                                    }
                            }else if(lihatAlat.equals("0")){
                                break;
                            }

                        
                    }

                }else if(pilih.equals("3")){
                    while (true) {
                        clearScreen();
                    System.out.println("""
                        1. Alat Pancing 1 Set
                        2. Mata Kail
                        3. Pelet
                        0. Kembali
                        """);
                        System.out.print("Pilih Barang Yang Ingin Diubah = ");
                        String ubahAlat = br.readLine();
                        if (ubahAlat.equals("1")) {
                            while (true) {
                                clearScreen();
                                System.out.println("""
                                        1. Alat Pancing 1 Set
                                        2. Joran
                                        3. Senar
                                        0. Kembali 
                                        """);
                                        System.out.print("Pilih Barang Yang Ingin Diubah = ");
                                        String Pilihalat = br.readLine();
                                        if(Pilihalat.equals("1")){
                                            clearScreen();
                                            for(int i =0; i<alatPancing.size(); i++){
                                                System.out.print(i+1+".");
                                                System.out.println("Nama = " + alatPancing.get(i).getNama());
                                                System.out.println("Merek = " + alatPancing.get(i).getMerek());
                                                System.out.println("Harga = " + alatPancing.get(i).getHarga());
                                            }
                                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                                            int ubahPancing = Integer.parseInt(br.readLine());
                                            ubahPancing -=1;
                                            if(ubahPancing <= alatPancing.size()){
                                                System.out.print("Masukan Nama Baru Barang = ");
                                                String newNama = br.readLine();
                                                alatPancing.get(ubahPancing).setNama(newNama);
                                                System.out.print("Masukan Merek Baru Barang = ");
                                                String newMerek = br.readLine();
                                                alatPancing.get(ubahPancing).setMerek(newMerek);
                                                System.out.print("Masukan Harga Baru Barang = ");
                                                double newHarga = Double.parseDouble(br.readLine());
                                                alatPancing.get(ubahPancing).setHarga(newHarga);
                                                System.out.println("\nBerhasil ubah data !");
                                                promptEnterKey();
                                            } else {
                                                System.out.println("Tidak Tersedia!");
                                            }
                                        }else if(Pilihalat.equals("2")){
                                            clearScreen();
                                            ubahJoran(joran, br);
                                            promptEnterKey();

                                        }else if(Pilihalat.equals("3")){
                                            clearScreen();
                                            ubahSenar(senar, br);
                                            promptEnterKey();

                                        }else if (Pilihalat.equals("0")) {
                                            break;
                                        }
                            }
    
                        }else if(ubahAlat.equals("2")){
                            clearScreen();
                            for(int i =0; i<mataKail.size(); i++){
                                System.out.print(i+1+".");
                                System.out.println("Nama = " + mataKail.get(i).getNama());
                                System.out.println("Merek = " + mataKail.get(i).getMerek());
                                System.out.println("Harga = " + mataKail.get(i).getHarga());
                                }
                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                            int ubahKail = Integer.parseInt(br.readLine());
                            ubahKail -= 1;
                            if(ubahKail <= mataKail.size()){
                                System.out.print("Masukan Nama Baru Barang = ");
                                String newNama = br.readLine();
                                alatPancing.get(ubahKail).setNama(newNama);
                                System.out.print("Masukan Merek Baru Barang = ");
                                String newMerek = br.readLine();
                                alatPancing.get(ubahKail).setMerek(newMerek);
                                System.out.print("Masukan Harga Baru Barang = ");
                                double newHarga = Double.parseDouble(br.readLine());
                                alatPancing.get(ubahKail).setHarga(newHarga);
                                System.out.println("\nBerhasil ubah data !");
                                promptEnterKey();
                            }else{
                                System.out.println("Tidak Tersedia!");
                            }

                        }else if(ubahAlat.equals("3")){
                            clearScreen();
                            for(int i =0; i<pelet.size(); i++){
                                System.out.print(i+1+".");
                                System.out.println("Nama = " + pelet.get(i).getNama());
                                System.out.println("Merek = " + pelet.get(i).getMerek());
                                System.out.println("Harga = " + pelet.get(i).getHarga());
                                }
                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                            int ubahPelet = Integer.parseInt(br.readLine());
                            ubahPelet -= 1;
                            if(ubahPelet <= pelet.size()){
                                System.out.print("Masukan Nama Baru Barang = ");
                                String newNama = br.readLine();
                                alatPancing.get(ubahPelet).setNama(newNama);
                                System.out.print("Masukan Merek Baru Barang = ");
                                String newMerek = br.readLine();
                                alatPancing.get(ubahPelet).setMerek(newMerek);
                                System.out.print("Masukan Harga Baru Barang = ");
                                double newHarga = Double.parseDouble(br.readLine());
                                alatPancing.get(ubahPelet).setHarga(newHarga);
                                System.out.println("\nBerhasil ubah data !");
                                promptEnterKey();
                            }else{
                                System.out.println("Tidak Tersedia!");
                            }



                        }else if(ubahAlat.equals("0")){
                            break;
                        }

                        
                    }
                    

                }else if(pilih.equals("4")){
                    while (true) {
                        clearScreen();
                    System.out.println("""
                        1. Alat Pancing 1 Set
                        2. Mata Kail
                        3. Pelet
                        0. Kembali
                        """);
                        System.out.println("Pilih Barang Yang Ingin Dihapus = ");
                        String hapusAlat = br.readLine();
                        if (hapusAlat.equals("1")) {
                            while (true) {
                                clearScreen();
                                System.out.println("""
                                        1. Alat Pancing 1 Set
                                        2. Joran
                                        3. Senar
                                        0. Kembali 
                                        """);
                                        System.out.print("Pilih Barang Yang Ingin Dihapus = ");
                                        String Pilihalat = br.readLine();
                                        if(Pilihalat.equals("1")){
                                            clearScreen();
                                            for(int i =0; i<alatPancing.size(); i++){
                                                System.out.print(i+1+".");
                                                System.out.println("Nama = " + alatPancing.get(i).getNama());
                                                System.out.println("Merek = " + alatPancing.get(i).getMerek());
                                                System.out.println("Harga = " + alatPancing.get(i).getHarga());
                                            }
                                            System.out.print("\nPilih Nomor Barang Yang Ingin Dihapus = ");
                                            int hapusalatPancing = Integer.parseInt(br.readLine());
                                            hapusalatPancing -=1;
                                            int sizealatPancing = alatPancing.size();
                                            if (hapusalatPancing >= 0 && hapusalatPancing < alatPancing.size()) {
                                                alatPancing.remove(hapusalatPancing);
                                                System.out.println("Barang Berhasil Dihapus!");
                                                promptEnterKey();
                                            } else {
                                                System.out.println("Nomor Barang Tidak Valid!");
                                            }
                                        }else if(Pilihalat.equals("2")){
                                            hapusJoran(joran, br);

                                        }else if(Pilihalat.equals("3")){
                                            hapusSenar(senar, br);

                                        }else if (Pilihalat.equals("0")) {
                                            break;
                                        }
                            }
                        }else if(hapusAlat.equals("4")){
                            clearScreen();
                            for(int i =0; i<mataKail.size(); i++){
                                System.out.print(i+1+".");
                                System.out.println("Nama = " + mataKail.get(i).getNama());
                                System.out.println("Merek = " + mataKail.get(i).getMerek());
                                System.out.println("Harga = " + mataKail.get(i).getHarga());
                            }
                            System.out.print("\nPilih Nomor Barang Yang Ingin Dihapus = ");
                            int hapusmataKail = Integer.parseInt(br.readLine());
                            hapusmataKail -=1;
                            int sizemataKail = mataKail.size();
                            if (hapusmataKail >= 0 && hapusmataKail < mataKail.size()) {
                                mataKail.remove(hapusmataKail);
                                System.out.println("Barang Berhasil Dihapus!");
                                promptEnterKey();
                            } else {
                                System.out.println("Nomor Barang Tidak Valid!");
                            }
                        }else if(hapusAlat.equals("6")){
                            clearScreen();
                            for(int i =0; i<pelet.size(); i++){
                                System.out.print(i+1+".");
                                System.out.println("Nama = " + pelet.get(i).getNama());
                                System.out.println("Merek = " + pelet.get(i).getMerek());
                                System.out.println("Harga = " + pelet.get(i).getHarga());
                            }
                            System.out.print("\nPilih Nomor Barang Yang Ingin Dihapus = ");
                            int hapuspelet = Integer.parseInt(br.readLine());
                            hapuspelet -=1;
                            int sizepelet = pelet.size();
                            if (hapuspelet >= 0 && hapuspelet < pelet.size()) {
                                pelet.remove(hapuspelet);
                                System.out.println("Barang Berhasil Dihapus!");
                                promptEnterKey();
                            } else {
                                System.out.println("Nomor Barang Tidak Valid!");
                            }

                        }else if(hapusAlat.equals("0")){
                            break;
                        }
                        
                    }
                    

                }else if(pilih.equals("5")){
                    break;
                }
        }
    }
}