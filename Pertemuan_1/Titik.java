import java.lang.Math;

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik += 1;
    }

    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double x) {
        ordinat = x;
    }

    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    public double getJarak(Titik T2) {
        double x = this.absis - T2.absis;
        double y = this.ordinat - T2.ordinat;
        return Math.sqrt((x*x) + (y*y));
    }

    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
