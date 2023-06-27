package model;

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

    public boolean isValid(String inputedIdUser, String inputedNamaUser, String inputedPin) {
        return inputedIdUser.equals(idUser) && inputedNamaUser.equals(namaUser) && inputedPin.equals(pin);
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
