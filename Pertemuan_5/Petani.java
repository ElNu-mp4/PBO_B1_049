import java.time.LocalDate;

class Petani extends Manusia implements Pajak {
    private static int counterPetani = 0;
    private String daerah;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String daerah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.daerah = daerah;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak dikenakan pajak
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama + ", Daerah: " + daerah + ", Alamat: " + alamat + ", Masa Kerja: " + hitungMasaKerja() + " tahun, Pajak: " + hitungPajak());
    }
}