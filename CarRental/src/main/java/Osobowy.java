public class Osobowy extends rodzaj_jednostki {
    public Osobowy(String nazwa, Integer pojemnosc, Integer maseDopuszczalna) {
        super(nazwa, pojemnosc, maseDopuszczalna);
    }

    public Osobowy(String nazwa, Integer pojemnosc, Integer maseDopuszczalna, String kolor, Double wartosc, Integer zasieg) {
        super(nazwa, pojemnosc, maseDopuszczalna, kolor, wartosc, zasieg);
    }

    public String toString() {
        return "Osobowy[" +
                "Nazwa='" + Nazwa + '\'' +
                ", Pojemnosc=" + Pojemnosc +
                ", MaseDopuszczalna=" + MaseDopuszczalna +
                ", Kolor='" + Kolor + '\'' +
                ", Wartosc='" + Wartosc + '\'' +
                ", Zasieg=" + Zasieg +
                ']';
    }
}
