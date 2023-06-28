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
        return "===============================================" +
            "\nInfo Barang\n" +
            "\nID Barang\t: " + getIdBarang() +
            "\nMerek Barang\t: " + getMerekBarang() +
            "\nHarga Barang\t: " + "Rp. " + getHargaBarang() +
            "\nStock\t\t: " + getStock() + " dus" +
            "\n-----------------------------------------------" +
            "\nKategori\n" + getKategori() +
            "\n===============================================";
    }
}