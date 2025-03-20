import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
    }

    public abstract void cetakInfo();
}