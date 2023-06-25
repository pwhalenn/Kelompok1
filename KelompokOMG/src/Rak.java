//Rak
//Pada rak memiliki beberapa class yaitu idRak, ruangan, dan kategori
//idRuangan

//ruangan
//Pada ruangan memiliki beberapa nomor ruangan seperti R1, R2, R3 dan pada tiap ruangan terdapat kategori barang yang berbeda

//kategori



public class Rak {

    private String idRak;
    private String ruangan;
    private String idUser;


    public Rak() {
    }


    public Rak(String idRak, String ruangan, String idUser) {
        this.idRak = idRak;
        this.ruangan = ruangan;
        this.idUser = idUser;
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

    public String getIdUser() {
        return this.idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }


    @Override
    public String toString() {
        return "{" +
            " idRak='" + getIdRak() + "'" +
            ", ruangan='" + getRuangan() + "'" +
            ", idUser='" + getIdUser() + "'" +
            "}";
    }
}


