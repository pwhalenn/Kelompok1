// Kategori 
// Id Kategori berupa sebuah string
// namaKategori berupa sebuah string

// Id Kategori dan Nama Kategori

public class Kategori {

    private String idKategori;
    private String namaKategori;


    public Kategori() {
    }
    
    public Kategori(String idKategori, String namaKategori) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
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

    public void setnamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }


    @Override
    public String toString() {
        return "{" +
            " IdKategori='" + getIdKategori() + "'" +
            ", NamaKategori='" + getNamaKategori() + "'" +
            "}";
    }
}