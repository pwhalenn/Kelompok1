import java.io.Console;
import java.util.Scanner;

public class App {


    //public static void MenuAtama() {
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


    //public static JenisMenu UserMenu() {
    //    System.out.println("=====================MENU=====================");
    //    Scanner scanner = new Scanner(System.in);
    //    System.out.println("1.  Informasi Barang");
    //    System.out.println("2.  Transaksi Barang");
    //    System.out.println("3.  Pengeditan Barang");
    //    System.out.println("4.  Penampilan Lokasi Stock");
    //    System.out.println("5.  Riwayat Transaksi Barang");
    //    System.out.println("6.  Logout");
    //    System.out.print("Choice ? ");
    //    int choice = scanner.nextInt();
    //    switch (choice) {
    //        case 1 -> {
    //            return JenisMenu.INFORMASI_STOCK;
    //        }
    //        case 2 -> {
    //            return JenisMenu.TRANSAKSI_STOCK;
    //        }
    //        case 3 -> {
    //            return JenisMenu.EDIT_STOCK;
    //        }
    //        case 4 -> {
    //            return JenisMenu.LOKASI_STOCK;
    //        }
    //        case 5 -> {
    //            return JenisMenu.RIWAYAT_STOCK;
    //        }
    //        case 6 -> {
    //            return JenisMenu.LOGOUT;
    //        }
    //        default -> System.out.println("Pilihan tidak tersedia. Mohon pilih kembali.\n");
    //    }
    //}


    public static void init() {
        // barang
        // garam PA01, 50, "dolphin", "Rp. 110.000"
        // teh MI03, 40, "sosoro", "Rp. 100.000"
        // manisan MA02, 20, "manisku", "Rp. 90.000"
        Barang garam = new Barang("PA01", 0, null, null);

        // kategori 
        // namaKategori bumbu, minuman, makanan
        Kategori K1 = new Kategori("KAT01", "Bumbu");
        Kategori K2 = new Kategori("KAT02", "Minuman");
        Kategori K3 = new Kategori("KAT03", "Makanan");

        //rak
        Rak R1 = new Rak("KO01", "Biru", "bumbu");
        Rak R2 = new Rak("KO02", "Hitam", "minuman");
        Rak R3 = new Rak("KO03", "Putih", "makanan");

        // pesanan
        Pesanan P1 = new Pesanan(null, null, null, null, null)

        // vendor
        User V1 = new User("R314", "Reisacom", "8472");
        User V2 = new User("K407", "Kaoru", "7454");
        User V3 = new User("A981", "Adonis", "7739");
    }


    
   public static void main(String[] args) throws Exception {
        init();
            //cetakDataBarang();
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


        
        Barang garam = new Barang("PA01", "bumbu");
        System.out.println(garam);
        Barang teh = new Barang("MI03", "minuman");
        System.out.println(teh);
        Barang manisan = new Barang("MA02", "makanan");
        System.out.println(manisan);
        //

        InfoBarang IB1 = new InfoBarang("23-08-24", "dolphin", "30");
        System.out.println(IB1);
        InfoBarang IB2 = new InfoBarang("01-12-23", "sosoro", "50");
        System.out.println(IB2);
        InfoBarang IB3 = new InfoBarang("11-01-25", "manisku", "80");
        System.out.println(IB3);
        //

        Kategori bumbu = new Kategori("KAT01", "Non-Fragile");
        System.out.println(bumbu);
        Kategori minuman = new Kategori("KAT02", "Fragile");
        System.out.println(minuman);
        Kategori makanan = new Kategori("KAT03", "Fragile");
        System.out.println(makanan);
        //

        Rak R1 = new Rak("KO01", "Biru", "bumbu");
        System.out.println(R1);
        Rak R2 = new Rak("KO02", "Hitam", "minuman");
        System.out.println(R2);
        Rak R3 = new Rak("KO03", "Putih", "makanan");
        System.out.println(R3);
        //

        Stock S1 = new Stock("STOCK1", "garam", 50, "Rp. 110.000");
        System.out.println(S1);
        Stock S2 = new Stock("STOCK2", "teh", 40, "Rp. 100.000");
        System.out.println(S2);
        Stock S3 = new Stock("STOCK3", "manisan", 20, "Rp. 90.000");
        System.out.println(S3);
        //

        User V1 = new User("R314", "Reisacom", "8472");
        System.out.println(V1);
        User V2 = new User("K407", "Kaoru", "7454");
        System.out.println(V2);
        User V3 = new User("A981", "Adonis", "7739");
        System.out.println(V3);
        //
    }
}