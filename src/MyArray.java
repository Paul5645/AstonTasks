// Интерфейс для класса MyArrayList
public interface MyArray<E> extends Iterable<E>{
    boolean add(E e);
    boolean delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
}
