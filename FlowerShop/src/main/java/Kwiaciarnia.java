import java.util.ArrayList;
import java.util.List;

public class Kwiaciarnia implements Kolekcja<Rośliny>
{
    List<Rośliny> rosliny = new ArrayList<Rośliny>();
    Double WartoscRoslin=0.0;
    public void zmienWysokoscRosliny(int index, Double nowaWysokosc) {
        getPlant(index).setWysokość(nowaWysokosc);
    }
    public void zmienWartoscRosliny(int index, Double nowaWartosc) {
        getPlant(index).setWartość(nowaWartosc);
        WartoscRoslin=przeliczWartoscRoslin();
    }

    public Double przeliczWartoscRoslin(){
        Double suma=0.0;
        for(Rośliny o: rosliny)
            suma+=o.getWartość();
        return suma;
    }

    public boolean add(Rośliny o) {
        if(rosliny.add(o))
        {WartoscRoslin=przeliczWartoscRoslin();
            return true;}
        return false;
    }

    public boolean delete(Rośliny o) {
        if(rosliny.remove(o))
        {WartoscRoslin=przeliczWartoscRoslin();
            return true;}
        return false;
    }

    public List<Rośliny> getAll() {
        return rosliny;
    }

    public Rośliny getPlant(int index) {
        return rosliny.get(index);
    }

    @Override
    public String toString() {
        return "Kwiaciarnia{ "+
                "WartoscRoslin = " + WartoscRoslin +
                  " :: "+ rosliny +

                '}';
    }
}
