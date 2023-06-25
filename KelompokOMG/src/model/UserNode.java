package model;
/*
Kelas untuk mengetahui siapa yang melakukan semua aktifitas penginputan dan pengeditan.

Memiliki atribut:
idUserk bersifat string
namaUserk bersifat string
pink bersifat string
*/

import java.time.LocalDateTime;

public class UserNode extends Node<UserNode> {
    private UserNode Next;

    private String idUser;
    private String namaUser;
    private String pin;
    private Riwayat riwayat;


    public UserNode(String idUser, String namaUser, String pin) {
        this.idUser = idUser;
        this.namaUser = namaUser;
        this.pin = pin;

        this.Next = null;
    }

    public UserNode(String[] metadata) {
        String idUser = metadata[0];
        String namaUser = metadata[1];
        String pin = metadata[2];

        this.idUser = idUser;
        this.namaUser = namaUser;
        this.pin = pin;

        this.Next = null;
    }


    @Override
    UserNode getNext() {
        return Next;
    }

    @Override
    void setNext(UserNode data) {
        Next = data;
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

    public Riwayat getRiwayat() {
        return this.riwayat;
    }

    public void updateRiwayat(JenisMenu jenisMenu) {
        RiwayatNode log = new RiwayatNode(namaUser, jenisMenu.toString(), jenisMenu.toString(), LocalDateTime.now());
        riwayat.listRiwayat.enqueue(log);
    }

    public void updateRiwayatForTransaksi(JenisMenu jenisMenu, int amount) {
        RiwayatNode log = new RiwayatNode(namaUser, jenisMenu.toString(), jenisMenu.toString() + amount + " dus", LocalDateTime.now());
        riwayat.listRiwayat.enqueue(log);
    }


    @Override
    public String toString() {
        return "{" +
            " Next='" + getNext() + "'" +
            ", idUser='" + getIdUser() + "'" +
            ", namaUser='" + getNamaUser() + "'" +
            ", pin='" + getPin() + "'" +
            "}";
    }
}
