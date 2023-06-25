public class List<T extends Node<T>> {
    private Node<T> Head;

    public List(){
    }

    public void add(T data){
        if(Head == null){
            Head = data;
            return;
        }

        Node<T> current = Head;

        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(data);
    }

    public Node<T> getHead(){
        return Head;
    }
}


