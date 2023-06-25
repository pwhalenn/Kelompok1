/*
Kelas ini untuk mengetahui kerawanan barang yang berkaitan dengan kelas Kategori.

Memiliki atribut:
idFragile bersifat string
kerawanan bersifat string
*/


public class Fragile extends Kategori{
    
    private String idFragile;
    private String kerawanan;


    public Fragile() {
    }


    public Fragile(String idFragile, String kerawanan) {
        this.idFragile = idFragile;
        this.kerawanan = kerawanan;
    }


    public String getIdFragile() {
        return this.idFragile;
    }

    public void setIdFragile(String idFragile) {
        this.idFragile = idFragile;
    }

    public String getKerawanan() {
        return this.kerawanan;
    }

    public void setKerawanan(String kerawanan) {
        this.kerawanan = kerawanan;
    }


    @Override
    public String toString() {
        return "{" +
            " idFragile='" + getIdFragile() + "'" +
            ", kerawanan='" + getKerawanan() + "'" +
            "}";
    }
}
