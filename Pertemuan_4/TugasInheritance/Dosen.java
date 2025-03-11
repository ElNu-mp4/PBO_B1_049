import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen() {

    }

    public Dosen(String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas        : " + fakultas);
    }
}
