import java.time.LocalDate;

class Pengusaha extends Manusia implements Pajak {
    private static int counterPengusaha = 0;
    private String npwp;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama + ", NPWP: " + npwp + ", Alamat: " + alamat + ", Masa Kerja: " + hitungMasaKerja() + " tahun, Pajak: " + hitungPajak());
    }
}