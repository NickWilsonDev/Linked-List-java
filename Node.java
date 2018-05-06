/* Node.java */

public class Node<T> {
    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }

    public setNext(Node next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

}
