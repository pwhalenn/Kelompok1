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
        System.out.println("1.  Informasi Stock");
        System.out.println("2.  Pembelian Stock");
        System.out.println("3.  Penjualan Stock");
        System.out.println("4.  Pengeditan Stock");
        System.out.println("5.  Penampilan Lokasi Stock");
        System.out.println("6.  Riwayat Transaksi Stock");
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
}
