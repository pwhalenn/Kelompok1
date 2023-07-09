import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import model.Barang;
import model.JenisMenu;
import model.Kategori;
import model.LaporanStock;
import model.Pesanan;
import model.Rak;
import model.User;

public class App {
    
    public static ArrayList<Barang> listBarang = new ArrayList<Barang>();
    public static ArrayList<LaporanStock> listBeli = new ArrayList<LaporanStock>();
    public static ArrayList<LaporanStock> listJual = new ArrayList<LaporanStock>();
    
    public static void UserMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==================Oh My Stock==================");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Pilihan ? ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        return;
                    }
                    case 2 -> System.exit(0);
                    default -> {
                        System.out.println();
                        System.out.println("Pilihan tidak tersedia. Mohon pilih kembali.\n");
                    }
                }
            }
            catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Input tidak valid. Mohon menginput dengan angka.\n");
                scanner.nextLine();
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
            System.out.println("5.  Penghapusan Barang");
            System.out.println("6.  Arus Stock");
            System.out.println("7.  Logout");
            System.out.print("Pilihan ? ");
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
                        return JenisMenu.PENGHAPUSAN_BARANG;
                    }
                    case 6 -> {
                        return JenisMenu.ARUS_STOCK;
                    }
                    case 7 -> {
                        return JenisMenu.LOGOUT;
                    }
                    default -> {
                        System.out.println();
                        System.out.println("Pilihan tidak tersedia. Mohon pilih kembali.\n");
                    }
                }
            }
            else {
                System.out.println();
                System.out.println("Input tidak valid. Mohon menginput dengan angka.\n");
                scanner.nextLine();
            }
        }
    }

    public static void LoginForm(User user) {
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();
        boolean akses = false;

        User u1 = new User("R314", "Reisacom", "8472");
        User u2 = new User("K407", "Kaoru", "7454");
        User u3 = new User("A981", "Adonis", "7739");
        
        while (!akses) {
            System.out.print("ID User : ");
            String idUser = scanner.nextLine();

            System.out.print("Nama User : ");
            String namaUser = scanner.nextLine();

            System.out.print("PIN : ");
            String pin = new String(console.readPassword());

            if (u1.isValid(idUser, namaUser, pin)) {
                akses = true;

                user.setIdUser(idUser);
                user.setNamaUser(namaUser);
                user.setPin(pin);

                System.out.println("===============================================");
                System.out.println("Hi " + user.getNamaUser() + "(" + user.getIdUser() + ")" + ", apa yang ingin anda lakukan?");
            }
            else if (u2.isValid(idUser, namaUser, pin)) {
                akses = true;

                user.setIdUser(idUser);
                user.setNamaUser(namaUser);
                user.setPin(pin);

                System.out.println("===============================================");
                System.out.println("Hi " + user.getNamaUser() + "(" + user.getIdUser() + ")" + ", apa yang ingin anda lakukan?");
            }
            else if (u3.isValid(idUser, namaUser, pin)) {
                akses = true;

                user.setIdUser(idUser);
                user.setNamaUser(namaUser);
                user.setPin(pin);

                System.out.println("===============================================");
                System.out.println("Hi " + user.getNamaUser() + "(" + user.getIdUser() + ")" + ", apa yang ingin anda lakukan?");
            }
            else {
                System.out.println();
                System.out.println("Akun tidak ditemukan. Mohon isi kembali.\n");
            }
        }
    }


    public static void inputDataTetap() {
        // init
        // Rak
        Rak r1 = new Rak("KO01", "Biru");
        Rak r2 = new Rak("KO02", "Hitam");
        Rak r3 = new Rak("KO03", "Putih");

        // Kategori
        Kategori k1 = new Kategori("KAT01", "bumbu", r1);
        Kategori k2 = new Kategori("KAT02", "minuman", r2);
        Kategori k3 = new Kategori("KAT03", "makanan", r3);

        // Barang
        // Barang b1 = new Barang("PA01", 50, "dolphin", "110.000", k1);
        // Barang b2 = new Barang("MI03", 40, "sosoro", "100.000", k2);
        // Barang b3 = new Barang("MA02", 20, "manisku", "90.000", k3);
        
        listBarang.add(new Barang("PA01", 50, "dolphin", "110.000", k1));
        listBarang.add(new Barang("MI03", 40, "sosoro", "100.000", k2));
        listBarang.add(new Barang("MA02", 20, "manisku", "90.000", k3));
    }


    public static void inputStock(Barang barang) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Rak rak = new Rak();
        Kategori kategori = new Kategori();

        String idBarang;
        String merekBarang;
        String hargaBarang;
        int stock = 0;
        
        System.out.println("Silahkan input barang.");
        System.out.println("===============================================");

        System.out.print("ID Barang\t: ");
        idBarang = scanner.nextLine();

        System.out.print("Merek Barang\t: ");
        merekBarang = scanner.nextLine();

        System.out.print("Harga Barang\t: ");
        hargaBarang = scanner.nextLine();
        
        boolean redo = false;
        while (!redo) {
            System.out.print("Stock Barang\t: ");
            try {
                stock = scanner.nextInt();
                if (stock > 999) {
                    redo = false;
                    System.out.println("Stock barang tidak boleh melibihi 999. Mohon untuk menginput kembali.");
                }
                else {
                    redo = true;
                }
            }
            catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Input tidak valid. Mohon menginput dengan angka.\n");
                scanner.nextLine();
            }
        }

        redo = false;
        while (!redo) {
            System.out.println("-----------------------------------------------");
            System.out.println("Apa kategori dari barang tersebut: ");
            System.out.println("1. Bumbu");
            System.out.println("2. Makanan");
            System.out.println("3. Minuman");
            System.out.print("Pilihan ? ");
            try {
                redo = true;
                int pilihanKategori = scanner.nextInt();
                scanner.nextLine();
                switch (pilihanKategori) {
                    case 1 -> {
                        Rak r1 = new Rak("KO01", "Biru");
                        Kategori k1 = new Kategori("KAT01", "bumbu", r1);

                        rak.setIdRak(r1.getIdRak());
                        rak.setRuangan(r1.getRuangan());
                        kategori.setIdKategori(k1.getIdKategori());
                        kategori.setNamaKategori(k1.getNamaKategori());
                        kategori.setRak(k1.getRak());
                    }
                    case 2 -> {
                        Rak r2 = new Rak("KO02", "Hitam");
                        Kategori k2 = new Kategori("KAT02", "minuman", r2);

                        rak.setIdRak(r2.getIdRak());
                        rak.setRuangan(r2.getRuangan());
                        kategori.setIdKategori(k2.getIdKategori());
                        kategori.setNamaKategori(k2.getNamaKategori());
                        kategori.setRak(k2.getRak());
                    }
                    case 3 -> {
                        Rak r3 = new Rak("KO03", "Putih");
                        Kategori k3 = new Kategori("KAT03", "makanan", r3);

                        rak.setIdRak(r3.getIdRak());
                        rak.setRuangan(r3.getRuangan());
                        kategori.setIdKategori(k3.getIdKategori());
                        kategori.setNamaKategori(k3.getNamaKategori());
                        kategori.setRak(k3.getRak());
                    }
                    default -> {
                        redo = false;
                        System.out.println("Pilihan tidak ada. Mohon untuk input kembali.");
                    }
                }
            }
            catch (InputMismatchException e) {
                redo = false;
                System.out.println("Input tidak valid. Mohon menginput dengan angka.");
                scanner.nextLine();
            }
        }
        barang.setIdBarang(idBarang);
        barang.setMerekBarang(merekBarang);
        barang.setHargaBarang(hargaBarang);
        barang.setStock(stock);

        listBarang.add(new Barang(idBarang, stock, merekBarang, hargaBarang, kategori));

        System.out.println("===============================================");
        System.out.println("Barang berhasil ditambahkan.");

        System.out.println();
        System.out.println("Tahan layar untuk kembali ke menu utama.");
        read.readLine();
    }


    public static void cetakListBarang() throws IOException {
        if (listBarang.size() == 0) {
            System.out.println("Tidak tersedia barang, silahkan input barang terlebih dahulu.");
        }
        else {
            int i;
            System.out.println("=========================================================================================================================");
            System.out.format("%-60s  %-34s  %-16s%n", "   Info Barang", "Kategori", "Rak");
            System.out.println("=========================================================================================================================");
            System.out.format("%-2s %-12s  %-20s  %-12s  %-7s  %-12s  %-20s  %-8s  %-12s%n", "i", "ID Barang", "Merek Barang", "Harga Barang", "Stock", "ID Kategori", "Nama Kategori", "ID Rak", "Ruangan");
            System.out.format("%-2s %-12s  %-20s  %-12s  %-7s  %-12s  %-20s  %-8s  %-12s%n", "-", "-----------", "------------------", "------------", "-------", "-----------", "------------------", "--------", "----------");
            int indeks = 1;
            for (Barang listBarang2 : listBarang) {
                System.out.println(indeks++ + ". " + listBarang2);
            }
            System.out.println("=========================================================================================================================");
        }
    }


   public static void pembelianStock() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int i;

        System.out.println("===============================================");
        if (listBarang.size() == 0) {
            System.out.println("Mohon melakukan penginputan barang terlebih dahulu.");
        }
        else {
            boolean redo1 = false;
            boolean redo2 = false;
            while (!redo1) {
                redo1 = true;
                System.out.println("List Barang:");
                for (i = 0; i < listBarang.size(); i++) {
                    Barang barang = listBarang.get(i);
                    int displayedIndex = i + 1;
                    System.out.println(displayedIndex + ". " + barang.getMerekBarang() + "\t: " + barang.getStock() + " dus");
                }
                System.out.println("===============================================");
                System.out.print("Pilih barang yang akan dibeli : ");
                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    int index = choice - 1;
                    if (index >= 0 && index < listBarang.size()) {
                        redo1 = true;
                        Barang pilihanBarang = listBarang.get(index);
                        while (!redo2) {
                            System.out.print("Berapa stock yang akan dibeli untuk " + pilihanBarang.getMerekBarang() + " : ");
                            int tambahanStock = scanner.nextInt();
                            scanner.nextLine();
                            int stockSekarang = pilihanBarang.getStock();
                            int stockUpdate = stockSekarang + tambahanStock;
                            if (stockUpdate > 999) {
                                System.out.print("Pembelian melebihi batas stock (Tidak melibihi 999 dus). Apakah anda ingin melanjutkan pembelian barang " + pilihanBarang.getMerekBarang() + " (Y/N) ? ");
                                String lanjut = scanner.next();
                                if (lanjut.equalsIgnoreCase("Y")) {
                                    redo2 = false;
                                }
                                else {
                                    redo2 = true;
                                }
                            }
                            else {
                                redo2 = true;
                                pilihanBarang.setStock(stockUpdate);

                                System.out.println("-----------------------------------------------");
                                System.out.println("Berhasil membeli barang sebesar " + tambahanStock + " dus.");
                                System.out.println("Sukses mengupdate stock " + pilihanBarang.getMerekBarang() + " menjadi " + pilihanBarang.getStock() + " dus.");
                                System.out.println("===============================================");
                                LaporanStock laporanBeli = new LaporanStock();
                                laporanBeli.setNamaBeli(pilihanBarang.getMerekBarang());
                                laporanBeli.setBeliStock(tambahanStock);
                                laporanBeli.masukStock();
                                listBeli.add(laporanBeli);
                            }   
                        }
                    }
                    else {
                        redo1 = false;
                        System.out.println("Pilihan tidak ada. Mohon untuk memilih kembali.");
                        System.out.println();
                    }
                }
                catch (InputMismatchException e) {
                    redo1 = false;
                    System.out.println("Input tidak valid. Mohon menginput dengan angka.");
                    System.out.println();
                    scanner.nextLine();
                }
            }
        }
        System.out.println();
        System.out.println("Tahan layar untuk kembali ke menu utama.");
        read.readLine();
    }


    public static void penjualanStock() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int i;

        System.out.println("===============================================");
        if (listBarang.size() == 0) {
            System.out.println("Mohon melakukan penginputan barang terlebih dahulu.");
        }
        else {
            boolean redo1 = false;
            boolean redo2 = false;
            while (!redo1) {
                redo1 = true;
                System.out.println("List Barang:");
                for (i = 0; i < listBarang.size(); i++) {
                    Barang barang = listBarang.get(i);
                    int displayedIndex = i + 1;
                    System.out.println(displayedIndex + ". " + barang.getMerekBarang() + "\t: " + barang.getStock());
                }
                System.out.println("===============================================");
                System.out.print("Pilih barang yang akan dijual : ");  
                try {
                    int pilihan = scanner.nextInt();
                    scanner.nextLine();
                    int index = pilihan - 1;
                    if (index >= 0 && index < listBarang.size()) {
                        redo1 = true;
                        Barang pilihanBarang = listBarang.get(index);
                        while (!redo2) {
                            System.out.print("Berapa jumlah stock yang akan dijual untuk " + pilihanBarang.getMerekBarang() + " : ");
                            int penguranganStock = scanner.nextInt();
                            scanner.nextLine();
                            if (penguranganStock <= pilihanBarang.getStock()) {
                                redo2 = true;
                                int stockSekarang = pilihanBarang.getStock();
                                int stockUpdate = stockSekarang - penguranganStock;
                                pilihanBarang.setStock(stockUpdate);

                                System.out.println("-----------------------------------------------");
                                System.out.println("Berhasil menjual barang sebesar " + penguranganStock + " dus.");
                                System.out.println("Sukses mengupdate stock " + pilihanBarang.getMerekBarang() + " menjadi " + pilihanBarang.getStock() + " dus.");
                                System.out.println("===============================================");
                            }
                            else {
                                System.out.print("Barang stock tidak mencukupi. Apakah anda ingin melanjutkan penjualan barang " + pilihanBarang.getMerekBarang() + " (Y/N) ? ");
                                String lanjut = scanner.next();
                                if (lanjut.equalsIgnoreCase("Y")) {
                                    redo2 = false;
                                }
                                else {
                                    redo2 = true;
                                    System.out.println("Tidak terjadi penjualan barang.");
                                }
                            }
                        }
                    }
                    else {
                        redo1 = false;
                        System.out.println("Pilihan tidak ada. Mohon untuk memilih kembali.");
                        System.out.println();
                    }
                }
                catch (InputMismatchException e) {
                    redo1 = false;
                    System.out.println("Input tidak valid. Mohon menginput dengan angka.");
                    System.out.println();
                    scanner.nextLine();
                }
            }
        }
        System.out.println();
        System.out.println("Tahan layar untuk kembali ke menu utama.");
        read.readLine();
    }


    public static void penghapusanBarang() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Barang barang = new Barang();
        
        if (listBarang.size() == 0) {
            System.out.println("Tidak tersedia barang, silahkan input barang terlebih dahulu.");
        }
        else {
            boolean redo1 = false;
            boolean redo2 = false;
            
            cetakListBarang();
            while (!redo1) {
                System.out.print("Pilih data barang yang akan dihapus : ");
                try {
                    int pilihan = scanner.nextInt();
                    scanner.nextLine();
                    int indeks = pilihan - 1;
                    if (indeks >= 0 && indeks <= listBarang.size()) {
                        Barang pilihanBarang = listBarang.get(indeks);
                        System.out.print("Tekan Y untuk melanjutkan penghapusan data barang " + pilihanBarang.getMerekBarang() + " : ");
                        String yakin = scanner.next();
                        if (yakin.equalsIgnoreCase("Y")) {
                            redo1 = true;
                            listBarang.remove(indeks);
                            System.out.println("Barang " + pilihanBarang.getMerekBarang() + " berhasil dihapus dari list.");
                        }
                        else {
                            redo1 = true;
                            System.out.println("Penghapusan barang " + pilihanBarang.getMerekBarang() + " dibatalkan.");
                        }
                    }
                    else {
                        redo1 = false;
                        System.out.println("Pilihan tidak ada. Mohon untuk menginput kembali.");
                        scanner.nextLine();
                    }
                }
                catch (InputMismatchException e) {
                    redo1 = false;
                    System.out.println("Input tidak valid. Mohon menginput dengan angka.");
                    System.out.println();
                    scanner.nextLine();
                }
            }
        }
        System.out.println();
        System.out.println("Tahan layar untuk kembali ke menu utama.");
        read.readLine();
    }


    public static void arusStock() {
        LaporanStock laporanStock = new LaporanStock();
        if (listBeli.size() == 0) {
            System.out.println("Belum ada pembelian atau pemasukan barang.");
        }
        else{
            for (LaporanStock listBeli2 : listBeli) {
                laporanStock.masukStock();
            }
        }
        if (listJual.size() == 0) {
            System.out.println("Belum ada penjualan atau pengeluaran barang.");
        }
        else {
            laporanStock.keluarStock();
        }  
    }    

    public static void main(String[] args) throws Exception {
        init();
        inputDataTetap();
        User user = new User();
        Barang barang = new Barang();

        boolean login = false;

        while (true) {
            UserMenu();

            if (!login) {
                LoginForm(user);
                login = true;
            }

            while (login) {
                JenisMenu jenisMenu = MainMenu();
                switch (jenisMenu) {
                    case INFORMASI_BARANG -> {
                        cetakListBarang();
                        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println();
                        System.out.println("Tahan layar untuk kembali ke menu utama.");
                        read.readLine();
                    }
                    case INPUT_STOCK -> {
                        inputStock(barang);
                    }
                    case PEMBELIAN_STOCK -> {
                        pembelianStock();
                    }
                    case PENJUALAN_STOCK -> {
                        penjualanStock();
                    }
                    case PENGHAPUSAN_BARANG -> {
                        penghapusanBarang();
                    }
                    case ARUS_STOCK -> {
                        arusStock();
                    }                    
                    case LOGOUT -> {
                        login = false;
                    }
                }
            }
        }
    }

    public static void init() {
        // User
        User u1 = new User("R314", "Reisacom", "8472");
        User u2 = new User("K407", "Kaoru", "7454");
        User u3 = new User("A981", "Adonis", "7739");

        // ArusStock
        // BarangMasuk
        // ArusStock ai1 = new BarangMasuk("IN01", 0);
        // ArusStock ai2 = new BarangMasuk("IN02", 0);
        // ArusStock ai3 = new BarangMasuk("IN03", 0);
        // // BarangKeluar
        // ArusStock ao1 = new BarangKeluar("OU01", 0);
        // ArusStock ao2 = new BarangKeluar("OU02", 0);
        // ArusStock ao3 = new BarangKeluar("OU03", 0);

        // Rak
        Rak r1 = new Rak("KO01", "Biru");
        Rak r2 = new Rak("KO02", "Hitam");
        Rak r3 = new Rak("KO03", "Putih");

        // Kategori
        Kategori k1 = new Kategori("KAT01", "bumbu", r1);
        Kategori k2 = new Kategori("KAT02", "minuman", r2);
        Kategori k3 = new Kategori("KAT03", "makanan", r3);

        // Barang
        Barang b1 = new Barang("PA01", 50, "dolphin", "Rp. 110.000", k1);
        Barang b2 = new Barang("MI03", 40, "sosoro", "Rp. 100.000", k2);
        Barang b3 = new Barang("MA02", 20, "manisku", "Rp. 90.000", k3);
    }
}