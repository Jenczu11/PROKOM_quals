import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        Osobowy osobowy = new Osobowy("a",10,10,"zielony",10.0,10);
        Osobowy osobowy1 = new Osobowy("b",10,15,"czerwony",10.0,10);

        wypozyczalnia.add(osobowy1);
        wypozyczalnia.add(osobowy);
        System.out.println(wypozyczalnia.toString());

//        wypozyczalnia.getAll().sort(rodzaj_jednostki::compareTo);
//        System.out.println(wypozyczalnia.toString());
        Collections.sort(wypozyczalnia.getAll(),new Compararor());
        System.out.println(wypozyczalnia.toString());
    }
}
