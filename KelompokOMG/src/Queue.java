public class Queue<T extends Node<T>> {
    private Node<T> front, rear, iterator;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(T node) {
        if (this.rear == null) {
            this.front = this.rear = this.iterator = node;
            return;
        }

        this.rear.setNext(node);
        this.rear = node;
    }

    public Node<T> getIterator() {
        return iterator;
    }

    public void next() {
        this.iterator = this.iterator.getNext();
    }

    public void rollback() {
        this.iterator = front;
    }
}
