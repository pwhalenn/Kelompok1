//Rak
//Pada rak memiliki beberapa class yaitu ID Rak, Ruangan, dan ID Barang

//ID Ruangan

//Ruangan
//Pada ruangan memiliki beberapa nomor ruangan seperti R1, R2, R3 dan pada tiap ruangan terdapat kategori barang yang berbeda

//ID Barang



public class Rak {

    private String idRuangan;
    private String ruangan;
    private String idBarang;
    

    public Rak() {
    }

    public Rak(String idRuangan, String ruangan, String idBarang) {
        this.idRuangan = idRuangan;
        this.ruangan = ruangan;
        this.idBarang = idBarang;
    }

    
    public String getIdRuangan() {
        return this.idRuangan;
    }
    
    public void setIdRuangan(String idRuangan) {
        this.idRuangan = idRuangan;
    }
    
    public String getRuangan() {
        return this.ruangan;
    }
    
    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }
    
    public String getIdBarang() {
        return this.idBarang;
    }
    
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }
    

    @Override
    public String toString() {
        return "{" +
            " idRuangan='" + getIdRuangan() + "'" +
            ", ruangan='" + getRuangan() + "'" +
            ", idBarang='" + getIdBarang() + "'" +
            "}";
    }

}


