package gd.list;

public interface GBdlist<Y> extends Iterable <Y> {

    boolean add(Y t);

    void remove(int index);

    Y get(int index);

    int size();

    void update(int index, Y t);

}
