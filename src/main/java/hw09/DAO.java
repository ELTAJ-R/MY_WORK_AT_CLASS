package hw09;


import java.util.Collection;
import java.util.Optional;

public interface DAO<T, H> {
    Optional<T> get(int index);

    Collection<T> getAll();

    void create(T obj);

    boolean save(T obj);

    boolean delete(T obj);

    boolean delete(int index);

    void modify(T obj, H c);

    int count();


}
