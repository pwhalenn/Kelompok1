import java.util.Scanner;

public class App {

    public static void MenuAtama() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==================Oh My Stock==================");
            System.out.println("1. Login");
            System.out.println("2. Exit");
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

    public static JenisMenu UserMenu() {
        System.out.println("=====================MENU=====================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.  Informasi Barang"); // 
        System.out.println("2.  Transaksi Barang");
        System.out.println("3.  Pengeditan Barang");
        System.out.println("4.  Penampilan Lokasi Stock");
        System.out.println("5.  Riwayat Transaksi Barang");
        System.out.print("Choice ? ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                return JenisMenu.INFORMASI_STOCK;
            }
            case 2 -> {
                return JenisMenu.PEMBELIAN_STOCK;
            }
            case 3 -> {
                return JenisMenu.PENUJUALAN_STOCK;
            }
            case 4 -> {
                return JenisMenu.EDIT_STOCK;
            }
            case 5 -> {
                return JenisMenu.RIWAYAT_STOCK;
            }
            case 6 -> {
                return JenisMenu.LOGOUT;
            }
            default -> System.out.println("Pilihan tidak tersedia. Mohon pilih kembali.\n");
        }
    }

    

    public static void main(String[] args) throws Exception {
    }

    public static void init() {
        // barang
        // buat dari sini

        // kategori
        Kategori pakaian = new Kategori("PA02", "Non-Fragile");
        Kategori makanan = new Kategori("MA01", "Fragile");
        Kategori minuman = new Kategori("Mi03", "Fragile");
        // rak
        // buat dari sini

        // stock
        // buat dari sini

        // vendor
        // buat dari sini
    }
}
