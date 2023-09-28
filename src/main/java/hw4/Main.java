package hw4;

public class Main {
    public static void main(String[] args) {
        // https://www.youtube.com/watch?v=BH6RJf2fVCQ
        HWLinkedList<Integer> my = new HWLinkedList<>();

        my.addLast(2);
        my.addLast(5);
        my.addLast(7);
        my.addLast(11);

        System.out.println("---------");

        System.out.printf("LinkedList имеет размер:  %d%n", my.size());
        System.out.printf("Искомый элемент в LinkedList имеет значение: %d%n", my.get(2));

        System.out.println("---------");

        for (Integer node : my) {
            System.out.println(node);
        }
    }
}
