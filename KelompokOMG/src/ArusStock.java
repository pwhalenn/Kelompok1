public class ArusStock {
    
    private String idPesanan;
    private int barangMasuk;
    private int barangKeluar;
    private Barang Barang;
    private String idUser;


    public ArusStock() {
    }


    public ArusStock(String idPesanan, int barangMasuk, int barangKeluar, Barang idBarang, User user) {
        this.idPesanan = idPesanan;
        this.barangMasuk = barangMasuk;
        this.barangKeluar = barangKeluar;
        this.idBarang = idBarang;
        this.user = user;
    }


    public String getIdPesanan() {
        return this.idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public int getBarangMasuk() {
        return this.barangMasuk;
    }

    public void setBarangMasuk(int barangMasuk) {
        this.barangMasuk = barangMasuk;
    }

    public int getBarangKeluar() {
        return this.barangKeluar;
    }

    public void setBarangKeluar(int barangKeluar) {
        this.barangKeluar = barangKeluar;
    }

    public Barang getIdBarang() {
        return this.idBarang;
    }

    public void setIdBarang(Barang idBarang) {
        this.idBarang = idBarang;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "{" +
            " idPesanan='" + getIdPesanan() + "'" +
            ", barangMasuk='" + getBarangMasuk() + "'" +
            ", barangKeluar='" + getBarangKeluar() + "'" +
            ", idBarang='" + getIdBarang() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }
}
