package sem03;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Integer> ints = List.of(1,2,3,2);
        List<String> collect = ints.stream().
                filter(x -> x == 2). // фильтрует, принимает внутри себя Предикат
                map(x -> x + " Я добавил строку"). // принимает в себя некую фугкцию
                distinct(). // выведет только уникальные значения
                collect(Collectors.toList()); // финальная (терминальная) операция
        System.out.println(collect);

        some((x -> x > 3));

        pow (x -> System.out.println(x*x),3);

    }

    private static void some(Predicate<Integer> p) {
        if (p.test(5)) {
            System.out.println("Верно!!!");
        }else {
            System.out.println("Неверно!!!");
        }
    }

    private  static void pow (Consumer<Integer> p, int x) {
        p.accept(x);
    }
}
