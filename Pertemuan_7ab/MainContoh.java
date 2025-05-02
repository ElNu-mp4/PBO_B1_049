public class MainContoh {
    public static void main(String[] args) {
        Datum<String> d1 = new Datum<>("Kucing");
        Datum<String> d2 = new Datum<>("Anjing");

        ContohMetodeGenerik util = new ContohMetodeGenerik();

        util.tampilkanIsi(d1);
        util.tampilkanIsi(d2);

        boolean sama = util.bandingkanIsi(d1, d2);
        System.out.println("Apakah isi sama? " + sama);

        util.tukarIsi(d1, d2);
        System.out.println("Setelah ditukar:");
        util.tampilkanIsi(d1);
        util.tampilkanIsi(d2);

        util.tampilkanTipe(d1);
    }
}