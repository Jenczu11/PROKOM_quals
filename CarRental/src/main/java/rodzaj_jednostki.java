//public abstract class rodzaj_jednostki {
public abstract class rodzaj_jednostki implements Comparable<rodzaj_jednostki> {
    final String Nazwa;
    final Integer Pojemnosc;

    public rodzaj_jednostki(String nazwa, Integer pojemnosc, Integer maseDopuszczalna) {
        Nazwa = nazwa;
        Pojemnosc = pojemnosc;
        MaseDopuszczalna = maseDopuszczalna;
    }

    final Integer MaseDopuszczalna;
    String Kolor;
    Double Wartosc;
    Integer Zasieg;

    public rodzaj_jednostki(String nazwa, Integer pojemnosc, Integer maseDopuszczalna, String kolor, Double wartosc, Integer zasieg) {
        Nazwa = nazwa;
        Pojemnosc = pojemnosc;
        MaseDopuszczalna = maseDopuszczalna;
        Kolor = kolor;
        Wartosc = wartosc;
        Zasieg = zasieg;
    }

    @Override
    public String toString() {
        return "rodzaj_jednostki{" +
                "Nazwa='" + Nazwa + '\'' +
                ", Pojemnosc=" + Pojemnosc +
                ", MaseDopuszczalna=" + MaseDopuszczalna +
                ", Kolor='" + Kolor + '\'' +
                ", Wartosc='" + Wartosc + '\'' +
                ", Zasieg=" + Zasieg +
                '}';
    }

    public String getNazwa() {
        return Nazwa;
    }

    public Integer getPojemnosc() {
        return Pojemnosc;
    }

    public Integer getMaseDopuszczalna() {
        return MaseDopuszczalna;
    }

    public String getKolor() {
        return Kolor;
    }

    public Double getWartosc() {
        return Wartosc;
    }

    public Integer getZasieg() {
        return Zasieg;
    }

    public void setKolor(String kolor) {
        Kolor = kolor;
    }

    public void setWartosc(Double wartosc) {
        Wartosc = wartosc;
    }

    public void setZasieg(Integer zasieg) {
        Zasieg = zasieg;
    }
    public int compareTo(rodzaj_jednostki o){
        if(this.getMaseDopuszczalna()==o.getMaseDopuszczalna()) return 0;
        if(this.getMaseDopuszczalna()>o.getMaseDopuszczalna()) return 1;
        else return -1;

    }
}
