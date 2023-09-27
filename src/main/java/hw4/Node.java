package hw4;

public class Node <T> {
    private T currentElement;
    private Node <T> prevElement;
    private Node <T> nextElement;

    public Node(T currentElement, Node<T> prevElement, Node<T> nextElement) {
        this.currentElement = currentElement;
        this.prevElement = prevElement;
        this.nextElement = nextElement;

    }

    public T getCurrentElement() {
        return currentElement;
    }

    public Node<T> getNextElement() {
        return nextElement;
    }

    public Node<T> getPrevElement() {
        return prevElement;
    }

    public void setNextElement(Node<T> nextElement) {
        this.nextElement = nextElement;
    }

    public void setPrevElement(Node<T> prevElement) {
        this.prevElement = prevElement;
    }

    public void setCurrentElement(T currentElement) {
        this.currentElement = currentElement;
    }
}
