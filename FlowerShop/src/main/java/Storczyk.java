public class Storczyk extends Rośliny {
    public Storczyk(String nazwa, String krajPochodzenia, Integer miesiącKwitnienia, Double wysokość, Double wartość, Double ilośćWody) {
        super(nazwa, krajPochodzenia, miesiącKwitnienia, wysokość, wartość, ilośćWody);
    }

    @Override
    public String toString() {
        return "[Storczyk " + super.toString()+"]";
    }
}
