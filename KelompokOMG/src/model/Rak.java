package model;

/*
Kelas untuk mengetahui lokasi barang.

Memiliki atribut:
idRak bersifat string
ruangan bersifat string
idUser bersifat string (asosiasi)
*/

public class Rak {

    private String idRak;
    private String ruangan;
    private String idUser;

    
    public Rak() {
    }


    public Rak(String idRak, String ruangan) {
        this.idRak = idRak;
        this.ruangan = ruangan;
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


    @Override
    public String toString() {
        return "{" +
            " idRak='" + getIdRak() + "'" +
            ", ruangan='" + getRuangan() + "'" +
            "}";
    }
}


