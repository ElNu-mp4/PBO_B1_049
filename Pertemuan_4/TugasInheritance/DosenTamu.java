import java.time.LocalDate;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu() {

    }

    public DosenTamu(String NIDK, LocalDate tanggalAkhirKontrak, String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok) {
        super(fakultas, NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak) {
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public String getNIDK() {
        return NIDK;
    }

    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }

    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK            : " + NIDK);
        System.out.println("Tanggal Akhir   : " + tanggalAkhirKontrak);
    }
}
