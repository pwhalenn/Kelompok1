package model;

public class LaporanStock extends Pesanan implements IArusStock {
    @Override
    public void masukStock() {
        System.out.println("Terjadi Pembelian Stock Barang");
    }

    @Override
    public void keluarStock() {
        System.out.println("Terjadi Penjualan Stock Barang");
    }
}