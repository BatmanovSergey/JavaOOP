package gd.list;

import java.util.Arrays;
import java.util.Iterator;

public class GBArrayList<T> implements GBdlist<T> {
    private T[] values;

    @SuppressWarnings("unchecked") // убираем ворнинги
    public GBArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean add(T t) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            // копируем    откуда, с какой позиции, куда, с какой позиции, что копируем
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[temp.length] = t;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked") // юираем ворнинги
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            // копируем    откуда, с какой позиции, куда, с какой позиции, что копируем
            int emountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, emountElementsAfterIndex);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {

        values[index] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        return "GBArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
