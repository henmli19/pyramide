public class Kreis {
    private Pyramide pyramide;
    private double radius;

    public Kreis(Pyramide pyramide, double radius) {
        this.pyramide = pyramide;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcVolumen() {
        return (1.0 / 3) * Math.PI * radius * radius * pyramide.getHoehe();
    }

    @Override
    public String toString() {
        return "Kreis-Pyramide mit Radius: " + radius +
                ", Höhe: " + pyramide.getHoehe() +
                ", Volumen: " + calcVolumen();
    }

    public static void main(String[] args) {
        Pyramide pyramide = new Pyramide(10) {
            @Override
            public double calcVolumen() {
                return 0;
            }
        };
        Kreis helper = new Kreis(pyramide, 5);
        System.out.println(helper);
    }
}
