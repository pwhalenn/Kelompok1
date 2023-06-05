//barang
//Class barang akan berisi ID barang dan Kategori
//ID barang bersifat string
//Merek barang bersifat string

//Kategori
//Akan menjelaskan apakah barang adalah makanan, minuman, dll.
//bersifat string

public class Barang {
    private String idBarang;
    private String kategori;


    public Barang() {
    }
    

    public Barang(String idBarang, String kategori) {
        this.idBarang = idBarang;
        
        this.kategori = kategori;
    }
    
    public String getIdBarang() {
        return this.idBarang;
    }

    public void setIdBarang(String IdBarang) {
        this.idBarang = IdBarang;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

}
