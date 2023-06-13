//barang
//Class barang akan berisi ID barang dan Kategori
//ID barang bersifat string
//Merek barang bersifat string

//infoBarang
//Akan yang akan menjelaskan expiredDate, merek, jumlahDiDus
//bersifat string


public class Barang {

    private String idBarang;
    private String infoBarang;


    public Barang() {
    }


    public Barang(String idBarang, String infoBarang) {
        this.idBarang = idBarang;
        this.infoBarang = infoBarang;
    }


    public String getIdBarang() {
        return this.idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getInfoBarang() {
        return this.infoBarang;
    }

    public void setInfoBarang(String infoBarang) {
        this.infoBarang = infoBarang;
    }



    @Override
    public String toString() {
        return "{" +
            " idBarang='" + getIdBarang() + "'" +
            ", infoBarang='" + getInfoBarang() + "'" +
            "}";
    }
}
