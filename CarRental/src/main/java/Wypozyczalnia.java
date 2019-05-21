import java.util.ArrayList;
import java.util.List;

public class Wypozyczalnia implements Kolekcja<rodzaj_jednostki> {

    List<rodzaj_jednostki> flota = new ArrayList<rodzaj_jednostki>();
    Double WartoscFloty;

    public Wypozyczalnia() {
    }
    public void zmienWartosc(rodzaj_jednostki o, Double nowaWartosc){
        flota.get(flota.indexOf(o)).setWartosc(nowaWartosc);
        WartoscFloty=przeliczWartoscFloty();
    }
    public void zmienZasieg(rodzaj_jednostki o, Integer nowaWartosc){
        flota.get(flota.indexOf(o)).setZasieg(nowaWartosc);

    }
    public void zmienKolor(rodzaj_jednostki o, String nowaWartosc){
        flota.get(flota.indexOf(o)).setKolor(nowaWartosc);
    }

    public Double przeliczWartoscFloty()
        {Double suma=0.0;
        for(rodzaj_jednostki o: flota)
            suma+=o.getWartosc();
            return suma;
        }
    public boolean add(rodzaj_jednostki o) {
        if(flota.add(o))
        {WartoscFloty=przeliczWartoscFloty();
        return true;}
        else return false;
    }

    public boolean delete(rodzaj_jednostki o) {
        if(flota.remove(o))
        {WartoscFloty=przeliczWartoscFloty();
            return true;}
        else return false;
    }

    public List<rodzaj_jednostki> getAll() {
        return flota;
    }

    public rodzaj_jednostki getCar(int index) {
        return flota.get(index);
    }

    @Override
    public String toString() {
        return "Wypozyczalnia{" +
                "flota=" + flota +
                ", WartoscFloty=" + WartoscFloty +
                '}';
    }
}
