//Rak
//Pada rak memiliki beberapa class yaitu ID Rak, Ruangan, dan ID Barang

//ID Ruangan

//Ruangan
//Pada ruangan memiliki beberapa nomor ruangan seperti R1, R2, R3 dan pada tiap ruangan terdapat kategori barang yang berbeda

//ID Barang



public class Rak {

    private String IdRuangan;
    private String Ruangan;
    private String IdBarang;
    
    
    public String getIdRuangan() {
        return this.IdRuangan;
    }
    
    public void setIdRuangan(String IdRuangan) {
        this.IdRuangan = IdRuangan;
    }
    
    public String getRuangan() {
        return this.Ruangan;
    }
    
    public void setRuangan(String Ruangan) {
        this.Ruangan = Ruangan;
    }
    
    public String getIdBarang() {
        return this.IdBarang;
    }
    
    public void setIdBarang(String IdBarang) {
        this.IdBarang = IdBarang;
    }
    
}


