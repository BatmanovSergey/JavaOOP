package gd.list;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GBdlist<Integer> list = new GBArrayList<>();

        System.out.println(list.size());

        list.add(7);
        list.add(11);
        list.add(15);
        list.add(77);

        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list);

        list.update(1, 9);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}