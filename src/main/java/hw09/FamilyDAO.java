package hw09;


import java.util.Collection;
import java.util.Optional;

public interface FamilyDAO<T> {
    Optional<T> get(int index);
    Collection<T> getAll();
    void create(T obj);
    boolean saveFamily(T obj);
    boolean delete(T obj);
    boolean delete(int index);
    void update(T obj);


}
