public class MGaris {
    public static void main(String[] args) {
        // Membuat objek garis G1 dengan titik awal (0, 0) dan titik akhir (1, 1)
        Garis G1 = new Garis(new Titik(0, 0), new Titik(1, 1));
        System.out.println("Garis G1:");
        G1.printGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.println("Titik Tengah G1: " + G1.getTitikTengah());
        System.out.println("Persamaan G1: " + G1.getPersamaanGaris());

        // Membuat objek garis G2 dengan titik awal (-2, 0) dan titik akhir (0, 4)
        Garis G2 = new Garis(new Titik(-2, 0), new Titik(0, 4));
        System.out.println("\nGaris G2:");
        G2.printGaris();
        System.out.println("Persamaan G2: " + G2.getPersamaanGaris());

        // Mengecek apakah G1 sejajar dengan G2
        System.out.println("\nApakah G1 sejajar dengan G2? " + G1.isSejajar(G2));

        // Mengecek apakah G1 tegak lurus dengan G2
        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));

        // Menampilkan jumlah garis yang telah dibuat
        System.out.println("\nJumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}