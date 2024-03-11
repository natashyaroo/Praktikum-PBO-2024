import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        
    } 
    public static void promptEnterKey(){
        System.out.println("\nTekan \"ENTER\" untuk Melanjutkan...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
     }
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        ArrayList<alatPancing> alatPancing = new ArrayList<alatPancing>();
        ArrayList<joran> joran = new ArrayList<joran>();
        ArrayList<reel> reel = new ArrayList<reel>();
        ArrayList<senar> senar = new ArrayList<senar>();
        ArrayList<mataKail> mataKail = new ArrayList<mataKail>();
        ArrayList<pelet> pelet = new ArrayList<pelet>();
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
                                2. Joran
                                3. Reel
                                4. Mata Kail
                                5. Senar
                                6. Pelet
                                0. Kembali
                                """);
                        System.out.print("Pilih Barang Yang Ingin Ditambahkan = ");
                        String tambahAlat = br.readLine();
                        if (tambahAlat.equals("1")) {
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
                            
                        }
                        else if (tambahAlat.equals("2")) {
                            clearScreen();
                            System.out.print("Masukan Nama Joran  = ");
                            String nama = br.readLine();
                            System.out.print("Masukan Merek Joran = ");
                            String merek = br.readLine();
                            System.out.print("Masukan Harga Joran = ");
                            double harga = Double.parseDouble(br.readLine());
                            joran joranbaru = new joran(nama, merek, harga);
                            joran.add(joranbaru);
                            System.out.println("\nData Barang Berhasil Ditambahkan!");
                            promptEnterKey();
                        }else if(tambahAlat.equals("3")){
                            clearScreen();
                            System.out.print("Masukan Nama Reel  = ");
                            String nama = br.readLine();
                            System.out.print("Masukan Merek Reel = ");
                            String merek = br.readLine();
                            System.out.print("Masukan Harga Reel = ");
                            double harga = Double.parseDouble(br.readLine());
                            reel reelbaru = new reel(nama, merek, harga);
                            reel.add(reelbaru);
                            System.out.println("\nData Barang Berhasil Ditambahkan!");
                            promptEnterKey();

                        }else if(tambahAlat.equals("4")){
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

                        }else if(tambahAlat.equals("5")){
                            clearScreen();
                            System.out.print("Masukan Nama Senar  = ");
                            String nama = br.readLine();
                            System.out.print("Masukan Merek Senar = ");
                            String merek = br.readLine();
                            System.out.print("Masukan Harga Senar = ");
                            double harga = Double.parseDouble(br.readLine());
                            senar senarbaru = new senar(nama, merek, harga);
                            senar.add(senarbaru);
                            System.out.println("\nData Barang Berhasil Ditambahkan!");
                            promptEnterKey();

                        }else if(tambahAlat.equals("6")){
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
                            2. Joran
                            3. Reel
                            4. Mata Kail
                            5. Senar
                            6. Pelet
                            0. Kembali
                            """);
                            System.out.print("Pilih Barang Yang Ingin Dilihat = ");
                            String lihatAlat = br.readLine();
                            if (lihatAlat.equals("1")) {
                                clearScreen();
                                for(int i =0; i<alatPancing.size(); i++){
                                    System.out.print(i+1+".");
                                    alatPancing.get(i).tampil();
                                    promptEnterKey();
                                    }
                            }else if (lihatAlat.equals("2")) {
                                for(int i =0; i<joran.size(); i++){
                                    clearScreen();
                                    System.out.print(i+1+".");
                                    joran.get(i).tampil();
                                    promptEnterKey();
                                    }
                            }else if(lihatAlat.equals("3")){
                                clearScreen();
                                for(int i =0; i<reel.size(); i++){
                                    System.out.print(i+1+".");
                                    reel.get(i).tampil();
                                    promptEnterKey();
                                    }
                            }else if(lihatAlat.equals("4")){
                                clearScreen();
                                for(int i =0; i<mataKail.size(); i++){
                                    System.out.print(i+1+".");
                                    mataKail.get(i).tampil();
                                    promptEnterKey();
                                    }
    
                            }else if(lihatAlat.equals("5")){
                                clearScreen();
                                for(int i =0; i<senar.size(); i++){
                                    System.out.print(i+1+".");
                                    senar.get(i).tampil();
                                    promptEnterKey();
                                    }
    
                            }else if(lihatAlat.equals("6")){
                                clearScreen();
                                for(int i =0; i<pelet.size(); i++){
                                    System.out.print(i+1+".");
                                    pelet.get(i).tampil();
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
                        2. Joran
                        3. Reel
                        4. Mata Kail
                        5. Senar
                        6. Pelet
                        0. Kembali
                        """);
                        System.out.print("Pilih Barang Yang Ingin Diubah = ");
                        String ubahAlat = br.readLine();
                        if (ubahAlat.equals("1")) {
                            clearScreen();
                            for(int i =0; i<alatPancing.size(); i++){
                                System.out.print(i+1+".");
                                alatPancing.get(i).tampil();
                                }
                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                            int ubahPancing = Integer.parseInt(br.readLine());
                            ubahPancing -=1;
                            if(ubahPancing <= alatPancing.size()){
                                System.out.print("Masukan Nama Baru Barang = ");
                                alatPancing.get(ubahPancing).nama = br.readLine();
                                System.out.print("Masukan Merek Baru Barang = ");
                                alatPancing.get(ubahPancing).merek = br.readLine();
                                System.out.print("Masukan Harga Baru Barang = ");
                                alatPancing.get(ubahPancing).harga = Double.parseDouble(br.readLine());
                                System.out.println("\nBerhasil ubah data !");
                                promptEnterKey();
                            }else{
                                System.out.println("Tidak Tersedia!");
                            }
                        }
                        else if (ubahAlat.equals("2")) {
                            clearScreen();
                            for(int i =0; i<joran.size(); i++){
                                System.out.print(i+1+".");
                                joran.get(i).tampil();
                                }
                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                            int ubahJoran = Integer.parseInt(br.readLine());
                            ubahJoran -=1;
                            if(ubahJoran <= joran.size()){
                                System.out.print("Masukan Nama Baru Barang = ");
                                joran.get(ubahJoran).nama = br.readLine();
                                System.out.print("Masukan Merek Baru Barang = ");
                                joran.get(ubahJoran).merek = br.readLine();
                                System.out.print("Masukan Harga Baru Barang = ");
                                joran.get(ubahJoran).harga = Double.parseDouble(br.readLine());
                                System.out.println("\nBerhasil ubah data !");
                                promptEnterKey();
                            }else{
                                System.out.println("Tidak Tersedia!");
                            }

                        }else if(ubahAlat.equals("3")){
                            clearScreen();
                            for(int i =0; i<reel.size(); i++){
                                System.out.print(i+1+".");
                                reel.get(i).tampil();
                                }
                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                            int ubahReel = Integer.parseInt(br.readLine());
                            ubahReel -= 1;
                            if(ubahReel <= reel.size()){
                                System.out.print("Masukan Nama Baru Barang = ");
                                reel.get(ubahReel).nama = br.readLine();
                                System.out.print("Masukan Merek Baru Barang = ");
                                reel.get(ubahReel).merek = br.readLine();
                                System.out.print("Masukan Harga Baru Barang = ");
                                reel.get(ubahReel).harga = Double.parseDouble(br.readLine());
                                System.out.println("\nBerhasil ubah data !");
                                promptEnterKey();
                            }else{
                                System.out.println("Tidak Tersedia!");
                            }


                        }else if(ubahAlat.equals("4")){
                            clearScreen();
                            for(int i =0; i<mataKail.size(); i++){
                                System.out.print(i+1+".");
                                mataKail.get(i).tampil();
                                }
                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                            int ubahKail = Integer.parseInt(br.readLine());
                            ubahKail -= 1;
                            if(ubahKail <= mataKail.size()){
                                System.out.print("Masukan Nama Baru Barang = ");
                                mataKail.get(ubahKail).nama = br.readLine();
                                System.out.print("Masukan Merek Baru Barang = ");
                                mataKail.get(ubahKail).merek = br.readLine();
                                System.out.print("Masukan Harga Baru Barang = ");
                                mataKail.get(ubahKail).harga = Double.parseDouble(br.readLine());
                                System.out.println("\nBerhasil ubah data !");
                                promptEnterKey();
                            }else{
                                System.out.println("Tidak Tersedia!");
                            }


                        }else if(ubahAlat.equals("5")){
                            clearScreen();
                            for(int i =0; i<senar.size(); i++){
                                System.out.print(i+1+".");
                                senar.get(i).tampil();
                                }
                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                            int ubahSenar = Integer.parseInt(br.readLine());
                            ubahSenar -= 1;
                            if(ubahSenar <= senar.size()){
                                System.out.print("Masukan Nama Baru Barang = ");
                                senar.get(ubahSenar).nama = br.readLine();
                                System.out.print("Masukan Merek Baru Barang = ");
                                senar.get(ubahSenar).merek = br.readLine();
                                System.out.print("Masukan Harga Baru Barang = ");
                                senar.get(ubahSenar).harga = Double.parseDouble(br.readLine());
                                System.out.println("\nBerhasil ubah data !");
                                promptEnterKey();
                            }else{
                                System.out.println("Tidak Tersedia!");
                            }


                        }else if(ubahAlat.equals("6")){
                            clearScreen();
                            for(int i =0; i<pelet.size(); i++){
                                System.out.print(i+1+".");
                                pelet.get(i).tampil();
                                }
                            System.out.print("Pilih  Nomor Barang Yang Ingin Diubah = ");
                            int ubahPelet = Integer.parseInt(br.readLine());
                            ubahPelet -= 1;
                            if(ubahPelet <= pelet.size()){
                                System.out.print("Masukan Nama Baru Barang = ");
                                pelet.get(ubahPelet).nama = br.readLine();
                                System.out.print("Masukan Merek Baru Barang = ");
                                pelet.get(ubahPelet).merek = br.readLine();
                                System.out.print("Masukan Harga Baru Barang = ");
                                pelet.get(ubahPelet).harga = Double.parseDouble(br.readLine());
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
                        2. Joran
                        3. Reel
                        4. Mata Kail
                        5. Senar
                        6. Pelet
                        0. Kembali
                        """);
                        System.out.println("Pilih Barang Yang Ingin Dihapus = ");
                        String hapusAlat = br.readLine();
                        if (hapusAlat.equals("1")) {
                            clearScreen();
                            for(int i =0; i<alatPancing.size(); i++){
                                System.out.print(i+1+".");
                                alatPancing.get(i).tampil();
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
                        }
                        else if (hapusAlat.equals("2")) {
                            clearScreen();
                            for(int i =0; i<joran.size(); i++){
                                System.out.print(i+1+".");
                                joran.get(i).tampil();
                                }
                                System.out.print("\nPilih Nomor Barang Yang Ingin Dihapus = ");
                                int hapusJoran = Integer.parseInt(br.readLine());
                                hapusJoran -=1;
                                int sizeJoran = joran.size();
                                if (hapusJoran >= 0 && hapusJoran < joran.size()) {
                                    joran.remove(hapusJoran);
                                    System.out.println("Barang Berhasil Dihapus!");
                                    promptEnterKey();
                                } else {
                                    System.out.println("Nomor Barang Tidak Valid!");
                                }
                            
                        }else if(hapusAlat.equals("3")){
                            clearScreen();
                            for(int i =0; i<reel.size(); i++){
                                System.out.print(i+1+".");
                                reel.get(i).tampil();
                                }
                                System.out.print("\nPilih Nomor Barang Yang Ingin Dihapus = ");
                                int hapusReel = Integer.parseInt(br.readLine());
                                hapusReel -=1;
                                int sizeReel = reel.size();
                                if (hapusReel >= 0 && hapusReel < reel.size()) {
                                    reel.remove(hapusReel);
                                    System.out.println("Barang Berhasil Dihapus!");
                                    promptEnterKey();
                                } else {
                                    System.out.println("Nomor Barang Tidak Valid!");
                                }

                        }else if(hapusAlat.equals("4")){
                            clearScreen();
                            for(int i =0; i<mataKail.size(); i++){
                                System.out.print(i+1+".");
                                mataKail.get(i).tampil();
                                }
                                System.out.print("\nPilih Nomor Barang Yang Ingin Dihapus = ");
                                int hapusMataKail = Integer.parseInt(br.readLine());
                                hapusMataKail -=1;
                                int sizeMataKail = mataKail.size();
                                if (hapusMataKail >= 0 && hapusMataKail < mataKail.size()) {
                                    mataKail.remove(hapusMataKail);
                                    System.out.println("Barang Berhasil Dihapus!");
                                    promptEnterKey();
                                } else {
                                    System.out.println("Nomor Barang Tidak Valid!");
                                }
                        }else if(hapusAlat.equals("5")){
                            clearScreen();
                            for(int i =0; i<senar.size(); i++){
                                System.out.print(i+1+".");
                                senar.get(i).tampil();
                                }
                                System.out.println("\nPilih Nomor Barang Yang Ingin Dihapus = ");
                                int hapusSenar = Integer.parseInt(br.readLine());
                                hapusSenar -=1;
                                int sizeSenar = senar.size();
                                if (hapusSenar >= 0 && hapusSenar < senar.size()) {
                                    senar.remove(hapusSenar);
                                    System.out.println("Barang Berhasil Dihapus!");
                                    promptEnterKey();
                                } else {
                                    System.out.println("Nomor Barang Tidak Valid!");
                                }
                        }else if(hapusAlat.equals("6")){
                            clearScreen();
                            for(int i =0; i<pelet.size(); i++){
                                System.out.print(i+1+".");
                                pelet.get(i).tampil();
                                }
                                System.out.print("\nPilih Nomor Barang Yang Ingin Dihapus = ");
                                int hapusPelet = Integer.parseInt(br.readLine());
                                hapusPelet -=1;
                                int sizePelet = pelet.size();
                                if (hapusPelet >= 0 && hapusPelet < pelet.size()) {
                                    pelet.remove(hapusPelet);
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