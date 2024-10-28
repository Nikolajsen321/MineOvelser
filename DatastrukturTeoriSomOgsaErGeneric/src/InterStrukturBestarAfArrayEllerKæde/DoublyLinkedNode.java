package InterStrukturBestarAfArrayEllerKæde;

public class DoublyLinkedNode<E> {
    private E element;
    private DoublyLinkedNode<E> next;
    private DoublyLinkedNode<E> previous;

    public DoublyLinkedNode(E element) {
        this.element = element;
    }


    public void setNext(DoublyLinkedNode<E> next) {
        this.next = next;
    }

    public void setPrevious(DoublyLinkedNode<E> previous) {
        this.previous = previous;
    }

    public E getElement() {
        return element;
    }

    public DoublyLinkedNode<E> getNext() {
        return next;
    }

    public DoublyLinkedNode<E> getPrevious() {
        return previous;
    }
}
