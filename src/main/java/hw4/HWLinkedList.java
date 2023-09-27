package hw4;

import java.util.Iterator;

public class HWLinkedList<T> implements HWList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

//    public HWLinkedList<T> list;


    public HWLinkedList() {
        lastNode = new Node<>(null, firstNode, null);
        firstNode = new Node<>(null, null, lastNode);
        size = 0;
    }

    @Override
    public void addLast(T t) {
        Node<T> prev = lastNode;
        prev.setCurrentElement(t);
        lastNode = new Node<>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public T get(int index) {
        Node<T> goal = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            goal = getNextNode(goal);
        }
        return goal.getCurrentElement();
    }

    private Node<T> getNextNode(Node<T> current) {

        return current.getNextElement();
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public Iterator<T> iterator() {
//        return new LinkedListIterator<>(firstNode, lastNode, size);
        return new Iterator<>() {
            int count = 0;
            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public T next() {
                return get(count++);
            }
        };
    }
}
