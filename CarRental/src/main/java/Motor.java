public class Motor extends rodzaj_jednostki {
    public Motor(String nazwa, Integer pojemnosc, Integer maseDopuszczalna) {
        super(nazwa, pojemnosc, maseDopuszczalna);
    }

    public Motor(String nazwa, Integer pojemnosc, Integer maseDopuszczalna, String kolor, Double wartosc, Integer zasieg) {
        super(nazwa, pojemnosc, maseDopuszczalna, kolor, wartosc, zasieg);
    }

    @Override
    public String toString() {
        return "Motor[" +
                "Nazwa='" + Nazwa + '\'' +
                ", Pojemnosc=" + Pojemnosc +
                ", MaseDopuszczalna=" + MaseDopuszczalna +
                ", Kolor='" + Kolor + '\'' +
                ", Wartosc='" + Wartosc + '\'' +
                ", Zasieg=" + Zasieg +
                ']';
    }
}
