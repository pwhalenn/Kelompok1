// Stock memiliki atribut ID Barang, Jumlah Barang, Rak
// Jumlah barang berupa stock dus

public class Stock {

    private String idStock;
    private String Barang;
    private int jumlahBarang;
    private String rak;


    public Stock() {
    }

    public Stock(String idStock, String Barang, int jumlahBarang, String rak) {
        this.idStock = idStock;
        this.Barang = Barang;
        this.jumlahBarang = jumlahBarang;
        this.rak = rak;
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

    public int getJumlahBarang() {
        return this.jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getRak() {
        return this.rak;
    }

    public void setRak(String rak) {
        this.rak = rak;
    }


    @Override
    public String toString() {
        return "{" +
            " idStock='" + getIdStock() + "'" +
            ", Barang='" + getBarang() + "'" +
            ", jumlahBarang='" + getJumlahBarang() + "'" +
            ", rak='" + getRak() + "'" +
            "}";
    }
}
