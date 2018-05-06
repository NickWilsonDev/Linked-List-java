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
            Node<T> temp;
            temp = head;
            for(int i = 0; i < size; i++) {
                temp =  temp.getNext();
            }
        }
        this.size++;
    }

    public void remove(int position) {
        if (position == 0) {
            Node<T> temp = head;
            head =  temp.getNext();
            temp.setNext(null);
            temp = null;
        } else {
            Node<T> temp = head;
            int index = 0;
            while ((index + 1) != position) {
                temp.setNext(temp.getNext());
            }
            temp.setNext(temp.getNext().getNext());
        }
        this.size--;
    }

    /* getters */

    public Node<T> getHead() {
        return this.head;
    }

    public int getSize() {
        return this.size;
    }

}
