import java.util.List;

public interface Kolekcja <T> {
    boolean add(T o);
    boolean delete(T o);
    List<T> getAll();
    T getCar(int index);
}
