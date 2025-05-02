public class MainDatum {
    public static void main(String[] args) {
        Datum<String> hewan1 = new Datum<>("Kucing");
        Datum<String> hewan2 = new Datum<>("Anjing");
        Datum<String> hewan3 = new Datum<>("Burung");

        System.out.println("Datum 1: " + hewan1.getIsi());
        System.out.println("Datum 2: " + hewan2.getIsi());
        System.out.println("Datum 3: " + hewan3.getIsi());
    }
}