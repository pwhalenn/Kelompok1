public class Pesanan {
    
    private String idPesanan;
    private String barang;


    public Pesanan() {
    }


    public Pesanan(String idPesanan, String barang) {
        this.idPesanan = idPesanan;
        this.barang = barang;
    }


    public String getIdPesanan() {
        return this.idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getBarang() {
        return this.barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }


    @Override
    public String toString() {
        return "{" +
            " idPesanan='" + getIdPesanan() + "'" +
            ", barang='" + getBarang() + "'" +
            "}";
    }
}
