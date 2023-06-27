import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import model.ArusStock;
import model.Barang;
import model.BarangKeluar;
import model.BarangMasuk;
import model.JenisMenu;
import model.Kategori;
import model.Rak;
import model.User;

public class App {
    
    public static ArrayList<Barang> listBarang = new ArrayList<Barang>();

    public static void UserMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==================Oh My Stock==================");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Choice ? ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    return;
                }
                case 2 -> System.exit(0);
                default -> System.out.println("Pilihan tidak tersedia. Mohon pilih kembali.\n");
            }
        }
    }

    public static JenisMenu MainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("======================MENU=====================");
            System.out.println("1.  Informasi Barang");
            System.out.println("2.  Input Stock");
            System.out.println("3.  Pembelian Barang");
            System.out.println("4.  Penjualan Barang");
            System.out.println("5.  Edit Stock");
            System.out.println("6.  Logout");
            System.out.print("Choice ? ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> {
                        return JenisMenu.INFORMASI_BARANG;
                    }
                    case 2 -> {
                        return JenisMenu.INPUT_STOCK;
                    }
                    case 3 -> {
                        return JenisMenu.PEMBELIAN_STOCK;
                    }
                    case 4 -> {
                        return JenisMenu.PENJUALAN_STOCK;
                    }
                    case 5 -> {
                        return JenisMenu.EDIT_STOCK;
                    }
                    case 6 -> {
                        return JenisMenu.LOGOUT;
                    }
                    default -> System.out.println("Pilihan tidak tersedia. Mohon pilih kembali.\n");
                }
            }
            else {
                System.out.println("Input tidak valid. Silakan masukkan pilihan angka.");
                scanner.nextLine();
            }
        }
    }

    public static void LoginForm(User user) {
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        System.out.print("ID User : ");
        String idUser = scanner.nextLine();

        System.out.print("Nama User : ");
        String namaUser = scanner.nextLine();

        System.out.print("PIN : ");
        String pin = new String(console.readPassword());

        user.setIdUser(idUser);
        user.setNamaUser(namaUser);
        user.setPin(pin);

        System.out.println("===============================================");
        System.out.println("Hi " + user.getNamaUser() + "(" + user.getIdUser() + ")" + ", apa yang ingin anda lakukan?");
    }


    public static void inputStock(Barang barang) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String idBarang;
        String merekBarang;
        String hargaBarang;
        int stock;
        
        System.out.print("ID Barang : ");
        idBarang = input.nextLine();

        System.out.print("Merek Barang : ");
        merekBarang = input.nextLine();

        System.out.print("Harga Barang : ");
        hargaBarang = input.nextLine();
        
        System.out.print("Stock Barang : ");
        stock = input.nextInt();

        barang.setIdBarang(idBarang);
        barang.setMerekBarang(merekBarang);
        barang.setHargaBarang(hargaBarang);
        barang.setStock(stock);

        listBarang.add(new Barang(idBarang, stock, merekBarang, hargaBarang));
        System.out.println("Barang berhasil ditambahkan.");

        System.out.println();
        System.out.println("Tahan layar untuk kembali ke menu utama.");
        read.readLine();
    }


    public static void cetakListBarang() throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        if (listBarang.size() == 0) {
            System.out.println("Tidak tersedia barang, silahkan input barang terlebih dahulu.");
        }
        else {
            for (Barang listBarang2 : listBarang) {
                System.out.println(listBarang2);
            }
        }
        System.out.println();
        System.out.println("Tahan layar untuk kembali ke menu utama.");
        read.readLine();
    }


    public static void main(String[] args) throws Exception {
        init();
        User user = new User();
        Barang barang = new Barang();

        while (true) {
            UserMenu();
            LoginForm(user);

            while (user.getNamaUser() != null) {
                JenisMenu jenisMenu = MainMenu();
                switch (jenisMenu) {
                    case INFORMASI_BARANG -> {
                        cetakListBarang();
                    }
                    case INPUT_STOCK -> {
                        inputStock(barang);
                    }
                    case PEMBELIAN_STOCK -> {
                        return;
                    }
                    case PENJUALAN_STOCK -> {
                        return;
                    }
                    case EDIT_STOCK -> {
                        return;
                    }
                    case LOGOUT -> {
                        return;
                    }
                }
            }
        }
    }

    public static void init() {
        // User
        User U1 = new User("R314", "Reisacom", "8472");
        User U2 = new User("K407", "Kaoru", "7454");
        User U3 = new User("A981", "Adonis", "7739");

        // Barang
        Barang garam = new Barang("PA01", 50, "dolphin", "Rp. 110.000");
        Barang teh = new Barang("MI03", 40, "sosoro", "Rp. 100.000");
        Barang manisan = new Barang("MA02", 20, "manisku", "Rp. 90.000");

        // ArusStock
        // BarangMasuk
        ArusStock AI1 = new BarangMasuk("IN01", 0);
        ArusStock AI2 = new BarangMasuk("IN02", 0);
        ArusStock AI3 = new BarangMasuk("IN03", 0);
        // BarangKeluar
        ArusStock AO1 = new BarangKeluar("OU01", 0);
        ArusStock AO2 = new BarangKeluar("OU02", 0);
        ArusStock AO3 = new BarangKeluar("OU03", 0);

        // Rak
        Rak R1 = new Rak("KO01", "Biru");
        Rak R2 = new Rak("KO02", "Hitam");
        Rak R3 = new Rak("KO03", "Putih");

        // Kategori
        Kategori K1 = new Kategori("KAT01", "bumbu", garam, R1);
        Kategori K2 = new Kategori("KAT02", "minuman", garam, R2);
        Kategori K3 = new Kategori("KAT03", "makanan", garam, R3);
    }
}
