public class ContohMetodeGenerik {

    public <T> void tampilkanIsi(Datum<T> data) {
        System.out.println("Isi dari datum: " + data.getIsi());
    }

    public <T> boolean bandingkanIsi(Datum<T> data1, Datum<T> data2) {
        return data1.getIsi().equals(data2.getIsi());
    }

    public <T> void tukarIsi(Datum<T> data1, Datum<T> data2) {
        T temp = data1.getIsi();
        data1.setIsi(data2.getIsi());
        data2.setIsi(temp);
    }

    public <T> void tampilkanTipe(Datum<T> data) {
        System.out.println("Tipe data isi: " + data.getIsi().getClass().getSimpleName());
    }
}
