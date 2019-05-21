public class Magnolia extends Rośliny {
    public Magnolia(String nazwa, String krajPochodzenia, Integer miesiącKwitnienia, Double wysokość, Double wartość, Double ilośćWody) {
        super(nazwa, krajPochodzenia, miesiącKwitnienia, wysokość, wartość, ilośćWody);
    }

    @Override
    public String toString() {
        return "[Magnolia " + super.toString()+"]";
    }
}
