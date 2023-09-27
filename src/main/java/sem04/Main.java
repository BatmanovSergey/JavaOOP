package sem04;

import sem01.Crocodile;

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        List o = new ArrayList(); // сырые типы, без <>, еявно  прописывается <Object>

        o.add("abcdef");
        o.add(true);
        o.add('c');
        o.add(123);
        o.add(new Crocodile("gena"));

        for (Object ob : o) {
            if (ob instanceof String) System.out.println(((String) ob).length());
        }

        System.out.println(((String) o.get(0)).length());

        System.out.println("------------------");


        List<String> op = new ArrayList<>(); // сырые типы, без <>, еявно  прописывается <Object>

        List <?> h = new ArrayList<>(); // постановочный знак <?> wild cast, позволяет проводит инициализацию любыми типами

//        Example ex = new Example(op);
        Example ex1 = new Example(new ArrayList<>());

        op.add("abcdef");
        op.add("true");
        op.add("123");

        for (String str : op) {
            System.out.println(str.length());
        }

        System.out.println("------------------");

        MyList<Integer> myList = new MyList<>();

//        myList.add("fgdfg");
//        myList.add("rtuik");
        myList.myAdd(234).myAdd(123);

        System.out.println(myList);

    }
}
