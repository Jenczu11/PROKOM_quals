import java.util.Comparator;

public class Compararor implements Comparator<rodzaj_jednostki> {

    public int compare(rodzaj_jednostki o1, rodzaj_jednostki o2) {
        return o1.getNazwa().compareTo(o2.getNazwa());
    }
}
