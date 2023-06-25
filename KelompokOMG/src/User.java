/*
Kelas untuk mengetahui siapa yang melakukan semua aktifitas penginputan dan pengeditan.

Memiliki atribut:
idUserk bersifat string
namaUserk bersifat string
pink bersifat string
*/


public class User {

    private String idUser;
    private String namaUser;
    private String pin;


    public User() {
    }


    public User(String idUser, String namaUser, String pin) {
        this.idUser = idUser;
        this.namaUser = namaUser;
        this.pin = pin;
    }


    public String getIdUser() {
        return this.idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNamaUser() {
        return this.namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
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
            " idUser='" + getIdUser() + "'" +
            ", namaUser='" + getNamaUser() + "'" +
            ", pin='" + getPin() + "'" +
            "}";
    }
}

    

