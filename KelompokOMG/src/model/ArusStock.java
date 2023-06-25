package model;
/*
Kelas untuk mengetahui stock barang masuk dan keluar.

Memiliki atribut:
idPesanan bersifat string
barang merupakan kelas (agregrasi)
idUser bersifat string (asosiasi)
*/

public abstract class ArusStock {
    
    private String idPesanan;
    private LOL barang;
    private String idUser;


    public ArusStock() {
    }


    public ArusStock(String idPesanan, LOL barang) {
        this.idPesanan = idPesanan;
        this.barang = barang;
    }


    public String getIdPesanan() {
        return this.idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public LOL getBarang() {
        return this.barang;
    }

    public void setBarang(LOL barang) {
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
