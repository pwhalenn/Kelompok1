package model;
/*
Kelas untuk mengetahui stock barang masuk dan keluar.

Memiliki atribut:
idPesanan bersifat string
barang merupakan kelas (agregrasi)
idUser bersifat string (asosiasi)
*/

public abstract class Pesanan {
    
    private String idPesanan;
    private String namaBeli;
    private String namaJual;
    private int beliStock;
    private int jualStock;
    private Barang barang;


    public Pesanan() {
    }
    

    public Pesanan(String idPesanan, String namaBeli, String namaJual, int beliStock, int jualStock, Barang barang) {
        this.idPesanan = idPesanan;
        this.namaBeli = namaBeli;
        this.namaJual = namaJual;
        this.beliStock = beliStock;
        this.jualStock = jualStock;
        this.barang = barang;
    }


    public String getIdPesanan() {
        return this.idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getNamaBeli() {
        return this.namaBeli;
    }

    public void setNamaBeli(String namaBeli) {
        this.namaBeli = namaBeli;
    }

    public String getNamaJual() {
        return this.namaJual;
    }

    public void setNamaJual(String namaJual) {
        this.namaJual = namaJual;
    }

    public int getBeliStock() {
        return this.beliStock;
    }

    public void setBeliStock(int beliStock) {
        this.beliStock = beliStock;
    }

    public int getJualStock() {
        return this.jualStock;
    }

    public void setJualStock(int jualStock) {
        this.jualStock = jualStock;
    }

    public Barang getBarang() {
        return this.barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }


    @Override
    public String toString() {
        return "{" +
            " idPesanan='" + getIdPesanan() + "'" +
            ", namaBeli='" + getNamaBeli() + "'" +
            ", namaJual='" + getNamaJual() + "'" +
            ", beliStock='" + getBeliStock() + "'" +
            ", jualStock='" + getJualStock() + "'" +
            ", barang='" + getBarang() + "'" +
            "}";
    }
}