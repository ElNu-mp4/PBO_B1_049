import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String NIDN;
    static int BUP = 65;

    public DosenTetap() {

    }
    public DosenTetap(String NIDN, String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok) {
        super(fakultas, NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public int getBUP() {
        return BUP;
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerja() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN            : " + NIDN);
        System.out.println("BUP             : " + BUP);
    }
}
