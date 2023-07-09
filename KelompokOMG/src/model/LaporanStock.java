package model;

public class LaporanStock extends Pesanan implements IArusStock {
    @Override
    public void masukStock() {
        System.out.println("Pembelian stock barang ");
    }

    @Override
    public void keluarStock() {
        throw new UnsupportedOperationException("Unimplemented method 'keluarStock'");
    }
}