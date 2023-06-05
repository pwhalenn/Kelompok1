//barang
//Class barang akan berisi ID barang, Merek Barnag dan Kategori
//ID barang bersifat integer
//Merek barang bersifat string

//Kategori
//Akan menjelaskan apakah barang adalah makanan, minuman, dll.
//bersifat string

public class Barang {
    private String IdBarang;
    private String MerekBarang;
    private String JenisBarang;


    public Barang() {
    }
    

    public Barang(String IdBarang, String MerekBarang, String JenisBarang) {
        this.IdBarang = IdBarang;
        this.MerekBarang = MerekBarang;
        this.JenisBarang = JenisBarang;
    }
    
    public String getIdBarang() {
        return this.IdBarang;
    }

    public void setIdBarang(String IdBarang) {
        this.IdBarang = IdBarang;
    }

    public String getMerekBarang() {
        return this.MerekBarang;
    }

    public void setMerekBarang(String MerekBarang) {
        this.MerekBarang = MerekBarang;
    }

    public String getJenisBarang() {
        return this.JenisBarang;
    }

    public void setJenisBarang(String JenisBarang) {
        this.JenisBarang = JenisBarang;
    }

}
