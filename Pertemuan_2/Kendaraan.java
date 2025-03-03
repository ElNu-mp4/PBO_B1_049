public class Kendaraan {
    private String noPlat;
    private String Jenis;

    public Kendaraan() {
        noPlat = "";
        Jenis = "";
    }

    public Kendaraan(String noPlat, String Jenis) {
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.Jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
}
