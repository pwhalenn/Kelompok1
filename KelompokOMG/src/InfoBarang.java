public class InfoBarang {
    
    private String expiredDate;
    private String merek;
    private String jumlahDiDus;


    public InfoBarang() {
    }


    public InfoBarang(String expiredDate, String merek, String jumlahDiDus) {
        this.expiredDate = expiredDate;
        this.merek = merek;
        this.jumlahDiDus = jumlahDiDus;
    }


    public String getExpiredDate() {
        return this.expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getMerek() {
        return this.merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getJumlahDiDus() {
        return this.jumlahDiDus;
    }

    public void setJumlahDiDus(String jumlahDiDus) {
        this.jumlahDiDus = jumlahDiDus;
    }



    @Override
    public String toString() {
        return "{" +
            " expiredDate='" + getExpiredDate() + "'" +
            ", merek='" + getMerek() + "'" +
            ", jumlahDiDus='" + getJumlahDiDus() + "'" +
            "}";
    }
}
