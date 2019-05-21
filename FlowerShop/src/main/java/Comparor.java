import java.util.Comparator;

public class Comparor implements Comparator<Rośliny> {
    public int compare(Rośliny o1, Rośliny o2) {
        return o1.getNazwa().compareToIgnoreCase(o2.getNazwa());
    }
}
