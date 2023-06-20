//barang
//Class barang akan berisi ID barang dan Kategori
//ID barang bersifat string
//Merek barang bersifat string

//infoBarang
//Akan yang akan menjelaskan expiredDate, merek, jumlahDiDus
//bersifat string


public class Barang {

    private String idBarang;
    private int stock;
    private String merekBarang;
    private String hargaBarang;


    public Barang() {
    }


    public Barang(String idBarang, int stock, String merekBarang, String hargaBarang) {
        this.idBarang = idBarang;
        this.stock = stock;
        this.merekBarang = merekBarang;
        this.hargaBarang = hargaBarang;
    }


    public String getIdBarang() {
        return this.idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMerekBarang() {
        return this.merekBarang;
    }

    public void setMerekBarang(String merekBarang) {
        this.merekBarang = merekBarang;
    }

    public String getHargaBarang() {
        return this.hargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }


    @Override
    public String toString() {
        return "{" +
            " idBarang='" + getIdBarang() + "'" +
            ", stock='" + getStock() + "'" +
            ", merekBarang='" + getMerekBarang() + "'" +
            ", hargaBarang='" + getHargaBarang() + "'" +
            "}";
    }
}
