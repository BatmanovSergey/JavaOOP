package hw4;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;
    private int index;

    public LinkedListIterator(Node<T> firstNode, Node<T> lastNode, int size) {
        this.firstNode = firstNode;
        this.lastNode = lastNode;
        this.size = size;
        this.index = 0;

    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        return lastNode.getCurrentElement();
    }
}
