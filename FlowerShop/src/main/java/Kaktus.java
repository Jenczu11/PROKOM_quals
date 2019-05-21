public class Kaktus extends Rośliny {
    public Kaktus(String nazwa, String krajPochodzenia, Integer miesiącKwitnienia, Double wysokość, Double wartość, Double ilośćWody) {
        super(nazwa, krajPochodzenia, miesiącKwitnienia, wysokość, wartość, ilośćWody);
    }

    @Override
    public String toString() {
        return "[Kaktus " + super.toString()+"]";
    }
}
