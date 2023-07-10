package model;

/*
Kelas subclass

Memiliki metode:
masukStock()
keluarStock()
*/

public class LaporanStock extends Pesanan implements IArusStock {
    Barang barang = new Barang();
    @Override
    public void masukStock() {
        System.out.println("Pembelian stock barang " + getNamaBeli() + " sebesar " + getBeliStock());
    }

    @Override
    public void keluarStock() {
        System.out.println("Penjualan stock barang " + getNamaJual() +  " sebesar " + getJualStock());
    }
}