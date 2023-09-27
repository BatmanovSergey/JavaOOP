import gd.list.GBArrayList;
import gd.list.GBdlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;;


public class GBArrayListTest { // тесты должны быть автономными и изолированными, все необходиммые
                              // переменные создаём внутри метода

    @Test
    public void sizeTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        Assertions.assertEquals(3, list.size());
    }

    @Test
    public void sizeNegativeTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        Assertions.assertNotEquals(2, list.size());
    }

    @Test
    public void getTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        Assertions.assertEquals(7, list.get(1));

    }
    @Test
    public void getNegativeTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        Assertions.assertNotEquals(7, list.get(0));
    }


    @Test
    public void addTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(8);
        list.add(6);
        list.add(4);
        Assertions.assertEquals(8, list.get(0));

    }
    @Test
    public void addNegativeTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(8);
        list.add(6);
        list.add(4);
        Assertions.assertNotEquals(7, list.get(0));
    }


    @Test
    public void removeTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        list.remove(1);
        Assertions.assertEquals(9, list.get(1));
    }

    @Test
    public void removeNegativeTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        list.remove(1);
        Assertions.assertNotEquals(7, list.get(1));
    }

    @Test
    public void updateTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        list.update(1, 10);
        Assertions.assertEquals(10, list.get(1));
    }

    @Test
    public void updateNegativeTest() {
        GBdlist <Integer>list = new GBArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        list.update(1, 10);
        Assertions.assertNotEquals(7, list.get(1));
    }

}