import java.time.LocalDate;

class PNS extends Manusia implements Pajak {
    private static int counterPNS = 0;
    private String nip;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama + ", NIP: " + nip + ", Alamat: " + alamat + ", Masa Kerja: " + hitungMasaKerja() + " tahun, Pajak: " + hitungPajak());
    }
}