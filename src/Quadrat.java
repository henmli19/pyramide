public class Quadrat extends Pyramide{

    private double hoehe;
    public Quadrat(double hoehe) {
        super(hoehe);
    }

    @Override
    public double calcVolumen() {
        return hoehe*hoehe;
    }
}
