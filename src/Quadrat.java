public class Quadrat extends Pyramide{

    private double hoehe;
    private double laenge;

    public Quadrat(double laenge, double hoehe) {
        super(hoehe);
        this.laenge=laenge;
    }

    @Override
    public double calcVolumen() {
        return (1.0 / 3) * (laenge*laenge) * hoehe;
    }
}
