//Rak
//Pada rak memiliki beberapa class yaitu idRuangan, ruangan, dan idBarang
//idRuangan

//ruangan
//Pada ruangan memiliki beberapa nomor ruangan seperti R1, R2, R3 dan pada tiap ruangan terdapat kategori barang yang berbeda

//idBarang



public class Rak {

    private String idRuangan;
    private String idRak;
    private String idBarang;
    

    public Rak() {
    }

    public Rak(String idRuangan, String idRak, String idBarang) {
        this.idRuangan = idRuangan;
        this.idRak = idRak;
        this.idBarang = idBarang;
    }

    
    public String getIdRuangan() {
        return this.idRuangan;
    }
    
    public void setIdRuangan(String idRuangan) {
        this.idRuangan = idRuangan;
    }
    
    public String getIdRak() {
        return this.idRak;
    }
    
    public void setRuangan(String idRak) {
        this.idRak = idRak;
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
            ", idRak='" + getIdRak() + "'" +
            ", idBarang='" + getIdBarang() + "'" +
            "}";
    }

}


