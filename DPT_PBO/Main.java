import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class User {
    String username,password, prodi;
    int umur,NIM;
    public User(String username,String password,int NIM, String Prodi, int umur){
        this.username = username;
        this.password = password;
        this.NIM = NIM;
        this.prodi = Prodi;
        this.umur = umur;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public int getNIM() {
        return NIM;
    }
    void tampil(){
        System.out.println("Username = " + this.username);
        System.out.println("Password = *****");
        System.out.println("NIM = " + this.NIM);
        System.out.println("Prodi = " + this.prodi);
        System.out.println("Umur = " + this.umur);
    }

}

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
     public static void main(String[] args) throws IOException {
        ArrayList<User> Users = new ArrayList<User>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String menuAwal;
    
        while (true) {
            System.out.println("Menu Awal");
            System.out.println("1. Registrasi");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu = ");
            menuAwal = br.readLine();
    
            if (menuAwal.equals("1")) {
                clearScreen();
                System.out.println("Registrasi Pengguna!\n");
                System.out.print("Masukkan Username = ");
                String username = br.readLine();
                System.out.print("Masukan Password = ");
                String password = br.readLine();
                System.out.print("Masukan NIM = ");
                int NIM = Integer.parseInt(br.readLine());
                System.out.print("Masukan Prodi = ");
                String prodi = br.readLine();
                System.out.print("Masukan Umur = ");
                int umur = Integer.parseInt(br.readLine());
                User Userbaru = new User(username, password, NIM, prodi, umur);
                Users.add(Userbaru);
                clearScreen();
                System.out.println("\nBerhasil Mendaftar!");
                promptEnterKey();
            } else if (menuAwal.equals("2")) {
                clearScreen();
                System.out.print("Masukan Username = ");
                String username = br.readLine();
                System.out.print("Masuka Password = ");
                String password = br.readLine();
                System.out.print("Masukan NIM = ");
                int nim = Integer.parseInt(br.readLine());
                User loggedInUser = null; // Inisialisasi pengguna yang berhasil login
                boolean isLoggedIn = false;
                for (User user : Users) {
                    if (username.equals(user.getUsername()) && password.equals(user.getPassword()) && nim == user.getNIM()) {
                        isLoggedIn = true;
                        loggedInUser = user; 
                        break;
                    }
                }
                if (isLoggedIn) {
                    if(loggedInUser.getNIM() % 3 == 0){
                        System.out.println("Sistem Login dan Registrasi Facebook");
                        loggedInUser.tampil();
                        promptEnterKey();
                    }else if (loggedInUser.getNIM() %3 == 1 ){
                        System.out.println("Sistem Login dan Registrasi Genshin Impact");
                        loggedInUser.tampil();
                        promptEnterKey();
                    }else{
                        System.out.println("Sistem Login dan Registrasi Mobile Banking\n");
                        loggedInUser.tampil();
                        promptEnterKey();
                    }
                    // System.out.println("Login berhasil!");
                    // System.out.println("\nData Pengguna:");
                    // loggedInUser.tampil(); 
                    // promptEnterKey();
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                    promptEnterKey();
                }
            
            } else if (menuAwal.equals("3")) {
                System.out.println("Terima kasih telah menggunakan program kami.");
                break; 
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                promptEnterKey();
            }
        }
    }
}