import java.time.LocalDate;

public class Tendik extends Pegawai{
    static int BUP = 55;
    private String bidang;

    public Tendik() {

    }

    public Tendik(String bidang, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public int getBUP() {
        return BUP;
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerja() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang          : " + bidang);
        System.out.println("BUP             : " + BUP);
    }
}
