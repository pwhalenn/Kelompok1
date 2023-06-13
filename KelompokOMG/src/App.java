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
        System.out.println("1.  Informasi Barang");
        System.out.println("2.  Transaksi Barang");
        System.out.println("3.  Pengeditan Barang");
        System.out.println("4.  Penampilan Lokasi Stock");
        System.out.println("5.  Riwayat Transaksi Barang");
        System.out.println("5.  Logout");
        System.out.print("Choice ? ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                return JenisMenu.INFORMASI_STOCK;
            }
            case 2 -> {
                return JenisMenu.TRANSAKSI_STOCK;
            }
            case 3 -> {
                return JenisMenu.EDIT_STOCK;
            }
            case 4 -> {
                return JenisMenu.LOKASI_STOCK;
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
        init();
    }


    public static void init() {
        // barang
        Barang garam = new Barang("PA01", "bumbu");
        Barang teh = new Barang("MI03", "minuman");
        Barang manisan = new Barang("MA02", "makanan");

        // kategori
        Kategori bumbu = new Kategori("KAT01", "Non-Fragile");
        Kategori minuman = new Kategori("KAT02", "Fragile");
        Kategori makanan = new Kategori("KAT03", "Fragile");

        //rak
        Rak R1 = new Rak("KO01", "Biru", "bumbu");
        Rak R2 = new Rak("KO02", "Hitam", "minuman");
        Rak R3 = new Rak("KO03", "Putih", "makanan");

        // stock
        Stock S1 = new Stock("STOCK1", "garam", 50, "R1");
        Stock S2 = new Stock("STOCK2", "teh", 40, "R1");
        Stock S3 = new Stock("STOCK3", "manisan", 20, "R3");

        // vendor
        User V1 = new User("R314", "Reisacom", "8472");
        User V2 = new User("K407", "Kaoru", "7454");
        User V3 = new User("A981", "Adonis", "7739");
    }


}