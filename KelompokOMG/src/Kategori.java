// Kategori 
// Id Barang berupa sebuah string
// Jenis Barang berupa sebuah string yang berisi: "fragile atau non fragile"

// Id Barang dan Jenis Barang

public class Kategori {
    private String idBarang;
    private String fragile;


    public Kategori() {
    }
    
    public Kategori(String idBarang, String fragile) {
        this.idBarang = idBarang;
        this.fragile = fragile;
    }
    

    public String getIdBarang() {
        return this.idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
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
            " IdBarang='" + getIdBarang() + "'" +
            ", Fragile='" + getFragile() + "'" +
            "}";
    }
    
}