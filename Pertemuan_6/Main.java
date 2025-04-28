public class Main {
    public static void main(String[] args) {
        Anabul[] anabul = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul a : anabul) {
            a.bunyi();
            a.bergerak();
            System.out.println(); // spasi antar hewan
        }
    }
}