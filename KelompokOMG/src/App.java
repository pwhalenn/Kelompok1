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
        Scanner scanner = new Scanner(System.in);
    }

    public static void main(String[] args) throws Exception {
        
    }
}
