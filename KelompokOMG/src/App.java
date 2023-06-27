import java.io.Console;
import java.util.Scanner;
import model.JenisMenu;
import model.User;

public class App {

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
            System.out.println("2.  Pembelian Barang");
            System.out.println("3.  Penjualan Barang");
            System.out.println("4.  Riwayat Stock");
            System.out.println("5.  Penampilan Lokasi Stock");
            System.out.println("6.  Logout");
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
                    return JenisMenu.PENJUALAN_STOCK;
                }
                case 4 -> {
                    return JenisMenu.RIWAYAT_STOCK;
                }
                case 5 -> {
                    return JenisMenu.LOKASI_STOCK;
                }
                case 6 -> {
                    return JenisMenu.LOGOUT;
                }
                default -> System.out.println("Pilihan tidak tersedia. Mohon pilih kembali.\n");
            }
        }
    }


    public static void LoginForm(User user) {
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        System.out.print("ID User ? ");
        String idUser = scanner.nextLine();

        System.out.print("Nama User ? ");
        String namaUser = scanner.nextLine();

        System.out.print("PIN ? ");
        String pin = new String(console.readPassword());

        user.setIdUser(idUser);
        user.setNamaUser(namaUser);
        user.setPin(pin);

        System.out.println("===============================================");
        System.out.println("Hi " + user.getNamaUser() + "(" + user.getIdUser() + ")" + ", apa yang ingin anda lakukan?");
    }

    
   public static void main(String[] args) throws Exception {
        User user = new User();

        while (true) {
            UserMenu();
            LoginForm(user);

            while (user.getNamaUser() != null) {
                JenisMenu jenisMenu = MainMenu();
                switch (jenisMenu) {
                    case INFORMASI_STOCK -> {
                        return;
                    }
                    case PEMBELIAN_STOCK -> {
                        return;
                    }
                    case PENJUALAN_STOCK -> {
                        return;
                    }
                    case RIWAYAT_STOCK -> {
                        return;
                    }
                    case LOKASI_STOCK ->  {
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
        // UserNode U1 = new UserNode("R314", "Reisacom", "8472");
        // UserNode U2 = new UserNode("K407", "Kaoru", "7454");
        // UserNode U3 = new UserNode("A981", "Adonis", "7739");


        // Barang
        // Barang garam = new Barang("PA01", 50, "dolphin", "Rp. 110.000");
        // Barang teh = new Barang("MI03", 40, "sosoro", "Rp. 100.000");
        // Barang manisan = new Barang("MA02", 20, "manisku", "Rp. 90.000");


        // ArusStock
        // ArusStock AS1 = new ArusStock("PE01", garam);
        // ArusStock AS2 = new ArusStock("PE02", teh);
        // ArusStock AS3 = new ArusStock("PE03", manisan);


        // Rak
        // Rak R1 = new Rak("KO01", "Biru");
        // Rak R2 = new Rak("KO02", "Hitam");
        // Rak R3 = new Rak("KO03", "Putih");


        // Kategori 
        // Kategori K1 = new Kategori("KAT01", "bumbu", garam, R1);
        // Kategori K2 = new Kategori("KAT02", "minuman", garam, R2);
        // Kategori K3 = new Kategori("KAT03", "makanan", garam, R3);
    }
}
