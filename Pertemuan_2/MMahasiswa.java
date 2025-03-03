public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("D001", "Dr. Budi Santoso", "Informatika");
        
        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("B 1234 ABC", "Mobil");
        
        // Membuat objek MataKuliah
        MataKuliah matkul1 = new MataKuliah("IF101", "Pemrograman Berorientasi Objek", 3);
        MataKuliah matkul2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah matkul3 = new MataKuliah("IF103", "Basis Data", 4);
        
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("220001", "Ahmad Faisal", "Informatika");
        
        // Mengatur dosen wali dan kendaraan mahasiswa
        mahasiswa1.setDosenWali(dosen1);
        mahasiswa1.setKendaraan(kendaraan1);
        
        // Menambahkan mata kuliah ke dalam daftar mahasiswa
        mahasiswa1.addMatKul(matkul1);
        mahasiswa1.addMatKul(matkul2);
        mahasiswa1.addMatKul(matkul3);
        
        // Memanggil method untuk menampilkan informasi
        mahasiswa1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + mahasiswa1.getJumlahMatKul());
        System.out.println("Total SKS: " + mahasiswa1.getJumlahSKS());
    }
}

