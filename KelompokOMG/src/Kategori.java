// Kategori 
// Id Kategori berupa sebuah string
// Jenis Barang berupa sebuah string yang berisi: "fragile atau non fragile"

// Id Kategori dan Jenis Barang



public class Kategori {

    private String idKategori;
    private String fragile;


    public Kategori() {
    }
    
    public Kategori(String idKategori, String fragile) {
        this.idKategori = idKategori;
        this.fragile = fragile;
    }
    

    public String getIdKategori() {
        return this.idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }


    public String getFragile() {
        return this.fragile;
    }

    public void setFragile(String fragile) {
        this.fragile = fragile;
    }


    @Override
    public String toString() {
        return "{" +
            " IdKategori='" + getIdKategori() + "'" +
            ", Fragile='" + getFragile() + "'" +
            "}";
    }
}