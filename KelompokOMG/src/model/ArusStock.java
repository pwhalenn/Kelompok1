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
    private Barang barang;
    // private String idUser;


    public ArusStock() {
    }


    public ArusStock(String idPesanan, Barang barang) {
        this.idPesanan = idPesanan;
        this.barang = barang;
    }


    public String getIdPesanan() {
        return this.idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
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
            ", barang='" + getBarang() + "'" +
            "}";
    }
}
