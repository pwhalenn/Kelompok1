public class User {
    // didalam vendor akan terdapat atribut seperti namaUser, ID User dan PIN class ini akan menunjukkan
    // siapa yang melakukan berbagai kegiatan dalam aplikasi

    private String namaUser;
    private String idUser;
    private String pin;

    
    

    public User() {
    }

    public User(String namaUser, String idUser, String pin) {
        this.namaUser = namaUser;
        this.idUser = idUser;
        this.pin = pin;
    }
    

    public String getNamaUser() {
        return this.namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getIdUser() {
        return this.idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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
            " namaUser='" + getNamaUser() + "'" +
            ", idUser='" + getIdUser() + "'" +
            ", pin='" + getPin() + "'" +
            "}";
    }

}

    

