// Stock memiliki atribut ID Barang, Jumlah Barang, Rak
// Jumlah barang berupa stock dus

public class Stock {
    private String idBarang;
    private String jumlahBarang;
    private String rak;

    public Stock() {
    }

    public Stock(String idBarang, String jumlahBarang, String rak) {
        this.idBarang = idBarang;
        this.jumlahBarang = jumlahBarang;
        this.rak = rak;
    }

    public String getIdBarang() {
        return this.idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getJumlahBarang() {
        return this.jumlahBarang;
    }

    public void setJumlahBarang(String jumlahBarang) {
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
            " IdBarang='" + getIdBarang() + "'" +
            ", JumlahBarang='" + getJumlahBarang() + "'" +
            ", Rak='" + getRak() + "'" +
            "}";
    }
}
