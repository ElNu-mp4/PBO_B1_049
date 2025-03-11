import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Pegawai
        Pegawai pegawai1 = new Pegawai("123456", "Budi Santoso", LocalDate.of(1985, 5, 15), LocalDate.of(2010, 3, 1), 5000000);
        pegawai1.printInfo();
        System.out.println();

        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("Teknik Informatika", "654321", "Dr. Andi Wijaya", LocalDate.of(1978, 2, 10), LocalDate.of(2005, 7, 15), 7000000);
        dosen1.printInfo();
        System.out.println();

        // Membuat objek DosenTetap
        DosenTetap dosenTetap1 = new DosenTetap("001122", "Teknik Mesin", "112233", "Prof. Siti Rahma", LocalDate.of(1975, 10, 20), LocalDate.of(2000, 1, 10), 8000000);
        dosenTetap1.printInfo();
        System.out.println("Tunjangan       : Rp." + dosenTetap1.getTunjangan());
        System.out.println();

        // Membuat objek DosenTamu
        DosenTamu dosenTamu1 = new DosenTamu("445566", LocalDate.of(2026, 5, 30), "Ekonomi", "334455", "Dr. Sugeng Widodo", LocalDate.of(1980, 6, 25), LocalDate.of(2015, 9, 1), 6000000);
        dosenTamu1.printInfo();
        System.out.println("Tunjangan       : Rp." + dosenTamu1.getTunjangan());
        System.out.println();

        // Membuat objek Tendik
        Tendik tendik1 = new Tendik("Administrasi", "556677", "Dewi Kusuma", LocalDate.of(1990, 11, 5), LocalDate.of(2018, 4, 10), 4000000);
        tendik1.printInfo();
        System.out.println("Tunjangan       : Rp." + tendik1.getTunjangan());
    }
}
