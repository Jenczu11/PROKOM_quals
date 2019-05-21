public abstract class Rośliny implements Comparable<Rośliny> {
    final private String nazwa;
    final private String krajPochodzenia;
    final private Integer miesiącKwitnienia;
    private Double wysokość;
    private Double wartość;
    private Double ilośćWody;

    public Rośliny(String nazwa, String krajPochodzenia, Integer miesiącKwitnienia, Double wysokość, Double wartość, Double ilośćWody) {
        this.nazwa = nazwa;
        this.krajPochodzenia = krajPochodzenia;
        this.miesiącKwitnienia = miesiącKwitnienia;
        this.wysokość = wysokość;
        this.wartość = wartość;
        this.ilośćWody = ilośćWody;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public Integer getMiesiącKwitnienia() {
        return miesiącKwitnienia;
    }

    public Double getWysokość() {
        return wysokość;
    }

    public void setWysokość(Double wysokość) {
        this.wysokość = wysokość;
    }

    public Double getWartość() {
        return wartość;
    }

    public void setWartość(Double wartość) {
        this.wartość = wartość;
    }

    public Double getIlośćWody() {
        return ilośćWody;
    }

    public void setIlośćWody(Double ilośćWody) {
        this.ilośćWody = ilośćWody;
    }

    @Override
    public String toString() {
        return  "nazwa='" + nazwa + '\'' +
                ", krajPochodzenia='" + krajPochodzenia + '\'' +
                ", miesiącKwitnienia=" + miesiącKwitnienia +
                ", wysokość=" + wysokość +
                ", wartość=" + wartość +
                ", ilośćWody=" + ilośćWody;
    }

    public int compareTo(Rośliny o) {
        if(this.getWartość()==o.getWartość()) return 0;
        if(this.getWartość()>o.getWartość()) return 1;
        else return -1;
    }
}
