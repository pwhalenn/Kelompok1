// Stock memiliki atribut ID Barang, Jumlah Barang, Rak
// Jumlah barang berupa stock dus

public class Stock {
    private String IdBarang;
    private String JumlahBarang;
    private String Rak;

    public Stock() {
    }

    public Stock(String IdBarang, String JumlahBarang, String Rak) {
        this.IdBarang = IdBarang;
        this.JumlahBarang = JumlahBarang;
        this.Rak = Rak;
    }

    public String getIdBarang() {
        return this.IdBarang;
    }

    public void setIdBarang(String IdBarang) {
        this.IdBarang = IdBarang;
    }

    public String getJumlahBarang() {
        return this.JumlahBarang;
    }

    public void setJumlahBarang(String JumlahBarang) {
        this.JumlahBarang = JumlahBarang;
    }

    public String getRak() {
        return this.Rak;
    }

    public void setRak(String Rak) {
        this.Rak = Rak;
    }  

}
