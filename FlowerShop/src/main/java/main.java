import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Kwiaciarnia kwiaciarnia = new Kwiaciarnia();
        kwiaciarnia.add(new Magnolia("f","f",6,6.0,6.0,6.0));
        kwiaciarnia.add(new Magnolia("e","e",5,5.0,5.0,5.0));
        kwiaciarnia.add(new Storczyk("d","d",4,4.0,4.0,4.0));
        kwiaciarnia.add(new Storczyk("c","c",3,3.0,3.0,3.0));
        kwiaciarnia.add(new Kaktus("a","a",1,1.0,1.0,1.0));
        kwiaciarnia.add(new Kaktus("b","b",2,2.0,2.0,2.0));
        System.out.println("kwiaciarnia nie posortowana");
        System.out.println(kwiaciarnia.toString());
        System.out.println("kwiaciarnia posortowana po nazwie");
        Collections.sort(kwiaciarnia.getAll(),new Comparor());
        System.out.println(kwiaciarnia.toString());
        System.out.println("kwiaciarnia po wartosci kwiata");


        kwiaciarnia.getAll().sort(Rośliny::compareTo);

        System.out.println(kwiaciarnia.toString());
    }
}
