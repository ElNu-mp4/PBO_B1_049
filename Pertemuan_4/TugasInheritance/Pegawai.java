import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private int gajiPokok;

    public Pegawai() {

    }

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getMasaKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }

    public void printInfo() {
        System.out.println("NIP             : " + NIP);  
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir);
        System.out.println("TMT             : " + TMT);
        System.out.println("Gaji Pokok      : Rp." + gajiPokok);
    }
}