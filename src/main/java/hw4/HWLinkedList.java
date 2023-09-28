package hw4;

import java.util.Iterator;

public class HWLinkedList<T> implements HWList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

//// Версия из ютьюба
//
//    public HWLinkedList() {
//        lastNode = new Node<>(null, firstNode, null);
//        firstNode = new Node<>(null, null, lastNode);
//        size = 0;
//    }
//
//    @Override
//    public void addLast(T t) {
//        Node<T> prev = lastNode;
//        prev.setCurrentElement(t);
//        lastNode = new Node<>(null, prev, null);
//        prev.setNextNode(lastNode);
//        size++;
//    }
//
//    @Override
//    public T get(int index) {
//        Node<T> goal = firstNode.getNextNode();
//        for (int i = 0; i < index; i++) {
//            goal = getNextNodeNew(goal);
//        }
//        return goal.getCurrentElement();
//    }
//
//    private Node<T> getNextNodeNew(Node<T> current) {
//        return current.getNextNode();
//    }
//
//// Версия из ютьюба

// Версия от Алеси
    public HWLinkedList() {
        firstNode = new Node<>(null, null, lastNode);
        lastNode = new Node<>(null, firstNode, null);
        size = 0;
    }

    @Override
    public void addLast(T t) {
        Node<T> prevNode = lastNode.getPrevNode();
        Node<T> addNode = new Node<>(t, lastNode.getPrevNode(), prevNode.getNextNode());
//        Node<T> addNode = new Node<>(t, prevNode, lastNode); тоже самое что и строка выше
        prevNode.setNextNode(addNode);
        lastNode.setPrevNode(addNode);
        size++;
    }

    @Override
    public T get(int index) {
        Node<T> goal = firstNode.getNextNode();
        for (int i = 0; i < index; i++) {
            goal = goal.getNextNode();
        }
        return goal.getCurrentElement();
    }

// Версия от Алеси


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
