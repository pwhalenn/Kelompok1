package model;

public class BarangKeluar extends ArusStock implements ILaporanStock {

    private String idKeluar;
    private int jumlahKeluar;


    public BarangKeluar() {
    }


    public BarangKeluar(String idKeluar, int jumlahKeluar) {
        this.idKeluar = idKeluar;
        this.jumlahKeluar = jumlahKeluar;
    }


    public String getIdKeluar() {
        return this.idKeluar;
    }

    public void setIdKeluar(String idKeluar) {
        this.idKeluar = idKeluar;
    }

    public int getJumlahKeluar() {
        return this.jumlahKeluar;
    }

    public void setJumlahKeluar(int jumlahKeluar) {
        this.jumlahKeluar = jumlahKeluar;
    }


    @Override
    public String toString() {
        return "{" +
            " idKeluar='" + getIdKeluar() + "'" +
            ", jumlahKeluar='" + getJumlahKeluar() + "'" +
            "}";
    }


    @Override
    public void pencatatanStock() {
        
    }
}