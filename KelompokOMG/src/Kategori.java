// Kategori 
// Id Barang berupa sebuah string
// Jenis Barang berupa sebuah string yang berisi: "fragile atau non fragile"

// Id Barang, Jenis Barang, Fragile

public class Kategori {
    private String IdBarang;
    private String JenisBarang;
    private String Fragile;


    public String getIdBarang() {
        return this.IdBarang;
    }

    public void setIdBarang(String IdBarang) {
        this.IdBarang = IdBarang;
    }

    public String getJenisBarang() {
        return this.JenisBarang;
    }

    public void setJenisBarang(String JenisBarang) {
        this.JenisBarang = JenisBarang;
    }

    public String getFragile() {
        return this.Fragile;
    }

    public void setFragile(String Fragile) {
        this.Fragile = Fragile;
    }

}