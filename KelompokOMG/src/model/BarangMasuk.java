package model;

public class BarangMasuk extends ArusStock implements ILaporanStock{
    
    private String idMasuk;
    private int jumlahMasuk;


    public BarangMasuk() {
    }


    public BarangMasuk(String idMasuk, int jumlahMasuk) {
        this.idMasuk = idMasuk;
        this.jumlahMasuk = jumlahMasuk;
    }


    public String getIdMasuk() {
        return this.idMasuk;
    }

    public void setIdMasuk(String idMasuk) {
        this.idMasuk = idMasuk;
    }

    public int getJumlahMasuk() {
        return this.jumlahMasuk;
    }

    public void setJumlahMasuk(int jumlahMasuk) {
        this.jumlahMasuk = jumlahMasuk;
    }


    @Override
    public String toString() {
        return "{" +
            " idMasuk='" + getIdMasuk() + "'" +
            ", jumlahMasuk='" + getJumlahMasuk() + "'" +
            "}";
    }


    @Override
    public void laporanArusStock() {
        
    }
}