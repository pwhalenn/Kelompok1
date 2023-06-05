// Kategori 
// Id Barang berupa sebuah string
// Jenis Barang berupa sebuah string yang berisi: "fragile atau non fragile"

// Id Barang dan Jenis Barang

public class Kategori {
    private String IdBarang;
    private String Fragile;


    public Kategori() {
    }
    
    public Kategori(String IdBarang, String Fragile) {
        this.IdBarang = IdBarang;
        this.Fragile = Fragile;
    }
    

    public String getIdBarang() {
        return this.IdBarang;
    }

    public void setIdBarang(String IdBarang) {
        this.IdBarang = IdBarang;
    }


    public String getFragile() {
        return this.Fragile;
    }

    public void setFragile(String Fragile) {
        this.Fragile = Fragile;
    }


    @Override
    public String toString() {
        return "{" +
            " IdBarang='" + getIdBarang() + "'" +
            ", Fragile='" + getFragile() + "'" +
            "}";
    }
    
}