/* 
Kelas untuk mengetahui informasi-informasi barang

Memiliki atribut:

idBarang bersifat string
stock bersifat int
merek bersifat string
hargaBarang bersifat int
idKategori
user
*/


public class Barang {

    private String idBarang;
    private int stock;
    private String merekBarang;
    private String hargaBarang;
    private Kategori idkategori;
    private User user;


    public Barang() {
    }


    public Barang(String idBarang, int stock, String merekBarang, String hargaBarang) {
        this.idBarang = idBarang;
        this.stock = stock;
        this.merekBarang = merekBarang;
        this.hargaBarang = hargaBarang;
        this.idkategori = idkategori;
        this.user = user;
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

    public Kategori getIdkategori() {
        return this.idkategori;
    }

    public void setIdkategori(Kategori idkategori) {
        this.idkategori = idkategori;
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
            " idBarang='" + getIdBarang() + "'" +
            ", stock='" + getStock() + "'" +
            ", merekBarang='" + getMerekBarang() + "'" +
            ", hargaBarang='" + getHargaBarang() + "'" +
            "}";
    }
}
