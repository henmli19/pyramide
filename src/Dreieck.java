public class Dreieck extends Pyramide {
    private double grundseite;
    private double grundhoehe;

    public Dreieck(double hoehe, double grundseite, double grundhoehe) {
        super(hoehe);
        this.grundseite = grundseite;
        this.grundhoehe = grundhoehe;
    }

    @Override
    public double calcVolumen() {
        double grundflaeche = (grundseite * grundhoehe) / 2;
        return (grundflaeche * getHoehe()) / 3;
    }
}