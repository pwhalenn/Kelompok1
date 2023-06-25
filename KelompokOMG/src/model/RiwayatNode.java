import java.time.LocalDateTime;

public class RiwayatNode extends Node<RiwayatNode> {
    private RiwayatNode Next;

    private String namaUser;
    private String jenisMenu;
    private String keterangan;
    private LocalDateTime CreatedOn;

    public RiwayatNode(String namaUser, String jenisMenu, String keterangan, LocalDateTime CreatedOn) {
        this.namaUser = namaUser;
        this.jenisMenu = jenisMenu;
        this.keterangan = keterangan;
        this.CreatedOn = CreatedOn;

        this.Next = null;
    }


    @Override
    RiwayatNode getNext() {
        return Next;
    }

    @Override
    void setNext(RiwayatNode data) {
        Next = data;
    }

    public String getNamaUser() {
        return this.namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getJenisMenu() {
        return this.jenisMenu;
    }

    public void setJenisMenu(String jenisMenu) {
        this.jenisMenu = jenisMenu;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public LocalDateTime getCreatedOn() {
        return this.CreatedOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.CreatedOn = createdOn;
    }
}