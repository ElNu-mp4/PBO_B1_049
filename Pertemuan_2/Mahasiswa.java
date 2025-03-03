import java.util.ArrayList;

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan Kendaraan;

    public Mahasiswa() {
        this.NIM = "";
        this.Nama = "";
        this.Prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = null;
        this.Kendaraan = null;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.Prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Selektor (getter)
    public String getNim() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return Kendaraan;
    }

    // Mutator (setter)
    public void setNim(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan Kendaraan) {
        this.Kendaraan = Kendaraan;
    }

    // Method untuk menambahkan mata kuliah
    public void addMatKul(MataKuliah MatKul) {
        if (listMatkul.size() < 50) {
            listMatkul.add(MatKul);
        } else {
            System.out.println("Tidak bisa menambahkan lebih dari 50 mata kuliah.");
        }
    }

    // Method untuk mendapatkan jumlah SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matKul : listMatkul) {
            totalSKS += matKul.getSKS();
        }
        return totalSKS;
    }

    // Method untuk mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    // Method untuk menampilkan informasi mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
    }

    // Method untuk menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum memiliki dosen wali"));
        System.out.println("Kendaraan: " + (Kendaraan != null ? Kendaraan.getJenis() + " - " + Kendaraan.getNoPlat() : "Tidak memiliki kendaraan"));
        System.out.println("Mata Kuliah yang diambil: ");
        for (MataKuliah matKul : listMatkul) {
            System.out.println("- " + matKul.getNama() + " (" + matKul.getSKS() + " SKS)");
        }
        System.out.println("Total SKS: " + getJumlahSKS());
    }
}
