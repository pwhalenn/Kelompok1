// Stock memiliki atribut ID Stock, Barnag, Jumlah Dus, Rak
// Jumlah Dus berupa stock dus

public class Stock {

    private String idStock;
    private String Barang;
    private int jumlahDus;
    private String hargaPerDus;


    public Stock() {
    }


    public Stock(String idStock, String Barang, int jumlahDus, String hargaPerDus) {
        this.idStock = idStock;
        this.Barang = Barang;
        this.jumlahDus = jumlahDus;
        this.hargaPerDus = hargaPerDus;
    }


    public String getIdStock() {
        return this.idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public String getBarang() {
        return this.Barang;
    }

    public void setBarang(String Barang) {
        this.Barang = Barang;
    }

    public int getJumlahDus() {
        return this.jumlahDus;
    }

    public void setJumlahDus(int jumlahDus) {
        this.jumlahDus = jumlahDus;
    }

    public String getHargaPerDus() {
        return this.hargaPerDus;
    }

    public void setHargaPerDus(String hargaPerDus) {
        this.hargaPerDus = hargaPerDus;
    }


    @Override
    public String toString() {
        return "{" +
            " idStock='" + getIdStock() + "'" +
            ", Barang='" + getBarang() + "'" +
            ", jumlahDus='" + getJumlahDus() + "'" +
            ", hargaPerDus='" + getHargaPerDus() + "'" +
            "}";
    }
}
