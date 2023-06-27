package model;

public class Riwayat {
    public Queue<RiwayatNode> listRiwayat;

    public Riwayat() {
        this.listRiwayat = new Queue<RiwayatNode>();
    }

    public void printListRiwayat() {
        while (listRiwayat.getIterator() != null) {
            RiwayatNode current = (RiwayatNode) listRiwayat.getIterator();
            System.out.println("========================================");
            System.out.println("Jenis Transaksi: " + current.getJenisMenu());
            System.out.println("Keterangan: " + current.getKeterangan());
            System.out.println(current.getCreatedOn().toString());
            System.out.println();
            listRiwayat.next();
        }
        listRiwayat.rollback();
        System.out.println("========================================");
    }
}
