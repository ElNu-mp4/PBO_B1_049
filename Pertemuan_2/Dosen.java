public class Dosen {
    private String NIP;
    private String Nama;
    private String Prodi;

    public Dosen() {
        NIP = "";
        Nama = "";
        Prodi = "";
    }

    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    public String getNIP() {
        return this.NIP;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getProdi() {
        return this.Prodi;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
}