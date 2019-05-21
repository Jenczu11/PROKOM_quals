public class Ciezarowy extends rodzaj_jednostki {
    public Ciezarowy(String nazwa, Integer pojemnosc, Integer maseDopuszczalna) {
        super(nazwa, pojemnosc, maseDopuszczalna);
    }

    public Ciezarowy(String nazwa, Integer pojemnosc, Integer maseDopuszczalna, String kolor, Double wartosc, Integer zasieg) {
        super(nazwa, pojemnosc, maseDopuszczalna, kolor, wartosc, zasieg);
    }

    public String toString() {
        return "Ciezarowy[" +
                "Nazwa='" + Nazwa + '\'' +
                ", Pojemnosc=" + Pojemnosc +
                ", MaseDopuszczalna=" + MaseDopuszczalna +
                ", Kolor='" + Kolor + '\'' +
                ", Wartosc='" + Wartosc + '\'' +
                ", Zasieg=" + Zasieg +
                ']';
    }
}
