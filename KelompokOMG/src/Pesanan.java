public class Pesanan {
    
    private String idPesanan;
    private String barangMasuk;
    private String barangKeluar;
    private String idBarang;
    private String user;


    public Pesanan() {
    }


    public Pesanan(String idPesanan, String barangMasuk, String barangKeluar, String idBarang, String user) {
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

    public String getBarangMasuk() {
        return this.barangMasuk;
    }

    public void setBarangMasuk(String barangMasuk) {
        this.barangMasuk = barangMasuk;
    }

    public String getBarangKeluar() {
        return this.barangKeluar;
    }

    public void setBarangKeluar(String barangKeluar) {
        this.barangKeluar = barangKeluar;
    }

    public String getIdBarang() {
        return this.idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
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
