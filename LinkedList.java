/* LinkedList.java */

public class LinkedList<T> {

    private Node<T> head;

    private int size;

    public LinkedList(Node<T> node) {
        this.head = node;
        size = 1;
    }

    public void add(Node<T> node) {
        if (size == 1) {
            this.head.setNext(node);
        } else if (size == 0) {
            this.head = node;
        } else {
            Node temp;
            temp = head;
            for(int i = 0; i < size; i++) {
                temp = temp.getNext();
            }
        }
        this.size++;
    }

    /* getters */

    public Node<T> getHead() {
        return this.head;
    }

    public int getSize() {
        return this.size;
    }

}
