public class ArusStock {
    
    private String idPesanan;
    private int barangMasuk;
    private int barangKeluar;
    private Barang barang;
    private String idUser;


    public ArusStock() {
    }


    public ArusStock(String idPesanan, int barangMasuk, int barangKeluar, Barang barang, String idUser) {
        this.idPesanan = idPesanan;
        this.barangMasuk = barangMasuk;
        this.barangKeluar = barangKeluar;
        this.barang = barang;
        this.idUser = idUser;
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

    public Barang getBarang() {
        return this.barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public String getIdUser() {
        return this.idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }


    @Override
    public String toString() {
        return "{" +
            " idPesanan='" + getIdPesanan() + "'" +
            ", barangMasuk='" + getBarangMasuk() + "'" +
            ", barangKeluar='" + getBarangKeluar() + "'" +
            ", barang='" + getBarang() + "'" +
            ", idUser='" + getIdUser() + "'" +
            "}";
    }
}
