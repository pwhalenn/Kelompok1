package model;
/* 
Kelas untuk mengetahui informasi-informasi barang

Memiliki atribut:
idBarang bersifat string
stock bersifat int
merek bersifat string
hargaBarang bersifat string
iduser bersifat string (asosiasi)
*/

public class Barang {

    private String idBarang;
    private int stock;
    private String merekBarang;
    private String hargaBarang;
    private Kategori kategori;
    // private String idUser;


    public Barang() {
    }


    public Barang(String idBarang, int stock, String merekBarang, String hargaBarang, Kategori kategori) {
        this.idBarang = idBarang;
        this.stock = stock;
        this.merekBarang = merekBarang;
        this.hargaBarang = hargaBarang;
        this.kategori = kategori;
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

    public Kategori getKategori() {
        return this.kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s  %-20s  %-12s  %-3d %-3s  %-12s  %-20s  %-8s  %-12s%n",
            getIdBarang(),
            getMerekBarang(),
            "Rp. " + getHargaBarang(),
            getStock(),
            "dus",
            getKategori().getIdKategori(),
            getKategori().getNamaKategori(),
            getKategori().getRak().getIdRak(),
            getKategori().getRak().getRuangan()));
        return sb.toString();
    }
}