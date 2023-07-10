package model;

/*
Kelas untuk mengetahui kategori dari setiap barang.

NB: Nantinya kategori akan menjadi penentu pengalokasi barang.

Memiliki atribut:
idKategori bersifat string
namaKategori bersifat string
rak merupakan kelas (agregrasi)
*/


public class Kategori {

    private String idKategori;
    private String namaKategori;
    private Rak rak;


    public Kategori() {
    }


    public Kategori(String idKategori, String namaKategori, Rak rak) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
        this.rak = rak;
    }


    public String getIdKategori() {
        return this.idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamaKategori() {
        return this.namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public Rak getRak() {
        return this.rak;
    }

    public void setRak(Rak rak) {
        this.rak = rak;
    }


    @Override
    public String toString() {
        return
            "\nID Kategori\t: " + getIdKategori() +
            "\nNama Kategori\t: " + getNamaKategori() +
            "\n-----------------------------------------------" +
            "\nRak\n\n" + getRak();
    }
}