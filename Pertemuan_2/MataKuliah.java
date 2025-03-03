public class MataKuliah {
    private String idMatkul;
    private String Nama;
    private int SKS;

    public MataKuliah() {
        idMatkul = "";
        Nama = "";
        SKS = 0;
    }

    public MataKuliah(String idMatkul, String Nama, int SKS) {
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    public String getIdMatkul() {
        return this.idMatkul;
    }

    public String getNama() {
        return this.Nama;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }
}
