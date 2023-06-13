//Rak
//Pada rak memiliki beberapa class yaitu idRRak, ruangan, dan idBarang
//idRuangan

//ruangan
//Pada ruangan memiliki beberapa nomor ruangan seperti R1, R2, R3 dan pada tiap ruangan terdapat kategori barang yang berbeda

//idBarang



public class Rak {

    private String idRak;
    private String ruangan;
    private String idBarang;
    

    public Rak() {
    }

    public Rak(String idRak, String ruangan, String idBarang) {
        this.idRak = idRak;
        this.ruangan = ruangan;
        this.idBarang = idBarang;
    }


    public String getIdRak() {
        return this.idRak;
    }

    public void setIdRak(String idRak) {
        this.idRak = idRak;
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
            " idRak='" + getIdRak() + "'" +
            ", ruangan='" + getRuangan() + "'" +
            ", idBarang='" + getIdBarang() + "'" +
            "}";
    }
}


