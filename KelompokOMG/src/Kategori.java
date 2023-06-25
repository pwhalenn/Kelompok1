// Kategori 
// Id Kategori berupa sebuah string
// namaKategori berupa sebuah string

// Id Kategori dan Nama Kategori

public class Kategori {

    private String idKategori;
    private String namaKategori;
    private Barang barang;
    private Rak rak;


    public Kategori() {
    }


    public Kategori(String idKategori, String namaKategori, Barang barang, Rak rak) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
        this.barang = barang;
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

    public Barang getBarang() {
        return this.barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Rak getRak() {
        return this.rak;
    }

    public void setRak(Rak rak) {
        this.rak = rak;
    }


    @Override
    public String toString() {
        return "{" +
            " idKategori='" + getIdKategori() + "'" +
            ", namaKategori='" + getNamaKategori() + "'" +
            ", barang='" + getBarang() + "'" +
            ", rak='" + getRak() + "'" +
            "}";
    }
}