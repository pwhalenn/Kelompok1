package model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class User {

    public List<UserNode> listUser;

    private UserNode user = null;

    public User() {
        listUser = new List<UserNode>();

        Path pathToFile = Paths.get("KelompokOMG/assets/user.csv");
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();

            while (line != null) {
                String[] metadata = line.split(",");
                UserNode userNode = new UserNode(metadata);
                listUser.add(userNode);
                line = br.readLine();
            }
            br.close();
        } catch (NoSuchFileException e) {
            System.err.println("File not found: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private boolean isValidUser(UserNode node, String idUser, String namaUser, String pin) {
        return (Objects.equals(node.getIdUser(), idUser) && Objects.equals(node.getNamaUser(), namaUser) && Objects.equals(node.getPin(), pin));
    }

    public void login(String idUser, String namaUser, String pin) {
        UserNode currentNode = (UserNode) listUser.getHead();
        do {
            if (currentNode != null) {
                if (isValidUser(currentNode, idUser, namaUser, pin)) {
                    user = currentNode;
                    currentNode.updateRiwayat(JenisMenu.LOGIN);
                    return;
                }
                currentNode = currentNode.getNext();
            }
        } while (currentNode != null);
        System.out.println("Tidak ada User Cocok\n");
    }

    public void informasiStock() throws IOException {
        // user.updateRiwayat(JenisMenu.INFORMASI_STOCK);
        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // System.out.printf("Nomor Rekening           : %s\n", user.getNomorRekening());
        // System.out.printf("Nama Pemilik             : %s\n", user.getNamaPemilik());
        // System.out.printf("Saldo                    : Rp. %s\n", String.format("%,.2f", user.getSaldo()));
        // System.out.println("Tahan layar, dan kembali ke menu utama.\n");
        // input.readLine();
    }

    public void pembelianStock() throws IOException {
        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Masukkan jumlah saldo yang ingan ditarik.");
        // double amount = scanner.nextDouble();

        // if (user.getSaldo() < amount) {
        //     System.out.println("Saldo tidak cukup.\n");
        // } else {
        //     user.withdraw(amount);
        //     user.updateHistoryForTransaction(JenisOperasi.WITHDRAW, amount);
        //     System.out.println("Berhasil withdraw.\n");
        // }

        // System.out.println("Tahan layar, dan kembali ke menu utama.\n");
        // input.readLine();
    }

    public void penjualanStock() throws IOException {
        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Masukkan jumlah nominal yang akan dideposit.");
        // double amount = scanner.nextDouble();

        // if (amount < 100000 || amount > 10000000 || amount % 100000 != 0) {
        //     System.out.println("Nominal tidak valid.\n");
        // } else {
        //     user.deposit(amount);
        //     user.updateHistoryForTransaction(JenisOperasi.DEPOSIT, amount);
        //     System.out.println("Berhasil deposit.\n");
        // }

        // System.out.println("Tahan layar, dan kembali ke menu utama.\n");
        // input.readLine();
    }

    // public void riwayatStock() throws IOException {
        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Nomor Rekening Tujuan : ");
        // String noRekeningTujuan = scanner.nextLine();

        // RekeningNode currentNode = (RekeningNode) listRekening.getHead();
        // boolean found = false;
        // do {
        //     if (currentNode != null) {
        //         if (Objects.equals(currentNode.getNomorRekening(), noRekeningTujuan)) {
        //             found = true;
        //             break;
        //         }
        //         currentNode = currentNode.getNext();
        //     }
        // } while (currentNode != null);

        // if (Objects.equals(noRekeningTujuan, user.getNomorRekening()) || !found) {
        //     System.out.println("Nomor tujuan tidak valid. Transaksi dibatalkan");
        //     System.out.println("Tahan layar, dan kembali ke menu utama.\n");
        //     input.readLine();
        //     return;
        // }

        // System.out.print("Nominal Transfer      : ");
        // double amount = scanner.nextDouble();
        // if (user.getSaldo() < amount) {
        //     System.out.println("Saldo tidak cukup.\n");
        // } else {
        //     user.withdraw(amount);
        //     user.updateHistoryForTransfer(JenisOperasi.TRANSFER, amount, true);

        //     currentNode.deposit(amount);
        //     currentNode.updateHistoryForTransfer(JenisOperasi.TRANSFER, amount, false);
        //     System.out.println("Berhasil transfer.\n");
        // }

        // System.out.println("Tahan layar, dan kembali ke menu utama.\n");
        // input.readLine();
    // }

    public void lokasiStock() throws IOException {
        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Masukkan jumlah nominal yang akan dideposit.");
        // double amount = scanner.nextDouble();

        // if (amount < 100000 || amount > 10000000 || amount % 100000 != 0) {
        //     System.out.println("Nominal tidak valid.\n");
        // } else {
        //     user.deposit(amount);
        //     user.updateHistoryForTransaction(JenisOperasi.DEPOSIT, amount);
        //     System.out.println("Berhasil deposit.\n");
        // }

        // System.out.println("Tahan layar, dan kembali ke menu utama.\n");
        // input.readLine();
    }

    public void riwayatStock() {
        user.getRiwayat().printListRiwayat();
    }

    public void logout() {
        user.updateRiwayat(JenisMenu.LOGOUT);
        this.setUser(null);
    }

    public UserNode getUser() {
        return user;
    }

    public void setUser(UserNode data) {
        user = data;
    }
}
