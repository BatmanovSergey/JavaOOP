package hw4;

public class Node <T> {
    private T currentElement;
    private Node <T> prevNode;
    private Node <T> nextNode;

    public Node(T currentElement, Node<T> prevNode, Node<T> nextNode) {
        this.currentElement = currentElement;
        this.prevNode = prevNode;
        this.nextNode = nextNode;

    }

    public T getCurrentElement() {
        return currentElement;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setNextNode(Node<T> nextElement) {
        this.nextNode = nextElement;
    }

    public void setPrevNode(Node<T> prevElement) {
        this.prevNode = prevElement;
    }

    public void setCurrentElement(T currentElement) {
        this.currentElement = currentElement;
    }
}
