import java.io.Console;
import java.util.Scanner;

public class App {


<<<<<<< HEAD
    //public static void MenuUtama() {
    //    Scanner scanner = new Scanner(System.in);
    //    while (true) {
    //        System.out.println("==================Oh My Stock==================");
    //        System.out.println("1. Login");
    //        System.out.println("2. Exit");
    //        int choice = scanner.nextInt();
    //        switch (choice) {
    //            case 1 -> {
    //                return;
    //            }
    //            case 2 -> System.exit(0);
    //            default -> System.out.println("Pilihan tidak tersedia. Mohon pilih kembali.\n");
    //        }
    //    }
    //}
=======
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
>>>>>>> b157adeff3f8e72b32c91a4db998eb0f22731671


    public static JenisMenu UserMenu() {
        System.out.println("=====================MENU=====================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.  Informasi Barang");
        System.out.println("2.  Transaksi Barang");
        System.out.println("3.  Pengeditan Barang");
        System.out.println("4.  Penampilan Lokasi Stock");
        System.out.println("5.  Riwayat Transaksi Barang");
        System.out.println("6.  Logout");
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


    public static void init() {
        // barang
        // garam PA01, 50, "dolphin", "Rp. 110.000"
        // teh MI03, 40, "sosoro", "Rp. 100.000"
        // manisan MA02, 20, "manisku", "Rp. 90.000"
        Barang garam = new Barang("PA01", 50, "dolphin", "110000");
        Barang teh = new Barang("MI03", 40, "sosoro", "100000");
        Barang manisan = new Barang("MA02", 20, "manisku", "90000");

        // kategori 
        // namaKategori bumbu, minuman, makanan
        Kategori K1 = new Kategori("KAT01", "Bumbu");
        Kategori K2 = new Kategori("KAT02", "Minuman");
        Kategori K3 = new Kategori("KAT03", "Makanan");

        //rak
        Rak R1 = new Rak("KO01", "Biru", "Bumbu", null);
        Rak R2 = new Rak("KO02", "Hitam", "Minuman", null);
        Rak R3 = new Rak("KO03", "Putih", "Makanan", null)

        // aruspesanan
        ArusStock A1 = new ArusStock("PE01", 0, 0, garam, null);
        ArusStock A2 = new ArusStock("PE02", 0, 0, garam, null);
        ArusStock A3 = new ArusStock("PE03", 0, 0, garam, null);

        // user
        User V1 = new User("R314", "Reisacom", "8472");
        User V2 = new User("K407", "Kaoru", "7454");
        User V3 = new User("A981", "Adonis", "7739");
    }


    
   public static void main(String[] args) throws Exception {
        init();
            // cetakDataBarang();
            // public static void cetakDataBarang(String[] args) {
                //for (int i =0; i<20;i++){
                    //if(barang[i]!=null)
                        //System.out.println(barang[i]);
                //}
                
            //}
            //cetakInfoBarang();
            // public static void cetakInfoBarang(String[] args) {
                //for (int i =0; i<20;i++){
                    //if(infoBarang[i]!=null)
                        //System.out.println(infoBarang[i]);
                //}
            //}
            //cetakKategori();
            //public static void cetakKategori(String[] args) {
                //for (int i =0; i<20;i++){
                    //if(infoKategori[i]!=null)
                        //System.out.println(infoKategori[i]);
                //}
            //}
    }
}