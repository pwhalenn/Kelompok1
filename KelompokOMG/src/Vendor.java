public class Vendor {
    // didalam vendor akan terdapat atribut seperti namaVendor, ID vendor dan PIN class ini akan menunjukkan
    // siapa yang melakukan berbagai kegiatan dalam aplikasi

    private String namaVendor;
    private String idVendor;
    private String pin;
    

    public Vendor() {
    }

    public Vendor(String namaVendor, String idVendor, String pin) {
        this.namaVendor = namaVendor;
        this.idVendor = idVendor;
        this.pin = pin;
    }
    

    public String getNamaVendor() {
        return this.namaVendor;
    }

    public void setNamaVendor(String namaVendor) {
        this.namaVendor = namaVendor;
    }

    public String getIdVendor() {
        return this.idVendor;
    }

    public void setIdVendor(String idVendor) {
        this.idVendor = idVendor;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
    @Override
    public String toString() {
        return "{" +
            " namaVendor='" + getNamaVendor() + "'" +
            ", idVendor='" + getIdVendor() + "'" +
            ", pin='" + getPin() + "'" +
            "}";
    }

}

    

