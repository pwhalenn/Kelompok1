public class Vendor {
    // didalam vendor akan terdapat atribut seperti namaVendor, ID vendor dan PIN class ini akan menunjukkan
    // siapa yang melakukan berbagai kegiatan dalam aplikasi

    private String NamaVendor;
    private String IdVendor;
    private String Pin;
    

    public Vendor() {
    }

    public Vendor(String NamaVendor, String IdVendor, String Pin) {
        this.NamaVendor = NamaVendor;
        this.IdVendor = IdVendor;
        this.Pin = Pin;
    }
    

    public String getNamaVendor() {
        return this.NamaVendor;
    }

    public void setNamaVendor(String NamaVendor) {
        this.NamaVendor = NamaVendor;
    }

    public String getIdVendor() {
        return this.IdVendor;
    }

    public void setIdVendor(String IdVendor) {
        this.IdVendor = IdVendor;
    }

    public String getPin() {
        return this.Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }
    
    }
    

