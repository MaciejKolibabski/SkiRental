import java.util.List;

public interface Managment<T> {

    boolean dodaj(T obj);
    boolean usun (T obj);
    List<T> policz();

}
