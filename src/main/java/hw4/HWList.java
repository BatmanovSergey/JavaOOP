package hw4;

public interface HWList<T> extends Iterable <T> {
    void addLast(T t);

    T get(int index);

    int size();

}
